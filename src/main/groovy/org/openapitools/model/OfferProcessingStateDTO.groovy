package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferProcessingNoteDTO;
import org.openapitools.model.OfferProcessingStatusType;

@Canonical
class OfferProcessingStateDTO {
    
    OfferProcessingStatusType status
    /* Причины, по которым товар не прошел модерацию. */
    List<OfferProcessingNoteDTO> notes
}
