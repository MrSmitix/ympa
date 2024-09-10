package org.openapitools.server.model


/**
 * Описывает проблемы, возникшие при сохранении товара.
 *
 * @param status  for example: ''null''
 * @param results Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  for example: ''null''
*/
final case class UpdateOfferMappingsResponse (
  status: Option[ApiResponseStatusType] = None,
  results: Option[Seq[UpdateOfferMappingResultDTO]] = None
)

