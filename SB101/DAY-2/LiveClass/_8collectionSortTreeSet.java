package com.LiveClass;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class _8collectionSortTreeSet {
	public static void main(String[] args) {
		List<Integer> rollN0=new ArrayList<>();
		rollN0.add(7);
		rollN0.add(4);
		rollN0.add(79);
		rollN0.add(5);
		rollN0.add(77);
		rollN0.add(25);
		TreeSet<Integer> ts = new TreeSet<>(rollN0);
		System.out.println(ts);
		
	}
}
