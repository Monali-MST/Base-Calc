
package classes;

public class BaseCal {
    public static void main(String[] args) {
       
        
    }

    //..............................................move from Dec to all..section............................... 
        public StringBuilder move10ToBin(String snum) {
		int num1 = Integer.parseInt(snum);
		StringBuilder sb = new StringBuilder();
		while (num1>0){
			int lastBit =num1%2;
			num1= Math.floorDiv(num1, 2);
	        sb.append(lastBit);
		}
		StringBuilder result =sb.reverse();
		return result;
        }


}

