package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.OfferCardRecommendationDTO;
import org.openapitools.model.OfferCardStatusType;
import org.openapitools.model.OfferErrorDTO;
import org.openapitools.model.ParameterValueDTO;

@Canonical
class OfferCardDTO {
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    String offerId
    
    GetMappingDTO mapping
    /* Список характеристик с их значениями.  */
    List<ParameterValueDTO> parameterValues
    
    OfferCardStatusType cardStatus
    /* Процент заполненности карточки. */
    Integer contentRating
    /* Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  */
    List<OfferCardRecommendationDTO> recommendations
    /* Ошибки в контенте, препятствующие размещению товара на витрине. */
    List<OfferErrorDTO> errors
    /* Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. */
    List<OfferErrorDTO> warnings
}
