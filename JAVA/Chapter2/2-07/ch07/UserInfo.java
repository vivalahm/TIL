package ch07;

public class UserInfo {
	public String userID;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {} // �⺻ ������ 
	
	public UserInfo(String userID, String userPassWord, String userName, String userAddress, String phoneNumber ) {
		this.userID = userID;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public void showUserInfo() {
		System.out.println("���̵� " + userID + "�� ������� �̸��� " + userName + "�̰�, �ּҴ� " + userAddress + "�Դϴ�." );
	}

}
