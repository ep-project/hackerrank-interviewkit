public class Hiker {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        boolean countValley = true;
        int altitude = 0;//sea level
        int valleys = 0;

        for(int i=0; i<n; i++){
            if( s.charAt(i)=='D' ){
                altitude--;
            }else
            {
                altitude++;
            }

            if(altitude < 0 && countValley){
                valleys++;
                countValley = false;
            }

            if (altitude == 0){
                countValley = true;
            }
        }

        return valleys;

    }
}