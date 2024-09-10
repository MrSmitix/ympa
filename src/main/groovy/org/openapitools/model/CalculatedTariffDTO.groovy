package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CalculatedTariffType;
import org.openapitools.model.TariffParameterDTO;

@Canonical
class CalculatedTariffDTO {
    
    CalculatedTariffType type
    /* Стоимость услуги в рублях. */
    BigDecimal amount
    /* Параметры расчета тарифа. */
    List<TariffParameterDTO> parameters = new ArrayList<>()
}
