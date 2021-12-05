
 public class User {
	private String name;
	private String username;
	private String password;
	private long phoneNumber; 
	
  
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public User(String name,String username,String password,long phoneNumber){
		this.name=name;
		this.username=username;
		this.password=password;
		this.phoneNumber=phoneNumber;
		
	}
	
	public boolean flag = false;
	public boolean comparePhoneNumber(User user) {
		if(getPhoneNumber() == user.getPhoneNumber()) {
			return true;
		}
		else {
			return false;
			
		}
		
	}
	
	}