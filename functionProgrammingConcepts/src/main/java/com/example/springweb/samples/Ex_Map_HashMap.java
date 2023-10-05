package com.example.springweb.samples;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class Employees {

	int empId;
	String employeeName;
	String baseShift;

	Employees(int empId, String employeeName, String baseShift) {

		this.empId = empId;
		this.employeeName = employeeName;
		this.baseShift = baseShift;
	}

}

public class Ex_Map_HashMap {

	static int randomGenerator() {
		int randomNumber = (int) (Math.random() * 100);
		return randomNumber;
	}

	static List<Employees> employeeList() {
		List<Employees> l = new ArrayList<>();
		l.add(new Employees(1, "A", null));
		l.add(new Employees(2, "B", null));
		l.add(new Employees(3, "C", null));
		l.add(new Employees(4, "D", null));
		l.add(new Employees(5, "E", null));
		l.add(new Employees(6, "F", null));
		return l;

	}

	static Map<Integer, Employees> randomEmployeeMapping() {

		Map<Integer, Employees> m = new TreeMap<Integer, Employees>();
		Iterator<Employees> i = employeeList().iterator();
		int p = 0;
		while (i.hasNext()) {
			Employees e = i.next();
			int r = randomGenerator();
			while (p == r) {
				int temp = randomGenerator();
				r = temp;
			}
			p = r;
			m.put(r, e);
		}
		return m;
	}

	public static void main(String[] args) {

		int mse = 2;
		int ase = 2;
		int nse = 2;
		// Entry is a sub interface of HashMap which has getKey() and getValue() methods
		// need to convert to Set using the entrySet() method
		// passing the set value to Entry to traverse and retrieve key and value
		// separately

		for (Map.Entry<Integer, Employees> s : randomEmployeeMapping().entrySet()) {
			Employees e = s.getValue();
			if (mse != 0) {
				e.baseShift = "Morning";

				mse--;
			} else if (ase != 0) {
				e.baseShift = "Afternoon";
				ase--;
			} else if (nse != 0) {
				e.baseShift = "Night";
				nse--;
			}
			System.out.println(s.getKey() + " = " + e.empId + " - " + e.employeeName + " - " + e.baseShift + " Shift");

			for (int i = 0; i < employeeList().size(); i++) {
				if (employeeList().get(i).empId == e.empId) {
					employeeList().set(i, new Employees(e.empId, e.employeeName, e.baseShift));
				}
			}

		}

		employeeList().forEach(c -> System.out.println(c.empId + " " + c.employeeName + " " + c.baseShift));

		// m.replace(1, "A");
		// m.replaceAll((k,v)->"V");

		/*
		 * m.entrySet() .stream()
		 * .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		 * .forEach(System.out::println);
		 */
		int[] a = { 2, 7, 11, 15 };
		int[] b = Ex_Map_HashMap.twoSum(a, 9);
		for (int b1 : b) {
			System.out.println(b1);
		}
	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length; j++) {
				if (target == (nums[i] + nums[j]) && i != j) {
					return new int[] { i, j };
				}

			}
		}
		return new int[] {};
	}

}
