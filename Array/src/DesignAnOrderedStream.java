import java.util.ArrayList;
import java.util.List;

class OrderedStream {

    private String[] arr;
    int ptr = 1;

    public OrderedStream(int n) {
        arr = new String[n+1];
    }

    public List<String> insert(int id, String value) {

        List<String> res = new ArrayList<>();
        arr[id] = value;
        while(ptr<=arr.length-1 && arr[ptr] != null) {
            res.add(arr[ptr++]);
        }
        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(id,value);
 */