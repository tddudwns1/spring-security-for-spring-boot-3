package com.nahwasa.springsecuritybasicsettingforspringboot3.config;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAuthorize {
    @Target({ ElementType.METHOD, ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AdminAuthorize {
        @PreAuthorize("hasAnyRole('ADMIN')")
        String value() default "";
    }

    @Target({ ElementType.METHOD, ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UserAuthorize {
        @PreAuthorize("hasAnyRole('USER')")
        String value() default "";
    }
}
