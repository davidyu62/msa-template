package com.msa.userservice;

import jakarta.persistence.Column;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class RequestUser {

    @NotNull
    private String email;
    @NotNull
    private String name;
    @NotNull
    private String pwd;
}
