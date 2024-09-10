package org.openapitools.server.model


/**
 * Информация о покупателе и его номере телефона.
 *
 * @param id Идентификатор покупателя. for example: ''null''
 * @param lastName Фамилия покупателя. for example: ''null''
 * @param firstName Имя покупателя. for example: ''null''
 * @param middleName Отчество покупателя. for example: ''null''
 * @param `type`  for example: ''null''
 * @param phone Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`.  for example: ''null''
*/
final case class OrderBuyerInfoDTO (
  id: Option[String] = None,
  lastName: Option[String] = None,
  firstName: Option[String] = None,
  middleName: Option[String] = None,
  `type`: Option[OrderBuyerType] = None,
  phone: Option[String] = None
)

