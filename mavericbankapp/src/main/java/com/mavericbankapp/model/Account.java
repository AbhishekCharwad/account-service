package com.mavericbankapp.model;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String type;
        @Column(name = "type")
        private String customerId;




}
