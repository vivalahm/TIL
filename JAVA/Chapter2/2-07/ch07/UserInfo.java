package ch07;

public class UserInfo {
	public String userID;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {} // 기본 생성자 
	
	public UserInfo(String userID, String userPassWord, String userName, String userAddress, String phoneNumber ) {
		this.userID = userID;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	public void showUserInfo() {
		System.out.println("아이디 " + userID + "의 사용자의 이름은 " + userName + "이고, 주소는 " + userAddress + "입니다." );
	}

}
