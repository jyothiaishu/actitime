package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;



@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerProject  extends BaseClass{
	@Test
	public void testcreateProject() throws EncryptedDocumentException, IOException
	{
		Reporter.log("create Project",true);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getnewProject().click();
		t.getprojectnamet().sendKeys("MyProject");
		t.getUser().click();
		
		t.getProjectDD().sendKeys("banking Project");
		
		
		
		
	}

}
