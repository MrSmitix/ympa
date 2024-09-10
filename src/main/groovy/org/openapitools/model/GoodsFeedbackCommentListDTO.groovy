package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.GoodsFeedbackCommentDTO;

@Canonical
class GoodsFeedbackCommentListDTO {
    /* Список комментариев. */
    List<GoodsFeedbackCommentDTO> comments = new ArrayList<>()
    
    ForwardScrollingPagerDTO paging
}
