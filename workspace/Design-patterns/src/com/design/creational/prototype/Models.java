package com.design.creational.prototype;

public class Models {
 
	
	public static class Movie implements PrototypeCapable
	{
	    private String name = null;
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    @Override
	    public Movie clone() throws CloneNotSupportedException {
	        System.out.println("Cloning Movie object..");
	        return (Movie) super.clone();
	    }
	    
	    @Override
	    public String toString() {
	        return "Movie";
	    }
	}
	
	public static class Album implements PrototypeCapable
	{
	    private String name = null;
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    @Override
	    public Album clone() throws CloneNotSupportedException {
	        System.out.println("Cloning Album object..");
	        return (Album) super.clone();
	    }
	    @Override
	    public String toString() {
	        return "Album";
	    }
	}
	
	public static class Show implements PrototypeCapable
	{
	    private String name = null;
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    @Override
	    public Show clone() throws CloneNotSupportedException {
	        System.out.println("Cloning Show object..");
	        return (Show) super.clone();
	    }
	    @Override
	    public String toString() {
	        return "Show";
	    }
	}
	 
}
