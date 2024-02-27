import java.io.*;
import java.util.ArrayList;
import java.util.List;

class AppData {
    private List<String> headers;
    private List<List<Integer>> data;

    public AppData(List<String> headers, List<List<Integer>> data) {
        this.headers = headers;
        this.data = data;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public List<List<Integer>> getData() {
        return data;
    }

    public void setData(List<List<Integer>> data) {
        this.data = data;
    }
}

