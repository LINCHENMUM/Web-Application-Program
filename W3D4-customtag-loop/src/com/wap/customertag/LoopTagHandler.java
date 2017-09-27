package com.wap.customertag;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.wap.customertag.model.Movie;

public class LoopTagHandler extends SimpleTagSupport {

	private List movieList;

	public void setMovieList(List movieList) {
		this.movieList = movieList;
	}

	public void doTag() throws JspException, IOException {
		Iterator i = movieList.iterator();
		while (i.hasNext()) {
			Movie movie = (Movie) i.next();
			getJspContext().setAttribute("mymovie", movie);
			getJspBody().invoke(null);
		}
	}

}
