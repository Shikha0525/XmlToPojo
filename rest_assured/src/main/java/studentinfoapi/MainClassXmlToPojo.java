package studentinfoapi;

import java.io.IOException;

public class MainClassXmlToPojo {

	public static void main(String[] args) throws IOException {
		
		EnrollmentAgreementService eas=new EnrollmentAgreementService();
		StudentRecord student=eas.getEnrolledStudentInformation("https://stg-esignature.pennfoster.edu/Services/DocumentManagement.asmx/GetESigDocumentData?studentId=82518483&apikey=D6F5259D-9BBD-4116-9D93-945697694914");
		System.out.println(student);
	}
	
}
