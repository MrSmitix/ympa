
package org.openapitools.client.model


case class OfferConditionDTO (
    _type: Option[OfferConditionType],
    _quality: Option[OfferConditionQualityType],
    /* Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.  */
    _reason: Option[String]
)
object OfferConditionDTO {
    def toStringBody(var_type: Object, var_quality: Object, var_reason: Object) =
        s"""
        | {
        | "type":$var_type,"quality":$var_quality,"reason":$var_reason
        | }
        """.stripMargin
}
