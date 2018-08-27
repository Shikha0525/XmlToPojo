package studentinfoapi;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import simplexml.model.XmlName;


//@JsonIgnoreProperties(value= {"schema"})
@XmlRootElement(name="StudentRecord")
@XmlName("diffgr:id")
public class StudentRecord
{
	@XmlAttribute
	
	@XmlName("AccountNumberText")
    private String AccountNumberText;
	
	@XmlName("PaymentNumbers")
    private String PaymentNumbers;
	
	@XmlName("WaiverText")
    private String WaiverText;
	
	@XmlName("LastPaymentAmount")
    private String LastPaymentAmount;
	
	@XmlName("LastGradeCompleted")
    private String LastGradeCompleted;
	
	@XmlName("TermsOfEnrollment")
    private String TermsOfEnrollment;
	
	@XmlName("PaymentPlanInformation")
    private String PaymentPlanInformation;
	
	@XmlName("FinanceCharge")
    private String FinanceCharge;
	
	@XmlName("TermsAndConditionsAcknowledgment")
    private String TermsAndConditionsAcknowledgment;
	
	@XmlName("SingleCourseSales")
    private String SingleCourseSales;
	 
	@XmlName("NumberOfCancellationDaysText")
    private String NumberOfCancellationDaysText;
    
	 @XmlName("LName")
    private String LName;
    
    @XmlName("TotalOfPayments")
    private String TotalOfPayments;
    
    @XmlName("CompanyPhone")
    private String CompanyPhone;

    @XmlName("PaymentBreakDownText")
    private String PaymentBreakDownText;

    @XmlName("MinimumNumberOfPayments")
    private String MinimumNumberOfPayments;

    @XmlName("ProgramName")
    private String ProgramName;

    @XmlName("AmountFinanced")
    private String AmountFinanced;

    @XmlName("Address2")
    private String Address2;

    @XmlName("Address1")
    private String Address1;

    @XmlName("EmailAddress")
    private String EmailAddress;

    @XmlName("LoanTermText")
    private String LoanTermText;

    @XmlName("Zip")
    private String Zip;
    
    @XmlName("MethodOfPaymentText")
    private String MethodOfPaymentText;

    @XmlName("TuitionDifferential")
    private String TuitionDifferential;

    @XmlName("AccountInformationText")
    private String AccountInformationText;
    
    @XmlName("StudentId")
    private String StudentId;

    @XmlName("FeeDifferential")
    private String FeeDifferential;

    @XmlName("CompanyPostalCode")
    private String CompanyPostalCode;

    @XmlName("CompanyCity")
    private String CompanyCity;

    @XmlName("CompanyState")
    private String CompanyState;

    @XmlName("InterestRate")
    private String InterestRate;

    @XmlName("ProgramNumber")
    private String ProgramNumber;

    @XmlName("FormCreationTimeStamp")
    private String FormCreationTimeStamp;

    @XmlName("CompanyAddress1")
    private String CompanyAddress1;

    @XmlName("PhoneNumber")
    private String PhoneNumber;

    @XmlName("FullPayTuition")
    private String FullPayTuition;

    @XmlName("CompanyName")
    private String CompanyName;

    @XmlName("BirthDate")
    private String BirthDate;

    @XmlName("City")
    private String City;
    
    @XmlName("FName")
    private String FName;

    @XmlName("LastPaymentNumber")
    private String LastPaymentNumber;

    @XmlName("SecondToLastPayment")
    private String SecondToLastPayment;

    @XmlName("FirstPayment")
    private String FirstPayment;

    @XmlName("State")
    private String State;

    @XmlName("FullPayFees")
    private String FullPayFees;

    @XmlName("Apr")
    private String Apr;

    @XmlName("PayPlanText")
    private String PayPlanText;

    @XmlName("MonthlyPayment")
    private String MonthlyPayment;

    public String getAccountNumberText ()
    {
        return AccountNumberText;
    }

    public void setAccountNumberText (String AccountNumberText)
    {
        this.AccountNumberText = AccountNumberText;
    }

    public String getPaymentNumbers ()
    {
        return PaymentNumbers;
    }

    public void setPaymentNumbers (String PaymentNumbers)
    {
        this.PaymentNumbers = PaymentNumbers;
    }

    public String getWaiverText ()
    {
        return WaiverText;
    }

    public void setWaiverText (String WaiverText)
    {
        this.WaiverText = WaiverText;
    }

    public String getLastPaymentAmount ()
    {
        return LastPaymentAmount;
    }

    public void setLastPaymentAmount (String LastPaymentAmount)
    {
        this.LastPaymentAmount = LastPaymentAmount;
    }

    public String getLastGradeCompleted ()
    {
        return LastGradeCompleted;
    }

    public void setLastGradeCompleted (String LastGradeCompleted)
    {
        this.LastGradeCompleted = LastGradeCompleted;
    }

    public String getTermsOfEnrollment ()
    {
        return TermsOfEnrollment;
    }

    public void setTermsOfEnrollment (String TermsOfEnrollment)
    {
        this.TermsOfEnrollment = TermsOfEnrollment;
    }

    public String getPaymentPlanInformation ()
    {
        return PaymentPlanInformation;
    }

    public void setPaymentPlanInformation (String PaymentPlanInformation)
    {
        this.PaymentPlanInformation = PaymentPlanInformation;
    }

    public String getFinanceCharge ()
    {
        return FinanceCharge;
    }

    public void setFinanceCharge (String FinanceCharge)
    {
        this.FinanceCharge = FinanceCharge;
    }

    public String getTermsAndConditionsAcknowledgment ()
    {
        return TermsAndConditionsAcknowledgment;
    }

    public void setTermsAndConditionsAcknowledgment (String TermsAndConditionsAcknowledgment)
    {
        this.TermsAndConditionsAcknowledgment = TermsAndConditionsAcknowledgment;
    }

    public String getSingleCourseSales ()
    {
        return SingleCourseSales;
    }

    public void setSingleCourseSales (String SingleCourseSales)
    {
        this.SingleCourseSales = SingleCourseSales;
    }

    public String getNumberOfCancellationDaysText ()
    {
        return NumberOfCancellationDaysText;
    }

    public void setNumberOfCancellationDaysText (String NumberOfCancellationDaysText)
    {
        this.NumberOfCancellationDaysText = NumberOfCancellationDaysText;
    }

    public String getLName ()
    {
        return LName;
    }

    public void setLName (String LName)
    {
        this.LName = LName;
    }

    public String getTotalOfPayments ()
    {
        return TotalOfPayments;
    }

    public void setTotalOfPayments (String TotalOfPayments)
    {
        this.TotalOfPayments = TotalOfPayments;
    }

    public String getCompanyPhone ()
    {
        return CompanyPhone;
    }

    public void setCompanyPhone (String CompanyPhone)
    {
        this.CompanyPhone = CompanyPhone;
    }

    public String getPaymentBreakDownText ()
    {
        return PaymentBreakDownText;
    }

    public void setPaymentBreakDownText (String PaymentBreakDownText)
    {
        this.PaymentBreakDownText = PaymentBreakDownText;
    }

    public String getMinimumNumberOfPayments ()
    {
        return MinimumNumberOfPayments;
    }

    public void setMinimumNumberOfPayments (String MinimumNumberOfPayments)
    {
        this.MinimumNumberOfPayments = MinimumNumberOfPayments;
    }

    public String getProgramName ()
    {
        return ProgramName;
    }

    public void setProgramName (String ProgramName)
    {
        this.ProgramName = ProgramName;
    }

    public String getAmountFinanced ()
    {
        return AmountFinanced;
    }

    public void setAmountFinanced (String AmountFinanced)
    {
        this.AmountFinanced = AmountFinanced;
    }

    public String getAddress2 ()
    {
        return Address2;
    }

    public void setAddress2 (String Address2)
    {
        this.Address2 = Address2;
    }

    public String getAddress1 ()
    {
        return Address1;
    }

    public void setAddress1 (String Address1)
    {
        this.Address1 = Address1;
    }

    public String getEmailAddress ()
    {
        return EmailAddress;
    }

    public void setEmailAddress (String EmailAddress)
    {
        this.EmailAddress = EmailAddress;
    }

    public String getLoanTermText ()
    {
        return LoanTermText;
    }

    public void setLoanTermText (String LoanTermText)
    {
        this.LoanTermText = LoanTermText;
    }

    public String getZip ()
    {
        return Zip;
    }

    public void setZip (String Zip)
    {
        this.Zip = Zip;
    }

    public String getMethodOfPaymentText ()
    {
        return MethodOfPaymentText;
    }

    public void setMethodOfPaymentText (String MethodOfPaymentText)
    {
        this.MethodOfPaymentText = MethodOfPaymentText;
    }

    public String getTuitionDifferential ()
    {
        return TuitionDifferential;
    }

    public void setTuitionDifferential (String TuitionDifferential)
    {
        this.TuitionDifferential = TuitionDifferential;
    }

    public String getAccountInformationText ()
    {
        return AccountInformationText;
    }

    public void setAccountInformationText (String AccountInformationText)
    {
        this.AccountInformationText = AccountInformationText;
    }

    public String getStudentId ()
    {
        return StudentId;
    }

    public void setStudentId (String StudentId)
    {
        this.StudentId = StudentId;
    }

    public String getFeeDifferential ()
    {
        return FeeDifferential;
    }

    public void setFeeDifferential (String FeeDifferential)
    {
        this.FeeDifferential = FeeDifferential;
    }

    public String getCompanyPostalCode ()
    {
        return CompanyPostalCode;
    }

    public void setCompanyPostalCode (String CompanyPostalCode)
    {
        this.CompanyPostalCode = CompanyPostalCode;
    }

    public String getCompanyCity ()
    {
        return CompanyCity;
    }

    public void setCompanyCity (String CompanyCity)
    {
        this.CompanyCity = CompanyCity;
    }

    public String getCompanyState ()
    {
        return CompanyState;
    }

    public void setCompanyState (String CompanyState)
    {
        this.CompanyState = CompanyState;
    }

    public String getInterestRate ()
    {
        return InterestRate;
    }

    public void setInterestRate (String InterestRate)
    {
        this.InterestRate = InterestRate;
    }

    public String getProgramNumber ()
    {
        return ProgramNumber;
    }

    public void setProgramNumber (String ProgramNumber)
    {
        this.ProgramNumber = ProgramNumber;
    }

    public String getFormCreationTimeStamp ()
    {
        return FormCreationTimeStamp;
    }

    public void setFormCreationTimeStamp (String FormCreationTimeStamp)
    {
        this.FormCreationTimeStamp = FormCreationTimeStamp;
    }

    public String getCompanyAddress1 ()
    {
        return CompanyAddress1;
    }

    public void setCompanyAddress1 (String CompanyAddress1)
    {
        this.CompanyAddress1 = CompanyAddress1;
    }

    public String getPhoneNumber ()
    {
        return PhoneNumber;
    }

    public void setPhoneNumber (String PhoneNumber)
    {
        this.PhoneNumber = PhoneNumber;
    }

    public String getFullPayTuition ()
    {
        return FullPayTuition;
    }

    public void setFullPayTuition (String FullPayTuition)
    {
        this.FullPayTuition = FullPayTuition;
    }

    public String getCompanyName ()
    {
        return CompanyName;
    }

    public void setCompanyName (String CompanyName)
    {
        this.CompanyName = CompanyName;
    }

    public String getBirthDate ()
    {
        return BirthDate;
    }

    public void setBirthDate (String BirthDate)
    {
        this.BirthDate = BirthDate;
    }

    public String getCity ()
    {
        return City;
    }

    public void setCity (String City)
    {
        this.City = City;
    }

    public String getFName ()
    {
        return FName;
    }

    public void setFName (String FName)
    {
        this.FName = FName;
    }

    public String getLastPaymentNumber ()
    {
        return LastPaymentNumber;
    }

    public void setLastPaymentNumber (String LastPaymentNumber)
    {
        this.LastPaymentNumber = LastPaymentNumber;
    }

    public String getSecondToLastPayment ()
    {
        return SecondToLastPayment;
    }

    public void setSecondToLastPayment (String SecondToLastPayment)
    {
        this.SecondToLastPayment = SecondToLastPayment;
    }

    public String getFirstPayment ()
    {
        return FirstPayment;
    }

    public void setFirstPayment (String FirstPayment)
    {
        this.FirstPayment = FirstPayment;
    }

    public String getState ()
    {
        return State;
    }

    public void setState (String State)
    {
        this.State = State;
    }

    public String getFullPayFees ()
    {
        return FullPayFees;
    }

    public void setFullPayFees (String FullPayFees)
    {
        this.FullPayFees = FullPayFees;
    }

    public String getApr ()
    {
        return Apr;
    }

    public void setApr (String Apr)
    {
        this.Apr = Apr;
    }

    public String getPayPlanText ()
    {
        return PayPlanText;
    }

    public void setPayPlanText (String PayPlanText)
    {
        this.PayPlanText = PayPlanText;
    }

    public String getMonthlyPayment ()
    {
        return MonthlyPayment;
    }

    public void setMonthlyPayment (String MonthlyPayment)
    {
        this.MonthlyPayment = MonthlyPayment;
    }

//    @Override
//    public String toString()
//    {
//        return "ClassPojo [AccountNumberText = "+AccountNumberText+", PaymentNumbers = "+PaymentNumbers+", WaiverText = "+WaiverText+", LastPaymentAmount = "+LastPaymentAmount+", LastGradeCompleted = "+LastGradeCompleted+", TermsOfEnrollment = "+TermsOfEnrollment+", PaymentPlanInformation = "+PaymentPlanInformation+", FinanceCharge = "+FinanceCharge+", TermsAndConditionsAcknowledgment = "+TermsAndConditionsAcknowledgment+", SingleCourseSales = "+SingleCourseSales+", NumberOfCancellationDaysText = "+NumberOfCancellationDaysText+", LName = "+LName+", TotalOfPayments = "+TotalOfPayments+", CompanyPhone = "+CompanyPhone+", PaymentBreakDownText = "+PaymentBreakDownText+", MinimumNumberOfPayments = "+MinimumNumberOfPayments+", ProgramName = "+ProgramName+", AmountFinanced = "+AmountFinanced+", Address2 = "+Address2+", Address1 = "+Address1+", EmailAddress = "+EmailAddress+", LoanTermText = "+LoanTermText+", Zip = "+Zip+", MethodOfPaymentText = "+MethodOfPaymentText+", TuitionDifferential = "+TuitionDifferential+", AccountInformationText = "+AccountInformationText+", StudentId = "+StudentId+", FeeDifferential = "+FeeDifferential+", CompanyPostalCode = "+CompanyPostalCode+", CompanyCity = "+CompanyCity+", CompanyState = "+CompanyState+", InterestRate = "+InterestRate+", ProgramNumber = "+ProgramNumber+", FormCreationTimeStamp = "+FormCreationTimeStamp+", CompanyAddress1 = "+CompanyAddress1+", PhoneNumber = "+PhoneNumber+", FullPayTuition = "+FullPayTuition+", CompanyName = "+CompanyName+", BirthDate = "+BirthDate+", City = "+City+", FName = "+FName+", LastPaymentNumber = "+LastPaymentNumber+", SecondToLastPayment = "+SecondToLastPayment+", FirstPayment = "+FirstPayment+", State = "+State+", FullPayFees = "+FullPayFees+", Apr = "+Apr+", PayPlanText = "+PayPlanText+", MonthlyPayment = "+MonthlyPayment+"]";
//    }
    
    @Override
    public String toString()
    {
    	String newLine = System.getProperty("line.separator");
        return "AccountNumberText = "+AccountNumberText+","+newLine+", PaymentNumbers = "+PaymentNumbers+","+newLine+", WaiverText = "+WaiverText+", "+newLine+",LastPaymentAmount = "+LastPaymentAmount+", "+newLine+",LastGradeCompleted = "+LastGradeCompleted+", "+newLine+",TermsOfEnrollment = "+TermsOfEnrollment+","+newLine+", PaymentPlanInformation = "+PaymentPlanInformation+","+newLine+", FinanceCharge = "+FinanceCharge+","+newLine+",TermsAndConditionsAcknowledgment = "+TermsAndConditionsAcknowledgment+","+newLine+", SingleCourseSales = "+SingleCourseSales+", "+newLine+",NumberOfCancellationDaysText = "+NumberOfCancellationDaysText+","+newLine+", LName = "+LName+", "+newLine+",TotalOfPayments = "+TotalOfPayments+","+newLine+", CompanyPhone = "+CompanyPhone+","+newLine+", PaymentBreakDownText = "+PaymentBreakDownText+","+newLine+", MinimumNumberOfPayments = "+MinimumNumberOfPayments+","+newLine+", ProgramName = "+ProgramName+","+newLine+", AmountFinanced = "+AmountFinanced+","+newLine+", Address2 = "+Address2+","+newLine+", Address1 = "+Address1+","+newLine+", EmailAddress = "+EmailAddress+","+newLine+",LoanTermText = "+LoanTermText+","+newLine+", Zip = "+Zip+","+newLine+", MethodOfPaymentText = "+MethodOfPaymentText+", "+newLine+",TuitionDifferential = "+TuitionDifferential+", "+newLine+",AccountInformationText = "+AccountInformationText+","+newLine+", StudentId = "+StudentId+","+newLine+", FeeDifferential = "+FeeDifferential+","+newLine+", CompanyPostalCode = "+CompanyPostalCode+","+newLine+", CompanyCity = "+CompanyCity+", "+newLine+",CompanyState = "+CompanyState+", "+newLine+",InterestRate = "+InterestRate+", "+newLine+",ProgramNumber = "+ProgramNumber+","+newLine+", FormCreationTimeStamp = "+FormCreationTimeStamp+","+newLine+", CompanyAddress1 = "+CompanyAddress1+","+newLine+", PhoneNumber = "+PhoneNumber+", "+newLine+",FullPayTuition = "+FullPayTuition+","+newLine+", CompanyName = "+CompanyName+","+newLine+", BirthDate = "+BirthDate+", "+newLine+",City = "+City+","+newLine+", FName = "+FName+","+newLine+", LastPaymentNumber = "+LastPaymentNumber+","+newLine+",SecondToLastPayment = "+SecondToLastPayment+","+newLine+", FirstPayment = "+FirstPayment+","+newLine+", State = "+State+","+newLine+", FullPayFees = "+FullPayFees+","+newLine+", Apr = "+Apr+","+newLine+", PayPlanText = "+PayPlanText+","+newLine+", MonthlyPayment = "+MonthlyPayment+"";
    }
    
    
}

			
			