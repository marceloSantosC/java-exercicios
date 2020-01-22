package entities;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Log {
	private String name;
	private Date acessTime;
	public static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	
	public Log() {
	}
	
	public Log(String name, Date acessTime) {
		this.name = name;
		this.acessTime = acessTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcessTime() {
		return dateFormat.format(acessTime);
	}

	public void setAcessTime(Date acessTime) {
		this.acessTime = acessTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Log other = (Log) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Name: " 
				+ name 
				+ "AcessTime: " 
				+ dateFormat.format(acessTime);
	}
	

}
