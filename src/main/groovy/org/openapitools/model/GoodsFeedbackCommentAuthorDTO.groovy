package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GoodsFeedbackCommentAuthorType;

@Canonical
class GoodsFeedbackCommentAuthorDTO {
    
    GoodsFeedbackCommentAuthorType type
    /* Имя автора или название кабинета. */
    String name
}
