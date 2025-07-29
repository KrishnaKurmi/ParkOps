package com.xansa.ParkOps.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {
    @Autowired
    FeedbackRepository feedbackRepository;

    @GetMapping("/feedback/{id}/{rid}")
    public String feedback(@PathVariable("id")int id,@PathVariable("rid") int rid, Model model){
        Feedback f = new Feedback();
        f.setVisitor_id(id);
        f.setRide_id(rid);
        model.addAttribute("feedback",f);
//        model.addAttribute("vistorId",id);
//        model.addAttribute("rideId",rid);
        return "feedback";
    }

    @PostMapping("/submit")
    @ResponseBody
    public String submit(@ModelAttribute Feedback f,Model model){
        feedbackRepository.save(f);
//        feedback.setVisitor_id(id);
//        feedback.setRide_id(rid);
//        feedback.setRating(rating);
//        feedback.setComment(comment);
//        feedbackRepository.save(feedback);
        System.out.println("Rating : "+ f.getRating()+"\nComment : "+ f.getComment());
        System.out.println("\n-----------------------------------");
        return "Success";
    }
}
