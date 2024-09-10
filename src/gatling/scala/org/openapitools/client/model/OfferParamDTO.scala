
package org.openapitools.client.model


case class OfferParamDTO (
    /* Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  */
    _name: String,
    /* Значение.  */
    _value: String
)
object OfferParamDTO {
    def toStringBody(var_name: Object, var_value: Object) =
        s"""
        | {
        | "name":$var_name,"value":$var_value
        | }
        """.stripMargin
}
