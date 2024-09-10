package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;

@Canonical
class SkipGoodsFeedbackReactionRequest {
    /* Список идентификаторов отзывов, на которые магазин не будет отвечать. */
    Set<Long> feedbackIds = new LinkedHashSet<>()
}
