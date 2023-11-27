import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping
public class SuperMan {

/*

/about
@RequestMapping this annotation is used for mapping  URl with  method

*/
@RequestMapping("/about")

public String aboutRequestHeader(){

    System.out.println("Processing about to request");
    return "about";
}

}
