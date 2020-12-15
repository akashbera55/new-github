package chutzpa;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomActitime;

public class TestActitime extends BaseTest
{
	@Test
	public void run() throws IOException
	{
		PomActitime p=new PomActitime(driver);
		p.loginMethod();
	}
}
