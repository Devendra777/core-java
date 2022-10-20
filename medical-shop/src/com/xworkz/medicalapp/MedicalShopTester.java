package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.*;

public class MedicalShopTester {

	public static void main(String[] args) {

		String staffNames[] = new String[3];
		staffNames[0] = "Narang";
		staffNames[1] = "Sarang";
		staffNames[2] = "Bajarang";

		long staffContactNo[] = new long[3];
		staffContactNo[0] = 8908908908L;
		staffContactNo[1] = 8908908900L;
		staffContactNo[2] = 8908908906L;

		String cosmetics[] = new String[2];
		cosmetics[0] = "Himalaya Face Wash";
		cosmetics[1] = "Pond's Cream";

		String medicineNames[] = new String[2];
		medicineNames[0] = "Dulcolax";
		medicineNames[1] = "Seftum 500mg";

		String billingMethod[] = new String[2];
		billingMethod[0] = "Credit";
		billingMethod[1] = "Scan";

		MedicalShop med = new MedicalShop("AAERT678906077070", "Vijayanagar", "Maruthi Medical", staffNames,
		staffContactNo, medicineNames, cosmetics, 7, billingMethod);
		med.displayInfo();

	}

}
