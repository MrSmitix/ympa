package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedDownloadErrorDTO;
import org.openapitools.model.FeedStatusType;

@Canonical
class FeedDownloadDTO {
    
    FeedStatusType status
    
    FeedDownloadErrorDTO error
}
