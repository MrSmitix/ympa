
package org.openapitools.client.model


case class ModelDTO (
    /* Идентификатор модели товара. */
    _id: Option[Long],
    /* Название модели товара. */
    _name: Option[String],
    _prices: Option[ModelPriceDTO]
)
object ModelDTO {
    def toStringBody(var_id: Object, var_name: Object, var_prices: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"prices":$var_prices
        | }
        """.stripMargin
}
