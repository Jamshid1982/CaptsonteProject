package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGenerator {
	public static void main(String [] args) {
		System.out.println(getData("name"));
		System.out.println(getData("email"));
		System.out.println(getData("random"));
	}
	public static String getData(String input){
		Faker faker = new Faker();
		String result = "";
		if(input.equals("name")) {
			result = faker.name().fullName();
		}else if(input.equals("email")) {
			result = faker.name().firstName() + faker.name().lastName() + "@gmail.com";
			
		}else if(input.equals("phone")) {
			result = faker.phoneNumber().cellPhone();
			
		}else
			result = faker.expression("#{letterify '????.????@tekshool.us'}");
		
		return result;
		
		
	}
}
