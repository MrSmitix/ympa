package org.openapitools.server.model


/**
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 *
 * @param optimalPrice  for example: ''null''
 * @param averagePrice  for example: ''null''
*/
final case class PriceCompetitivenessThresholdsDTO (
  optimalPrice: Option[BasePriceDTO] = None,
  averagePrice: Option[BasePriceDTO] = None
)

