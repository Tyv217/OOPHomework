package RetValTest;

public class RetValTest {
    public static class NoCamAddressException extends Exception{
    }
    public static String sEmail = "";
    public static void extractCamEmail(String sentence) {
        try {
            if (sentence == null || sentence.length() == 0)
                throw new NullPointerException();
                // Error - sentence empty
                String tokens[] = sentence.split(" "); // split into tokens
            int x = 0;
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i].endsWith("@cam.ac.uk")) {
                    sEmail = tokens[i];
                    x = 1;
                }
            }
            if(x==0){
                throw new NoCamAddressException();
            }

            System.out.println("Success: "+RetValTest.sEmail);

        }
        catch(NullPointerException e){
            System.out.println("Supplied string empty");
        }
        catch(NoCamAddressException e){
            System.out.println("No @cam address in supplied string");
        }
    }
    public static void main(String[] args) {
        RetValTest.extractCamEmail("My email is rkh23@cam.ac.uk");
    }
}
