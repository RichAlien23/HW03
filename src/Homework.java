import com.sun.tools.javac.Main;

public class Homework {
   //Task 1
    public static int calculateAbsoluteDifference(int a, int b) {
       int difference = a-b;
    int absoluteDifference = Math.abs(difference);
    return absoluteDifference;
    }

    //Task2
    public char firstSymbolFromString(String str) {
        char firstSymbolFromString=str.charAt(0);
        return firstSymbolFromString;
    }

    //Task3
    public char lastSymbolFromString(String str) {
        char lastSymbolFromString = str.charAt(str.lastIndexOf(str));
        return lastSymbolFromString;
   }

        //Task4
        public String changeFirstAndLastSymbol (String str){

            char firstSymbolFromString = str.charAt(0);
            char lastSymbolFromString = str.charAt(str.lastIndexOf(str));
            String middleSymbolsFromString = str.substring(1, str.length() - 1);
            String changeFirstAndLastSymbol = lastSymbolFromString + middleSymbolsFromString + firstSymbolFromString;
            return changeFirstAndLastSymbol;
        }

}
