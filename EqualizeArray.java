// Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
            Arrays.sort(arr);
            int gz = 1; //group size
            int max =1;

            for(int i=1; i<arr.length; i++){
                if(arr[i] == arr[i-1]){
                    gz +=1;
                    if(gz>max) max=gz;
                }else{ //they are not equal, we start another group
                    gz=1;//reset group size
                }
            }
        return (arr.length - max); //simply delete anything that does not form part of the largest group
    }