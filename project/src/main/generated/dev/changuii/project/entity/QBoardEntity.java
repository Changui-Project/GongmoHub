package dev.changuii.project.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardEntity is a Querydsl query type for BoardEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardEntity extends EntityPathBase<BoardEntity> {

    private static final long serialVersionUID = -1876846040L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardEntity boardEntity = new QBoardEntity("boardEntity");

    public final NumberPath<Long> boardId = createNumber("boardId", Long.class);

    public final DatePath<java.time.LocalDate> closeDate = createDate("closeDate", java.time.LocalDate.class);

    public final NumberPath<Integer> contactNum = createNumber("contactNum", Integer.class);

    public final StringPath contactType = createString("contactType");

    public final StringPath content = createString("content");

    public final QContestEntity contestEntity;

    public final StringPath openTalkURL = createString("openTalkURL");

    public final DatePath<java.time.LocalDate> postDate = createDate("postDate", java.time.LocalDate.class);

    public final StringPath recruitmentType = createString("recruitmentType");

    public final StringPath rule = createString("rule");

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final ListPath<String, StringPath> techStacks = this.<String, StringPath>createList("techStacks", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public QBoardEntity(String variable) {
        this(BoardEntity.class, forVariable(variable), INITS);
    }

    public QBoardEntity(Path<? extends BoardEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardEntity(PathMetadata metadata, PathInits inits) {
        this(BoardEntity.class, metadata, inits);
    }

    public QBoardEntity(Class<? extends BoardEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contestEntity = inits.isInitialized("contestEntity") ? new QContestEntity(forProperty("contestEntity")) : null;
    }

}

