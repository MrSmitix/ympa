package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GoodsFeedbackDescriptionDTO {
    /* Описание плюсов товара в отзыве. */
    String advantages
    /* Описание минусов товара в отзыве. */
    String disadvantages
    /* Комментарий в отзыве. */
    String comment
}
