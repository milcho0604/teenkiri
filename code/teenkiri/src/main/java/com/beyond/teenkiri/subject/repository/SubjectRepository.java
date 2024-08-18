package com.beyond.teenkiri.subject.repository;

import com.beyond.teenkiri.common.domain.DelYN;
import com.beyond.teenkiri.subject.domain.Grade;
import com.beyond.teenkiri.subject.domain.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

    Page<Subject> findByDelYN(DelYN delYN, Pageable pageable);
    Page<Subject> findByTitleContainingAndDelYN(String title, DelYN delYN, Pageable pageable);
    Page<Subject> findByUserTeacherNameContainingAndDelYN(String userTeacherName, DelYN delYN, Pageable pageable);
    Page<Subject> findByCourseIdAndDelYN(Long courseId, DelYN delYN, Pageable pageable);
    Page<Subject> findByCourseIdAndGradeInAndDelYN(Long courseId, List<Grade> grades, DelYN delYN, Pageable pageable);
    Page<Subject> findByGradeInAndDelYN(List<Grade> grades, DelYN delYN, Pageable pageable);
    Page<Subject> findAllByDelYNOrderByRatingDesc(DelYN delYN, Pageable pageable);
    Page<Subject> findByIsMainSubjectAndDelYN(Boolean isMainSubject, DelYN delYN, Pageable pageable);
    Page<Subject> findByTitleContainingOrUserTeacherNameContainingAndDelYN(String title, String userTeacherName, DelYN delYN, Pageable pageable);
    Page<Subject> findByTitleContainingOrUserTeacherNameContainingOrGradeInAndDelYN(String title, String userTeacherName, List<Grade> grades, DelYN delYN, Pageable pageable);
    Page<Subject> findByTitleContainingAndGradeInAndDelYN(String title, List<Grade> grades, DelYN delYN, Pageable pageable);
    Page<Subject> findByUserTeacherNameContainingAndGradeInAndDelYN(String userTeacherName, List<Grade> grades, DelYN delYN, Pageable pageable);

}
