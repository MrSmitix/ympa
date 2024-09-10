package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderDeliveryAddressDTO._

case class OrderDeliveryAddressDTO (
  /* Страна.  Обязательный параметр.  */
  country: Option[String],
/* Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).  */
  postcode: Option[String],
/* Город или населенный пункт.  Обязательный параметр.  */
  city: Option[String],
/* Район. */
  district: Option[String],
/* Станция метро. */
  subway: Option[String],
/* Улица.  Обязательный параметр.  */
  street: Option[String],
/* Дом или владение.  Обязательный параметр.  */
  house: Option[String],
/* Корпус или строение. */
  block: Option[String],
/* Подъезд. */
  entrance: Option[String],
/* Код домофона. */
  entryphone: Option[String],
/* Этаж. */
  floor: Option[String],
/* Квартира или офис. */
  apartment: Option[String],
/* Телефон получателя заказа.  Обязательный параметр.  */
  phone: Option[String],
/* Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  */
  recipient: Option[String],
gps: Option[GpsDTO])

object OrderDeliveryAddressDTO {
  import DateTimeCodecs._

  implicit val OrderDeliveryAddressDTOCodecJson: CodecJson[OrderDeliveryAddressDTO] = CodecJson.derive[OrderDeliveryAddressDTO]
  implicit val OrderDeliveryAddressDTODecoder: EntityDecoder[OrderDeliveryAddressDTO] = jsonOf[OrderDeliveryAddressDTO]
  implicit val OrderDeliveryAddressDTOEncoder: EntityEncoder[OrderDeliveryAddressDTO] = jsonEncoderOf[OrderDeliveryAddressDTO]
}
