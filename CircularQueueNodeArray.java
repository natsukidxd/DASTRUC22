import javax.swing.JOptionPane;

public class CircularQueueNodeArray {
    public static void main(String[] args) {
        CircularQueueNode cqn;
        String choice1 = "";

        while(choice1 != "0") {
            choice1 = JOptionPane.showInputDialog("Circular Queue Node Menu\n1. Create\n2. Exit\nEnter your choice: ");

            switch(choice1) {
                case "1" : {
                    cqn = new CircularQueueNode();
                    JOptionPane.showMessageDialog(null, "Circular Queue Node created.");
                    String choice2 = " ";
                    while(choice2 != "4") {
                        choice2 = JOptionPane.showInputDialog("Circular Queue Node Menu\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
                        switch(choice2) {
                            case "1": {
                                String item = JOptionPane.showInputDialog("Enter an object to enqueue:");
                                boolean isEnqueued = cqn.enqueue(item);
                                if(isEnqueued) {
                                    JOptionPane.showMessageDialog(null, "Object enqueued.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Object not enqueued.");
                                }
                                break;
                            }
                            case "2": {
                                int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to dequeue?");
                                if(input == 0) {
                                    boolean isDequeued = cqn.dequeue();
                                    if(isDequeued) {
                                        JOptionPane.showMessageDialog(null, "Dequeued successful.");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Dequeued unsuccessful.");
                                    }
                                }
                                break;
                            }
                            case "3": {
                                String result = cqn.toString();
                                JOptionPane.showMessageDialog(null, result);
                                break;
                            }
                            case "4": {
                                JOptionPane.showMessageDialog(null, "Exiting the menu...");
                                break;
                            }
                            default: {
                                JOptionPane.showMessageDialog(null, "Choose between 1 to 3 only.");
                                break;
                            }
                        }
                    }
                    break;
                }
                case "2": {
                    JOptionPane.showMessageDialog(null, "Exiting....");
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Choose between 1 and 2.");
                }
            }
        }
    }
}