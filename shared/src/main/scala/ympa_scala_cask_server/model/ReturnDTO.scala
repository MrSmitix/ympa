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
import ympa_scala_cask_server.model.LogisticPickupPointDTO
import ympa_scala_cask_server.model.RecipientType
import ympa_scala_cask_server.model.RefundStatusType
import ympa_scala_cask_server.model.ReturnItemDTO
import ympa_scala_cask_server.model.ReturnShipmentStatusType
import ympa_scala_cask_server.model.ReturnType
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class ReturnDTO(
/* Идентификатор возврата. */
  id: Option[Long] = None ,

  /* Номер заказа. */
  orderId: Option[Long] = None ,

  /* Дата создания возврата клиентом. */
  creationDate: Option[OffsetDateTime] = None ,

  /* Дата обновления возврата. */
  updateDate: Option[OffsetDateTime] = None ,

    refundStatus: Option[RefundStatusType] = None ,

    logisticPickupPoint: Option[LogisticPickupPointDTO] = None ,

    shipmentRecipientType: Option[RecipientType] = None ,

    shipmentStatus: Option[ReturnShipmentStatusType] = None ,

  /* Сумма возврата. */
  refundAmount: Option[Long] = None ,

  /* Список товаров в возврате. */
  items: Seq[ReturnItemDTO],

    returnType: Option[ReturnType] = None ,

  /* Используется ли опция **Быстрый возврат денег за дешевый брак**.  */
  fastReturn: Option[Boolean] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : ReturnDTOData = {
    ReturnDTOData(
            id = id.getOrElse(0),
            orderId = orderId.getOrElse(0),
            creationDate = creationDate.getOrElse(null),
            updateDate = updateDate.getOrElse(null),
            refundStatus = refundStatus.getOrElse(null),
            logisticPickupPoint = logisticPickupPoint.map(_.asData).getOrElse(null),
            shipmentRecipientType = shipmentRecipientType.getOrElse(null),
            shipmentStatus = shipmentStatus.getOrElse(null),
            refundAmount = refundAmount.getOrElse(0),
            items = items.map(_.asData),
            returnType = returnType.getOrElse(null),
            fastReturn = fastReturn.getOrElse(false)
    )
  }

}

object ReturnDTO{

    given RW[ReturnDTO] = ReturnDTOData.readWriter.bimap[ReturnDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case orderId extends Fields("orderId")
            case creationDate extends Fields("creationDate")
            case updateDate extends Fields("updateDate")
            case refundStatus extends Fields("refundStatus")
            case logisticPickupPoint extends Fields("logisticPickupPoint")
            case shipmentRecipientType extends Fields("shipmentRecipientType")
            case shipmentStatus extends Fields("shipmentStatus")
            case refundAmount extends Fields("refundAmount")
            case items extends Fields("items")
            case returnType extends Fields("returnType")
            case fastReturn extends Fields("fastReturn")
    }


}

