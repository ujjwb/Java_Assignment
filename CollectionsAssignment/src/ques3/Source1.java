package ques3;
class StackEmpty extends Exception{
    public StackEmpty(){
        super();
    }
}
class StackFull extends Exception{
    public StackFull(){
        super();
    }
}
class SpecialStack {
    int maxSize, size,stack[], min;

    public SpecialStack(int maxSize){
        this.stack= new int[maxSize];
        this.maxSize=maxSize;
        this.size=0;
    }
    public void push(int element ) {
        try {
            if (isFull()) {
                throw new StackFull();
            }
        }
        catch(StackFull e){
            System.out.println("Stack is Full! "+element+" not Pushed");
            return;
        }
        stack[size]=element;
        if(size==0){
            min=element;
        }
        else if(element<min){
            min=element;
        }
        size++;

    }
    public int pop(){
        try {
            if (isEmpty()) {
                throw new StackEmpty();
            }
        }
        catch(StackEmpty e){
            System.out.println("Stack is Empty! Nothing Popped");
            return 0;
        }
        return stack[--size];
    }
    public boolean isFull(){
        return maxSize==size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public void print() {
        for(int i=0;i<size;i++){
            System.out.printf(stack[i]+" ");
        }
        System.out.printf("\n");
    }
    public int getMin()
    {
        return min;
    }
}

public class Source1 {
    public static void main(String[] args) {
        SpecialStack stack1=new SpecialStack(5);
        stack1.push(48);
        stack1.push(20);
        stack1.push(40);
        stack1.push(38);
        stack1.push(29);
        stack1.push(73);
        System.out.println(stack1.pop()+" "+stack1.pop()+ " "+stack1.getMin());
        stack1.print();
    }
}
