package com.shs.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Builder(builderClassName = "Builder")
public class Client {
    private String email;
    private String password;

    public static Client.Builder builder(){
        return new Builder()
                .email("test@outsource-to-ukraine.com")
                .password("testpassword123456");
    }
}
