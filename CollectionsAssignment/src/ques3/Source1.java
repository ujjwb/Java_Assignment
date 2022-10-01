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

    int maxSize, size,stack[],minStack[];

    public SpecialStack(int maxSize){
        this.stack= new int[maxSize];
        this.minStack=new int[maxSize];
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
            minStack[size]=element;
        }
        else if(minStack[size-1]>element){
            minStack[size]=element;
        }
        else if(minStack[size-1]<element){
            minStack[size]=minStack[size-1];
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
        System.out.println("");
    }


    public int getMin()
    {
        return minStack[size-1];
    }
}

public class Source1 {
    public static void main(String[] args) {
        SpecialStack stack1=new SpecialStack(10);
        stack1.push(48);
        stack1.push(20);
        stack1.push(40);
        stack1.push(21);
        stack1.push(29);
        stack1.push(23);
        stack1.push(1);
        stack1.push(18);



        System.out.println(stack1.getMin()+" "+stack1.pop()+" "+stack1.pop()+ " "+stack1.getMin());
        stack1.print();
    }
}
