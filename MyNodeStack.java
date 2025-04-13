public class MyNodeStack {
	MyNode top;
	int count;
	
	public MyNodeStack() {
		top = null;
		count = 0;
	}
	public boolean isEmpty() {
		return top == null;
	}
	private boolean isFull() {
		return false;
	}
	public boolean push(Object o) {
		if(!isFull()) {
			MyNode newNode = new MyNode();
			newNode.item = o;
			if(top == null) {
				top = newNode;
			} else {
				MyNode tempTop = top;
				while(tempTop.next != null) {
					tempTop = tempTop.next;
				}
				tempTop.next = newNode;
			}
			count++;
		}
		return true;
	}
	public boolean pop() {
		if(!isEmpty()) {
			if(top != null && top.next == null) {
				top = null;
			} else {
				MyNode currentTempTop = top;
				MyNode previousTempTop = null;
				while(currentTempTop.next != null) {
					previousTempTop = currentTempTop;
					currentTempTop = currentTempTop.next;
				}
				previousTempTop.next = null;
			}
			count--;
			return true;
		}
		return false;
	}
	public Object peek() {
		if(!isEmpty()) {
			MyNode tempTop = top;
			while(tempTop.next != null) {
				tempTop = tempTop.next;
			}
			return tempTop.item;
		}
		return null;
	}
	public String toString() {
		String result = "";
		if(!isEmpty()) {
			if(top != null && top.next == null) {
				result += "[" + top.item.toString() + "] =>";
			} else {
				MyNode tempTop = top;
				while(tempTop.next != null) {
					result += "[" + tempTop.item.toString() + "] =>";
					tempTop = tempTop.next;
				}
			}
		}
		return result;
	}
}
