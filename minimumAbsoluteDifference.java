// Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {

        int min = Integer.MAX_VALUE;

    //By sorting the shortest distance is going to fall within adjacent elements, 
    //making the search linear rather than quadratic
       
       Arrays.sort(arr); 

        for(int j=1; j<arr.length; j++){
            if( Math.abs(arr[j]-arr[j-1]) < min) 
                min = Math.abs(arr[j]-arr[j-1]);
        }

        return min;
    }
