/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

/**
 *
 * @author HARNY
 */
class TextInput {
     String input = "";
     String output = "";
    public void add(char x)
    {
        this.input = this.input+x;
    }
    public String getValue(){
        
        return this.input;
    
    }
    
}

class NumericInput extends TextInput {
    public void add(char y)
    {
        
        if(Character.isDigit(y))
        {
            super.input = super.input + y;
        }
    }
    
}

public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         TextInput input = new NumericInput();
         input.add('1');
         input.add('a');
         input.add('0');
        System.out.println(input.getValue());
   
        // TODO code application logic here
    }
}
