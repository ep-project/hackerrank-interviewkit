public class  RepeatedString{

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long az = 0;

        for (int i=0; i< s.length(); i++){
            if(s.charAt(i)=='a'){
                az++;
            }
        }

        long groups = n/s.length();

        az *=groups;

        int extra = new Long(n%s.length()).intValue();

        if (extra>0){//count extra az
            for (int i=0; i< extra; i++){
            if(s.charAt(i)=='a'){
                az++;
            }
        }
        }

        return az;
    }
}