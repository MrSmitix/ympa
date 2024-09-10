package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class AddOffersToArchiveRequest {
    /* Список товаров, которые нужно поместить в архив. */
    List<String> offerIds = new ArrayList<>()
}
