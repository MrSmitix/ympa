package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GoodsFeedbackStatisticsDTO {
    /* Оценка товара. */
    Integer rating
    /* Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.  */
    Long commentsCount
    /* Рекомендуют ли этот товар. */
    Boolean recommended
    /* Количество баллов Плюса, которое автор получил за отзыв. */
    Long paidAmount
}
