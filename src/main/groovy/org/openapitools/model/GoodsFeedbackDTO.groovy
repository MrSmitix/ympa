package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GoodsFeedbackDescriptionDTO;
import org.openapitools.model.GoodsFeedbackIdentifiersDTO;
import org.openapitools.model.GoodsFeedbackMediaDTO;
import org.openapitools.model.GoodsFeedbackStatisticsDTO;

@Canonical
class GoodsFeedbackDTO {
    /* Идентификатор отзыва.  */
    Long feedbackId
    /* Дата и время создания отзыва. */
    Date createdAt
    /* Нужен ли ответ на отзыв. */
    Boolean needReaction
    
    GoodsFeedbackIdentifiersDTO identifiers
    /* Имя автора отзыва. */
    String author
    
    GoodsFeedbackDescriptionDTO description
    
    GoodsFeedbackMediaDTO media
    
    GoodsFeedbackStatisticsDTO statistics
}
