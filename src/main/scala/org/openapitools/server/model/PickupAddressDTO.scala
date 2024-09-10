package org.openapitools.server.model


/**
 * Адрес доставки.
 *
 * @param country Страна. for example: ''Россия''
 * @param city Город. for example: ''Москва''
 * @param street Улица. for example: ''Стрелецкая улица''
 * @param house Номер дома. for example: ''9к2''
 * @param postcode Почтовый индекс. for example: ''123518''
*/
final case class PickupAddressDTO (
  country: Option[String] = None,
  city: Option[String] = None,
  street: Option[String] = None,
  house: Option[String] = None,
  postcode: Option[String] = None
)

