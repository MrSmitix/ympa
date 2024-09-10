package model

import play.api.libs.json._
import java.time.OffsetDateTime
import scala.collection.immutable.Set

/**
  * Список с информацией об отгрузках.
  * @param id Идентификатор отгрузки.
  * @param planIntervalFrom Начало планового интервала отгрузки.
  * @param planIntervalTo Конец планового интервала отгрузки.
  * @param externalId Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
  * @param orderIds Идентификаторы заказов в отгрузке.
  * @param draftCount Количество заказов, которое Маркет запланировал к отгрузке.
  * @param plannedCount Количество заказов, которое Маркет подтвердил к отгрузке.
  * @param factCount Количество заказов, принятых в сортировочном центре или пункте приема.
  * @param statusDescription Описание статуса отгрузки.
  * @param statusUpdateTime Время последнего изменения статуса отгрузки.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ShipmentInfoDTO(
  id: Option[Long],
  planIntervalFrom: Option[OffsetDateTime],
  planIntervalTo: Option[OffsetDateTime],
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
  statusUpdateTime: Option[OffsetDateTime]
  additionalProperties: 
)

object ShipmentInfoDTO {
  implicit lazy val shipmentInfoDTOJsonFormat: Format[ShipmentInfoDTO] = {
    val realJsonFormat = Json.format[ShipmentInfoDTO]
    val declaredPropNames = Set("id", "planIntervalFrom", "planIntervalTo", "shipmentType", "warehouse", "warehouseTo", "externalId", "deliveryService", "palletsCount", "orderIds", "draftCount", "plannedCount", "factCount", "status", "statusDescription", "statusUpdateTime")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { shipmentInfoDTO =>
        val jsObj = realJsonFormat.writes(shipmentInfoDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

