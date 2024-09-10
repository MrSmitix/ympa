package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ReturnDecisionReasonType;
import org.openapitools.model.ReturnDecisionSubreasonType;
import org.openapitools.model.ReturnDecisionType;

@Canonical
class ReturnDecisionDTO {
    /* Идентификатор товара в возврате. */
    Long returnItemId
    /* Количество единиц товара. */
    Integer count
    /* Комментарий. */
    String comment
    
    ReturnDecisionReasonType reasonType
    
    ReturnDecisionSubreasonType subreasonType
    
    ReturnDecisionType decisionType
    /* Сумма возврата. */
    Long refundAmount
    /* Компенсация за обратную доставку. */
    Long partnerCompensation
    /* Список хеш-кодов фотографий товара от покупателя. */
    List<String> images
}
