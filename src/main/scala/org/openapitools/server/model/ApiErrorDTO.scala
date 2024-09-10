package org.openapitools.server.model


/**
 * Общий формат ошибки.
 *
 * @param code Код ошибки. for example: ''null''
 * @param message Описание ошибки. for example: ''null''
*/
final case class ApiErrorDTO (
  code: String,
  message: Option[String] = None
)

