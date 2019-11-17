package com.pagelibrary.RanfordBank;

import org.testng.annotations.Test;

public class TestExecution {

	public class TestExecution extends Repositoty {
		
		@Test(prorioty=0)
		public void verify_lanuch(){
			
			Launch();
		}
			@Test(priority=1)
			public void verify_login() {
				login_TC();
			}
		}
	}
