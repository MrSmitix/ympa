package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GetMappingDTO {
    /* SKU на Маркете. */
    Long marketSku
    /* Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
    String marketSkuName
    /* Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
    Long marketModelId
    /* Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
    String marketModelName
    /* Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  */
    Long marketCategoryId
    /* Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  */
    String marketCategoryName
}
