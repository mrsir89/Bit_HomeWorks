package com.example7.spring;


import com.example7.spring.model.ToDoStatus;
import com.example7.spring.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class IndexController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView index(Model model){
        List<Todo> todos =  new ArrayList<>();
        setup(todos);

        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("message","welcome");
        modelMap.addAttribute("todos",todos);
        return new ModelAndView("index",modelMap);

    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getTodo(@RequestParam("id") String id){
        return getTodoViewById(id);
    }
    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView getTodoById(@PathVariable("id") String id){
        return getTodoViewById(id);
    }



    @RequestMapping(value = "/newTodo",method = RequestMethod.GET)
    public String newTodo(){
        return "newTodo";
    }


//
//    @RequestMapping(value = "/newTodo",method = RequestMethod.GET)
//    @ResponseBody
//    public String addTodo(@RequestParam("title")String title, @RequestParam("description") String description){
//        String str = "title : " + title +"<br>"+"content : "+description + "<br>"+"data add finish";
//        return str;
//    }






    private Todo findById(List<Todo> todos, String id){
        for(Todo todo : todos){
            if(todo.getId().equals(id)){
                return todo;
            }
        }
        return null;
    }


    private ModelAndView getTodoViewById(String id) {
        List<Todo> todos = new ArrayList<>();
        setup(todos);

        Todo todo = findById(todos, id);
        if(todo == null){
            return new ModelAndView("not_found", new ModelMap());


        }
        ModelMap modelMap = new ModelMap();
        modelMap.put("todo", todo);
        return new ModelAndView("view",modelMap);
    }


    private void setup(List<Todo> todos) {
        todos.clear();
        for(int i=0;i<10;i++){
            Todo todo = new Todo();
            todo.setId(Integer.toString(i));
            todo.setTitle("Todo : "+i);
            todo.setDescription("Todo Description : "+i);
            todo.setFromPlanDate(new Date());
            if( i % 3 ==0){
                todo.setStatus(ToDoStatus.Cancelled);
                todo.setCancelled(new Date());
            }else if(i%2 ==0){
                todo.setStatus(ToDoStatus.InProgress);
            }else {
                todo.setStatus(ToDoStatus.Ready);
            }
            todos.add(todo);
        }
    }

}
