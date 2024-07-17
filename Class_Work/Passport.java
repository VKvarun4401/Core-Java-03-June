class Passport {

    static String cprLoc;
    static int dcdrLoc;
    static String surNm;
    static String givenNm;
    static String db;
    static String eml;
    static boolean iseMailSame;
    static String lgnId;
    static String passWord;
    static String cnfrPwd;
    static String hntQues;
    static String hntAns;
    static String cpth;

    // method
    public static boolean createPassPort(String cprLocation, int dcdrLocation, String surName, String givenName, String dob,String email, boolean isEmailLoginSame, String loginId, String pwd, String confirmPwd, String hintQuestion, String hintAns,String captcha)
	{
	    System.out.println("The createPassPort() started:..");
	    boolean isPassPortCreated = false;
		boolean iscprLocationValid=false;
		boolean isDcdrLocationValid =false;
		boolean issurnameValid = false;
		boolean isGivenNameValid = false;
		boolean isDobValid=false;
		boolean isEmailValid =false;
		boolean isEmailsameValid=false;
		boolean islgnValid=false;
		boolean isPassWordValid=false;
		boolean isConfirmPasswordValid=false;
		boolean isHintQuestion=false;
		boolean isHintAnswerValid=false;
		boolean iscaptchavalid=false;
	 

        if(cprLocation != null)
        {
            cprLoc = cprLocation;
            iscprLocationValid=true;
            
        }
        else
        {
            System.out.println("please provide valid cpr Location..");
			return iscprLocationValid;
            
        }

        if	(dcdrLocation > 0 )
        {
            dcdrLoc  =  dcdrLocation ;
            isDcdrLocationValid = true;
        }
        else
        {
            System.out.println("Please provide valid dcdrLocation");
            return isDcdrLocationValid;
        }	
        if( surName != null)
        {
            surNm = surName; 
            issurnameValid=true;
        }
        else
        {
            System.out.println("provide proper valid surnane");
			return issurnameValid;
        }
        if(givenName  != null)
        {
            givenNm = givenName;
            isGivenNameValid=true;
        }
        else
        {
            System.out.println("Provide proper name");
			return isGivenNameValid;
        }
        if(dob!=null)
        {
            db = dob;
            isDobValid=true;	
        }
        else
        {
            System.out.println("Provide valid DOB");
			return isDobValid;
        }

        if(email!=null)
        {
            eml = email;
            isEmailValid=true;	 
        }
        else
        {
            System.out.println("Provide valid email..");
			return isEmailValid;
        }
        if(isEmailLoginSame!=false)
        {
            iseMailSame = isEmailLoginSame;
            isEmailsameValid=true;
        }
        else
        {
        System.out.println("provide valid Email..");
            return isEmailsameValid;
        }
        if(loginId!=null)
        {
            lgnId = loginId;
            islgnValid=true;	
        }
        else
        {
            System.out.println("provide valid login Id...");
            return islgnValid;
        }
        if( pwd!=null)
        {
            passWord = pwd;
            isPassWordValid=true;	
        }
        else
        {
            System.out.println("Provide vlid password");
            return isPassWordValid;
        }
        if(confirmPwd!=null)
        {
            cnfrPwd = confirmPwd; 
            isConfirmPasswordValid=true;	
        }
        else
        {
            System.out.println("provide valid confirm passWord");
            return isConfirmPasswordValid;
        }
        if(hintQuestion!=null)
        {
            hntQues = hintQuestion;
            isHintQuestion=true;	
        }
        else
        {
            System.out.println("Provide valid HInt Qusetion");
            return isHintQuestion;
        }
        if(hintAns!=null)
        {
            hntAns = hintAns; 
            isHintAnswerValid=true;
        }
        else{
            System.out.println("Provide valid Hint Answer");
			return isHintAnswerValid;
        }
        if( captcha!=null)
        {
            cpth = captcha;
            iscaptchavalid=true;
        }
        else{
            System.out.println("provide valid capcha....");
            return iscaptchavalid;
        }
        
        isPassPortCreated=true;
        System.out.println("passport Cretaed..");
        
        return isPassPortCreated;
    }
	 
	 
	

    public static void getPassPortDetails() {

        System.out.println("The cpr location is:" + cprLoc);
        System.out.println("The dcdr loaction is:" + dcdrLoc);
        System.out.println("The sur Name is:" + surNm);
        System.out.println("Given Nmae is:" + givenNm);
        System.out.println("Date of Birth:" + db);
        System.out.println("Email ID:" + eml);
        System.out.println("Is email available:" + iseMailSame);
        System.out.println("Id of  login  " + lgnId);
        System.out.println("Password:" + passWord);
        System.out.println("Confirm Password:" + cnfrPwd);
        System.out.println("hint question is :" + hntQues);
        System.out.println("Hint answer is:" + hntAns);
        System.out.println("capcha is:" + cpth);
        return;

    }

}