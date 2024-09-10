package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MechanicsType;
import org.openapitools.model.PromoParticipationType;

@Canonical
class GetPromosRequest {
    
    PromoParticipationType participation
    
    MechanicsType mechanics
}
