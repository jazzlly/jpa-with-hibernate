package com.in28minutes.jpa.hibernate.demo.repository;

import com.in28minutes.jpa.hibernate.demo.DemoApplication;
import com.in28minutes.jpa.hibernate.demo.entity.Review;
import com.in28minutes.jpa.hibernate.demo.entity.ReviewRating;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class ReviewRepoTest {
    @Autowired
    ReviewRepo reviewRepo;

    @Test
    public void smoke() {
        Review review = new Review(ReviewRating.FOUR, "just for test");
        Review saved = reviewRepo.save(review);

        System.out.println(saved);
    }
}