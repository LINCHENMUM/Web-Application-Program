package label;

import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class Label extends SimpleTagSupport {

	String strForeColor;
	String strText;

	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		if (strForeColor != null) {
			out.write(String.format("<span style='color:%s'>%s</span>", strForeColor, strText));
		} else {
			out.write(String.format("<span>%s</span>", strText));
		}
	}

	public void setStrForeColor(String strForeColor) {
		this.strForeColor = strForeColor;
	}

	public void setStrText(String strText) {
		this.strText = strText;
	}

}
