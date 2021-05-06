package com.te.ecom.beans;


import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("response")
@JsonPropertyOrder({"status" , "msg"})
@XmlRootElement(name = "response")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EcomResponse implements Serializable{
	

		@JsonProperty("status")
		@XmlElement(name = "status-code")
		private int statusCode;
		
		
		private String  msg;
		
		@JsonProperty("item")
		@XmlElement(name = "item")
		private Item item;
		
		
		private List<Item> ItemList;


		public int getStatusCode() {
			return statusCode;
		}


		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}


		public String getMsg() {
			return msg;
		}


		public void setMsg(String msg) {
			this.msg = msg;
		}


		public Item getItem() {
			return item;
		}


		public void setItem(Item item) {
			this.item = item;
		}


		public List<Item> getItemList() {
			return ItemList;
		}


		public void setItemList(List<Item> itemList) {
			ItemList = itemList;
		}


		public void setBean1(Item infoBean) {
		     this.item=infoBean;	
		}


		public void setBean(Item infoBean) {
			this.item=infoBean;
			
		}
		
		
	}