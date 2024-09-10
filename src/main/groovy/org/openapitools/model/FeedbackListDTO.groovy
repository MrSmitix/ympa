package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FeedbackDTO;
import org.openapitools.model.ScrollingPagerDTO;

@Canonical
class FeedbackListDTO {
    
    ScrollingPagerDTO paging
    /* Список отзывов.  Содержит не более 20 отзывов.  */
    List<FeedbackDTO> feedbackList = new ArrayList<>()
}
