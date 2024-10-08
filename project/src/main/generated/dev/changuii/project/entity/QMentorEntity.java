package dev.changuii.project.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMentorEntity is a Querydsl query type for MentorEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMentorEntity extends EntityPathBase<MentorEntity> {

    private static final long serialVersionUID = 82269989L;

    public static final QMentorEntity mentorEntity = new QMentorEntity("mentorEntity");

    public final StringPath content = createString("content");

    public final StringPath email = createString("email");

    public final StringPath imageURL = createString("imageURL");

    public final NumberPath<Long> mentorId = createNumber("mentorId", Long.class);

    public final StringPath name = createString("name");

    public final StringPath openTalkURL = createString("openTalkURL");

    public final StringPath password = createString("password");

    public final StringPath record = createString("record");

    public QMentorEntity(String variable) {
        super(MentorEntity.class, forVariable(variable));
    }

    public QMentorEntity(Path<? extends MentorEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMentorEntity(PathMetadata metadata) {
        super(MentorEntity.class, metadata);
    }

}

