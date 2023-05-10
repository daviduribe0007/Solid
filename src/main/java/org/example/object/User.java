package org.example.object;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {

    int id;
    String name;
    String lastName;
}
