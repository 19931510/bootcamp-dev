package com.dev.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity (name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List <Feedback>feedbacks;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List <News> news;

    @OneToMany(cascade = CascadeType.ALL)
    private List <Service> service;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }
    public List <Feedback> getFeedbacks() { return feedbacks; }
    public void setFeedbacks(List <Feedback> feedbacks) { this.feedbacks = feedbacks; }
    public List <News> getNews() { return news; }
    public void setNews(List <News> news) { this.news = news; }
    public List <Service> getService() { return service; }
    public void setService(List <Service> service) { this.service = service; }

    }
