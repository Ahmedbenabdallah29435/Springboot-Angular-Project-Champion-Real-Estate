package com.example.techmasterpi.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;


@Getter
@Setter
public class RelocationDTO {

    private Integer relocationid;

    private Date relocationdate;

    @Size(max = 255)
    private String locationdep;

    @Size(max = 255)
    private String locationarr;

    private Integer userRelocation;

}
