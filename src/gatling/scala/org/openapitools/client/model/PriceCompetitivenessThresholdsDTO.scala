
package org.openapitools.client.model


case class PriceCompetitivenessThresholdsDTO (
    _optimalPrice: Option[BasePriceDTO],
    _averagePrice: Option[BasePriceDTO]
)
object PriceCompetitivenessThresholdsDTO {
    def toStringBody(var_optimalPrice: Object, var_averagePrice: Object) =
        s"""
        | {
        | "optimalPrice":$var_optimalPrice,"averagePrice":$var_averagePrice
        | }
        """.stripMargin
}
