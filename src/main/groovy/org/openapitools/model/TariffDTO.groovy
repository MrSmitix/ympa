package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TariffParameterDTO;
import org.openapitools.model.TariffType;

@Canonical
class TariffDTO {
    
    TariffType type
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  */
    BigDecimal percent
    /* Значение тарифа в рублях. */
    BigDecimal amount
    /* Параметры расчета тарифа. */
    List<TariffParameterDTO> parameters = new ArrayList<>()
}
