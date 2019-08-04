public class ArrayRotation{
	
	static int[] rotLeft(int[] ar, int r) {
        int d = r;
        int[] a = ar;
        if (d == a.length) d=0;
        int temp[] = new int[d];

        for (int i=0; i<temp.length; i++){
            temp[i]=a[i];
        }

        if(d>0){//Only do this if d>0, otherwise no rotation is necessary
            for(int j=d; j<(a.length); j++){
                a[j-d]=a[j];
            }
        }

        for (int x=(a.length-d), y=0; x<a.length; x++, y++){
            a[x]=temp[y];
        }

        return a;        
    }
}