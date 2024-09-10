package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ScrollingPagerDTO {
    /* Идентификатор следующей страницы результатов. */
    String nextPageToken
    /* Идентификатор предыдущей страницы результатов. */
    String prevPageToken
}
