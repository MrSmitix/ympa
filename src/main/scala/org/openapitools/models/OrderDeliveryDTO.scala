package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrderCourierDTO
import org.openapitools.models.OrderDeliveryAddressDTO
import org.openapitools.models.OrderDeliveryDatesDTO
import org.openapitools.models.OrderDeliveryDispatchType
import org.openapitools.models.OrderDeliveryEacType
import org.openapitools.models.OrderDeliveryPartnerType
import org.openapitools.models.OrderDeliveryType
import org.openapitools.models.OrderLiftType
import org.openapitools.models.OrderShipmentDTO
import org.openapitools.models.OrderTrackDTO
import org.openapitools.models.OrderVatType
import org.openapitools.models.RegionDTO
import scala.collection.immutable.Seq

/**
 * Информация о доставке.
 * @param id Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
 * @param _type 
 * @param serviceName Наименование службы доставки.
 * @param price {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
 * @param deliveryPartnerType 
 * @param courier 
 * @param dates 
 * @param region 
 * @param address 
 * @param vat 
 * @param deliveryServiceId Идентификатор службы доставки.
 * @param liftType 
 * @param liftPrice Стоимость подъема на этаж.
 * @param outletCode Идентификатор пункта самовывоза, присвоенный магазином.
 * @param outletStorageLimitDate Формат даты: `ДД-ММ-ГГГГ`. 
 * @param dispatchType 
 * @param tracks Информация для отслеживания перемещений посылки.
 * @param shipments Информация о посылках.
 * @param estimated Приблизительная ли дата доставки.
 * @param eacType 
 * @param eacCode Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
 */
case class OrderDeliveryDTO(id: Option[String],
                _type: Option[OrderDeliveryType],
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
                tracks: Option[Seq[OrderTrackDTO]],
                shipments: Option[Seq[OrderShipmentDTO]],
                estimated: Option[Boolean],
                eacType: Option[OrderDeliveryEacType],
                eacCode: Option[String]
                )

object OrderDeliveryDTO {
    /**
     * Creates the codec for converting OrderDeliveryDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderDeliveryDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDeliveryDTO] = deriveEncoder
}
