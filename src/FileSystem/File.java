package FileSystem;

import java.util.List;

public class File implements  FileStructure{
    String name;

    public File(String name, int size, List<Integer> ids) {
        this.name = name;
        this.size = size;
        this.ids = ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Integer> getIds() {
        return ids;
    }

    @Override
    public boolean isFile() {
        return true;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    int size;
    List<Integer> ids;

    @Override
    public void print() {
        System.out.print(name+" "+size);


    }
}
