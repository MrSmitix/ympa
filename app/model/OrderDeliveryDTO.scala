package model

import play.api.libs.json._

/**
  * Информация о доставке.
  * @param id Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
  * @param serviceName Наименование службы доставки.
  * @param price {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
  * @param deliveryServiceId Идентификатор службы доставки.
  * @param liftPrice Стоимость подъема на этаж.
  * @param outletCode Идентификатор пункта самовывоза, присвоенный магазином.
  * @param outletStorageLimitDate Формат даты: `ДД-ММ-ГГГГ`. 
  * @param tracks Информация для отслеживания перемещений посылки.
  * @param shipments Информация о посылках.
  * @param estimated Приблизительная ли дата доставки.
  * @param eacCode Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderDeliveryDTO(
  id: Option[String],
  `type`: Option[OrderDeliveryType],
  serviceName: Option[String],
  price: Option[BigDecimal],
  deliveryPartnerType: Option[OrderDeliveryPartnerType],
  courier: Option[OrderCourierDTO],
  dates: Option[OrderDeliveryDatesDTO],
  region: Option[RegionDTO],
  address: Option[OrderDeliveryAddressDTO],
  vat: Option[OrderVatType],
  deliveryServiceId: Option[Long],
  liftType: Option[OrderLiftType],
  liftPrice: Option[BigDecimal],
  outletCode: Option[String],
  outletStorageLimitDate: Option[String],
  dispatchType: Option[OrderDeliveryDispatchType],
  tracks: Option[List[OrderTrackDTO]],
  shipments: Option[List[OrderShipmentDTO]],
  estimated: Option[Boolean],
  eacType: Option[OrderDeliveryEacType],
  eacCode: Option[String]
)

object OrderDeliveryDTO {
  implicit lazy val orderDeliveryDTOJsonFormat: Format[OrderDeliveryDTO] = Json.format[OrderDeliveryDTO]
}

