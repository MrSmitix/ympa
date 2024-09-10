package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PaymentFrequencyType;
import org.openapitools.model.SellingProgramType;

@Canonical
class CalculateTariffsParametersDTO {
    /* Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке.  */
    Long campaignId
    
    SellingProgramType sellingProgram
    
    PaymentFrequencyType frequency
}
