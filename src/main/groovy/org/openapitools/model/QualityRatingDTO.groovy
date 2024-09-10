package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.QualityRatingComponentDTO;

@Canonical
class QualityRatingDTO {
    /* Значение индекса качества. */
    Long rating
    /* Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`.  */
    Date calculationDate
    /* Составляющие индекса качества. */
    List<QualityRatingComponentDTO> components = new ArrayList<>()
}
