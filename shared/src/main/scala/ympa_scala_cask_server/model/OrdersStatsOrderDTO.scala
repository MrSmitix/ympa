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
import java.time.LocalDate
import java.time.OffsetDateTime
import ympa_scala_cask_server.model.OrderStatsStatusType
import ympa_scala_cask_server.model.OrdersStatsCommissionDTO
import ympa_scala_cask_server.model.OrdersStatsDeliveryRegionDTO
import ympa_scala_cask_server.model.OrdersStatsItemDTO
import ympa_scala_cask_server.model.OrdersStatsOrderPaymentType
import ympa_scala_cask_server.model.OrdersStatsPaymentDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class OrdersStatsOrderDTO(
/* Идентификатор заказа. */
  id: Option[Long] = None ,

  /* Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.  */
  creationDate: Option[LocalDate] = None ,

  /* Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).  */
  statusUpdateDate: Option[OffsetDateTime] = None ,

    status: Option[OrderStatsStatusType] = None ,

  /* Идентификатор заказа в информационной системе магазина. */
  partnerOrderId: Option[String] = None ,

    paymentType: Option[OrdersStatsOrderPaymentType] = None ,

  /* Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  */
  fake: Option[Boolean] = None ,

    deliveryRegion: Option[OrdersStatsDeliveryRegionDTO] = None ,

  /* Список товаров в заказе после возможных изменений. */
  items: Seq[OrdersStatsItemDTO],

  /* Список товаров в заказе до изменений. */
  initialItems: Seq[OrdersStatsItemDTO] = Nil ,

  /* Информация о денежных переводах по заказу. */
  payments: Seq[OrdersStatsPaymentDTO],

  /* Информация о комиссиях за заказ. */
  commissions: Seq[OrdersStatsCommissionDTO]

  ) {

  def asJson: String = asData.asJson

  def asData : OrdersStatsOrderDTOData = {
    OrdersStatsOrderDTOData(
            id = id.getOrElse(0),
            creationDate = creationDate.getOrElse(null),
            statusUpdateDate = statusUpdateDate.getOrElse(null),
            status = status.getOrElse(null),
            partnerOrderId = partnerOrderId.getOrElse(""),
            paymentType = paymentType.getOrElse(null),
            fake = fake.getOrElse(false),
            deliveryRegion = deliveryRegion.map(_.asData).getOrElse(null),
            items = items.map(_.asData),
            initialItems = initialItems.map(_.asData),
            payments = payments.map(_.asData),
            commissions = commissions.map(_.asData)
    )
  }

}

object OrdersStatsOrderDTO{

    given RW[OrdersStatsOrderDTO] = OrdersStatsOrderDTOData.readWriter.bimap[OrdersStatsOrderDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case creationDate extends Fields("creationDate")
            case statusUpdateDate extends Fields("statusUpdateDate")
            case status extends Fields("status")
            case partnerOrderId extends Fields("partnerOrderId")
            case paymentType extends Fields("paymentType")
            case fake extends Fields("fake")
            case deliveryRegion extends Fields("deliveryRegion")
            case items extends Fields("items")
            case initialItems extends Fields("initialItems")
            case payments extends Fields("payments")
            case commissions extends Fields("commissions")
    }


}

