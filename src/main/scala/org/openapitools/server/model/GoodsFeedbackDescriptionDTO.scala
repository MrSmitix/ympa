package org.openapitools.server.model


/**
 * Текстовая часть отзыва.
 *
 * @param advantages Описание плюсов товара в отзыве. for example: ''null''
 * @param disadvantages Описание минусов товара в отзыве. for example: ''null''
 * @param comment Комментарий в отзыве. for example: ''null''
*/
final case class GoodsFeedbackDescriptionDTO (
  advantages: Option[String] = None,
  disadvantages: Option[String] = None,
  comment: Option[String] = None
)

