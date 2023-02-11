package com.adri.AdriInternship_MattikaTongsai;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="user_id", nullable = false, unique = true)
		private long userId;
		public long getUserId()
		{
			return userId;
		}

		@Column(name="user_name",nullable = false, unique = true)
		private String userName;
		public String getUserName()
		{
			return userName;
		}

		@Column (nullable = false, unique = true)
		private String email;
		public String getEmail()
		{
			return email;
		}
		
		
		@Column (nullable = false)
		private String information;
		public String getInformation()
		{
			return information;
		}
}


