import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.*;

public class polyglotAbs {

    // Embedding JavaScript
    public static void jsAbs(int input){
       try (Context context = Context.create("js")){
           Value jsBindings = context.getBindings("js");
           context.eval("js", "print('running abs in JavaScript!')");
           System.out.println(jsBindings.getMember("Math").getMember("abs").execute(input));
       }
    }

    // Embedding Python
    public static void pyAbs(int input){
       try (Context context = Context.create("python")){
           Value pyBindings = context.getBindings("python");
           context.eval("python", "print('running abs in Python!')");
           System.out.println(pyBindings.getMember("abs").execute(input));
       }
    }

    // Embedding Ruby
    public static void rbAbs(int input){
       try (Context context = Context.create("ruby")){
           Value rbBindings = context.getBindings("ruby");
           context.eval("ruby", "puts 'running abs in Ruby!'");
           context.eval("ruby", "puts " + input + ".abs");
       }
    }

   public static void main(String[] args) {
        System.out.println("This polyglot example runs abs functions.");
        jsAbs(-42);
        pyAbs(-42);
        rbAbs(-42);
    }
}
