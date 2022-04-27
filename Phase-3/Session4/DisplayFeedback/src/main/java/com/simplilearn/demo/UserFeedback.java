package com.simplilearn.demo;


import java.util.Date;

public class UserFeedback {

	///id, feedback,user_email,date///
        private long ID;
        private String name;
        private String feed;
        private Date dateAdded;  
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public String getFeed() { return this.feed;}
        public Date getDateAdded() { return this.dateAdded;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(String feed) { this.feed = feed;}
        public void setDateAdded(Date date) { this.dateAdded = date;}
		@Override
		public String toString() {
			return "EProductEntity [ID=" + ID + ", name=" + name + ", Feedback=" + feed + ", dateAdded=" + dateAdded
					+ "]";
		} 
        
        
}