/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private String cardnum = "";

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			//return displayformat() ;
			return "[" + number + "]" + "  " ;		
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ){
		   if((ch.equals("X") || ch.equals("Delete"))) {
		   	   if(cnt >= 0){
                  number = number.substring(0, number.length() - 1);
		   	   }
           }
           else{	
		      number += ch ;
		   }
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

	public String displayformat(){
		StringBuffer buf = new StringBuffer();
		if(number.length() >= 1){
			if(number.length() <= 4)
				buf.append(number.substring(0, number.length() + 1));
			else {
				buf.append(number.substring(0, 5));
				buf.append(" ");
				if(number.length() <= 8)
				   buf.append(number.substring(5, number.length() + 1));
				else {
				   buf.append(number.substring(5, 9));
				   buf.append(" ");
				   if(number.length() <= 12)
				      buf.append(number.substring(9, number.length() + 1));
				   else {
				      buf.append(number.substring(9, 13));
				      buf.append(" ");
				      if(number.length() <= 16)
				         buf.append(number.substring(13, number.length() + 1));
				      else {
				         buf.append(number.substring(13, 17));				      	
				      }				      				   	
				   }				   					
				}		
			}
		}
		cardnum = buf.toString();
		return "[" + cardnum + "]" + "  " ;		
	}

}