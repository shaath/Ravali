package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functionDriven.BusinessMethods;

public class Keyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String res = null;
		String curPrPath = System.getProperty("user.dir");
		String xlPath = curPrPath+"\\src\\testData\\Keyword.xlsx";
		String xlOut = curPrPath+"\\src\\results\\KeyRes.xlsx";
		
		FileInputStream fi = new FileInputStream(xlPath);
		
		BusinessMethods bm = new BusinessMethods();
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		XSSFSheet tcSht= wb.getSheet("Testcase");
		XSSFSheet tsSht= wb.getSheet("Teststeps");
		XSSFSheet tdSht= wb.getSheet("TestData");
		
		int tcRc = tcSht.getLastRowNum();
		int tsRc = tsSht.getLastRowNum();
		
		for(int i = 1; i <= tcRc; i++){
			tcSht.getRow(i).createCell(3);
			
			String exe = tcSht.getRow(i).getCell(2).getStringCellValue();
			if(exe.equalsIgnoreCase("Y")){
				String tcShtTcId = tcSht.getRow(i).getCell(0).getStringCellValue();
				
				for(int j = 1; j <= tsRc; j++){
					String tsShtTcId = tsSht.getRow(j).getCell(0).getStringCellValue();
					
					if(tcShtTcId.equalsIgnoreCase(tsShtTcId)){
						String key = tsSht.getRow(j).getCell(3).getStringCellValue();
//						System.out.println(key);
						
						switch (key) {
						case "Launch":
							String br = tdSht.getRow(1).getCell(0).getStringCellValue();
							String url = tdSht.getRow(1).getCell(1).getStringCellValue();
							res = bm.orgLaunch(br, url);
							break;
						case "login":
							String u = tdSht.getRow(1).getCell(2).getStringCellValue();
							String p = tdSht.getRow(1).getCell(3).getStringCellValue();
							res = bm.orgLogin(u, p);
							break;
						case "logout":
							bm.orgLogout();
							bm.orgClose();
							break;
						case "Empreg":
							String f = tdSht.getRow(1).getCell(4).getStringCellValue(); 
							String l =  tdSht.getRow(1).getCell(5).getStringCellValue();
							String eid =  tdSht.getRow(1).getCell(6).getStringCellValue();
							res = bm.orgEmpReg(f, l, eid);
							break;
						case "Usereg":
							String ename = tdSht.getRow(1).getCell(7).getStringCellValue();
							String uname = tdSht.getRow(1).getCell(8).getStringCellValue();
							String pwd = tdSht.getRow(1).getCell(9).getStringCellValue();
							res = bm.orgUserReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un = tdSht.getRow(1).getCell(8).getStringCellValue();
							String pd = tdSht.getRow(1).getCell(9).getStringCellValue();
							res = bm.orgLogin(un, pd);
							break;
						default:
							System.out.println("Give a proper Keyword");
							break;
						}
						
						//Test Steps sheet results updation.
						tsSht.getRow(j).createCell(4).setCellValue(res);
						//Test case sheet results updation.
						if(!tcSht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")){
							tcSht.getRow(i).getCell(3).setCellValue(res);
						}
					}	
				}
			}
			else{
				tcSht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo = new FileOutputStream(xlOut);
		wb.write(fo);
		wb.close();
		
	}

}
