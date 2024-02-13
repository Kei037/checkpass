package com.checkpass.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admin extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ano;

    @OneToOne  // 일대일 구조 관계
    @JoinColumn(name = "user_id") // 외래키 컬럼명 설정
    private User user;
}
