package etu1777.framework;

import java.io.File;
import java.util.LinkedList;

public class Utils {
    public String getCoreURL(String url){
        String[] newUrl=url.split("/");
        String rep=new String();
        for(int i=2; i<newUrl.length-1; i++){
            rep+=newUrl[i]+"/";
        }
        rep+=newUrl[newUrl.length-1];
        return rep;
    }
    @SuppressWarnings("rawtypes")
    public LinkedList<Class> getAllPackagesClasses(){
        LinkedList<Class> liste=new LinkedList<>();
        File directory=new File("webapps/frame/WEB-INF/classes");
        File[] files=directory.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                File[] files2=f.listFiles();

            }
        }
        return liste;
    }
}
