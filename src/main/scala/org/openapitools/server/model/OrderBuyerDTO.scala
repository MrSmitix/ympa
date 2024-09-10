package org.openapitools.server.model


/**
 * Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. 
 *
 * @param id Идентификатор покупателя. for example: ''null''
 * @param lastName Фамилия покупателя. for example: ''null''
 * @param firstName Имя покупателя. for example: ''null''
 * @param middleName Отчество покупателя. for example: ''null''
 * @param `type`  for example: ''null''
*/
final case class OrderBuyerDTO (
  id: Option[String] = None,
  lastName: Option[String] = None,
  firstName: Option[String] = None,
  middleName: Option[String] = None,
  `type`: Option[OrderBuyerType] = None
)

