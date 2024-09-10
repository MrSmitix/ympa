package org.openapitools.server.model


/**
 * Описывает проблемы, которые появились при сохранении товара.
 *
 * @param status  for example: ''null''
 * @param results Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  for example: ''null''
*/
final case class UpdateOfferContentResponse (
  status: Option[ApiResponseStatusType] = None,
  results: Option[Seq[UpdateOfferContentResultDTO]] = None
)

