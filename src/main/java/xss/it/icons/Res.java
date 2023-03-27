package xss.it.icons;

import java.net.URL;

/**
 * @author XDSSWAR
 * Created on 03/27/2023
 */
public class Res {

    /**
     * Get Url of resource
     * @param location String
     * @return URL
     */
    public static URL load(String location){
        return Res.class.getResource(location);
    }

}
