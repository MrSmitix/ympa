
package org.openapitools.client.model


case class OfferCardRecommendationDTO (
    _type: OfferCardRecommendationType,
    /* Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов. */
    _percent: Option[Integer]
)
object OfferCardRecommendationDTO {
    def toStringBody(var_type: Object, var_percent: Object) =
        s"""
        | {
        | "type":$var_type,"percent":$var_percent
        | }
        """.stripMargin
}
