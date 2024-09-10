package org.openapitools.server.model


/**
 * Ответ на запрос информации о точке продаж.
 *
 * @param outlet  for example: ''null''
*/
final case class GetOutletResponse (
  outlet: Option[FullOutletDTO] = None
)

