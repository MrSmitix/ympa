package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedbackCommentAuthorType;

@Canonical
class FeedbackCommentAuthorDTO {
    
    FeedbackCommentAuthorType type
    /* Имя автора отзыва или название магазина. */
    String name
}
