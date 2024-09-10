package org.openapitools.server.model


/**
 * @param parameters  for example: ''null''
 * @param offers Товары, для которых нужно рассчитать стоимость услуг. for example: ''null''
*/
final case class CalculateTariffsRequest (
  parameters: CalculateTariffsParametersDTO,
  offers: Seq[CalculateTariffsOfferDTO]
)

