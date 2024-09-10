package org.openapitools.server.model


/**
 * Информация об акциях Маркета.
 *
 * @param promos Акции Маркета. for example: ''null''
*/
final case class GetPromosResultDTO (
  promos: Seq[GetPromoDTO]
)

