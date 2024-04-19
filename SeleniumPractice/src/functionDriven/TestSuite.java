package functionDriven;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res;
		BusinessMethods bm = new BusinessMethods();
		//Login
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("App Login "+res);
		
		res= bm.orgLogout();
		System.out.println("App Logout "+res);

		bm.orgClose();
		System.out.println("Application Closed successfully");
		
		//EmpReg
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("App Login "+res);
		
		res = bm.orgEmpReg("Vinayak", "SP", "VSP85855");
		System.out.println("Employee Registration "+res);
		
		res= bm.orgLogout();
		System.out.println("App Logout "+res);

		bm.orgClose();
		System.out.println("Application Closed successfully");

		//UserReg
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("App Login "+res);
		
		res = bm.orgUserReg("Vinayak SP", "AAVinayakSP", "Test@8547963214");
		System.out.println("User Registration "+res);
		
		res= bm.orgLogout();
		System.out.println("App Logout "+res);

		bm.orgClose();
		System.out.println("Application Closed successfully");
		
		//UserLogin
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res = bm.orgLogin("AAVinayakSP", "Test@8547963214");
		System.out.println("App Login "+res);
		
		res= bm.orgLogout();
		System.out.println("App Logout "+res);

		bm.orgClose();
		System.out.println("Application Closed successfully");
	}

}
