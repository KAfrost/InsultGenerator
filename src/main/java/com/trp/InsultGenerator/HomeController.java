package com.trp.InsultGenerator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


@Controller
@RequestMapping("")
public class HomeController {


   @GetMapping
    public String index (Model model){
       HashMap<String, String> choices = new HashMap<>();
       choices.put("compliment", "Compliment");
       choices.put("insult", "Insult");
       choices.put("encouragement", "Words of Encouragement");

       model.addAttribute("choices", choices);

        return "index";
    }

    @PostMapping("results")
    public String giveItToMeBaby(Model model, String response){
        HashMap<String, String> choices = new HashMap<>();
        choices.put("compliment", "Compliment");
        choices.put("insult", "Insult");
        choices.put("encouragement", "Words of Encouragement");


        model.addAttribute("choices", choices);

        Random random = new Random();

        int randomNum1 = random.nextInt(10);
        int randomNum2 = random.nextInt(10);
        int randomNum3 = random.nextInt(11);

        if (response != null) {
            switch (response) {
                case "insult":
                    switch (randomNum1) {
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

                    switch (randomNum2) {
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

                    switch (randomNum3) {
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
                    break;
                case "compliment":
                    switch (randomNum1) {
                        case 0:
                            model.addAttribute("adj", "a beautiful ");
                            break;
                        case 1:
                            model.addAttribute("adj", "an intelligent ");
                            break;
                        case 2:
                            model.addAttribute("adj", "an amazing ");
                            break;
                        case 3:
                            model.addAttribute("adj", "a hilarious ");
                            break;
                        case 4:
                            model.addAttribute("adj", "a glowing ");
                            break;
                        case 5:
                            model.addAttribute("adj", "a relaxed ");
                            break;
                        case 6:
                            model.addAttribute("adj", "a creative ");
                            break;
                        case 7:
                            model.addAttribute("adj", "a smart ");
                            break;
                        case 8:
                            model.addAttribute("adj", "a giving ");
                            break;
                        case 9:
                            model.addAttribute("adj", "an incredible ");
                            break;
                        default:
                            model.addAttribute("adj", "a selfless ");
                            break;
                    }
                    switch (randomNum2) {
                        case 0:
                            model.addAttribute("adj2", "wonderous ");
                            break;
                        case 1:
                            model.addAttribute("adj2", "worthy ");
                            break;
                        case 2:
                            model.addAttribute("adj2", "skilled ");
                            break;
                        case 3:
                            model.addAttribute("adj2", "honest ");
                            break;
                        case 4:
                            model.addAttribute("adj2", "lovely ");
                            break;
                        case 5:
                            model.addAttribute("adj2", "happy ");
                            break;
                        case 6:
                            model.addAttribute("adj2", "curious ");
                            break;
                        case 7:
                            model.addAttribute("adj2", "friendly ");
                            break;
                        case 8:
                            model.addAttribute("adj2", "resourceful ");
                            break;
                        case 9:
                            model.addAttribute("adj2", "generous ");
                            break;
                        default:
                            model.addAttribute("adj2", "sane ");
                            break;
                    }
                    switch (randomNum3) {
                        case 0:
                            model.addAttribute("name", "friend.");
                            break;
                        case 1:
                            model.addAttribute("name", "flower.");
                            break;
                        case 2:
                            model.addAttribute("name", "genius.");
                            break;
                        case 3:
                            model.addAttribute("name", "winner.");
                            break;
                        case 4:
                            model.addAttribute("name", "ducky.");
                            break;
                        case 5:
                            model.addAttribute("name", "cookie.");
                            break;
                        case 6:
                            model.addAttribute("name", "person.");
                            break;
                        case 7:
                            model.addAttribute("name", "dust bunny.");
                            break;
                        case 8:
                            model.addAttribute("name", "hero.");
                            break;
                        case 9:
                            model.addAttribute("name", "nugget.");
                            break;
                        case 10:
                            model.addAttribute("name", "monkey.");
                            break;
                        default:
                            model.addAttribute("name", "loaf.");
                            break;
                    }
                    break;
                case "encouragement":
                    switch(randomNum3){
                        case 1:
                            model.addAttribute("encourage", "You're a gift to those around you." );
                            break;
                        case 2:
                            model.addAttribute("encourage", "If cartoon bluebirds were real, a couple of 'em would be sitting on your shoulders singing right now.");
                            break;
                        case 3:
                            model.addAttribute("encourage", "You're always learning new things and trying to better yourself. That's awesome.");
                            break;
                        case 4:
                            model.addAttribute("encourage", "Everyone gets knocked down sometimes; only people like you get back up again and keep going.");
                            break;
                        case 5:
                            model.addAttribute("encourage", "I am so proud of you, and I hope you are too!");
                            break;
                        case 6:
                            model.addAttribute("encourage", "You are making a difference.");
                            break;
                        case 7:
                            model.addAttribute("encourage", "Actions speak louder than words, and yours tell an incredible story.");
                            break;
                        case 8:
                            model.addAttribute("encourage", "The people you love are lucky to have you in their lives.");
                            break;
                        case 9:
                            model.addAttribute("encourage", "I KNOW you can.");
                            break;
                        case 10:
                            model.addAttribute("encourage", "You are not alone." );
                            break;
                        default:
                            model.addAttribute("encourage", "You've got this!");
                            break;
                    }
                break;
                default:
                    model.addAttribute("adj", "weird");
                    model.addAttribute("adj2", "cheeky");
                    model.addAttribute("name", "monkey");

            }
        }
        return "index";
    }
}
