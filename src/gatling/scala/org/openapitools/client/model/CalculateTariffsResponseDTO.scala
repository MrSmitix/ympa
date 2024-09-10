
package org.openapitools.client.model


case class CalculateTariffsResponseDTO (
    /* Стоимость услуг. */
    _offers: List[CalculateTariffsOfferInfoDTO]
)
object CalculateTariffsResponseDTO {
    def toStringBody(var_offers: Object) =
        s"""
        | {
        | "offers":$var_offers
        | }
        """.stripMargin
}
