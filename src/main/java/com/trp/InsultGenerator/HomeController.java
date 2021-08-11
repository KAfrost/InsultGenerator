package com.trp.InsultGenerator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;


@Controller
@RequestMapping("")
public class HomeController {

   @GetMapping
    public String index (Model model){
        Random random = new Random();

        int randomNum1 = random.nextInt(10);
        int randomNum2 = random.nextInt(10);
        int randomNum3 = random.nextInt(11);



        switch (randomNum1){
            case 0:
                model.addAttribute("adj", "a dim-witted ");
                break;
            case 1:
                model.addAttribute("adj", "a lazy ");
                break;
            case 2:
                model.addAttribute("adj", "a rude ");
                break;
            case 3:
                model.addAttribute("adj", "a sad ");
                break;
            case 4:
                model.addAttribute("adj", "an impertinent ");
                break;
            case 5:
                model.addAttribute("adj", "an uptight ");
                break;
            case 6:
                model.addAttribute("adj", "a droning ");
                break;
            case 7:
                model.addAttribute("adj", "a lame ");
                break;
            case 8:
                model.addAttribute("adj", "a vain ");
                break;
            case 9:
                model.addAttribute("adj", "a boring ");
                break;
            default:
                model.addAttribute("adj", "a stupid ");
                break;
        }

        switch (randomNum2){
            case 0:
                model.addAttribute("adj2", "hairy ");
                break;
            case 1:
                model.addAttribute("adj2", "puny ");
                break;
            case 2:
                model.addAttribute("adj2", "ditzy ");
                break;
            case 3:
                model.addAttribute("adj2", "crusty ");
                break;
            case 4:
                model.addAttribute("adj2", "funky ");
                break;
            case 5:
                model.addAttribute("adj2", "cheesy ");
                break;
            case 6:
                model.addAttribute("adj2", "grizzly ");
                break;
            case 7:
                model.addAttribute("adj2", "stinky ");
                break;
            case 8:
                model.addAttribute("adj2", "whiny ");
                break;
            case 9:
                model.addAttribute("adj2", "dizzy ");
                break;
            default:
                model.addAttribute("adj2", "greedy ");
                break;
        }

        switch (randomNum3){
            case 0:
                model.addAttribute("name", "camel.");
                break;
            case 1:
                model.addAttribute("name", "pizza face.");
                break;
            case 2:
                model.addAttribute("name", "nooblet.");
                break;
            case 3:
                model.addAttribute("name", "panda.");
                break;
            case 4:
                model.addAttribute("name", "ducky.");
                break;
            case 5:
                model.addAttribute("name", "squeegee.");
                break;
            case 6:
                model.addAttribute("name", "twig.");
                break;
            case 7:
                model.addAttribute("name", "dust bunny.");
                break;
            case 8:
                model.addAttribute("name", "stump.");
                break;
            case 9:
                model.addAttribute("name", "nugget.");
                break;
            case 10:
                model.addAttribute("name", "LaunchCode book.");
                break;
            default:
                model.addAttribute("name", "loaf.");
                break;
        }

        return "index";
    }
}
