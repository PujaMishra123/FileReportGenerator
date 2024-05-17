package FileSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileSystemController {
    //there might be single files
    //one file in multiple collections
    //collection inside collection
    public static void main(String[] args)
    {
        ArrayList<FileStructure> list=new ArrayList<>();
        list.add(new File("file1.txt",100,null));
        list.add(new File("file2.txt",200,List.of(1)));
        list.add(new File("file3.txt",200,List.of(1)));
        list.add(new File("file4.txt",300,List.of(2,3)));
        list.add(new File("file5.txt",10,null));
        list.add(new CollectionGroup("collection child",500,List.of(1),4));
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(FileStructure f:list)
        {
            List<Integer> ids=f.getIds();
            if(ids!=null)
            {
                for(int id:ids)
                {
                    hm.put(id,hm.getOrDefault(id,0)+f.getSize());
                }
            }
            if(!f.isFile())
            {
                CollectionGroup obj=(CollectionGroup) f;
                hm.put(obj.getId(),hm.getOrDefault(obj.getId(),0)+f.getSize());
            }


        }
        System.out.println(list.stream().mapToInt(FileStructure::getSize).sum());
     System.out.println(hm.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).limit(3).collect(Collectors.toList()));






    }
}
