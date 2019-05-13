package com.example.RestList;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    public List<Emp> lst =new ArrayList<Emp>(Arrays.asList(
            new Emp(1,"java","25"),
            new Emp(1,"php","26"),
            new Emp(1,"net","27")
    ));

    @RequestMapping("")
    public List<Emp> getAll(){
        return lst;
    }

    @RequestMapping("/{id}")
    public Emp getId(@PathVariable int id){
        return lst.get(id);
    }

    @RequestMapping(value="",method= RequestMethod.POST)
    public void add(@RequestBody Emp emp){
        lst.add(emp);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id,@RequestBody Emp emp) {

        for (int i=0;i<lst.size();i++){
            Emp e=lst.get(i);
            if(e.getId()==id){
                lst.set(i,emp) ;
            }
        }
        return "success";
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        lst.removeIf(e->e.getId()==id);
    }

}
