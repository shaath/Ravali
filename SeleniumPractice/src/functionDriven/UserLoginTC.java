package functionDriven;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res;
		BusinessMethods bm = new BusinessMethods();
		
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("App Launch "+res);
		
		res = bm.orgLogin("AAAAVinayakSP", "Test@8547963214");
		System.out.println("App Login "+res);
		
		res= bm.orgLogout();
		System.out.println("App Logout "+res);

		bm.orgClose();
		System.out.println("Application Closed successfully");

	}

}
