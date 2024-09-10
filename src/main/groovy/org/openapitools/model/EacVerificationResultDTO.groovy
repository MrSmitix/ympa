package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EacVerificationStatusType;

@Canonical
class EacVerificationResultDTO {
    
    EacVerificationStatusType verificationResult
    /* Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  */
    Integer attemptsLeft
}
