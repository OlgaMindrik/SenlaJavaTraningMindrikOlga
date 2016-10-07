	
abstract class Man{
	
	protected String firstname;
	protected String lastname;
	protected int born;
	protected String registrationaddress;
	
	public void setFirstname(String newFirstname){
	firstname = newFirstname;
	}
		public  String getFirstName(){
		return firstname;
		}
	
	public void setLastname(String newLastname)
	{ lastname = newLastname;
	}	
		public String getLastname(){
		return lastname;
		}
	
	public void setBorn(int newBorn)
	{ born = newBorn;
	}	
	
		public int getBorn(){
		return born;
		}
	public void setRegistrationaddress(String newRegistrationaddress)
	{ registrationaddress = newRegistrationaddress;
	}	
	
		public String getRegistrationaddress(){
		return registrationaddress;
		}
}
//////////////////////////////////////////////	
	class Patient extends	Man{
		private String passportID;
		private String diseaseHistory;
		private OutPatientCard card;
		private Section section;
	public Patient(String a, String b, int c, String d, String e, String f){
		firstname = a;
		lastname = b;
		born = c;
		registrationaddress = d;
		passportID = e;
		diseaseHistory = f;
		System.out.println("I create an object of class Patient");
	}

	public void setPassportID(String newPassportID){
	passportID = newPassportID;}
	
		public String getPassportID(){
		return passportID;
		}
	public void setDiseaseHistory(String newDiseaseHistory){
	diseaseHistory=newDiseaseHistory;
	}
		public String getDiseaseHistory(){
		return diseaseHistory;
		}
		public void setCard(OutPatientCard newCard){
        card = newCard;
    }
    public OutPatientCard getCard(){
        return card;
    }
	public void setSection(Section newSection){
		section = newSection;
	}
	public Section getSection(){
		return section;
	}
	
}
//////////////////////////////////////////////////////////////	 
	class OutPatientCard{
	private int number;
	private int policyNumber;

	public OutPatientCard(int a, int b){
	number = a;
	policyNumber = b;
	System.out.println("I create an object of class OutPatienCard");
	}
	
	public void setNumber(int newNumber){
	number = newNumber;}
	
		public int getNumber(){
		return number;
		}
	public void setPolicyNumber(int newPolicyNumber){
	policyNumber = newPolicyNumber;
	}
		public int getPolicyNumber(){
		return policyNumber;
		}
	}
//////////////////////////////////////////////////////////////////	
	class Section{
	private int number;

	private Patient patient;
	private Clinic clinic;	

	public Section(int a){
	number = a;
	
	System.out.println("I create an object of class Section");
	}
	@Override
 public String toString(){
  
  return Integer.toString(number);
 }
 public void setNumber(int newNumb){
  this.number = newNumb;
 }
 public int getNumber(){
  return number;
 }
	/*public void setNumber(int newNumber){
	number = newNumber;
	}
	
	public int getNumber(){
	return number;
	}
	*/
	public void setPatient(Patient newPatient){
	patient = newPatient;
	}
	
	public Patient getPatient(){
	return patient;
	}
	public void setClinic(Clinic newClinic){
		clinic = newClinic;
	}
	public Clinic getClinic(){
		return clinic;
	}
	}
/////////////////////////////////////////////////////////////////////////	
	class Clinic{
	private String name;
	private Section section;
	
	
	public Clinic(String a){
	name = a;
	System.out.println("I create an object of class Clinic");
	}
	@Override
	public String toString(){
		return name;
	}

	public void setSection(Section newSection){
	section = newSection;
	}
	
	public Section getSection(){
	return section;
	}
	}
	
	class Main{
public static void main(String[] s){
	
	Patient patient = new Patient("Ibanov", "Ivan", 1958, "Hrodno", "kn1234658", "In 1965, ill with chicken pox" );
	OutPatientCard outPatientCard = new OutPatientCard(666666, 99999999);
	Section section = new Section(2);
	Clinic clinic = new Clinic("Hrodno city polyclinic");
	System.out.println(patient.getFirstName() +" " + patient.getLastname() + " " + patient.getBorn() + " " + patient.getPassportID() + " " + patient.getDiseaseHistory());
	System.out.println(" Number Out Patient Card: " + outPatientCard.getNumber() + " |  Number Policy: " + outPatientCard.getPolicyNumber());
	patient.setSection(section);
	section.setClinic(clinic);
	System.out.println("Assigned to section: " + patient.getSection() + " " + section.getClinic());}	
}	
	


