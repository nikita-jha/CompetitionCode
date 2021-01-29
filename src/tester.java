public class tester {
    public static void main(String[] args) {
        int[] ar = {1, 4, 2, 1, 4, 4, 4};
        tester t = new tester();
        System.out.println(t.maxSpan(ar));


    }

    public int maxSpan(int[] nums) {
        int i=0;
        if(nums.length == 1){
            return 1;
        }else if(nums.length == 0){
          return 0;
        } else{
            int outerMax = 0;
            int counterFlag = nums.length;
            while(counterFlag-- > 0){

                int max = 0;
                for(int j = i+1; j<nums.length; j++){
                    if(nums[j] == nums[i]){
                        int distance = j-i;
                        if(distance > max){
                            max = distance;
                        }
                    }
                }
                if(max > outerMax){
                    outerMax = max;
                }
                i++;
            }
            return outerMax+1;

        }
    }

}
