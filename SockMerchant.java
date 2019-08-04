public class Merchant {

    static int sockMerchant(int n, int[] ar) {
        int socks [] = ar;
        Arrays.sort(socks);//Sort the socks array

        int i = 1;
        int pairs = 0;
        while(i < n){
            if (socks[i] == socks[i-1]){
                pairs++;
                i++;
            }
            i++;
        }
        return pairs;
    }
   }
