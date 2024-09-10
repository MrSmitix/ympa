package org.openapitools.server.model


/**
 * Текст ошибки.
 *
 * @param `type`  for example: ''null''
 * @param parameterId Идентификатор характеристики, с которой связана ошибка. for example: ''null''
 * @param message Текст ошибки. for example: ''null''
*/
final case class OfferMappingErrorDTO (
  `type`: OfferMappingErrorType,
  parameterId: Option[Long] = None,
  message: String
)

