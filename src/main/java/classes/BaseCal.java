
package classes;

public class BaseCal {
    public static void main(String[] args) {
       
        
    }

    //..............................................move Dec to all..section............................... 
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
                    switch (lastBit) {
                        case 10 -> sb.append("A");
                        case 11 -> sb.append("B");
                        case 12 -> sb.append("C");
                        case 13 -> sb.append("D");
                        case 14 -> sb.append("E");
                        case 15 -> sb.append("F");
                        default -> sb.append(lastBit);
                    }
		}
		StringBuilder result =sb.reverse();
		return result;
	}
   	
	//..............................................move all to Dec..section...............................

	public int move2ToDec(String snum){			
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



	public int move8ToDec(String snum){                           
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
		int lastbit=0;
		int tot=0;
		int x=0;
		for(int i=len-1;i>=0;i--){
			char ch = sb.charAt(i);
			String s1= String.valueOf(ch);
			if("A".equalsIgnoreCase(s1)){
                            lastbit = 10;
                        } else if("B".equalsIgnoreCase(s1)){
                            lastbit = 11;
                        }else if("C".equalsIgnoreCase(s1)){
                            lastbit = 12;
                        }else if("D".equalsIgnoreCase(s1)){
                            lastbit = 13;
                        }else if("E".equalsIgnoreCase(s1)){
                            lastbit = 14;
                        }else if("F".equalsIgnoreCase(s1)){
                            lastbit = 15;
                        }else{
                            lastbit = Integer.parseInt(s1);
                        }
                        tot+=Math.pow(16,x)*lastbit; 
			x+=1;
		}
		return tot;
	}
        //..............................................move Bin to Oct..section...............................
        
        public StringBuilder move2ToOct(String snum) {
            int dec = move2ToDec(snum);
            String sdec = String.valueOf(dec);
                        
            return move10ToOct(sdec);
        }
        
        //..............................................move Bin to Hex..section...............................
        
        public StringBuilder move2ToHex(String snum) {
            int dec = move2ToDec(snum);
            String sdec = String.valueOf(dec);
            
            return move10ToHex(sdec);
    
        }
        
        //..............................................move Oct to Hex..section...............................
        
        public StringBuilder move8ToHex(String snum) {
            int dec = move8ToDec(snum);
            String sdec = String.valueOf(dec);
            
            return move10ToHex(sdec);
    
        }
        
        //..............................................move Hex to Oct..section...............................
        
        public StringBuilder move16ToOct(String snum) {          
            int dec = move16ToDec(snum);
            String sdec = String.valueOf(dec);
            
            return move10ToOct(sdec);
        }
        
        //..............................................move Oct to Bin..section...............................
        
        public StringBuilder move8ToBin(String snum) {
            int dec = move8ToDec(snum);
            String sdec = String.valueOf(dec);
            
            return move10ToBin(sdec);
        }
        
        //..............................................move Hex to Bin..section...............................
        
        public StringBuilder move16ToBin(String snum) {
            int dec = move16ToDec(snum);
            String sdec = String.valueOf(dec);
            
            return move10ToBin(sdec);
    
        }
//...................End of logical oparatings................................................................


}

