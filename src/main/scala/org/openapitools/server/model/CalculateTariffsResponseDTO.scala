package org.openapitools.server.model


/**
 * Расчет стоимости услуг.
 *
 * @param offers Стоимость услуг. for example: ''null''
*/
final case class CalculateTariffsResponseDTO (
  offers: Seq[CalculateTariffsOfferInfoDTO]
)

