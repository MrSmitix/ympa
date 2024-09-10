package org.openapitools.server.model


/**
 * @param code Код для подтверждения ЭАПП. for example: ''null''
*/
final case class VerifyOrderEacRequest (
  code: Option[String] = None
)

