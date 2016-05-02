package com.shipeng.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.shipeng.model.Entry;
import com.shipeng.daoImpl.EntryDaoImpl;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;


public class ListEntryController implements Controller {

    private EntryDaoImpl entryDaoImpl;

    public void setEntryDaoImpl(EntryDaoImpl e) {
        this.entryDaoImpl = e;
    }

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
        ModelAndView model = new ModelAndView("home");

        List<Entry> listEntry = entryDaoImpl.listEntry();
        
        if (listEntry == null) {
        	System.out.println("empty list.");
        }else {
        	System.out.println("count is: " + listEntry.size());
        }
       
        model.addObject("listEntry", listEntry);

		return model;
	}
	
}
