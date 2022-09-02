package com.newtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capminds.Capminds_BaseClass;
import com.pageobjectmanager.Pageobjectmanager;

public class Setting_Module extends Capminds_BaseClass {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		geturl("https://ehr.vozo.xyz:444/");

		// Enter Username

		sendkeys(pom.getinstance().getUsername(), "tech1");

		// Enter Password

		sendkeys(pom.getinstance().getPassword(), "capminds@03");

		// Click Signin Button '

		Clickonelement(pom.getinstance().getSigninbtn());

		//////////////////////// settings //////////////

		// click Settings

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		Clickonelement(pom.getSettings_Module().getclciksettings());

		// click account settings

		Thread.sleep(6000);

		Clickonelement(pom.getSettings_Module().getclickaccountsettings());

		// send first name

		sendkeys(pom.getSettings_Module().getsendfirst(), "ABCD");

		// send last

		sendkeys(pom.getSettings_Module().getsendlastname(), "xyz");

		// middle name

		sendkeys(pom.getSettings_Module().getsendmiddlename(), "PRR");

		// clcik suffix

		Clickonelement(pom.getSettings_Module().getselectsuffix());

		// select suffix

		Clickonelement(pom.getSettings_Module().getselectmrsuffix());

		// email name

		clear(pom.getSettings_Module().getsendmail());

		sendkeys(pom.getSettings_Module().getsendmail(), "xyz@gmail.com");

		// phone

		clear(pom.getSettings_Module().getsendphone());

		sendkeys(pom.getSettings_Module().getsendphone(), "123456789");

		// send new pass

		sendkeys(pom.getSettings_Module().getsendnewpass(), "abc@123");

		// send confirm pass

		sendkeys(pom.getSettings_Module().getsendconpass(), "abc@123");

		// send confirm pass

		sendkeys(pom.getSettings_Module().getsendcurrennpass(), "abc@123");

		// get text

		// gettext(pom.getSettings_Module().getgetprofile());

		////////////// click clinical ////////////////
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement clinical = wait3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Clinical')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clinical);

//		Thread.sleep(6000);
//
//		Clickonelement(pom.getSettings_Module().getclickclini());

		// license

		// clear(pom.getSettings_Module().getcfirstname());

		Clickonelement(pom.getSettings_Module().getlicensety());

		// select license

		Clickonelement(pom.getSettings_Module().getselelicensety());

		// license#

		sendkeys(pom.getSettings_Module().getselelicenseno(), "12345");

		// calender sele

		sendkeys(pom.getSettings_Module().getcalendercl(), "03/16/2022");

		// license state

		Clickonelement(pom.getSettings_Module().getlicensestate());

		// license state

		Thread.sleep(3000);
		sendkeys(pom.getSettings_Module().getNpinumber(), "1234");

		// specality

		Thread.sleep(3000);

		selectone(pom.getSettings_Module().getSpecality(), "Lactation consulting");

//					Select se = new Select(driver.findElement(By.xpath("(//select[@name='specialty'])[1]")));
//					
//					se.selectByVisibleText("Lactation consulting");

//					Clickonelement(pom.getSettings_Module().getSpecality());
		//
//					Clickonelement(pom.getSettings_Module().getseleSpecality());

		// sele tc

		clear(pom.getSettings_Module().getseleTC());

		sendkeys(pom.getSettings_Module().getseleTC(), "123456789");

		////////////// facility info /////////////

		Thread.sleep(3000);

		Clickonelement(pom.getSettings_Module().getselefac());

		// add faci

		Clickonelement(pom.getSettings_Module().getaddselefac());

		// facename

		sendkeys(pom.getSettings_Module().getaddselefacname(), "xyz");

		// facename

		sendkeys(pom.getSettings_Module().getaddselefaccountry(), "abc");

		// facename

		sendkeys(pom.getSettings_Module().getaddselefacadd(), "abc street");

		// facename

		sendkeys(pom.getSettings_Module().getaddselefaczip(), "55555");

		// State

		sendkeys(pom.getSettings_Module().getaddselefacstate(), "abc state");

		// City

		sendkeys(pom.getSettings_Module().getaddselefaccity(), "abc City");

		// phone

		sendkeys(pom.getSettings_Module().getaddseleofficephone(), "123456");

		// phone

		sendkeys(pom.getSettings_Module().getaddseleofficephone(), "123456");

		// fax

		sendkeys(pom.getSettings_Module().getaddfax(), "54321");

		// radio button

		Clickonelement(pom.getSettings_Module().getradiobtntele());

		// cli con btn

		Clickonelement(pom.getSettings_Module().getclicon());

		// Billing add fac

		Thread.sleep(3000);
		Clickonelement(pom.getSettings_Module().getclickbill());

		// pos code

		selectone(pom.getSettings_Module().getseleposco(), "Telehealth");

		// Facility Npi

		sendkeys(pom.getSettings_Module().getfacnpi(), "54321");

		// Facility Npi

		sendkeys(pom.getSettings_Module().getfacnpi(), "54321");

		// Facility fac num

		sendkeys(pom.getSettings_Module().getfacprovnum(), "456789");

		// billing tax no

		sendkeys(pom.getSettings_Module().getbillingtaxid(), "456789");

		// billing npi no

		sendkeys(pom.getSettings_Module().getbillingnpino(), "456789");

		// clia npi no

		sendkeys(pom.getSettings_Module().getbillingclia(), "03/18/2022");

		// billing npi no

		sendkeys(pom.getSettings_Module().getbillingcliano(), "456789");

		// radio bill fac

		Clickonelement(pom.getSettings_Module().getradiobilfa());

		// close fac

		Clickonelement(pom.getSettings_Module().getclosefac());

		////////////////// click user//////////////////

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getUsersele());

		// click user

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getaddprovsele());

		// firstname p

		sendkeys(pom.getSettings_Module().getpfirstname(), "hello");

		// last p

		sendkeys(pom.getSettings_Module().getplastname(), "123");

		// select prime

		selectone(pom.getSettings_Module().getprimpro(), "Select Provider");

		// select prime

		selectone(pom.getSettings_Module().getprimpro(), "Select Provider");

		// select role

		sendkeys(pom.getSettings_Module().getemailadd(), "xyz@gmail.com");

		// select usernam

		sendkeys(pom.getSettings_Module().getusernam(), "admin");

		// select pass

		sendkeys(pom.getSettings_Module().getpasspro(), "admin@123");

		// select pass

		sendkeys(pom.getSettings_Module().getcpasspro(), "admin@123");

		// select phon

		sendkeys(pom.getSettings_Module().getcphon(), "123456");

		// select phon

		selectone(pom.getSettings_Module().getseledfac(), "oemrvozo");

		// radio

		Clickonelement(pom.getSettings_Module().getchepror());

		// Federal Tax ID:

		Clickonelement(pom.getSettings_Module().getfedrata());

		// select dea

		sendkeys(pom.getSettings_Module().getdeanu(), "12343");

		// select dea

		sendkeys(pom.getSettings_Module().getjobdes(), "welcome");

		// select dea

		sendkeys(pom.getSettings_Module().gettaxom(), "Hello");

		// select upi

		sendkeys(pom.getSettings_Module().getupinp(), "123");

		// select npi

		sendkeys(pom.getSettings_Module().getNPIP(), "123");
		// select spe

		selectone(pom.getSettings_Module().getSpecp(), "Acupuncture");

		// select lic

		selectone(pom.getSettings_Module().getlicty(), "LCSW");

		// select lic

		sendkeys(pom.getSettings_Module().getlicsen(), "123456");

		// select lic

		sendkeys(pom.getSettings_Module().getcalep(), "03/17/2022");

		// select spe

		selectone(pom.getSettings_Module().getlicsta(), "AK");

		// add lice

		// Clickonelement(pom.getSettings_Module().getaddlic());

		// dele lice

		// Clickonelement(pom.getSettings_Module().getaddlic());

		// close

		Clickonelement(pom.getSettings_Module().getcloseus());

		// click edit

		Clickonelement(pom.getSettings_Module().getclickedit());

		// close edit

		Clickonelement(pom.getSettings_Module().getcloseclickedit());

		//// //////// staff /////////////////

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclistaff());

		// addstaff
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getcliaddstaff());

		// first name

		sendkeys(pom.getSettings_Module().getfisrtnames(), "abcd");

		// last name

		sendkeys(pom.getSettings_Module().getlastnames(), "efgh");

		// select pp

		selectone(pom.getSettings_Module().getselepripro(), "tech1 test");

		// select role

		selectone(pom.getSettings_Module().getselerole(), "Administrators");

		// select pass

		sendkeys(pom.getSettings_Module().getseleemaiadd(), "admin@gmail.com");

		// select pass

		sendkeys(pom.getSettings_Module().getseleuserna(), "admin123");

		// select pass

		sendkeys(pom.getSettings_Module().getselepass(), "admin123");

		// select pass

		sendkeys(pom.getSettings_Module().getselecpass(), "admin123");

		// select pass

		sendkeys(pom.getSettings_Module().getselehoph(), "123456");

		// select pass

		sendkeys(pom.getSettings_Module().getselecelph(), "123456");

		// select pass

		selectone(pom.getSettings_Module().getseleDF(), "oemrvozo");

		// check for provider

		Clickonelement(pom.getSettings_Module().getradiopro());

		// select pass

		sendkeys(pom.getSettings_Module().getfedtaxid(), "123456");

		// select deanum

		sendkeys(pom.getSettings_Module().getdeanump(), "654321");

		// job des

		sendkeys(pom.getSettings_Module().getjobdesp(), "welcome");

		// taxmp

		sendkeys(pom.getSettings_Module().gettaxmp(), "hello");

		// upi

		sendkeys(pom.getSettings_Module().getupinpro(), "123456");

		// npi

		sendkeys(pom.getSettings_Module().getnpipro(), "65432");

		// select spec

		selectone(pom.getSettings_Module().getspesele(), "Counseling");

		// select spec

		selectone(pom.getSettings_Module().getlicetyp(), "LICSW");

		// upi

		sendkeys(pom.getSettings_Module().getlicetp(), "123456");

		// upi

		sendkeys(pom.getSettings_Module().getliceexpp(), "03/19/2022");

		// licsta

		selectone(pom.getSettings_Module().getlicestat(), "AZ");

		// close

		Clickonelement(pom.getSettings_Module().getcloseus());

		Clickonelement(pom.getSettings_Module().getselefac());

		////////// My Plan /////

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='My plan'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);

		Thread.sleep(5000);

		// Clickonelement(pom.getSettings_Module().getmyplan());

		// Plan details

		gettext(pom.getSettings_Module().getplanname());

		// Add Clinicians

		Clickonelement(pom.getSettings_Module().getaddclinicians());

		// Add clinicians

		Clickonelement(pom.getSettings_Module().getincclinicians());

		// reduc clinicians

		Clickonelement(pom.getSettings_Module().getdecclinicians());

		// get pay clinicians

		gettext(pom.getSettings_Module().getpaynowtex());

		// Close Clinicians

		Clickonelement(pom.getSettings_Module().getcloseclini());

		// up bil
		System.out.println("Estimated Monthly Total");
		gettext(pom.getSettings_Module().getessmontlyto());

		// edit Payment
		Clickonelement(pom.getSettings_Module().geteditpayment());

		// get card name

		gettext(pom.getSettings_Module().getcardholname());

		// card no

		gettext(pom.getSettings_Module().getcardno());

		// get card name

		gettext(pom.getSettings_Module().getexpino());
		
		//cancel ed
		
		Clickonelement(pom.getSettings_Module().getcanceledi());
		
		// sub id 
		
		System.out.println("Your Subscription ID");
		gettext(pom.getSettings_Module().getsubid());
		
		//cus id
		System.out.println("Your Customer ID");
		gettext(pom.getSettings_Module().getcusid());
		
		//select Invoice 
		
		Thread.sleep(6000);
		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement invoic = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Invoice')])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", invoic);

		
		//Clickonelement(pom.getSettings_Module().getinvoicesele());
		
		//View Invoice
		Thread.sleep(6000);
		
		Clickonelement(pom.getSettings_Module().getviewinvo());
		
		//billi Cycl
		
		gettext(pom.getSettings_Module().getbillingcycl());
		
		//Paid Amount
		
		System.out.println("Paid Amount");
		
		gettext(pom.getSettings_Module().getpaidam());
		
		//close invoi
		
		Clickonelement(pom.getSettings_Module().getcloseinvo());
		
		
		
		// click Settings

//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//
//		Clickonelement(pom.getSettings_Module().getclciksettings());

		///////////////// clcik Features ///////////////
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getfeaturcli());

		// click schedul
		Thread.sleep(4000);
		Clickonelement(pom.getSettings_Module().getclischedul());

		// clic cal
		Clickonelement(pom.getSettings_Module().getclical());

		// calender from

		Thread.sleep(2000);

		selectone(pom.getSettings_Module().getcalfrom(), "02 AM");

		// cal to

		selectone(pom.getSettings_Module().getcalto(), "08 AM");

		// cal to

		selectone(pom.getSettings_Module().getseledayw(), "Week");

		// cal to

		selectone(pom.getSettings_Module().getfulwe(), "Don't show Sundays");

//////////////Appointment  Remainder //////////////

		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getfeaturcli());

		// click schedul
		Thread.sleep(4000);
		Clickonelement(pom.getSettings_Module().getclischedul());

		Clickonelement(pom.getSettings_Module().getapprem());

		// ccli
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getemairad());

		// remail edit

//		WebDriverWait wait3 = new WebDriverWait(driver, 10);
//		WebElement edi = wait3.until(
//				ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'][normalize-space()='Edit'])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", edi);

		Thread.sleep(6000);

		Clickonelement(pom.getSettings_Module().getemailedit());

		// remail edit

		Clickonelement(pom.getSettings_Module().getemailcli());

		// remail edit

		Clickonelement(pom.getSettings_Module().getclprae());

		// client

		Clickonelement(pom.getSettings_Module().getclclie());

		// client

		Clickonelement(pom.getSettings_Module().getclcappe());

		// client

		Clickonelement(pom.getSettings_Module().getclclinke());

		// remai

		clear(pom.getSettings_Module().getremsenem());

		sendkeys(pom.getSettings_Module().getremsenem(), "Hello 123 ");

		// msgem

		clear(pom.getSettings_Module().getmsgema());

		sendkeys(pom.getSettings_Module().getmsgema(), "appiontment  ");

		// cancel

		Clickonelement(pom.getSettings_Module().getcancelema());

		//////////

		// remail edit

		Clickonelement(pom.getSettings_Module().getteleedit());

		// remail edit

		Clickonelement(pom.getSettings_Module().gettelecli());

		// remail edit

		Clickonelement(pom.getSettings_Module().getclpraT());

		// client

		Clickonelement(pom.getSettings_Module().getclcliT());

		// client

		Clickonelement(pom.getSettings_Module().getclcappT());

		// client

		Clickonelement(pom.getSettings_Module().getclclinkT());

		// remai

		clear(pom.getSettings_Module().getremsentel());

		sendkeys(pom.getSettings_Module().getremsentel(), "Hello 123 ");

		// msgem

		clear(pom.getSettings_Module().getmsgtele());

		sendkeys(pom.getSettings_Module().getmsgtele(), "Tele appiontment  ");

		// cancel

		Clickonelement(pom.getSettings_Module().getcanceltele());

		/////////////// Voice ///////////////

		// clc voice ar
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getvoicear());

		// app remail
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getvoicerad());

		// remail edit

		Clickonelement(pom.getSettings_Module().getvoiceedit());

		// remail edit

		Clickonelement(pom.getSettings_Module().getvoicecli());

		// remail edit

		Clickonelement(pom.getSettings_Module().getclpravoice());

		// client

		Clickonelement(pom.getSettings_Module().getclclievoice());

		// client

		Clickonelement(pom.getSettings_Module().getclcappvoice());

		// client

		Clickonelement(pom.getSettings_Module().getclclinkvoice());

//					// remai
		//
//					clear(pom.getSettings_Module().getremsenem());
		//
//					sendkeys(pom.getSettings_Module().getremsenem(), "Hello 123 ");

		// msgem

		clear(pom.getSettings_Module().getmsgvoice());

		sendkeys(pom.getSettings_Module().getmsgvoice(), "Voice  appiontment   ");

		// cancel

		Clickonelement(pom.getSettings_Module().getcancelvoice());

//////////////////// text //////////

		// clc voice ar
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().gettextar());

		// app remail
		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().gettextrad());

		// remail edit

		Clickonelement(pom.getSettings_Module().gettextedit());

		// remail edit

		Clickonelement(pom.getSettings_Module().gettextcli());

		// remail edit

		Clickonelement(pom.getSettings_Module().getclpratext());

		// client

		Clickonelement(pom.getSettings_Module().getclclietext());

		// client

		Clickonelement(pom.getSettings_Module().getclcapptext());

		// client

		Clickonelement(pom.getSettings_Module().getclclinktext());

//						// remai
		//
//						clear(pom.getSettings_Module().getremsenem());
		//
//						sendkeys(pom.getSettings_Module().getremsenem(), "Hello 123 ");

		// msgem

		clear(pom.getSettings_Module().getmsgtext());

		sendkeys(pom.getSettings_Module().getmsgtext(), "text   appiontment   ");

		// cancel

		Clickonelement(pom.getSettings_Module().getcanceltext());

//////////// Administration Senderx  ///////////

		// admi cli
		Thread.sleep(3000);

		Clickonelement(pom.getSettings_Module().getAdmcli());

		// erx set

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().geterxset());

		// clic fav

		Clickonelement(pom.getSettings_Module().getfavpres());

		// Clickonelement(pom.getSettings_Module().getcancelgh());

		//////////////////// ADD med///////

//				WebDriverWait wait1 = new WebDriverWait(driver, 10);
//				WebElement element1 = wait1
//						.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'E-Prescriptions')]")));
//				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);

		// sch cli
		// Thread.sleep(6000);

		// Clickonelement(pom.getSettings_Module().getclicsene());

		// clic fav

		// Clickonelement(pom.getSettings_Module().getadpres());

		// fin med

		sendkeys(pom.getSettings_Module().getfinmedp(), "a");

		// sel med

		Thread.sleep(5000);

		Clickonelement(pom.getSettings_Module().getselmedp());

		// sel sig

		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getselsigp());

		// sel dos

		Thread.sleep(3000);

		Clickonelement(pom.getSettings_Module().getseldosp());

		// cli dos

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclidosp());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselunip());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getcliunip());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselroup());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getcliroup());

//				// sel uni
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().getselfrep());
		//
//				// cli uni
		//
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().getclifrep());
		//
//				// sel dir
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getseldirp());
		//
//				// cli dir
		//
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getclidirp());
		//
//				// sel dir
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getseldurp());
		//
//				// cli dir
		//
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getclidurp());

		// cli updat

		Clickonelement(pom.getSettings_Module().getcliupdp());

//				// eff date
		//
//				Clickonelement(pom.getSettings_Module().geteffdatp());
		//
//				// sele eff da
		//
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().geteffdatselp());

		// sen di

		sendkeys(pom.getSettings_Module().getsendip(), "10");

		// dis un

		Clickonelement(pom.getSettings_Module().getdiunp());

		// sele dis

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getdiunselp());
		// sele dis

		sendkeys(pom.getSettings_Module().getrefip(), "10");

		// cli up

		// sendkeys(pom.getSettings_Module().getnotophap(), "Hello 123 ");

		// cli sav

		Clickonelement(pom.getSettings_Module().getclisavp());

///////////// clic compound ///////////

		Thread.sleep(6000);

		Clickonelement(pom.getSettings_Module().getadpres());

		// cli comp

//				WebDriverWait wait2 = new WebDriverWait(driver, 10);
//				WebElement comp = wait2
//						.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Compound'])[1]")));
//				((JavascriptExecutor) driver).executeScript("arguments[0].click();", comp);

		Thread.sleep(6000);

		Clickonelement(pom.getSettings_Module().getclicomp());

		// fin med

		sendkeys(pom.getSettings_Module().getfincompp(), "a");

		// sel med

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselcomp());

		// sel sig

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselsigp());

		// sel dos

		Clickonelement(pom.getSettings_Module().getseldosp());

		// cli dos

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclidosp());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselunip());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getcliunip());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselroup());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getcliroup());

//				// sel uni
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().getselfrep());
		//
//				// cli uni
		//
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().getclifrep());
		//
//				// sel dir
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getseldirp());
		//
//				// cli dir
		//
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getclidirp());
		//
//				// sel dir
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getseldurp());
		//
//				// cli dir
		//
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getclidurp());
		//
		// cli updat

		Clickonelement(pom.getSettings_Module().getcliupdp());

//				// eff date
		//
//				Clickonelement(pom.getSettings_Module().geteffdatp());
		//
//				// sele eff da
		//
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().geteffdatselp());

		// sen di

		sendkeys(pom.getSettings_Module().getsendip1(), "10");

		// dis un

		Clickonelement(pom.getSettings_Module().getdiunp());

		// sele dis

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getdiunselp());
		// sele dis

		sendkeys(pom.getSettings_Module().getrefip1(), "10");

		// cli up

		// sendkeys(pom.getSettings_Module().getnotophap(), "Hello 123 ");

		// cli sav

		Clickonelement(pom.getSettings_Module().getclisavp());

//////////////// clic Supply ///////////////////

		Thread.sleep(4000);

		Clickonelement(pom.getSettings_Module().getadpres());

		// cli sup
//				WebDriverWait wait3 = new WebDriverWait(driver, 10);
//				WebElement sup = wait3
//						.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Supply'])[1]")));
//				((JavascriptExecutor) driver).executeScript("arguments[0].click();", sup);

		Thread.sleep(6000);

		Clickonelement(pom.getSettings_Module().getclisupp());

		// fin med

		sendkeys(pom.getSettings_Module().getfinsupp(), "a");

		// sel med

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselsupp());

		// sel sig

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselsigp());

		// sel dos

		Clickonelement(pom.getSettings_Module().getseldosp());

		// cli dos

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getclidosp());

		// sel uni
		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getselunip());

		// cli uni

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getcliunip());

//				// sel uni
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().getselroup());
		//
//				// cli uni
		//
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().getcliroup());
		//
//				// sel uni
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().getselfrep());
		//
//				// cli uni
		//
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().getclifrep());
		//
//				// sel dir
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getseldirp());
		//
//				// cli dir
		//
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getclidirp());
		//
//				// sel dir
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getseldurp());
		//
//				// cli dir
		//
//				Thread.sleep(1000);
		//
//				Clickonelement(pom.getSettings_Module().getclidurp());

		// cli updat

		Clickonelement(pom.getSettings_Module().getcliupdp());

//				// eff date
		//
//				Clickonelement(pom.getSettings_Module().geteffdatp());
		//
//				// sele eff da
		//
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().geteffdatselp());

		// sen di

		sendkeys(pom.getSettings_Module().getsendip(), "10");

		// dis un

		Clickonelement(pom.getSettings_Module().getdiunp());

		// sele dis

		Thread.sleep(2000);

		Clickonelement(pom.getSettings_Module().getdiunselp());
		// sele dis

		sendkeys(pom.getSettings_Module().getrefip(), "10");

		// cli up

		// sendkeys(pom.getSettings_Module().getnotophap(), "Hello 123 ");

		// cli sav

		Clickonelement(pom.getSettings_Module().getclisavp());
		//
//				// cli pre pres
		//
//				Clickonelement(pom.getSettings_Module().getprepres());
		//
//				// edi pre pres
		//
//				Thread.sleep(2000);
		//
//				Clickonelement(pom.getSettings_Module().getedipres());

	}
}
