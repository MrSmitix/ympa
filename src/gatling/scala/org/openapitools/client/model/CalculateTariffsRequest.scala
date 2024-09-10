
package org.openapitools.client.model


case class CalculateTariffsRequest (
    _parameters: CalculateTariffsParametersDTO,
    /* Товары, для которых нужно рассчитать стоимость услуг. */
    _offers: List[CalculateTariffsOfferDTO]
)
object CalculateTariffsRequest {
    def toStringBody(var_parameters: Object, var_offers: Object) =
        s"""
        | {
        | "parameters":$var_parameters,"offers":$var_offers
        | }
        """.stripMargin
}
