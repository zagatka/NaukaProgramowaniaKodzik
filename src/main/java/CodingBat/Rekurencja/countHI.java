package CodingBat.Rekurencja;

public class countHI {

    //Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

    public int countHi(String str) {
        if (str.length() <= 1) {
            return 0;
        }
        return (str.substring(0, 2).equals("hi") ? 1 : 0) + countHi(str.substring(1));
    }
}
