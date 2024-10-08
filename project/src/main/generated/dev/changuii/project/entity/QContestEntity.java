package dev.changuii.project.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QContestEntity is a Querydsl query type for ContestEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContestEntity extends EntityPathBase<ContestEntity> {

    private static final long serialVersionUID = -1593241066L;

    public static final QContestEntity contestEntity = new QContestEntity("contestEntity");

    public final StringPath content = createString("content");

    public final NumberPath<Long> contestId = createNumber("contestId", Long.class);

    public final StringPath contestURL = createString("contestURL");

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    public final StringPath imageURL = createString("imageURL");

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final StringPath title = createString("title");

    public final StringPath type = createString("type");

    public QContestEntity(String variable) {
        super(ContestEntity.class, forVariable(variable));
    }

    public QContestEntity(Path<? extends ContestEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContestEntity(PathMetadata metadata) {
        super(ContestEntity.class, metadata);
    }

}

