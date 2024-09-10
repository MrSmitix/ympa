package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderDeliveryDTO._

case class OrderDeliveryDTO (
  /* Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  */
  id: Option[String],
`type`: Option[OrderDeliveryType],
/* Наименование службы доставки. */
  serviceName: Option[String],
/* {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  */
  price: Option[BigDecimal],
deliveryPartnerType: Option[OrderDeliveryPartnerType],
courier: Option[OrderCourierDTO],
dates: Option[OrderDeliveryDatesDTO],
region: Option[RegionDTO],
address: Option[OrderDeliveryAddressDTO],
vat: Option[OrderVatType],
/* Идентификатор службы доставки. */
  deliveryServiceId: Option[Long],
liftType: Option[OrderLiftType],
/* Стоимость подъема на этаж. */
  liftPrice: Option[BigDecimal],
/* Идентификатор пункта самовывоза, присвоенный магазином. */
  outletCode: Option[String],
/* Формат даты: `ДД-ММ-ГГГГ`.  */
  outletStorageLimitDate: Option[String],
dispatchType: Option[OrderDeliveryDispatchType],
/* Информация для отслеживания перемещений посылки. */
  tracks: Option[List[OrderTrackDTO]],
/* Информация о посылках. */
  shipments: Option[List[OrderShipmentDTO]],
/* Приблизительная ли дата доставки. */
  estimated: Option[Boolean],
eacType: Option[OrderDeliveryEacType],
/* Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  */
  eacCode: Option[String])

object OrderDeliveryDTO {
  import DateTimeCodecs._

  implicit val OrderDeliveryDTOCodecJson: CodecJson[OrderDeliveryDTO] = CodecJson.derive[OrderDeliveryDTO]
  implicit val OrderDeliveryDTODecoder: EntityDecoder[OrderDeliveryDTO] = jsonOf[OrderDeliveryDTO]
  implicit val OrderDeliveryDTOEncoder: EntityEncoder[OrderDeliveryDTO] = jsonEncoderOf[OrderDeliveryDTO]
}
