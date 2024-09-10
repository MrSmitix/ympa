package org.openapitools.server.model


/**
 * Фильтры для получения списка акций.
 *
 * @param participation  for example: ''null''
 * @param mechanics  for example: ''null''
*/
final case class GetPromosRequest (
  participation: Option[PromoParticipationType] = None,
  mechanics: Option[MechanicsType] = None
)

