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
    private long uno;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String email;

    @Column(length = 30, nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    @ColumnDefault("0")
    private boolean checkPass;

}
