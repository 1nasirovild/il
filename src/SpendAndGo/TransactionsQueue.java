/*
 * Name: Ildar Nasirov
 * Project Name: Transaction Queue
 * Version: 1.0
 * ADT: Queue
 */
package SpendAndGo;

/**
 *
 * @author Ildar
 */
public class TransactionsQueue extends Object{
    private final String[] queue;
    private int first = 0;
    private int last = 0;
    private int length = 0;

    public TransactionsQueue() {
        this.queue = new String[10];
    }

    public TransactionsQueue(int capacity) {
        this.queue = new String[capacity];
    }

    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public int size() {
        return this.length;
    }

    public void enqueue(String st) {
        if (this.isFull()) {
            System.out.println("The queue is full");
        } else {
            this.queue[this.last] = st;
            this.last = (this.last + 1) % this.capacity();
            this.length++;
        }
    }

    public void dequeue() {
        if (this.isEmpty()) {
            System.out.println("Nothing to remove");
        } else {
            this.queue[first] = null;
            this.first = (this.first + 1) % this.capacity();
            this.length--;
        }
    }

    public String dequeueReturn() {
        if (this.isEmpty()) {
            return ("Nothing to remove");
        } else {
            String toReturn = this.queue[this.first];
            this.queue[first] = null;
            this.first = (this.first + 1) % this.capacity();
            this.length--;
            return toReturn;
        }
    }

    public int capacity() {
        return this.queue.length;
    }

    public String peek() {
        if (this.isEmpty()) {
            return "The Queue is empty";
        } else {
            return this.queue[this.first];
        }
    }

    public boolean isFull() {
        return this.capacity() == this.size();
    }


    @Override
    public String toString() {

        String transactionQueue = "";
        int finalString = this.last;
        int firstString = this.first;
        
        if (this.isEmpty()) {
            return "The Transaction Queue is empty";
        } else {
            do {
                transactionQueue = transactionQueue + this.queue[firstString] + "\n";
                firstString = (firstString + 1) % this.capacity();
            } while (finalString != firstString);
            return transactionQueue;
        }

    }

}
