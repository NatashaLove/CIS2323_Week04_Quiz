package Person;

public class Person {
	
	String FirstN;
	String LastN;
	private int age; 
	private char sex;
	
	public String getFirstN(){
	   return FirstN;
    }
	
	public void setFirstN(String fName){
		FirstN=fName;
	}
	
    public String getLastN(){
		return LastN;
	}
	
    public void setLastN(String lName){
	   LastN=lName;
    }
	
	public int getAge(){
		return age;
	}
	
    public void setAge(int a){
	   age=a;
    }
	
	public char getSex(){
		return sex;
	}
	
    public void setSex(char s){
	   sex=s;
    }
	
	public String getPersonInfo() {
		return "The new person is a " +getSex() + "\n"+
		+ getAge() + "years old\n"+
		" with the name " + FirstN + " "+ LastN;
	}

}