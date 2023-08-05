package com.spring.demospring.collection;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Emp {
//	properties declaration
	
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String ,String > courses;
	private Properties props;
	
//	getter and setter method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String,	String> getCourses(){
		return courses;
	}
	public void setCourses(Map<String, String>courses) {
		this.courses=courses;
	}
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props=props;
	}
//	Constructor
	public Emp(String name, List<String> phones,Set<String> addresses, Map<String,String> courses,Properties props) {
		super();
		this.name=name;
		this.phones=phones;
		this.addresses=addresses;
		this.courses=courses;
		this.props=props;
	}
//	default constructor
	
	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses + ", Props=" +props +" ]";
	}
	
	
	
}
 