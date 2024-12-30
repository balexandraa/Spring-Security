package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NaturalId;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column
    private String username;

    @NotNull
    private String password;

    @Singular
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "users_roles",
                joinColumns = {
                        @JoinColumn(name = "USERS_ID",
                                    referencedColumnName = "ID")},
                inverseJoinColumns = {
                        @JoinColumn(name = "ROLES_ID",
                                    referencedColumnName = "ID")
                })
    private List<Role> roles;

    @Builder.Default
    private Boolean accountNonExpired = true;

    @Builder.Default
    private Boolean accountNonLocked = true;

    @Builder.Default
    private Boolean credentialsNonExpired = true;

    @Builder.Default
    private Boolean enabled = true;

    private String firstName;

    private String lastName;

    @NaturalId(mutable = true)
    private String emailAddress;

    private LocalDate birthdate;

}
