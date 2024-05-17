package FileSystem;

import java.util.List;

public interface FileStructure {
    void print();
    int getSize();
    List<Integer> getIds();
    boolean isFile();
}
