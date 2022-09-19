package com.edu.ulab.app.entity;

import com.edu.ulab.app.dto.UserDto;
import lombok.*;

import java.awt.print.Book;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class User extends UserDto {
   // private nameID;
    private Long id;
    private String fullName;
    private List<Book> books;
    private int age;
}

