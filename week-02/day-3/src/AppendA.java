/**
 * Created by Connor on 2017.03.22..
 */
public class AppendA {

    public static void main (String[] args){
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a string variable named `am` and assign the value `kuty` to it
        // - Write a function called `appendA` that gets a string as an input
        //   and appends an 'a' character to its end
        // - Print the result of `appendA(am)`

        String am = "kuty";

        String amAppended = appendA(am);

        System.out.println(amAppended);

    }

    public static String appendA (String toAppend){
        toAppend +="a";
        return toAppend;
    }

}

/* print inside the method
        public static void appendA (String toAppend){
            toAppend +="a";
            System.out.println(toAppend);
        }

 */