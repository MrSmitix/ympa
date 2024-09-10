package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OutletAddressDTO
import org.openapitools.models.OutletDeliveryRuleDTO
import org.openapitools.models.OutletStatusType
import org.openapitools.models.OutletType
import org.openapitools.models.OutletVisibilityType
import org.openapitools.models.OutletWorkingScheduleDTO
import org.openapitools.models.RegionDTO
import scala.collection.immutable.Seq

/**
 * Информация о точке продаж.
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
 * @param id Идентификатор точки продаж, присвоенный Маркетом.
 * @param status 
 * @param region 
 * @param shopOutletId Идентификатор точки продаж, заданный магазином.
 * @param workingTime Рабочее время.
 * @param moderationReason Статус модерации.
 */
case class FullOutletDTO(name: String,
                _type: OutletType,
                coords: Option[String],
                isMain: Option[Boolean],
                shopOutletCode: Option[String],
                visibility: Option[OutletVisibilityType],
                address: OutletAddressDTO,
                phones: Seq[String],
                workingSchedule: OutletWorkingScheduleDTO,
                deliveryRules: Option[Seq[OutletDeliveryRuleDTO]],
                storagePeriod: Option[Long],
                id: Option[Long],
                status: Option[OutletStatusType],
                region: Option[RegionDTO],
                shopOutletId: Option[String],
                workingTime: Option[String],
                moderationReason: Option[String]
                )

object FullOutletDTO {
    /**
     * Creates the codec for converting FullOutletDTO from and to JSON.
     */
    implicit val decoder: Decoder[FullOutletDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FullOutletDTO] = deriveEncoder
}
