package com.msa.userservice.model;

import lombok.Data;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class RequestLogin {
    private String email;
    private String pwd;
}
