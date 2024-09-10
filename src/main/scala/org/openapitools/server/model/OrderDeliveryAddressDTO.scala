package org.openapitools.server.model


/**
 * Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
 *
 * @param country Страна.  Обязательный параметр.  for example: ''null''
 * @param postcode Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).  for example: ''null''
 * @param city Город или населенный пункт.  Обязательный параметр.  for example: ''null''
 * @param district Район. for example: ''null''
 * @param subway Станция метро. for example: ''null''
 * @param street Улица.  Обязательный параметр.  for example: ''null''
 * @param house Дом или владение.  Обязательный параметр.  for example: ''null''
 * @param block Корпус или строение. for example: ''null''
 * @param entrance Подъезд. for example: ''null''
 * @param entryphone Код домофона. for example: ''null''
 * @param floor Этаж. for example: ''null''
 * @param apartment Квартира или офис. for example: ''null''
 * @param phone Телефон получателя заказа.  Обязательный параметр.  for example: ''null''
 * @param recipient Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  for example: ''null''
 * @param gps  for example: ''null''
*/
final case class OrderDeliveryAddressDTO (
  country: Option[String] = None,
  postcode: Option[String] = None,
  city: Option[String] = None,
  district: Option[String] = None,
  subway: Option[String] = None,
  street: Option[String] = None,
  house: Option[String] = None,
  block: Option[String] = None,
  entrance: Option[String] = None,
  entryphone: Option[String] = None,
  floor: Option[String] = None,
  apartment: Option[String] = None,
  phone: Option[String] = None,
  recipient: Option[String] = None,
  gps: Option[GpsDTO] = None
)

