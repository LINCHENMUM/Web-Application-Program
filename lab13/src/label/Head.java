package label;

import java.io.IOException;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class Head extends SimpleTagSupport {

	String strColor;
	String strWords;

	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		if (strColor != null) {
			out.write(String.format("<span style='color:%s'>%s</span>", strColor, strWords));
		} else {
			out.write(String.format("<span>%s</span>", strWords));
		}
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}

	public void setStrWords(String strWords) {
		this.strWords = strWords;
	}
}
