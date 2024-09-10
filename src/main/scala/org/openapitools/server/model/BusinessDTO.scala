package org.openapitools.server.model


/**
 * Информация о кабинете.
 *
 * @param id Идентификатор кабинета. for example: ''null''
 * @param name Название бизнеса. for example: ''null''
*/
final case class BusinessDTO (
  id: Option[Long] = None,
  name: Option[String] = None
)

