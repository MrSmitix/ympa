package org.openapitools.server.model


/**
 * Информация о доставке.
 *
 * @param id Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  for example: ''null''
 * @param `type`  for example: ''null''
 * @param serviceName Наименование службы доставки. for example: ''null''
 * @param price {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа.  for example: ''null''
 * @param deliveryPartnerType  for example: ''null''
 * @param courier  for example: ''null''
 * @param dates  for example: ''null''
 * @param region  for example: ''null''
 * @param address  for example: ''null''
 * @param vat  for example: ''null''
 * @param deliveryServiceId Идентификатор службы доставки. for example: ''null''
 * @param liftType  for example: ''null''
 * @param liftPrice Стоимость подъема на этаж. for example: ''null''
 * @param outletCode Идентификатор пункта самовывоза, присвоенный магазином. for example: ''null''
 * @param outletStorageLimitDate Формат даты: `ДД-ММ-ГГГГ`.  for example: ''23-09-2022''
 * @param dispatchType  for example: ''null''
 * @param tracks Информация для отслеживания перемещений посылки. for example: ''null''
 * @param shipments Информация о посылках. for example: ''null''
 * @param estimated Приблизительная ли дата доставки. for example: ''null''
 * @param eacType  for example: ''null''
 * @param eacCode Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`).  for example: ''null''
*/
final case class OrderDeliveryDTO (
  id: Option[String] = None,
  `type`: Option[OrderDeliveryType] = None,
  serviceName: Option[String] = None,
  price: Option[Double] = None,
  deliveryPartnerType: Option[OrderDeliveryPartnerType] = None,
  courier: Option[OrderCourierDTO] = None,
  dates: Option[OrderDeliveryDatesDTO] = None,
  region: Option[RegionDTO] = None,
  address: Option[OrderDeliveryAddressDTO] = None,
  vat: Option[OrderVatType] = None,
  deliveryServiceId: Option[Long] = None,
  liftType: Option[OrderLiftType] = None,
  liftPrice: Option[Double] = None,
  outletCode: Option[String] = None,
  outletStorageLimitDate: Option[String] = None,
  dispatchType: Option[OrderDeliveryDispatchType] = None,
  tracks: Option[Seq[OrderTrackDTO]] = None,
  shipments: Option[Seq[OrderShipmentDTO]] = None,
  estimated: Option[Boolean] = None,
  eacType: Option[OrderDeliveryEacType] = None,
  eacCode: Option[String] = None
)

