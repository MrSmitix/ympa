
package org.openapitools.client.model


case class GetModelsResponse (
    /* Список моделей товаров. */
    _models: List[ModelDTO],
    _currency: Option[CurrencyType],
    /* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
    _regionId: Option[Long]
)
object GetModelsResponse {
    def toStringBody(var_models: Object, var_currency: Object, var_regionId: Object) =
        s"""
        | {
        | "models":$var_models,"currency":$var_currency,"regionId":$var_regionId
        | }
        """.stripMargin
}
