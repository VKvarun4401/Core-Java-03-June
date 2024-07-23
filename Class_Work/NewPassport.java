class NewPassport {

     String cprLoc;
     int dcdrLoc;
     String surNm;
     String givenNm;
     String db;
     String eml;
     boolean iseMailSame;
     String lgnId;
     String passWord;
     String cnfrPwd;
     String hntQues;
     String hntAns;
     String cpth;

    // method
    public NewPassport(String cprLocation, int dcdrLocation, String surName, String givenName, String dob,String email, boolean isEmailLoginSame, String loginId, String pwd, String confirmPwd, String hintQuestion, String hintAns,String captcha)
	{
	    System.out.println("The createPassPort() started:..");
	    /*boolean isPassPortCreated = false;
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
		boolean iscaptchavalid=false;*/
	 

        if(cprLocation != null)
        {
            this.cprLoc = cprLocation;
            //iscprLocationValid=true;
            
        }
        else
        {
            System.out.println("please provide valid cpr Location..");
			//return iscprLocationValid;
            
        }

        if	(dcdrLocation > 0 )
        {
            this.dcdrLoc  =  dcdrLocation ;
            //isDcdrLocationValid = true;
        }
        else
        {
            System.out.println("Please provide valid dcdrLocation");
            //return isDcdrLocationValid;
        }	
        if( surName != null)
        {
            this.surNm = surName; 
            //issurnameValid=true;
        }
        else
        {
            System.out.println("provide proper valid surnane");
			//return issurnameValid;
        }
        if(givenName  != null)
        {
            this.givenNm = givenName;
            //isGivenNameValid=true;
        }
        else
        {
            System.out.println("Provide proper name");
			//return isGivenNameValid;
        }
        if(dob!=null)
        {
            this.db = dob;
            //isDobValid=true;	
        }
        else
        {
            System.out.println("Provide valid DOB");
			//return isDobValid;
        }

        if(email!=null)
        {
            this.eml = email;
            //isEmailValid=true;	 
        }
        else
        {
            System.out.println("Provide valid email..");
			//return isEmailValid;
        }
        if(isEmailLoginSame!=false)
        {
            this.iseMailSame = isEmailLoginSame;
            //isEmailsameValid=true;
        }
        else
        {
        System.out.println("provide valid Email..");
            //return isEmailsameValid;
        }
        if(loginId!=null)
        {
            this.lgnId = loginId;
            //islgnValid=true;	
        }
        else
        {
            System.out.println("provide valid login Id...");
            //return islgnValid;
        }
        if( pwd!=null)
        {
            this.passWord = pwd;
            //isPassWordValid=true;	
        }
        else
        {
            System.out.println("Provide vlid password");
            //return isPassWordValid;
        }
        if(confirmPwd!=null)
        {
            this.cnfrPwd = confirmPwd; 
            //isConfirmPasswordValid=true;	
        }
        else
        {
            System.out.println("provide valid confirm passWord");
           // return isConfirmPasswordValid;
        }
        if(hintQuestion!=null)
        {
            this.hntQues = hintQuestion;
            //isHintQuestion=true;	
        }
        else
        {
            System.out.println("Provide valid HInt Qusetion");
            //return isHintQuestion;
        }
        if(hintAns!=null)
        {
            this.hntAns = hintAns; 
            //isHintAnswerValid=true;
        }
        else{
            System.out.println("Provide valid Hint Answer");
			//return isHintAnswerValid;
        }
        if( captcha!=null)
        {
            this.cpth = captcha;
            //iscaptchavalid=true;
        }
        else{
            System.out.println("provide valid capcha....");
            //return iscaptchavalid;
        }
        
        //isPassPortCreated=true;
        System.out.println("passport Cretaed..");
        
        
    }
	 
	 
	

    public void getPassPortDetails() {

        System.out.println("The cpr location is:" + this.cprLoc);
        System.out.println("The dcdr loaction is:" + this.dcdrLoc);
        System.out.println("The sur Name is:" + this.surNm);
        System.out.println("Given Nmae is:" + this.givenNm);
        System.out.println("Date of Birth:" + this.db);
        System.out.println("Email ID:" + this.eml);
        System.out.println("Is email available:" + this.iseMailSame);
        System.out.println("Id of  login  " + this.lgnId);
        System.out.println("Password:" + this.passWord);
        System.out.println("Confirm Password:" + this.cnfrPwd);
        System.out.println("hint question is :" + this.hntQues);
        System.out.println("Hint answer is:" + this.hntAns);
        System.out.println("capcha is:" + this.cpth);
        return;

    }

}