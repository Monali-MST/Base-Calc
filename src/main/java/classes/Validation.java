package classes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Validation {
    
    public static void main (String args[]){
    
    }
    
    public Boolean NoValid(String snum, String base){
        if(snum.trim().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(),"Please enter a integer number."); 
            return false;
        }else{
            StringBuilder sb = new StringBuilder();
            sb.append(snum);
            int len = sb.length();
            for(int i=len-1;i>=0;i--){
                    char ch = sb.charAt(i);
                    String s1= String.valueOf(ch);
                    if("2".equals(base)){
                        if(!"0".equals(s1) && !"1".equals(s1)){
                            JOptionPane.showMessageDialog(new JFrame(),"Invalied Number!");
                            return false;               
                        }
                    } else if("8".equals(base)) {
                        if( !"0".equals(s1) && !"1".equals(s1) && !"2".equals(s1) && !"3".equals(s1) && !"4".equals(s1) && !"5".equals(s1) && !"6".equals(s1) && !"7".equals(s1)){
                            JOptionPane.showMessageDialog(new JFrame(),"Invalied Number!");
                            return false;
                        }
                    } else if("10".equals(base)) {
                        if( !"0".equals(s1) && !"1".equals(s1) && !"2".equals(s1) && !"3".equals(s1) && !"4".equals(s1) && !"5".equals(s1) && !"6".equals(s1) && !"7".equals(s1) && !"8".equals(s1) && !"9".equals(s1)){
                            JOptionPane.showMessageDialog(new JFrame(),"Invalied Number!");
                            return false;
                        }
                    } else {
                        if( !"0".equals(s1) && !"1".equals(s1) && !"2".equals(s1) && !"3".equals(s1) && !"4".equals(s1) && !"5".equals(s1) && !"6".equals(s1) && !"7".equals(s1) && !"8".equals(s1) && !"9".equals(s1) && !"A".equalsIgnoreCase(s1) && !"B".equalsIgnoreCase(s1) && !"C".equalsIgnoreCase(s1) && !"D".equalsIgnoreCase(s1) && !"E".equalsIgnoreCase(s1) && !"F".equalsIgnoreCase(s1)){
                            JOptionPane.showMessageDialog(new JFrame(),"Invalied Number!");
                            return false;
                        } 
                    }
            }    
             
            return true;            
        }
     
    }    
       
}

