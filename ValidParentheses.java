
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
        	char c=s.charAt(i);
            if(stack.isEmpty()){
            	stack.push(c);
            }else{
            	if(stack.peek()-c==-1||stack.peek()-c==-2){
            		stack.pop();
            	}else{
            		stack.push(c);
            	}
            }
        }
        System.out.println(stack.size());
        return stack.isEmpty();
    }
}
