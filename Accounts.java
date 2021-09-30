package com.example.demo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Accounts {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String City, state,Ownername;
		private int pin;
		private int BalanceAmount;
		private Date CreatedDate;
		private String AccountStatus ;//ACTIVE,INACTIVE,CLOSED
		public Accounts() {
			this.CreatedDate = new Date();
		}
		public void setCity(String city) {
			City = city;
		}
		public void setState(String state) {
			this.state = state;
		}
		public void setOwnername(String ownername) {
			Ownername = ownername;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		public void setBalanceAmount(int balanceAmount) {
			BalanceAmount = balanceAmount;
		}
		public void setCreatedDate(Date createdDate) {
			CreatedDate = createdDate;
		}
		public void setAccountStatus(String accountStatus) {
			AccountStatus = accountStatus;
		}
		public String getCity() {
			return City;
		}
		public String getState() {
			return state;
		}
		public String getOwnername() {
			return Ownername;
		}
		public int getPin() {
			return pin;
		}
		public int getBalanceAmount() {
			return BalanceAmount;
		}
		public Date getCreatedDate() {
			return CreatedDate;
		}
		public String getAccountStatus() {
			return AccountStatus;
		}
		
		public void ShowAccountDetails() {
			
			System.out.println("name:"+Ownername);
			
		}
		
}
