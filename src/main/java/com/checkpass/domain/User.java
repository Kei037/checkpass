package com.checkpass.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uno;

    @OneToOne(mappedBy = "user")
    private CheckPass checkPass;

    @Column(unique = true, length = 30, name = "userId") // 외래키 컬럼명 설정
    private String userId;

    @Column
    private String userPw;

    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String email;

    @Column(length = 30)
    private String phoneNumber;

}
