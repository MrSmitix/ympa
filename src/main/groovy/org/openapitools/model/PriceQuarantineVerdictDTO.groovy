package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PriceQuarantineVerdictParameterDTO;
import org.openapitools.model.PriceQuarantineVerdictType;

@Canonical
class PriceQuarantineVerdictDTO {
    
    PriceQuarantineVerdictType type
    /* Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. */
    List<PriceQuarantineVerdictParameterDTO> params = new ArrayList<>()
}
