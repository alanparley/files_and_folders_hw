package com.codeclan.example.file_hw.components;


import com.codeclan.example.file_hw.models.File;
import com.codeclan.example.file_hw.models.Folder;
import com.codeclan.example.file_hw.models.User;
import com.codeclan.example.file_hw.repository.FileRepository;
import com.codeclan.example.file_hw.repository.FolderRepository;
import com.codeclan.example.file_hw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run (ApplicationArguments args){
        User alan = new User ("Alan");
        userRepository.save(alan);

        Folder documents = new Folder ("Documents", alan );
        folderRepository.save(documents);

        Folder music = new Folder ("Music", alan);
        folderRepository.save(music);

        File worddoc = new File ("CV", "doc", 2, documents);
        fileRepository.save(worddoc);

        File tune = new File ("techno", "ogg", 5, music );
        fileRepository.save(tune);



    }
}
