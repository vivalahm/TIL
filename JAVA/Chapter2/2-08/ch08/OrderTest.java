package ch08;

public class OrderTest {

	public static void main(String[] args) {
		
		Order firstOrder = new Order(202011020003L, "010-2345-0001", "서울시 강남구 역삼동 111-333", "20201102", "130258", "35000원", "0003");
		
		firstOrder.showOrder();

	}

}
