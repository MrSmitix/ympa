package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApiResponseStatusType;
import org.openapitools.model.GoodsFeedbackCommentListDTO;

@Canonical
class GetGoodsFeedbackCommentsResponse {
    
    ApiResponseStatusType status
    
    GoodsFeedbackCommentListDTO result
}
