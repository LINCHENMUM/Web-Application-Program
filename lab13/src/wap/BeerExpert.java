package wap;

import java.util.*;

public class BeerExpert {

	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if (color.equals("amber")) {
			brands.add("beer-amber1");
			brands.add("beer-amber2");
			brands.add("beer-amber3");
			brands.add("beer-amber4");
		} else {
			brands.add("other-1");
			brands.add("other-2");
			brands.add("other-3");
		}
		return (brands);
	}
}
