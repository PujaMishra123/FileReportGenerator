package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class CollectionGroup implements FileStructure {
    String name;
    int size;
    List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    @Override
    public boolean isFile() {
        return false;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;


    public List<FileStructure> getFs() {
        return fs;
    }

    List<FileStructure> fs;

    public CollectionGroup(String name,int size,List<Integer> ids,int id) {
        this.name = name;
        this.size=size;
        this.ids=ids;
        this.id=id;
        fs=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setFs(List<FileStructure> fs) {
        this.fs = fs;
    }
    public void addFilesOrCollection(FileStructure obj)
    {
        fs.add(obj);

    }



    public int getSize()
    {
        int size=0;
        for(FileStructure fi:fs)
        {
            size=size+fi.getSize();


        }
        return size+this.size;
    }



    @Override
    public void print() {


    }
}
