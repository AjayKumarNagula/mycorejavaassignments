package com.example.eventsnow.service;

import com.example.eventsnow.model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventsService {

    List<Event> allevents = new ArrayList<Event>();
    public Event addNewEvent (Event event) {
        this.allevents.add(event);
        return event;
    }

    public List<Event> getAllEvents(){
        return this.allevents;
        }
    }

