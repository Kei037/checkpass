package com.checkpass.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admin extends BaseEntity {
    @Id
    @GeneratedValue
    private long ano;

    @Column(length = 20, nullable = false)
    private String adId;

    @Column(length = 20, nullable = false)
    private String adPw;

    public void change(String adId, String adPw) {
        this.adId = adId;
        this.adPw = adPw;
    }
}
