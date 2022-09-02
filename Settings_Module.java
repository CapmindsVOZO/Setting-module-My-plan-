package com.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Module {

	public WebDriver driver;

	public Settings_Module(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;

	}

	@FindBy(linkText = "Settings")
	private WebElement clciksettings;

	public WebElement getclciksettings() {

		return clciksettings;
	}

	//////////////////////// settings //////////////

	@FindBy(linkText = "My Profile")
	private WebElement clickaccountsettings;

	public WebElement getclickaccountsettings() {

		return clickaccountsettings;
	}

	@FindBy(xpath = "(//input[@name='fname'])[1]")
	private WebElement sendfirst;

	public WebElement getsendfirst() {

		return sendfirst;
	}

	@FindBy(xpath = "(//input[@name='lname'])[1]")
	private WebElement sendlastname;

	public WebElement getsendlastname() {

		return sendlastname;
	}

	@FindBy(xpath = "(//input[@name='mname'])[1]")
	private WebElement sendmiddlename;

	public WebElement getsendmiddlename() {

		return sendmiddlename;
	}

	@FindBy(xpath = "(//select[@name='suffix'])[1]")
	private WebElement selectsuffix;

	public WebElement getselectsuffix() {

		return selectsuffix;
	}

	@FindBy(xpath = "//option[contains(text(),'Mr')]")
	private WebElement selectmrsuffix;

	public WebElement getselectmrsuffix() {

		return selectmrsuffix;
	}

	@FindBy(xpath = "(//input[@name='email'])[1]")
	private WebElement sendmail;

	public WebElement getsendmail() {

		return sendmail;
	}

	@FindBy(xpath = "(//input[@name='phoneno'])[1]")
	private WebElement sendphone;

	public WebElement getsendphone() {

		return sendphone;
	}

	@FindBy(xpath = "(//input[@name='password'])[1]")
	private WebElement sendnewpass;

	public WebElement getsendnewpass() {

		return sendnewpass;
	}

	@FindBy(xpath = "(//input[@name='cpassword'])[1]")
	private WebElement sendconpass;

	public WebElement getsendconpass() {

		return sendconpass;
	}

	@FindBy(xpath = "(//input[@name='curpassword'])[1]")
	private WebElement sendcurrennpass;

	public WebElement getsendcurrennpass() {

		return sendcurrennpass;
	}

	@FindBy(xpath = "(//div[@class='prob-head-title'])[1]")
	private WebElement getprofile;

	public WebElement getgetprofile() {

		return getprofile;
	}

	@FindBy(xpath = "//div[contains(text(),'Clinical')]")
	private WebElement clickclini;

	public WebElement getclickclini() {

		return clickclini;
	}

	@FindBy(xpath = "(//select[@id='licentype0'])[1]")
	private WebElement licensety;

	public WebElement getlicensety() {

		return licensety;
	}

	@FindBy(xpath = "//option[contains(text(),'LCSW')]")
	private WebElement selelicensety;

	public WebElement getselelicensety() {

		return selelicensety;
	}

	@FindBy(xpath = "(//input[@name='licensenum'])[1]")
	private WebElement selelicenseno;

	public WebElement getselelicenseno() {

		return selelicenseno;
	}

	@FindBy(xpath = "(//input[@placeholder='License expiry Date'])[1]")
	private WebElement calendercl;

	public WebElement getcalendercl() {

		return calendercl;
	}

	@FindBy(xpath = "(//select[@name='licenseState'])[1]")
	private WebElement licensestate;

	public WebElement getlicensestate() {

		return licensestate;
	}

	@FindBy(xpath = "(//input[@name='npinum'])[1]")
	private WebElement Npinumber;

	public WebElement getNpinumber() {

		return Npinumber;
	}

	@FindBy(xpath = "(//select[@name='specialty'])[1]")
	private WebElement Specality;

	public WebElement getSpecality() {

		return Specality;
	}

	@FindBy(xpath = "//option[contains(text(),'Lactation consulting')]")
	private WebElement seleSpecality;

	public WebElement getseleSpecality() {

		return seleSpecality;
	}

	@FindBy(xpath = "(//input[@name='licenexp'])[1]")
	private WebElement seleTC;

	public WebElement getseleTC() {

		return seleTC;
	}
//////////////facility info /////////////


	@FindBy(xpath = "(//a[normalize-space()='Facility Information'])[1]")
	private WebElement selefac;

	public WebElement getselefac() {

		return selefac;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Facility'])[1]")
	private WebElement addselefac;

	public WebElement getaddselefac() {

		return addselefac;
	}

	@FindBy(xpath = "(//input[@id='facility'])[1]")
	private WebElement addselefacname;

	public WebElement getaddselefacname() {

		return addselefacname;

	}

	@FindBy(xpath = "(//input[@id='country'])[1]")
	private WebElement addselefaccountry;

	public WebElement getaddselefaccountry() {

		return addselefaccountry;
	}

	@FindBy(xpath = "(//input[@id='address'])[1]")
	private WebElement addselefacadd;

	public WebElement getaddselefacadd() {

		return addselefacadd;
	}

	@FindBy(xpath = "(//input[@id='postal'])[1]")
	private WebElement addselefaczip;

	public WebElement getaddselefaczip() {

		return addselefaczip;
	}

	@FindBy(xpath = "(//input[@id='state'])[1]")
	private WebElement addselefacstate;

	public WebElement getaddselefacstate() {

		return addselefacstate;
	}

	@FindBy(xpath = "(//input[@id='city'])[1]")
	private WebElement addselefaccity;

	public WebElement getaddselefaccity() {

		return addselefaccity;
	}

	@FindBy(xpath = "(//input[@id='offphone'])[1]")
	private WebElement addseleofficephone;

	public WebElement getaddseleofficephone() {

		return addseleofficephone;
	}

	@FindBy(xpath = "(//input[@id='fax'])[1]")
	private WebElement addfax;

	public WebElement getaddfax() {

		return addfax;
	}

	@FindBy(xpath = "(//input[@id='set_as_telehealth'])[1]")
	private WebElement radiobtntele;

	public WebElement getradiobtntele() {

		return radiobtntele;
	}

	@FindBy(xpath = "(//button[normalize-space()='Continue'])[1]")
	private WebElement clicon;

	public WebElement getclicon() {

		return clicon;
	}

	@FindBy(xpath = "(//div[contains(text(),'Billing')])[2]")
	private WebElement clickbill;

	public WebElement getclickbill() {

		return clickbill;
	}

	@FindBy(xpath = "(//select[@id='pos_code'])[1]")

	private WebElement seleposco;

	public WebElement getseleposco() {

		return seleposco;
	}

	@FindBy(xpath = "(//input[@id='facility_npi'])[1]")

	private WebElement facnpi;

	public WebElement getfacnpi() {

		return facnpi;
	}

	@FindBy(xpath = "(//input[@id='fac_pro_num'])[1]")

	private WebElement facprovnum;

	public WebElement getfacprovnum() {

		return facprovnum;
	}

	@FindBy(xpath = "(//input[@id='bill_tax_id'])[1]")

	private WebElement billingtaxid;

	public WebElement getbillingtaxid() {

		return billingtaxid;
	}

	@FindBy(xpath = "(//input[@id='billing_npi'])[1]")

	private WebElement billingnpino;

	public WebElement getbillingnpino() {

		return billingnpino;
	}

	@FindBy(xpath = "(//input[@id='clia_exp_date'])[1]")

	private WebElement billingclia;

	public WebElement getbillingclia() {

		return billingclia;
	}

	@FindBy(xpath = "(//input[@id='clia_num'])[1]")

	private WebElement billingcliano;

	public WebElement getbillingcliano() {

		return billingcliano;
	}

	@FindBy(xpath = "(//input[@id='set_as_billing'])[1]")

	private WebElement radiobilfa;

	public WebElement getradiobilfa() {

		return radiobilfa;
	}

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")

	private WebElement closefac;

	public WebElement getclosefac() {

		return closefac;
	}
//////////////////click user//////////////////
	@FindBy(xpath = "(//a[normalize-space()='User'])[1]")

	private WebElement Usersele;

	public WebElement getUsersele() {

		return Usersele;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add User'])[1]")

	private WebElement addprovsele;

	public WebElement getaddprovsele() {

		return addprovsele;
	}

	@FindBy(xpath = "(//input[@id='fname'])[1]")

	private WebElement pfirstname;

	public WebElement getpfirstname() {

		return pfirstname;
	}

	@FindBy(xpath = "(//input[@id='lname'])[1]")

	private WebElement plastname;

	public WebElement getplastname() {

		return plastname;
	}

	@FindBy(xpath = "(//select[@id='settingprovider'])[1]")

	private WebElement primpro;

	public WebElement getprimpro() {

		return primpro;
	}

	@FindBy(xpath = "(//select[@id='settingprorole'])[1]")

	private WebElement primrol;

	public WebElement getprimrol() {

		return primrol;
	}

	@FindBy(xpath = "(//input[@id='email'])[1]")

	private WebElement emailadd;

	public WebElement getemailadd() {

		return emailadd;
	}

	@FindBy(xpath = "(//input[@id='username'])[1]")

	private WebElement usernam;

	public WebElement getusernam() {

		return usernam;
	}

	@FindBy(xpath = "(//input[@type='password'])[1]")

	private WebElement passpro;

	public WebElement getpasspro() {

		return passpro;
	}

	@FindBy(xpath = "(//input[@type='password'])[2]")

	private WebElement cpasspro;

	public WebElement getcpasspro() {

		return cpasspro;
	}

	@FindBy(xpath = "(//input[@id='phone'])[1]")

	private WebElement hphon;

	public WebElement gethphon() {

		return hphon;
	}

	@FindBy(xpath = "(//input[@id='phonecell'])[1]")

	private WebElement cphon;

	public WebElement getcphon() {

		return cphon;
	}

	@FindBy(xpath = "(//select[@id='facility_id'])[1]")

	private WebElement seledfac;

	public WebElement getseledfac() {

		return seledfac;
	}

	@FindBy(xpath = "(//input[@id='myCheck'])[1]")

	private WebElement chepror;

	public WebElement getchepror() {

		return chepror;
	}

	@FindBy(xpath = "(//input[@id='federaltaxid'])[1]")

	private WebElement fedrata;

	public WebElement getfedrata() {

		return fedrata;
	}

	@FindBy(xpath = "(//input[@id='n_dea'])[1]")

	private WebElement deanu;

	public WebElement getdeanu() {

		return deanu;
	}

	@FindBy(xpath = "(//input[@id='title'])[1]")

	private WebElement jobdes;

	public WebElement getjobdes() {

		return jobdes;
	}

	@FindBy(xpath = "//input[@id='taxonomy']")

	private WebElement taxom;

	public WebElement gettaxom() {

		return taxom;
	}

	@FindBy(xpath = "(//input[@id='n_upin'])[1]")

	private WebElement upinp;

	public WebElement getupinp() {

		return upinp;
	}

	@FindBy(xpath = "(//input[@id='npi'])[1]")

	private WebElement NPIP;

	public WebElement getNPIP() {

		return NPIP;
	}

	@FindBy(xpath = "(//select[@id='special'])[1]")

	private WebElement Specp;

	public WebElement getSpecp() {

		return Specp;
	}

	@FindBy(xpath = "(//select[@name='licentype'])[1]")

	private WebElement licty;

	public WebElement getlicty() {

		return licty;
	}

	@FindBy(xpath = "(//input[@name='licensenum'])[1]")

	private WebElement licsen;

	public WebElement getlicsen() {

		return licsen;
	}

	@FindBy(xpath = "(//input[@placeholder='License expiry Date'])[1]")

	private WebElement calep;

	public WebElement getcalep() {

		return calep;
	}

	@FindBy(xpath = "(//select[@name='licenseState'])[1]")

	private WebElement licsta;

	public WebElement getlicsta() {

		return licsta;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Licenses'])[1]")

	private WebElement addlic;

	public WebElement getaddlic() {

		return addlic;
	}

	@FindBy(xpath = "//div[2]//div[2]//div[3]//div[1]//*[name()='svg']")

	private WebElement deleli;

	public WebElement getdeleli() {

		return deleli;
	}

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")

	private WebElement closeus;

	public WebElement getcloseus() {

		return closeus;
	}

	@FindBy(xpath = "(//button[@type='button'])[13]")

	private WebElement clickedit;

	public WebElement getclickedit() {

		return clickedit;
	}

	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")

	private WebElement closeclickedit;

	public WebElement getcloseclickedit() {

		return closeclickedit;
	}
//////////// staff /////////////////

	@FindBy(xpath = "//div[contains(text(),'Staff')]")

	private WebElement clistaff;

	public WebElement getclistaff() {

		return clistaff;
	}

	@FindBy(xpath = "(//button[@class='create-cli marg-btn-top btn-fnt-wgt btn-remove-shadow btn btn-primary'])[1]")

	private WebElement cliaddstaff;

	public WebElement getcliaddstaff() {

		return cliaddstaff;
	}

	@FindBy(xpath = "(//input[@id='fname'])[1]")

	private WebElement fisrtnames;

	public WebElement getfisrtnames() {

		return fisrtnames;
	}

	@FindBy(xpath = "(//input[@id='lname'])[1]")

	private WebElement lastnames;

	public WebElement getlastnames() {

		return lastnames;
	}

	@FindBy(xpath = "(//select[@id='settingprovider'])[1]")

	private WebElement selepripro;

	public WebElement getselepripro() {

		return selepripro;
	}

	@FindBy(xpath = "(//select[@id='settingprorole'])[1]")

	private WebElement selerole;

	public WebElement getselerole() {

		return selerole;
	}

	@FindBy(xpath = "(//input[@id='email'])[1]")

	private WebElement seleemaiadd;

	public WebElement getseleemaiadd() {

		return seleemaiadd;
	}

	@FindBy(xpath = "(//input[@id='username'])[1]")

	private WebElement seleuserna;

	public WebElement getseleuserna() {

		return seleuserna;
	}

	@FindBy(xpath = "(//input[@type='password'])[1]")

	private WebElement selepass;

	public WebElement getselepass() {

		return selepass;
	}

	@FindBy(xpath = "(//input[@type='password'])[2]")

	private WebElement selecpass;

	public WebElement getselecpass() {

		return selecpass;
	}

	@FindBy(xpath = "(//input[@id='phone'])[1]")

	private WebElement selehoph;

	public WebElement getselehoph() {

		return selehoph;
	}

	@FindBy(xpath = "(//input[@id='phonecell'])[1]")

	private WebElement selecelph;

	public WebElement getselecelph() {

		return selecelph;
	}

	@FindBy(xpath = "(//select[@id='facility_id'])[1]")

	private WebElement seleDF;

	public WebElement getseleDF() {

		return seleDF;
	}

	@FindBy(xpath = "(//input[@id='myCheck'])[1]")

	private WebElement radiopro;

	public WebElement getradiopro() {

		return radiopro;
	}

	@FindBy(xpath = "(//input[@id='federaltaxid'])[1]")

	private WebElement fedtaxid;

	public WebElement getfedtaxid() {

		return fedtaxid;
	}

	@FindBy(xpath = "(//input[@id='n_dea'])[1]")

	private WebElement deanump;

	public WebElement getdeanump() {

		return deanump;
	}

	@FindBy(xpath = "(//input[@id='title'])[1]")

	private WebElement jobdesp;

	public WebElement getjobdesp() {

		return jobdesp;
	}

	@FindBy(xpath = "(//input[@id='taxonomy'])[1]")

	private WebElement taxmp;

	public WebElement gettaxmp() {

		return taxmp;
	}

	@FindBy(xpath = "(//input[@id='n_upin'])[1]")

	private WebElement upinpro;

	public WebElement getupinpro() {

		return upinpro;
	}

	@FindBy(xpath = "(//input[@id='npi'])[1]")

	private WebElement npipro;

	public WebElement getnpipro() {

		return npipro;
	}

	@FindBy(xpath = "(//select[@id='special'])[1]")

	private WebElement spesele;

	public WebElement getspesele() {

		return spesele;
	}

	@FindBy(xpath = "(//select[@name='licentype'])[1]")

	private WebElement licetyp;

	public WebElement getlicetyp() {

		return licetyp;
	}

	@FindBy(xpath = "(//input[@name='licensenum'])[1]")

	private WebElement licetp;

	public WebElement getlicetp() {

		return licetp;
	}

	@FindBy(xpath = "(//input[@placeholder='License expiry Date'])[1]")

	private WebElement liceexpp;

	public WebElement getliceexpp() {

		return liceexpp;
	}

	@FindBy(xpath = "(//select[@name='licenseState'])[1]")

	private WebElement licestat;

	public WebElement getlicestat() {

		return licestat;
	}

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")

	private WebElement closeadds;

	public WebElement getlcloseadds() {

		return closeadds;
	}
	
	
	////// My Plan ////////////
	
	@FindBy(linkText =      "My plan")

	private WebElement myplan;

	public WebElement getmyplan() {

		return myplan;
	}
	
	@FindBy(xpath =     "(//div[@class='sc-bOJcbE gvOVwM'])[1]")

	private WebElement planname;

	public WebElement getplanname() {

		return planname;
	}
	
	@FindBy(xpath =     "(//a[normalize-space()='Add Clinicians'])[1]")

	private WebElement addclinicians;

	public WebElement getaddclinicians() {

		return addclinicians;
	}
	
	@FindBy(xpath =     "(//button[normalize-space()='+'])[1]")

	private WebElement incclinicians;

	public WebElement getincclinicians() {

		return incclinicians;
	}
	
	@FindBy(xpath =     "(//button[normalize-space()='-'])[1]")

	private WebElement decclinicians;

	public WebElement getdecclinicians() {

		return decclinicians;
	}
	
	@FindBy(xpath =     "(//*[name()='svg'][@stroke='currentColor'])[6]")

	private WebElement closeclini;

	public WebElement getcloseclini() {

		return closeclini;
	}
	
	@FindBy(xpath =     "(//button[normalize-space()='Pay Now'])[1]")

	private WebElement paynowtex;

	public WebElement getpaynowtex() {

		return paynowtex;
	}
	
	@FindBy(xpath =     "(//p[@class='sc-cdZahM bZVrnJ'])[7]")

	private WebElement essmontlyto;

	public WebElement getessmontlyto() {

		return essmontlyto;
	}
	
	@FindBy(xpath =     "(//button[normalize-space()='Edit Payment Info'])[1]")

	private WebElement editpayment;

	public WebElement geteditpayment() {

		return editpayment;
	}
	
	@FindBy(xpath =     "(//input[@placeholder='Enter Applicant Name'])[1]")

	private WebElement cardholname;

	public WebElement getcardholname() {

		return cardholname;
	}
	
	@FindBy(xpath =     "(//div[@class='sc-jVZirl fIdEHd'])[1]")

	private WebElement cardno;

	public WebElement getcardno() {

		return cardno;
	}
	
	@FindBy(xpath =     "(//input[@placeholder='MM/YY'])[1]")

	private WebElement expino;

	public WebElement getexpino() {

		return expino;
	}
	
	@FindBy(xpath =     "(//button[normalize-space()='Cancel'])[1]")

	private WebElement canceledi;

	public WebElement getcanceledi() {

		return canceledi;
	}

	@FindBy(xpath =     "(//h3[@class='sc-bfKFlL gjIjzS'])[2]")

	private WebElement subid;

	public WebElement getsubid() {

		return subid;
	}
	
	@FindBy(xpath =     "(//h3[@class='sc-bfKFlL gjIjzS'])[3]")

	private WebElement cusid;

	public WebElement getcusid() {

		return cusid;
	}
	
	@FindBy(xpath =     "(//div[contains(text(),'Invoice')])[1]")

	private WebElement invoicesele;

	public WebElement getinvoicesele() {

		return invoicesele;
	}
	
	@FindBy(xpath =     "(//button[contains(text(),'View Invoice')])[1]")

	private WebElement viewinvo;

	public WebElement getviewinvo() {

		return viewinvo;
	}
	
	@FindBy(xpath =     "(//td[@class='sc-gITdmR eaHEGc'])[1]")

	private WebElement billingcycl;

	public WebElement getbillingcycl() {

		return billingcycl;
	}
	
	@FindBy(xpath =     "(//td[@class='sc-gITdmR dIKPtU'])[1]")

	private WebElement paidam;

	public WebElement getpaidam() {

		return paidam;
	}
	
	@FindBy(xpath =     "(//*[name()='svg'][@stroke='currentColor'])[6]")

	private WebElement closeinvo;

	public WebElement getcloseinvo() {

		return closeinvo;
	}
	
//////////////Appointment  Remainder //////////////
	@FindBy(xpath = "(//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow2'])[1]")

	private WebElement featurcli;

	public WebElement getfeaturcli() {

		return featurcli;
	}

	@FindBy(xpath = "(//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow4'])[1]")

	private WebElement clischedul;

	public WebElement getclischedul() {

		return clischedul;
	}

	@FindBy(xpath = "(//a[normalize-space()='Calendar Settings'])[1]")

	private WebElement clical;

	public WebElement getclical() {

		return clical;
	}

	@FindBy(xpath = "(//select[@name='calendarfrom'])[1]")

	private WebElement calfrom;

	public WebElement getcalfrom() {

		return calfrom;
	}

	@FindBy(xpath = "(//select[@name='calendarto'])[1]")

	private WebElement calto;

	public WebElement getcalto() {

		return calto;
	}

	@FindBy(xpath = "(//select[@name='calendarview'])[1]")

	private WebElement seledayw;

	public WebElement getseledayw() {

		return seledayw;
	}

	@FindBy(xpath = "(//select[@name='calendarview1'])[1]")

	private WebElement fulwe;

	public WebElement getfulwe() {

		return fulwe;
	}

	@FindBy(xpath = "(//a[normalize-space()='Appointment Reminders'])[1]")

	private WebElement apprem;

	public WebElement getapprem() {

		return apprem;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-switch-handle')])")

	private WebElement emairad;

	public WebElement getemairad() {

		return emairad;
	}

	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Edit'])[1]")

	private WebElement emailedit;

	public WebElement getemailedit() {

		return emailedit;
	}

	@FindBy(xpath = "(//select[@class='form-control'])[1]")

	private WebElement emailcli;

	public WebElement getemailcli() {

		return emailcli;
	}

	@FindBy(xpath = "(//select[@class='m-t-29 form-control'])[1]")

	private WebElement clprae;

	public WebElement getclprae() {

		return clprae;
	}

	@FindBy(xpath = "(//select[@class='m-t-29 form-control'])[2]")

	private WebElement clclie;

	public WebElement getclclie() {

		return clclie;
	}

	@FindBy(xpath = "(//select[@class='m-t-29 form-control'])[3]")

	private WebElement clcappe;

	public WebElement getclcappe() {

		return clcappe;
	}

	@FindBy(xpath = "(//select[@class='m-t-29 form-control'])[4]")

	private WebElement clclinke;

	public WebElement getclclinke() {

		return clclinke;
	}

	@FindBy(xpath = "(//input[@id='emailsubject'])[1]")

	private WebElement remsenem;

	public WebElement getremsenem() {

		return remsenem;
	}

	@FindBy(xpath = "(//textarea[@id='emailmessage'])[1]")

	private WebElement msgema;

	public WebElement getmsgema() {

		return msgema;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement cancelema;

	public WebElement getcancelema() {

		return cancelema;
	}

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[2]")

	private WebElement teleedit;

	public WebElement getteleedit() {

		return teleedit;
	}

	@FindBy(xpath = "(//select[contains(@class,'form-control')])[1]")

	private WebElement telecli;

	public WebElement gettelecli() {

		return telecli;
	}

	@FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[1]")

	private WebElement clpraT;

	public WebElement getclpraT() {

		return clpraT;
	}

	@FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[2]")

	private WebElement clcliT;

	public WebElement getclcliT() {

		return clcliT;
	}

	@FindBy(xpath = "(//select[@class='m-t-29 form-control'])[3]")

	private WebElement clcappT;

	public WebElement getclcappT() {

		return clcappT;
	}

	@FindBy(xpath = "(//select[@class='m-t-29 form-control'])[4]")

	private WebElement clclinkT;

	public WebElement getclclinkT() {

		return clclinkT;
	}

	@FindBy(xpath = "(//input[@id='telehealthsubject'])[1]")

	private WebElement remsentel;

	public WebElement getremsentel() {

		return remsentel;
	}

	@FindBy(xpath = "(//textarea[@id='telehealthmessage'])[1]")

	private WebElement msgtele;

	public WebElement getmsgtele() {

		return msgtele;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement canceltele;

	public WebElement getcanceltele() {

		return canceltele;
	}
/////////////// Voice ///////////////
	@FindBy(xpath = "//div[contains(text(),'Voice')]")

	private WebElement voicear;

	public WebElement getvoicear() {

		return voicear;
	}

	@FindBy(xpath = "(//button[contains(@role,'switch')])[2]")

	private WebElement voicerad;

	public WebElement getvoicerad() {

		return voicerad;
	}

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[3]")

	private WebElement voiceedit;

	public WebElement getvoiceedit() {

		return voiceedit;
	}

	@FindBy(xpath = "(//select[contains(@class,'form-control')])[1]")

	private WebElement voicecli;

	public WebElement getvoicecli() {

		return voicecli;
	}

	@FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[1]")

	private WebElement clpravoice;

	public WebElement getclpravoice() {

		return clpravoice;
	}

	@FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[2]")

	private WebElement clclievoice;

	public WebElement getclclievoice() {

		return clclievoice;
	}

	@FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[3]")

	private WebElement clcappvoice;

	public WebElement getclcappvoice() {

		return clcappvoice;
	}

	@FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[4]")

	private WebElement clclinkvoice;

	public WebElement getclclinkvoice() {

		return clclinkvoice;
	}

	@FindBy(xpath = "(//textarea[@id='voicemessage'])[1]")

	private WebElement msgvoice;

	public WebElement getmsgvoice() {

		return msgvoice;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement cancelvoice;

	public WebElement getcancelvoice() {

		return cancelvoice;
	}
	//////////////////// text //////////
	@FindBy(xpath = "(//div[contains(text(),'Text')])[1]")

	private WebElement textar;

	public WebElement gettextar() {

		return textar;
	}

	@FindBy(xpath = "(//button[@role='switch'])[3]")

	private WebElement textrad;

	public WebElement gettextrad() {

		return textrad;
	}

	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Edit'])[4]")

	private WebElement textedit;

	public WebElement gettextedit() {

		return textedit;
	}

	@FindBy(xpath = "(//select[contains(@class,'form-control')])[1]")

	private WebElement textcli;

	public WebElement gettextcli() {

		return textcli;
	}

	@FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[1]")

	private WebElement clpratext;

	public WebElement getclpratext() {

		return clpratext;
	}

	@FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[2]")

	private WebElement clclietext;

	public WebElement getclclietext() {

		return clclietext;
	}

	@FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[3]")

	private WebElement clcapptext;

	public WebElement getclcapptext() {

		return clcapptext;
	}

	@FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[4]")

	private WebElement clclinktext;

	public WebElement getclclinktext() {

		return clclinktext;
	}

	@FindBy(xpath = "(//textarea[@id='textmessage'])[1]")

	private WebElement msgtext;

	public WebElement getmsgtext() {

		return msgtext;
	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")

	private WebElement canceltext;

	public WebElement getcanceltext() {

		return canceltext;
	}

	@FindBy(xpath = "//div[contains(text(),'Account settings')]")

	private WebElement cliacse;

	public WebElement getcliacse() {

		return cliacse;
	}

	@FindBy(xpath = "//div[contains(text(),'Scheduling')]")

	private WebElement clished2;

	public WebElement getclished2() {

		return clished2;
	}

	@FindBy(xpath = "//div[contains(text(),'Administration')]")

	private WebElement Admcli;

	public WebElement getAdmcli() {

		return Admcli;
	}

	@FindBy(xpath = "(//a[normalize-space()='eRx Settings'])[1]")

	private WebElement erxset;

	public WebElement geterxset() {

		return erxset;
	}

	@FindBy(xpath = "(//span[normalize-space()='Favourite Prescriptions'])[1]")

	private WebElement favpres;

	public WebElement getfavpres() {

		return favpres;
	}
////////////////////Click Senderx ///////

	@FindBy(xpath = "//a[contains(text(),'E-Prescriptions')]")

	private WebElement clicsene;

	public WebElement getclicsene() {

		return clicsene;

	}
////////////////setting erx ///////////////////

	@FindBy(xpath = "(//span[normalize-space()='Favourite Prescriptions'])[1]")

	private WebElement adpres;

	public WebElement getadpres() {

		return adpres;

	}

	@FindBy(xpath = "//label[@class='ant-radio-button-wrapper']//span[contains(text(),'Compound')]")

	private WebElement clicomp;

	public WebElement getclicomp() {

		return clicomp;
	}

	@FindBy(xpath = "(//span[normalize-space()='Supply'])[1]")

	private WebElement clisupp;

	public WebElement getclisupp() {

		return clisupp;
	}

	@FindBy(xpath = "(//input[@placeholder='Find Medication'])[1]")

	private WebElement finmedp;

	public WebElement getfinmedp() {

		return finmedp;
	}

	@FindBy(xpath = "(//input[@placeholder='Find Compound'])[1]")

	private WebElement fincompp;

	public WebElement getfincompp() {

		return fincompp;
	}

	@FindBy(xpath = "(//input[@placeholder='Find Supply'])[1]")

	private WebElement finsupp;

	public WebElement getfinsupp() {

		return finsupp;
	}

	@FindBy(xpath = "(//div[@class='title'][normalize-space()='RETIN-A (Topical)'])[1]")

	private WebElement selmedp;

	public WebElement getselmedp() {

		return selmedp;
	} // (//div[@class='title'][normalize-space()='RETIN-A (Topical)'])[1]

	@FindBy(xpath = "(//div[@class='title'][normalize-space()='RETIN-A (Topical)'])[1]")

	private WebElement selcomp;

	public WebElement getselcomp() {

		return selcomp;
	}

	@FindBy(xpath = "(//div[@class='content'])[1]")

	private WebElement selsupp;

	public WebElement getselsupp() {

		return selsupp;
	}

	@FindBy(xpath = "(//span[contains(@class,'ant-input-group-addon')])[1]")

	private WebElement selsigp;

	public WebElement getselsigp() {

		return selsigp;
	}//

	@FindBy(xpath = "(//span[contains(@class,'ant-select-selection-item')])[1]")

	private WebElement seldosp;

	public WebElement getseldosp() {

		return seldosp;
	}

	@FindBy(xpath = "(//div[contains(text(),'apply')])[1]")

	private WebElement clidosp;

	public WebElement getclidosp() {

		return clidosp;
	}

	@FindBy(xpath = "(//span[contains(@class,'ant-select-selection-item')])[2]")

	private WebElement selunip;

	public WebElement getselunip() {

		return selunip;
	}

	@FindBy(xpath = "(//div[contains(text(),'gram(s)')])[2]")

	private WebElement cliunip;

	public WebElement getcliunip() {

		return cliunip;
	}

	@FindBy(xpath = "(//span[contains(@class,'ant-select-selection-item')])[3]")

	private WebElement selroup;

	public WebElement getselroup() {

		return selroup;
	}

	@FindBy(xpath = "(//div[contains(text(),'inhalation')])[1]")

	private WebElement cliroup;

	public WebElement getcliroup() {

		return cliroup;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[5]")

	private WebElement selfrep;

	public WebElement getselfrep() {

		return selfrep;
	}

	@FindBy(xpath = "(//div[contains(text(),'4 times a day')])[1]")

	private WebElement clifrep;

	public WebElement getclifrep() {

		return clifrep;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[6]")

	private WebElement seldirp;

	public WebElement getseldirp() {

		return seldirp;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='after meals'])[1]")

	private WebElement clidirp;

	public WebElement getclidirp() {

		return clidirp;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[7]")

	private WebElement seldurp;

	public WebElement getseldurp() {

		return seldurp;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='x1 day'])[1]")

	private WebElement clidurp;

	public WebElement getclidurp() {

		return clidurp;
	}

	@FindBy(xpath = "(//span[normalize-space()='Update'])[1]")

	private WebElement cliupdp;

	public WebElement getcliupdp() {

		return cliupdp;
	}

	@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")

	private WebElement effdatp;

	public WebElement geteffdatp() {

		return effdatp;
	}

	@FindBy(xpath = "(//div[normalize-space()='14'])[1]")

	private WebElement effdatselp;

	public WebElement geteffdatselp() {

		return effdatselp;
	}

	@FindBy(xpath = "(//input[@type='text'])[4]")

	private WebElement sendip;

	public WebElement getsendip() {

		return sendip;
	}
	
	@FindBy(xpath = "(//input[@type='text'])[5]")

	private WebElement sendip1;

	public WebElement getsendip1() {

		return sendip1;
	}

	@FindBy(xpath = "(//span[contains(@class,'ant-select-selection-item')])[7]")

	private WebElement diunp;

	public WebElement getdiunp() {

		return diunp;
	}

	@FindBy(xpath = "(//div[contains(text(),'Capsule')])[1]")

	private WebElement diunselp;

	public WebElement getdiunselp() {

		return diunselp;
	}

	@FindBy(xpath = "(//input[@type='text'])[5]")

	private WebElement refip;

	public WebElement getrefip() {

		return refip;
	}
	
	@FindBy(xpath = "(//input[@type='text'])[6]")

	private WebElement refip1;

	public WebElement getrefip1() {

		return refip1;
	}

	@FindBy(xpath = "(//input[contains(@type,'text')])[7]")

	private WebElement notophap;

	public WebElement getnotophap() {

		return notophap;
	}

	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")

	private WebElement clisavp;

	public WebElement getclisavp() {

		return clisavp;
	}

	@FindBy(xpath = "(//button[normalize-space()='Preview Prescription'])[1]")

	private WebElement prepres;

	public WebElement getprepres() {

		return prepres;
	}

	@FindBy(xpath = "(//button[normalize-space()='Edit Prescription'])[1]")

	private WebElement edipres;

	public WebElement getedipres() {

		return edipres;
	}

	@FindBy(xpath = "(//a[normalize-space()='Electronic Reports'])[1]")

	private WebElement clelctronicrep;

	public WebElement getclelctronicrep() {

		return clelctronicrep;
	}

	@FindBy(xpath = "(//input[@placeholder='From Date'])[1]")

	private WebElement pofromdat;

	public WebElement getpofromdat() {

		return pofromdat;
	}

	@FindBy(xpath = "(//div[normalize-space()='22'])[1]")

	private WebElement poselfromdat;

	public WebElement getposelfromdat() {

		return poselfromdat;
	}

	@FindBy(xpath = "(//input[@placeholder='To Date'])[1]")

	private WebElement potodat;

	public WebElement getpotodat() {

		return potodat;
	}

	@FindBy(xpath = "(//div[contains(text(),'22')])[2]")

	private WebElement poseltodat;

	public WebElement getposeltodat() {

		return poseltodat;
	}

	@FindBy(xpath = "(//select[@class='arrow-adj form-control'])[1]")

	private WebElement selesta;

	public WebElement getselesta() {

		return selesta;
	}

	@FindBy(xpath = "(//option[@value='2'])[1]")

	private WebElement selestare;

	public WebElement getselestare() {

		return selestare;
	}

	@FindBy(xpath = "(//select[@class='tk-sel-box form-control'])[1]")

	private WebElement selepr;

	public WebElement getselepr() {

		return selepr;
	}

	@FindBy(xpath = "(//option[normalize-space()='tech1 test'])[1]")

	private WebElement seleprt;

	public WebElement getseleprt() {

		return seleprt;
	}

	@FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")

	private WebElement clisub;

	public WebElement getclisub() {

		return clisub;
	}

	@FindBy(xpath = "(//span[normalize-space()='Compound'])[1]")

	private WebElement clicom;

	public WebElement getclicom() {

		return clicom;
	}

	@FindBy(xpath = "(//span[normalize-space()='Supply'])[1]")

	private WebElement clisup;

	public WebElement getclisup() {

		return clisup;
	}

	@FindBy(xpath = "(//input[@placeholder='Find Medication'])[1]")

	private WebElement finmed;

	public WebElement getfinmed() {

		return finmed;
	}

	@FindBy(xpath = "(//input[@placeholder='Find Compound'])[1]")

	private WebElement fincomp;

	public WebElement getfincomp() {

		return fincomp;
	}

	@FindBy(xpath = "(//input[@placeholder='Find Supply'])[1]")

	private WebElement finsup;

	public WebElement getfinsup() {

		return finsup;
	}

	@FindBy(xpath = "(//div[@class='content'])[1]")

	private WebElement selmed;

	public WebElement getselmed() {

		return selmed;
	}

	@FindBy(xpath = "(//div[contains(@class,'title')][normalize-space()='RETIN-A (Topical)'])[1]")

	private WebElement selmed1;

	public WebElement getselmed1() {

		return selmed1;
	}

	@FindBy(xpath = "(//div[@class='title'][normalize-space()='RETIN-A (Topical)'])[1]")

	private WebElement selcom;

	public WebElement getselcom() {

		return selcom;
	}

	@FindBy(xpath = "(//span[@class='ant-input-group-addon'])[1]")

	private WebElement selsig;

	public WebElement getselsig() {

		return selsig;
	}//

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")

	private WebElement seldos;

	public WebElement getseldos() {

		return seldos;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='apply'])[1]")

	private WebElement clidos;

	public WebElement getclidos() {

		return clidos;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[3]")

	private WebElement seluni;

	public WebElement getseluni() {

		return seluni;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='gram(s)'])[1]")

	private WebElement cliuni;

	public WebElement getcliuni() {

		return cliuni;
	}

	@FindBy(xpath = "(//span[@title='n/a'])[1]")

	private WebElement selrou;

	public WebElement getselrou() {

		return selrou;
	}

	@FindBy(xpath = "(//div[contains(text(),'inhalation')])[1]")

	private WebElement clirou;

	public WebElement getclirou() {

		return clirou;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[5]")

	private WebElement selfre;

	public WebElement getselfre() {

		return selfre;
	}

	@FindBy(xpath = "(//div[contains(text(),'4 times a day')])[1]")

	private WebElement clifre;

	public WebElement getclifre() {

		return clifre;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[6]")

	private WebElement seldir;

	public WebElement getseldir() {

		return seldir;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='after meals'])[1]")

	private WebElement clidir;

	public WebElement getclidir() {

		return clidir;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[7]")

	private WebElement seldur;

	public WebElement getseldur() {

		return seldur;
	}

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='x1 day'])[1]")

	private WebElement clidur;

	public WebElement getclidur() {

		return clidur;
	}

	@FindBy(xpath = "(//span[normalize-space()='Update'])[1]")

	private WebElement cliupd;

	public WebElement getcliupd() {

		return cliupd;
	}//

	@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")

	private WebElement effdat;

	public WebElement geteffdat() {

		return effdat;
	}

	@FindBy(xpath = "(//div[normalize-space()='14'])[1]")

	private WebElement effdatsel;

	public WebElement geteffdatsel() {

		return effdatsel;
	}

	@FindBy(xpath = "(//input[@type='number'])[1]")

	private WebElement sendi;

	public WebElement getsendi() {

		return sendi;
	}

	@FindBy(xpath = "(//input[contains(@type,'text')])[4]")

	private WebElement sendi1;

	public WebElement getsendi1() {

		return sendi1;
	}

	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[1]")

	private WebElement diun;

	public WebElement getdiun() {

		return diun;
	}

	@FindBy(xpath = "(//div[contains(text(),'Capsule')])[1]")

	private WebElement diunsel;

	public WebElement getdiunsel() {

		return diunsel;
	}

	@FindBy(xpath = "(//input[@type='number'])[2]")

	private WebElement refi;

	public WebElement getrefi() {

		return refi;
	}

	@FindBy(xpath = "(//input[@type='text'])[4]")

	private WebElement notopha;

	public WebElement getnotopha() {

		return notopha;
	}

	@FindBy(xpath = "(//span[normalize-space()='Save'])[1]")

	private WebElement clisav;

	public WebElement getclisav() {

		return clisav;
	}
}
