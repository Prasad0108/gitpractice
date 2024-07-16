package com.JwtSecurity.Prakat_Project.Security;


import com.JwtSecurity.Prakat_Project.Service.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JwtHelper {

@Autowired
    private CustomUserDetailService customUserDetailService;
public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;

    private String secret = "afafasfafafasfasfasfafacasdasfasxASFACASDFACASDFASFASFDAFASFASDAADSCSDFADCVSGCFVADXCcadwavfsfarvf";

    public String getUsernameFromToken(String token) {

    }
}
