package mathclallenge;

public class Main {
	
	    public static long streak(long n){

	        if(n%2 == 0){
	            return 1l;
	        }

	        long count=0;
	        for (int i=1;i<1000;i++){
	            if (n%i==0){
	                n++;
	            }else {
	                break;
	            }
	            count++;
	        }
	        return count;
	    }

	    public static long function (long s, long N){
	        long count=0;
	        for (long n=2;n<N;n++){
	            if(streak(n) == s)
	                count++;
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        long sum=0;
	        System.out.println("Streak of 13 = "+streak(13));
	        System.out.println("Streak of 120 = "+streak(120));
	        System.out.println("P(6,1000000)= "+function(6,1000000));
	        long powVal = 0l;
	        long n = 0l;
	        for (long i=1;i<32;i++){
	            powVal = (long) Math.pow(4,i);

	            for (n = 2; n < powVal; n++){
	                if(streak(n) == i)
	                    sum++;
	            }

	            long funcRet = function(i, powVal);
	            sum+= funcRet;
	            System.out.println("P("+i+","+powVal+") = " + funcRet);
	            System.out.println("SUM : " +sum);

//	              System.out.println("SUM for " + i + " = " +sum);
	        }
	    }
	}