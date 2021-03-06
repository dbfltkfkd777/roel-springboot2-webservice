package com.roel.book.springboot.domain.posts;

import com.roel.book.springboot.domain.posts.user.User;
import lombok.Getter;
import org.springframework.context.annotation.Scope;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;



    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
