package studentinfoapi;

import java.io.IOException;
import java.net.URL;

import javax.xml.bind.Element;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import simplexml.SimpleXml;



//public class parser1 {
//
//	public static void main(String[] args) throws IOException {
//		GetRequest getReq =  new GetRequest();
//		//System.setProperty("http.agent", "Chrome");
//	    String body = getReq.makeGetRequestAndGetBody("https://stg-esignature.pennfoster.edu/Services/DocumentManagement.asmx/GetESigDocumentData?studentId=82518483&apikey=D6F5259D-9BBD-4116-9D93-945697694914");
//	    final SimpleXml simple = new SimpleXml();
//	    final simplexml.model.Element root = simple.fromXml(body);
//	    final StudentRecord student1 = simple.fromXml(root.children.get(1).children.get(0).children.get(0), StudentRecord.class);
//	    System.out.println(student1);
//    }

public class EnrollmentAgreementService{
	 
	 public StudentRecord getEnrolledStudentInformation(String url) throws IOException{
	  GetRequest getReq =  new GetRequest();
	  String body = getReq.makeGetRequestAndGetBody(url);
	  final SimpleXml simple = new SimpleXml();
	  final simplexml.model.Element root = simple.fromXml(body);
	  final StudentRecord student1 = simple.fromXml(root.children.get(1).children.get(0).children.get(0), StudentRecord.class);
	  return student1;
	 }
	 
	 

}
