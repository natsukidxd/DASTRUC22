public class MyArrayList {
    private Object[] items;
    private int count;
    
    MyArrayList() {
        this(10); 
    }
    
    MyArrayList(int size) {
        if(size < 5 || size > 50) {
            items = new Object[10];
        } else {
            items = new Object[size];
        }
        count = 0;
    }

    private boolean isFull() {
        return count == items.length;
    }
    
    private boolean isEmpty() {
        return count == 0;
    }
    public boolean add(Object i) {
    	if(!isFull() && !search(i)) {
    		items[count] = i;
    		count++;
    		return true;
    	} else {
    		return false;
    	}
    }

    public boolean search(Object o) {
        if(!isEmpty()) {
            for(int i = 0; i < count; i++) {
                if(items[i].toString().equals(o.toString())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public int searchPart2(Object o) {
        if(!isEmpty()) {
            for(int i = 0; i < count; i++) {
                if(items[i].toString().equals(o.toString())) {
                    return i;
                }
            }
        }
        return -1;
    }

    private boolean isLocationValid(int location) {
        return location >= 0 && location <= count - 1; 
    }

    public Object get(int location) {
        if(!isEmpty() && isLocationValid(location)) {
            return items[location];
        } else {
            return null;
        }
    }
    
    public boolean remove(Object o) {
        if(!isEmpty()) {
            int location = searchPart2(o);
            if(location != -1) {
                items[location] = items[count - 1];
                items[count - 1] = null;
                count--;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean remove(int location) {
        if(!isEmpty() && isLocationValid(location)) {
            items[location] = items[count - 1];
            items[count - 1] = null;
            count--;
            return true;
        }
        return false;
    }
   
    public boolean edit(Object item, Object newItem) {
        if(!isEmpty() && !search(item)) {
            int location = searchPart2(item);
            if(location != -1) {
                items[location] = newItem;
                return true;
            }
        }
        return false;
    }
    
    
    public boolean insert(Object o, int index) {
    	if(!isFull() && !isLocationValid(index)) {
    		items[count] = items[index];
    		count++;
    		items[index] = o;
    		return true;
    	} else {
    		return false;
    	}
    }
    public String toString() {
        String result = "";
        if(!isEmpty()){
            result += "[";
            for(int i = 0; i < count; i++) {
                result += items[i].toString();
                if(i < count - 1) result += ", ";
            }
            result += "]";
        }
        return result;
    }
}
