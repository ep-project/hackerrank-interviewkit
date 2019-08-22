// Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {
        int counter =0, len = b.length(), i=0;

        while(i<len-2){
            if( b.charAt(i)=='0' && b.charAt(i+1)=='1' && b.charAt(i+2)=='0' ){
                counter++;
                i +=2;
            }
            i++;
        }

        return counter;
    }
