package org.openapitools.server.model


/**
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 *
 * @param sellingProgram  for example: ''null''
 * @param status  for example: ''null''
*/
final case class OfferSellingProgramDTO (
  sellingProgram: SellingProgramType,
  status: OfferSellingProgramStatusType
)

