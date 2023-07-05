import com.sun.source.tree.CompilationUnitTree;

import java.sql.SQLOutput;

public class MyException extends Exception{
    public MyException(String description){
        super(description);
    }
}
