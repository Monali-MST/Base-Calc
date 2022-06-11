
package classes;

public class BaseCal {
    public static void main(String[] args) {
       
        
    }

    //..............................................move from Dec to all..section............................... 
        public StringBuilder move10ToBin(String snum) {
		int num = Integer.parseInt(snum);
		StringBuilder sb = new StringBuilder();
		while (num>0){
			int lastBit =num%2;
			num= Math.floorDiv(num, 2);
	        sb.append(lastBit);
		}
		StringBuilder result =sb.reverse();
		return result;
        }
        
        public StringBuilder move10ToOct(String snum){
		int num = Integer.parseInt(snum);
		StringBuilder sb = new StringBuilder();
		while (num>0){
			int lastBit =num%8;
			num = Math.floorDiv(num, 8);
	        sb.append(lastBit);
		}
		StringBuilder result =sb.reverse();
		return result;
	}

	public StringBuilder move10ToHex(String snum){
		int num = Integer.parseInt(snum);
		StringBuilder sb = new StringBuilder();
		while (num>0){
			int lastBit = num%16;
			num = Math.floorDiv(num, 16);
			if(lastBit==10){
				sb.append("A");
			}else if(lastBit==11){
				sb.append("B");
			}else if(lastBit==12){
				sb.append("C");
			}else if(lastBit==13){
				sb.append("D");
			}else if(lastBit==14){
				sb.append("E");
			}else if(lastBit==15){
				sb.append("F");
			}else{
				sb.append(lastBit);
			}
		}
		StringBuilder result =sb.reverse();
		return result;
	}
   	
	//..............................................move from all to Dec..section...............................

	public int move2ToDec(String snum){			//3,4,5,6,7,8,9,.. bin system eke ne. ehem thiyen no ek input krot....
		int num = Integer.parseInt(snum);
		int mod=0;
		int tot=0;
		int x=0;
		while(num>0){
			mod =num%10;
			num =Math.floorDiv(num, 10);
			tot+=Math.pow(2,x)*mod;                          
			x+=1;
		}
		return tot;
	}



	public int move8ToDec(String snum){                            //8,9 oct system eke ne
		int num = Integer.parseInt(snum);
		int mod=0;
		int tot=0;
		int x=0;
		while(num>0){
			mod =num%10;
			num =Math.floorDiv(num, 10);
			tot+=Math.pow(8,x)*mod;                          
			x+=1;
		}
		return tot;
	}  


	

	public int move16ToDec(String snum){		
		StringBuilder sb = new StringBuilder();
		sb.append(snum);
		int len = sb.length();
		int mod=0;
		int tot=0;
		int x=0;
		for(int i=len-1;i>=0;i--){
			char ch = sb.charAt(i);
			String s1= String.valueOf(ch);
			if(null==s1){
                            mod = Integer.parseInt(s1);
                        }else mod = switch (s1) {
                            case "A" -> 10;
                            case "B" -> 11;
                            case "C" -> 12;
                            case "D" -> 13;
                            case "E" -> 14;
                            case "F" -> 15;
                            default -> Integer.parseInt(s1);
                        };
			tot+=Math.pow(16,x)*mod; 
			x+=1;
		}
		return tot;
	}


//...................End of logical oparatings................................................................
}

