package com.xansa.ParkOps.feedback;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int feedback_id;
    int visitor_id,ride_id,rating;
    String comment;

    public Feedback() {
    }

    public Feedback(int feedback_id, int visitor_id, int ride_id, int rating, String comment) {
        this.feedback_id = feedback_id;
        this.visitor_id = visitor_id;
        this.ride_id = ride_id;
        this.rating = rating;
        this.comment = comment;
    }

    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    public int getVisitor_id() {
        return visitor_id;
    }

    public void setVisitor_id(int visitor_id) {
        this.visitor_id = visitor_id;
    }

    public int getRide_id() {
        return ride_id;
    }

    public void setRide_id(int ride_id) {
        this.ride_id = ride_id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
