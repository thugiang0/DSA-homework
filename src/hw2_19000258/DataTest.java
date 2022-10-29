// Bai 5

package hw2_19000258;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataTest {
	
	public static void sortInteger(List<Data> data) {
		Data temp;
		for (int i = 0; i < data.size(); i++) {
			for(int j = i+1; j < data.size(); j++) {
				if(data.get(i).getInteger() > data.get(j).getInteger()) {
					temp = data.get(i);
					data.set(i, data.get(j));
					data.set(j, temp);
				}
			}
		}
	}
	
	public static void sortRealNumber (List<Data> data) {
		Data temp;
		for (int i = 0; i < data.size(); i++) {
			for(int j = i+1; j < data.size(); j++) {
				if(data.get(i).getRealNumber() > data.get(j).getRealNumber()) {
					temp = data.get(i);
					data.set(i, data.get(j));
					data.set(j, temp);
				}
			}
		} 
	}

	public static void main(String[] args) {
		List<Data> list = new ArrayList<Data>();
		
		list.add(new Data(108, "Phomai", 9.5));
		list.add(new Data(201, "Oreo", 10.5));
		list.add(new Data(101, "Giang", 8.9));
		list.add(new Data(321, "Pizza", 5.7));
		list.add(new Data(211, "Milo", 7.5));
		
		System.out.println("\nTruoc khi sap xep: ");
		for (Data data : list) {
			System.out.println(data.getInteger() + " - " + data.getWord() 
			                  + " - " + data.getRealNumber());
		}
		System.out.println("\nSap xep theo so nguyen");
		sortInteger(list);
		for (Data data : list) {
			System.out.println(data.getInteger() + " - " + data.getWord() 
			                  + " - " + data.getRealNumber());
		}
		System.out.println("\nSap xep theo string");
		Collections.sort(list);
		for (Data data : list) {
			System.out.println(data.getInteger() + " - " + data.getWord() 
			                  + " - " + data.getRealNumber());
		}
		System.out.println("\nSap xep theo so thuc");
		sortRealNumber(list);
		for (Data data : list) {
			System.out.println(data.getInteger() + " - " + data.getWord() 
			                  + " - " + data.getRealNumber());
		}
	}
}
