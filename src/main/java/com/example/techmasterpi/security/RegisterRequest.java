package com.example.techmasterpi.security;

import com.example.techmasterpi.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private int cin;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private int phone;
    private String address;
    @Nullable
    private String profilepicture;
    @Nullable
    private String companyname;



    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Role> roles;
}
