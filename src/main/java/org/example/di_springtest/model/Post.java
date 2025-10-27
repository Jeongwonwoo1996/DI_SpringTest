package org.example.di_springtest.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data // getter, setter, toString, RequiredArgsConstructor
public class Post {
  private int postId;
  private String title;
  private String body;
  private int likes;
  private User user;




  //NoArgsConstructor
//  public Post(){
//
//  }

  //@RequiredArgsConstructor
//  public Post(int number){
//   this.number = number;
//  }

  //@AllArgsConstructor
//  public Post(int number, int postId, String title, String body, int likes){
//    this.number = number;
//    this.postId = postId;
//    this.title = title;
//    this.body = body;
//    this.likes = likes;
//  }

  // @getter

//  public int getPostId() {
//    return postId;
//  }
//
//  public String getTitle() {
//    return title;
//  }
//
//  public String getBody() {
//    return body;
//  }
//
//  public int getLikes() {
//    return likes;
//  }

  // @setter
//  public void setPostId(int postId) {
//    this.postId = postId;
//  }
//
//  public void setTitle(String title) {
//    this.title = title;
//  }
//
//  public void setBody(String body) {
//    this.body = body;
//  }
//
//  public void setLikes(int likes) {
//    this.likes = likes;
//  }


  // @toString
//  @Override
//  public String toString() {
//    return "Post{" +
//        "postId=" + postId +
//        ", title='" + title + '\'' +
//        ", body='" + body + '\'' +
//        ", likes=" + likes +
//        '}';
//  }
}
