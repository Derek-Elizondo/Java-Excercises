package tareajava;

public class Author {

	private String name;
	private String gender;
	private String nationality;
	
	
	public Author() {}
	public Author (String n, String g, String na) {
		this.name = n;
		this.gender = g;
		this.nationality = na;
	}
			
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setGender(String g) {
		this.gender = g;
	}
	public void setNationality(String na) {
		this.nationality = na;
	}
	
	
	public void presentation() {
		System.out.println("The author is "+name+", a "+gender+" of "+nationality+" origin.");
	}
}
