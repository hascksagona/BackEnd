package com.project.hack.dto.response;

import com.project.hack.model.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDto {

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    private Long postId;

    private String title;


    private String content;


    private String name;


    private String email;


    private String profile_image;


    private String like;


    private String category;

    public PostResponseDto(Post post) {
        this.postId = post.getPostId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.name = post.getName();
        this.email = post.getEmail();
        this.profile_image = post.getProfile_image();
        this.like = post.getLike();
        this.category = post.getCategory();
        this.modifiedAt = post.getModifiedAt();
        this.createdAt = post.getCreatedAt();
    }

    //”modifiedAt” :
    //”createdAt”:



}