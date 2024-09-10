
package org.openapitools.client.model


case class OfferMappingDTO (
    /* SKU на Маркете. */
    _marketSku: Option[Long],
    /* Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара.  */
    _modelId: Option[Long],
    /* Идентификатор категории для текущей карточки товара на Маркете. */
    _categoryId: Option[Long]
)
object OfferMappingDTO {
    def toStringBody(var_marketSku: Object, var_modelId: Object, var_categoryId: Object) =
        s"""
        | {
        | "marketSku":$var_marketSku,"modelId":$var_modelId,"categoryId":$var_categoryId
        | }
        """.stripMargin
}
