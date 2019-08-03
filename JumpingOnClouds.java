public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

            int jumps =0;
            int optmise = 0;

            for (int i=1; i< c.length; i++){
                if (c[i]==0){
                    jumps++;
                    if(c[i-1]==1)
                    {
                        optmise=0;
                    }
                    else optmise++;
                }

                if (optmise==2){
                    jumps--;
                    optmise=0;
                }
            }
            return jumps;
    }
}