package flyweight;

import java.util.ArrayList;
import java.util.List;

public class ChineseFacesFactory {
    private static List<ChinaFace> list = new ArrayList<>();

    public static ChinaFace getFace(int len, int wid){
        ChinaFace result = null;
        for(ChinaFace face: list){
            if(face.getLen() == len)
                if(face.getWid() == wid)
                    result = face;
        }

        if (result == null)
            result = new ChinaFace(len, wid);

        return result;
    }
}
