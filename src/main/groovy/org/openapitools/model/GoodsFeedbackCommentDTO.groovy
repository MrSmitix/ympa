package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GoodsFeedbackCommentAuthorDTO;
import org.openapitools.model.GoodsFeedbackCommentStatusType;

@Canonical
class GoodsFeedbackCommentDTO {
    /* Идентификатор комментария к отзыву.  */
    Long id
    /* Текст комментария. */
    String text
    /* Может ли продавец изменять комментарий или удалять его. */
    Boolean canModify
    /* Идентификатор комментария к отзыву.  */
    Long parentId
    
    GoodsFeedbackCommentAuthorDTO author
    
    GoodsFeedbackCommentStatusType status
}
