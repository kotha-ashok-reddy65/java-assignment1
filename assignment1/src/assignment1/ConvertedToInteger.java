package assignment1;

public class ConvertedToInteger {
	
//B. Enter a Roman Number as input and convert it to an integer. (ex X = 10)	
	
	public static int ToInteger(String inputVal) {
		//local variable
        int result = 0;
       //for loop
        for (int i = 0; i < inputVal.length(); i++) {
            if (i < inputVal.length() - 1 && ToValue(inputVal.charAt(i)) < ToValue(inputVal.charAt(i + 1))) {
                result -= ToValue(inputVal.charAt(i));
            } else {
                result += ToValue(inputVal.charAt(i));
            }
        }

        return result;
    }

    public static int ToValue(char c) {
    	//switch case
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
        public static void main(String[] args) {
            String inputVal = "X"; // your input starts here
            int outputVal = ToInteger(inputVal);
            System.out.println("The integer equivalent is: " + outputVal);
        }
    


}
