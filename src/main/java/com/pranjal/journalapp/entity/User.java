package com.pranjal.journalapp.entity;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import com.mongodb.lang.NonNull;

import lombok.*;


@Document(collection = "users")
@Data
@Builder
public class User {
    @Id
    private ObjectId id;

    @Indexed(unique = true)
    @NonNull
    private String userName;
    
    @NonNull
    private String password;

    @DBRef
    @Builder.Default
    private List<JournalEntry> journalEntries= new ArrayList<>();

    private List<String> roles;
}
