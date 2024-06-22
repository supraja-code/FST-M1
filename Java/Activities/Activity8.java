package activities;

public class Activity8 {
	
	static void exceptionTest(String string) throws CustomException {
		if (string == null) {
			throw new CustomException("String is null");
		}else {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		
		try {   
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null); 
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println(mae.getMessage());
        }

	}

}
