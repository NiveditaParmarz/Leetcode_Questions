class Solution {
    public int evalRPN(String[] tokens) {
    
        Stack <Integer> operand = new Stack<>();
        
        for(int i = 0; i < tokens.length; i++){
            int num = 0;
            if(tokens[i].length()>1 && tokens[i].charAt(0) == '-'){
                int j = 1;
                while(j < tokens[i].length()){
                    num = (num*10) + (tokens[i].charAt(j)-'0');
                    j++;
                }
                num = -(num);
                operand.push(num);
            }
            if(Character.isDigit(tokens[i].charAt(0))){
                int j = 0;
                while(j < tokens[i].length()){
                    num = (num*10) + (tokens[i].charAt(j)-'0');
                    j++;
                }
                operand.push(num);
            }


            else if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int val2 = operand.pop();
                int val1 = operand.pop();
                String oper = tokens[i];
                int val = calc(val1,val2,oper);
                operand.push(val);
            }
        }

        return operand.pop();

    }

    public int calc(int val1, int val2, String oper){
        if(oper.equals("+")){
            return val1+val2;
        }

        else if(oper.equals("-")){
            return val1-val2;
        }

        else if(oper.equals("*")){
            return val1*val2;
        }

        return val1/val2;

    }
}