package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FeedContentErrorDTO;
import org.openapitools.model.FeedStatusType;

@Canonical
class FeedContentDTO {
    /* Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`.  */
    Long rejectedOffersCount
    
    FeedStatusType status
    /* Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`.  */
    Long totalOffersCount
    
    FeedContentErrorDTO error
}
