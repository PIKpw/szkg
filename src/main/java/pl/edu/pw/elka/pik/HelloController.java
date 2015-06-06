package pl.edu.pw.elka.pik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.pw.elka.pik.dao.GameDAO;
import pl.edu.pw.elka.pik.model.db.Game;

import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        /*List<Game> listGames = gameDAO.list();
        ModelAndView model = new ModelAndView("hello");
        model.addObject("gameList", listGames);
        model.addObject("message", "Hello World from SZKG!");
        return model;*/
        return "forward:gameList";
    }
}