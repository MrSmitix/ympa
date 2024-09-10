package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class FeedbackFactorDTO {
    /* Идентификатор параметра. */
    Long id
    /* Название параметра. Например, `Скорость обработки заказа`. */
    String title
    /* Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`. */
    String description
    /* Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка).  */
    Integer value
}
