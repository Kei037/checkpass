package com.checkpass.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CheckPass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cno;

    @Column
    private String userId;

    @Column
    private boolean pass;
}
