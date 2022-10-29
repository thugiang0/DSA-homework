// Ex4 (2/2)

package hw3_19000258;

public class SimpleLinkedListTest {
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		
		list.add("8");
		list.add("18");
		list.add("0");
		list.add("10");
		list.add("11");
		list.add("19");
		
		System.out.println("Cac phan tu trong danh sach: " + list);
		System.out.println("\nSo phan tu: " + list.size());
		
		// gan gia tri o vi tri 4 bang 15
		list.set(3, "20");
		System.out.println("\nGan gia tri o vi tri 4 bang 20: " + list);
		
		// phan tu o vi tri thu 3
		System.out.println("\nPhan tu o vi tri thu 3 la: " + list.get(3));
		
		// xoa phan tu o vi tri dau tien
		list.removeTop();
		System.out.println("\nXoa phan tu dau danh sach: " + list);
		
		// xoa phan tu o vi tri cuoi cung
		list.removeBot();
		System.out.println("\nXoa phan tu cuoi danh sach: " + list);
		
		// kiem tra danh dach co chua phan tu 18?  (true/false)
		System.out.println("\nDanh sach chua phan tu gia tri 18: " + list.isContain("18"));
		
		// xoa phan tu 18
		list.remove("10");
		System.out.println("\nXoa phan tu co gia tri 10: " + list);

	}
}
		
		