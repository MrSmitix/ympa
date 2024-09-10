package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UpdateGoodsFeedbackCommentDTO {
    /* Идентификатор комментария к отзыву.  */
    Long id
    /* Идентификатор комментария к отзыву.  */
    Long parentId
    /* Текст комментария. */
    String text
}
