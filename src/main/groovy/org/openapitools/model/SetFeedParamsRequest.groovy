package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FeedParameterDTO;

@Canonical
class SetFeedParamsRequest {
    /* Параметры прайс-листа.  Обязательный параметр.  */
    List<FeedParameterDTO> parameters = new ArrayList<>()
}
