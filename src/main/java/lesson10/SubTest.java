package lesson10;

import java.io.FileNotFoundException;

/**
 * Created by admin on 10.11.2016.
 */
public class SubTest extends Test {

       /* public void start() throws Exception{
            throw new Exception("");
        }*/

    public void start()throws FileNotFoundException{
        throw new FileNotFoundException("File Not found!");
    }

}
