package com.simplilearn.demo;




public class User {

	///id, feedback,user_email,date///
        private long ID;
        private String name;
        private String uname;
        private String pwd; 
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public String getUname() { return this.uname;}
        public String getPwd() { return this.pwd;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setUname(String uname) { this.uname= uname;}
        public void setPwd(String pwd) { this.pwd = pwd;}
		@Override
		public String toString() {
			return "EProductEntity [ID=" + ID + ", name=" + name + ", username=" + uname + ", password=" + pwd
					+ "]";
		} 
        
        
}