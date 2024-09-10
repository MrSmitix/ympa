package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FeedbackCommentAuthorDTO;

@Canonical
class FeedbackCommentDTO {
    /* Идентификатор ответа. */
    Long id
    /* Идентификатор родительского ответа. */
    Long parentId
    /* Текст ответа. */
    String body
    /* Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    Date createdAt
    /* Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
    Date updatedAt
    
    FeedbackCommentAuthorDTO author
    /* Дочерние ответы. */
    List<FeedbackCommentDTO> children
}
