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

    public static final QBoardEntity boardEntity = new QBoardEntity("boardEntity");

    public final NumberPath<Long> boardId = createNumber("boardId", Long.class);

    public final DatePath<java.time.LocalDate> closeDate = createDate("closeDate", java.time.LocalDate.class);

    public final StringPath content = createString("content");

    public final StringPath openTalkURL = createString("openTalkURL");

    public final DatePath<java.time.LocalDate> postDate = createDate("postDate", java.time.LocalDate.class);

    public final ListPath<String, StringPath> techStacks = this.<String, StringPath>createList("techStacks", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public QBoardEntity(String variable) {
        super(BoardEntity.class, forVariable(variable));
    }

    public QBoardEntity(Path<? extends BoardEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardEntity(PathMetadata metadata) {
        super(BoardEntity.class, metadata);
    }

}

