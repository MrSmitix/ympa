package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;

@Canonical
class GetQualityRatingRequest {
    /* Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты.  */
    Date dateFrom
    /* Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты.  */
    Date dateTo
    /* Список идентификаторов магазинов. */
    Set<Long> campaignIds = new LinkedHashSet<>()
}
