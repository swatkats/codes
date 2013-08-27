package egen.properties;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
		private String firstLine;
		private String secondLine;
		private String city;
		private int zip;
		public String getFirstLine() {
			return firstLine;
		}
		public void setFirstLine(String firstLine) {
			this.firstLine = firstLine;
		}
		public String getSecondLine() {
			return secondLine;
		}
		public void setSecondLine(String secondLine) {
			this.secondLine = secondLine;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		
		public String toString()
		{
			return "  "+this.firstLine+" "+this.secondLine+" "+this.city+"--"+this.zip;
		}

	}


