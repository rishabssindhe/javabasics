package aggregation;

public class patient {
	String patientName;
	int patientAge;
	String disease;
	String dateofarrival;
	information info;
	payment pay;
	public patient(String patientName, int patientAge, String disease, String dateofarrival,information info,payment pay) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.disease = disease;
		this.dateofarrival = dateofarrival;
		this.info=info;
		this.pay=pay;
	}
void patientDetails() {
	System.out.println("Name "+this.patientName);
	System.out.println("Age "+this.patientAge);
	System.out.println("Disease "+this.disease);
	System.out.println("Date of Arrival "+this.dateofarrival);
	System.out.println("Block number "+this.info.blockNo);
	System.out.println("Floor number "+this.info.FloorNo);
	System.out.println("Room number "+this.info.roomNo);
	System.out.println("Bed number "+this.info.bedNo);
	System.out.println("Registration fees "+this.pay.regFees);
	System.out.println("Admission fees "+this.pay.admFees);
	System.out.println("Balance amount "+this.pay.balamt);
}
public static void main(String[] args) {
	information info=new information('B',2,8,3);
	payment pay=new payment(500,3000,2500);
	patient p=new patient("ABC",65,"Common Cold","26/02/2026",info,pay);
	p.patientDetails();
}
}