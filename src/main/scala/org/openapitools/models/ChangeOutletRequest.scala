package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OutletAddressDTO
import org.openapitools.models.OutletDeliveryRuleDTO
import org.openapitools.models.OutletType
import org.openapitools.models.OutletVisibilityType
import org.openapitools.models.OutletWorkingScheduleDTO
import scala.collection.immutable.Seq

/**
 * 
 * @param name Название точки продаж. 
 * @param _type 
 * @param coords Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
 * @param isMain Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
 * @param shopOutletCode Идентификатор точки продаж, присвоенный магазином.
 * @param visibility 
 * @param address 
 * @param phones Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
 * @param workingSchedule 
 * @param deliveryRules Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
 * @param storagePeriod Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
 */
case class ChangeOutletRequest(name: String,
                _type: OutletType,
                coords: Option[String],
                isMain: Option[Boolean],
                shopOutletCode: Option[String],
                visibility: Option[OutletVisibilityType],
                address: OutletAddressDTO,
                phones: Seq[String],
                workingSchedule: OutletWorkingScheduleDTO,
                deliveryRules: Option[Seq[OutletDeliveryRuleDTO]],
                storagePeriod: Option[Long]
                )

object ChangeOutletRequest {
    /**
     * Creates the codec for converting ChangeOutletRequest from and to JSON.
     */
    implicit val decoder: Decoder[ChangeOutletRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChangeOutletRequest] = deriveEncoder
}
