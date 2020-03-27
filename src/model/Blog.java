package model;

import java.time.LocalDate;

// Type your code
public class Blog
{
	String title;
	String description;
	LocalDate postedOn;
	public String gettitle()
	{
		return this.title;
	}
	public void gettitle(String title)
	{
		this.title = title;
	}
	public String getdescription()
	{
		return this.description;
	}
	public void getdescription(String description)
	{
		this.description = description;
	}
	public LocalDate getpostedOn()
	{
		return this.postedOn;
	}
	public void getpostedOn(LocalDate postedOn)
	{
		this.postedOn = postedOn;
	}
	public Blog(String title,String description,LocalDate postedOn)
	{
		this.title = title;
		this.postedOn = postedOn;
		this.description = description;
	}
}
