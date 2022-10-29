// Ex3 (3/3)

package hw3_19000258;

public class SimpleArrayListTest {

    public static void main(String[] args) {
        SimpleArrayList<String> list = new SimpleArrayList<>();
        
        list.add("8");
		list.add("18");
		list.add("0");
		list.add("10");
		list.add("11");
		list.add("19");
		
        // in ra danh sach cac phan tu
		System.out.print("Danh sach cac phan tu: ");
        for (int i = 0; i < list.size(); i++){
        	System.out.print(list.get(i) +" ");
        }
  
        // Gan gia tri o vi tri 4 bang 20:
        System.out.print("\n\nGan gia tri o vi tri 4 bang 20: ");
        list.set(3, "20");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) +" ");
            }

        // Xoa phan tu gia tri 10
        System.out.print("\n\nXoa phan tu gia tri 10: ");
        list.remove("10");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) +" ");
        }
      
        // Kiem tra danh sach co phan tu 11 khong
        System.out.println("\n\nDanh sach co phan tu 11: " + list.isContain("11"));
    
    }
}
