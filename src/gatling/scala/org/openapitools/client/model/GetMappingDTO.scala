
package org.openapitools.client.model


case class GetMappingDTO (
    /* SKU на Маркете. */
    _marketSku: Option[Long],
    /* Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
    _marketSkuName: Option[String],
    /* Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
    _marketModelId: Option[Long],
    /* Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
    _marketModelName: Option[String],
    /* Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  */
    _marketCategoryId: Option[Long],
    /* Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  */
    _marketCategoryName: Option[String]
)
object GetMappingDTO {
    def toStringBody(var_marketSku: Object, var_marketSkuName: Object, var_marketModelId: Object, var_marketModelName: Object, var_marketCategoryId: Object, var_marketCategoryName: Object) =
        s"""
        | {
        | "marketSku":$var_marketSku,"marketSkuName":$var_marketSkuName,"marketModelId":$var_marketModelId,"marketModelName":$var_marketModelName,"marketCategoryId":$var_marketCategoryId,"marketCategoryName":$var_marketCategoryName
        | }
        """.stripMargin
}
