package model;

public class User {
		public String userId;
		public String userName;
		private String password;
		public String defaultAccount;
		public User (String UserId, String userName,String password, String defaultAccount) {
			this.userId = UserId;
			this.userName = userName;
			this.password = password;
			this.defaultAccount = defaultAccount;
		}
		boolean checkPassword(String pass) {
			if(pass.equals(password)) {
				return true;
			}
			return false;
		}	
		
		public String getPassword() {
			return password;
		}
}