package com.codeclan.example.file_hw.repository;

import com.codeclan.example.file_hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
