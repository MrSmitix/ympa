package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FeedbackFactorDTO;

@Canonical
class FeedbackGradesDTO {
    /* Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»). */
    BigDecimal average
    /* Количество пользователей, считающих отзыв полезным. */
    Long agreeCount
    /* Количество пользователей, считающих отзыв бесполезным. */
    Long rejectCount
    /* Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.  */
    List<FeedbackFactorDTO> factors = new ArrayList<>()
}
