package excercises.week03;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    // Text hiện tại
    private String s = "";

    // Lịch sử để phục vụ undo
    private Stack<String> history = new Stack<>();


    // Query 1: append W
    public void append(String w) {
        history.push(s);
        s += w;
    }


    // Query 2: delete k ký tự cuối
    public void delete(int k) {
        history.push(s);
        s = s.substring(0, s.length() - k);
    }


    // Query 3: print ký tự thứ k
    public void print(int k) {
        System.out.println(s.charAt(k - 1));
    }


    // Query 4: undo
    public void undo() {
        s = history.pop();
    }
}