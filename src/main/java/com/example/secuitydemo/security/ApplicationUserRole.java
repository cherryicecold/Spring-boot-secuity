package com.example.secuitydemo.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.secuitydemo.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE)),
    STUDENT(Sets.newHashSet(STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
