package com.example.eventsnow.controller;

import com.example.eventsnow.model.Event;
import com.example.eventsnow.service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eventsnow")
public class EventController {
   @Autowired     //injecting the EventsService
    private EventsService eventsService;

   @PostMapping("/newevent")
   public Event addEvent(@RequestBody Event event){
       return this.eventsService.addNewEvent(event);
   }

   @GetMapping("/all")
   public List<Event> getAll(){
       return this.eventsService.getAllEvents();
    }


}
