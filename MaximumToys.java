 static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int toys = 0;

        for(int i=0; i<prices.length; i++){
            if(k-prices[i] > 0){
                ++toys;
                k = k - prices[i];
            }
        }
            return toys;
    }