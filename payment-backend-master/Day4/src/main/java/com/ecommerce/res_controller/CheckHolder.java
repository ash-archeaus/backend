package com.ecommerce.res_controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.Verify;

@RestController
@CrossOrigin(origins = "*")
public class CheckHolder {
	
	
	
	@PostMapping("/verifyholder")
	public boolean verify(@RequestBody Verify verify) throws FileNotFoundException {
		return checkSdnList(verify.getName());
		

	}

	private static boolean checkSdnList(String recAccName) throws FileNotFoundException {
		boolean flag = false;
		try {
			File file = new File("C:\\Users\\Administrator\\Desktop\\project\\SDNclean.txt");
			
			BufferedReader fReader = new BufferedReader(new FileReader(file));		
			String i;
			Set<String> ts = new TreeSet<>();
			while((i = fReader.readLine()) != null)
				ts.add(i);

			if(ts.contains(recAccName)){
				flag = true;
			}
			fReader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
}
