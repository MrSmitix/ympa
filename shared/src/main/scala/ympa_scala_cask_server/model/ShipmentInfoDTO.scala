/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI spec version: LATEST
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */

// this model was generated using model.mustache
package ympa_scala_cask_server.model
import java.time.OffsetDateTime
import ympa_scala_cask_server.model.DeliveryServiceDTO
import ympa_scala_cask_server.model.PalletsCountDTO
import ympa_scala_cask_server.model.PartnerShipmentWarehouseDTO
import ympa_scala_cask_server.model.ShipmentStatusType
import ympa_scala_cask_server.model.ShipmentType
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class ShipmentInfoDTO(
/* Идентификатор отгрузки. */
  id: Option[Long] = None ,

  /* Начало планового интервала отгрузки. */
  planIntervalFrom: Option[OffsetDateTime] = None ,

  /* Конец планового интервала отгрузки. */
  planIntervalTo: Option[OffsetDateTime] = None ,

    shipmentType: Option[ShipmentType] = None ,

    warehouse: Option[PartnerShipmentWarehouseDTO] = None ,

    warehouseTo: Option[PartnerShipmentWarehouseDTO] = None ,

  /* Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`. */
  externalId: Option[String] = None ,

    deliveryService: Option[DeliveryServiceDTO] = None ,

    palletsCount: Option[PalletsCountDTO] = None ,

  /* Идентификаторы заказов в отгрузке. */
  orderIds: Set[Long],

  /* Количество заказов, которое Маркет запланировал к отгрузке. */
  draftCount: Option[Int] = None ,

  /* Количество заказов, которое Маркет подтвердил к отгрузке. */
  plannedCount: Option[Int] = None ,

  /* Количество заказов, принятых в сортировочном центре или пункте приема. */
  factCount: Option[Int] = None ,

    status: Option[ShipmentStatusType] = None ,

  /* Описание статуса отгрузки. */
  statusDescription: Option[String] = None ,

  /* Время последнего изменения статуса отгрузки. */
  statusUpdateTime: Option[OffsetDateTime] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : ShipmentInfoDTOData = {
    ShipmentInfoDTOData(
            id = id.getOrElse(0),
            planIntervalFrom = planIntervalFrom.getOrElse(null),
            planIntervalTo = planIntervalTo.getOrElse(null),
            shipmentType = shipmentType.getOrElse(null),
            warehouse = warehouse.map(_.asData).getOrElse(null),
            warehouseTo = warehouseTo.map(_.asData).getOrElse(null),
            externalId = externalId.getOrElse(""),
            deliveryService = deliveryService.map(_.asData).getOrElse(null),
            palletsCount = palletsCount.map(_.asData).getOrElse(null),
            orderIds = orderIds,
            draftCount = draftCount.getOrElse(0),
            plannedCount = plannedCount.getOrElse(0),
            factCount = factCount.getOrElse(0),
            status = status.getOrElse(null),
            statusDescription = statusDescription.getOrElse(""),
            statusUpdateTime = statusUpdateTime.getOrElse(null)
    )
  }

}

object ShipmentInfoDTO{

    given RW[ShipmentInfoDTO] = ShipmentInfoDTOData.readWriter.bimap[ShipmentInfoDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case planIntervalFrom extends Fields("planIntervalFrom")
            case planIntervalTo extends Fields("planIntervalTo")
            case shipmentType extends Fields("shipmentType")
            case warehouse extends Fields("warehouse")
            case warehouseTo extends Fields("warehouseTo")
            case externalId extends Fields("externalId")
            case deliveryService extends Fields("deliveryService")
            case palletsCount extends Fields("palletsCount")
            case orderIds extends Fields("orderIds")
            case draftCount extends Fields("draftCount")
            case plannedCount extends Fields("plannedCount")
            case factCount extends Fields("factCount")
            case status extends Fields("status")
            case statusDescription extends Fields("statusDescription")
            case statusUpdateTime extends Fields("statusUpdateTime")
    }


}

