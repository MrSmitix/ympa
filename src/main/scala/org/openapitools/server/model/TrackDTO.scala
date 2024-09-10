package org.openapitools.server.model


/**
 * Информация о трек-номерах.
 *
 * @param trackCode Трек-код почтового отправления. for example: ''null''
*/
final case class TrackDTO (
  trackCode: Option[String] = None
)

