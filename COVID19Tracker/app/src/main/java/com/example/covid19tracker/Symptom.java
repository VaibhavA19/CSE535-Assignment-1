package com.example.covid19tracker;

public class Symptom {
   private String Name;
   private int rating;

   public String getName() {
      return Name;
   }

   public Symptom(String name, int rating) {
      Name = name;
      this.rating = rating;
   }

   public void setName(String name) {
      Name = name;
   }

   public int getRating() {
      return rating;
   }

   public void setRating(int rating) {
      this.rating = rating;
   }
}
