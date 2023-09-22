package day5;

public class TaxCalculation {
	
	public void taxCalculation(Person person) {
		if(person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Text not Applicable!!");
		}else {
			if(person.getIncome() <= 160000) {
				person.setTax(0);
			}
			else if(person.getIncome() > 160000 && person.getIncome() <= 500000) {
				person.setTax((person.getIncome() - 160000)* 0.10);
			}
			else if(person.getIncome() > 500000 && person.getIncome() <= 800000) {
				person.setTax((person.getIncome() - 500000) * 0.20);
			}
			else{
				person.setTax((person.getIncome() * 0.30));
			}
		}
	}
   
}