class Solution{
    static int evenlyDivides(int N){
        // code here
        int temp = N;
        int count = 0 ;
        int rem =0;
        while (temp > 0){
            rem = temp % 10;
            if (rem != 0 && N % rem == 0) {
                count+=1;
             }
             temp = temp / 10;
            
        }
        return count;
    }
}
// input = 12 
// output = 2