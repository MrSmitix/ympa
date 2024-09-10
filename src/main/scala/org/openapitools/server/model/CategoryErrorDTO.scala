package org.openapitools.server.model


/**
 * Текст ошибки.
 *
 * @param categoryId Идентификатор категории. for example: ''null''
 * @param `type`  for example: ''null''
*/
final case class CategoryErrorDTO (
  categoryId: Option[Long] = None,
  `type`: Option[CategoryErrorType] = None
)

