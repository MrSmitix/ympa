package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class GetBidsRecommendationsRequest {
    /* Список товаров, для которых нужно получить рекомендации по ставкам.  */
    List<String> skus = new ArrayList<>()
}
