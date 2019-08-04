public class MinStack {

    // 思路：用一个int型变量min记录当前栈中的最小值

    private LinkedList<Integer> stack;
    List<Integer> array;
    int min;
    public MinStack() {
        stack = new LinkedList<>();
        array = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }
    public void push(int x) {
        stack.push(x);
        array.add(x);
        min = Math.min(min, x);
    }
    public void pop() {
        int num = stack.pop();
        array.remove(array.size() - 1);
        if(array.size() > 0) {
            min = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if(min > array.get(i)) {
                    min = array.get(i);
                }
            }
        }else {
            min = Integer.MAX_VALUE;
        }
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return min;
    }
}
