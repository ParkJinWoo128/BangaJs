package com.example.firstproject1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // DB가 해당 객체를 인식 가능!!
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Article {

    @Id // 대표값을 지정! link a 학번!!
    @GeneratedValue // 1, 2, 3 ... 자동 생성 어노테이션!!
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
    
    // 위에서 @ 저거 해서 자동으로 추가됨 그래서 이거 밑에 필요없음
//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }
//
//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}