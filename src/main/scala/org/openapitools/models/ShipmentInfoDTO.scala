package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.DeliveryServiceDTO
import org.openapitools.models.PalletsCountDTO
import org.openapitools.models.PartnerShipmentWarehouseDTO
import org.openapitools.models.ShipmentStatusType
import org.openapitools.models.ShipmentType

/**
 * Список с информацией об отгрузках.
 * @param id Идентификатор отгрузки.
 * @param planIntervalFrom Начало планового интервала отгрузки.
 * @param planIntervalTo Конец планового интервала отгрузки.
 * @param shipmentType 
 * @param warehouse 
 * @param warehouseTo 
 * @param externalId Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
 * @param deliveryService 
 * @param palletsCount 
 * @param orderIds Идентификаторы заказов в отгрузке.
 * @param draftCount Количество заказов, которое Маркет запланировал к отгрузке.
 * @param plannedCount Количество заказов, которое Маркет подтвердил к отгрузке.
 * @param factCount Количество заказов, принятых в сортировочном центре или пункте приема.
 * @param status 
 * @param statusDescription Описание статуса отгрузки.
 * @param statusUpdateTime Время последнего изменения статуса отгрузки.
 */
case class ShipmentInfoDTO(id: Option[Long],
                planIntervalFrom: Option[ZonedDateTime],
                planIntervalTo: Option[ZonedDateTime],
                shipmentType: Option[ShipmentType],
                warehouse: Option[PartnerShipmentWarehouseDTO],
                warehouseTo: Option[PartnerShipmentWarehouseDTO],
                externalId: Option[String],
                deliveryService: Option[DeliveryServiceDTO],
                palletsCount: Option[PalletsCountDTO],
                orderIds: Set[Long],
                draftCount: Option[Int],
                plannedCount: Option[Int],
                factCount: Option[Int],
                status: Option[ShipmentStatusType],
                statusDescription: Option[String],
                statusUpdateTime: Option[ZonedDateTime]
                )

object ShipmentInfoDTO {
    /**
     * Creates the codec for converting ShipmentInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[ShipmentInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ShipmentInfoDTO] = deriveEncoder
}
