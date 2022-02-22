package sideproject.sideproject;

import java.util.ArrayList;
import java.util.List;

public class CustomObject {
	private String key;
	private List<CustomChild> list;

	public CustomObject(int i ) {
		StringBuffer sb = new StringBuffer();
		for (int idx = 0; idx < (i+1) ; idx++) {
			sb.append("asdf");
		}
		key = sb.toString();
		list = new ArrayList<>();
		for (int idx = 0; idx < (i+1); idx++) {
			list.add(new CustomChild(idx));
		}
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<CustomChild> getList() {
		return list;
	}

	public void setList(List<CustomChild> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "CustomObject [key=" + key + ", list=" + list + "]";
	}

}