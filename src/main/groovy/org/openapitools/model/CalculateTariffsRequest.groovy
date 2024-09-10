package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CalculateTariffsOfferDTO;
import org.openapitools.model.CalculateTariffsParametersDTO;

@Canonical
class CalculateTariffsRequest {
    
    CalculateTariffsParametersDTO parameters
    /* Товары, для которых нужно рассчитать стоимость услуг. */
    List<CalculateTariffsOfferDTO> offers = new ArrayList<>()
}
