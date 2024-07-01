public class LCM_GCD {
        static Long[] lcmAndGcd(Long A , Long B) {
            // code here
        Long gcdValue = gcd(A,B);
        Long lcmValue = Math.abs(A*B) / gcdValue;
        return new Long[]{lcmValue, gcdValue};
        }
        static Long gcd(Long a, Long b){
            if (b ==0){
               return a;
            }else {
                return gcd(b , a%b);
            }
       
        }      
        
    }

