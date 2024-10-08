package dev.changuii.project.repository.impl;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import dev.changuii.project.entity.ContestEntity;
import dev.changuii.project.entity.QContestEntity;
import dev.changuii.project.repository.ContestCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContestCustomRepositoryImpl implements ContestCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public ContestCustomRepositoryImpl(
            @Autowired JPAQueryFactory jpaQueryFactory
    ){
        this.jpaQueryFactory=jpaQueryFactory;
    }


    @Override
    public List<ContestEntity> findByKeywords(List<String> keywords) {
        QContestEntity qContest = QContestEntity.contestEntity;

        BooleanBuilder builder = new BooleanBuilder();
        for (String keyword : keywords){
            builder.or(qContest.content.like("%" + keyword + "%"))
                    .or(qContest.title.like("%" + keyword + "%"));
        }

        return jpaQueryFactory.selectFrom(qContest)
                .where(builder)
                .fetch();
    }
}
