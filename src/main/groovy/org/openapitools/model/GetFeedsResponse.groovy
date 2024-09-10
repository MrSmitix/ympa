package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FeedDTO;

@Canonical
class GetFeedsResponse {
    /* Список прайс-листов. */
    List<FeedDTO> feeds = new ArrayList<>()
}
