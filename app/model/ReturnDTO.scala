package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Возврат заказа.
  * @param id Идентификатор возврата.
  * @param orderId Номер заказа.
  * @param creationDate Дата создания возврата клиентом.
  * @param updateDate Дата обновления возврата.
  * @param refundAmount Сумма возврата.
  * @param items Список товаров в возврате.
  * @param fastReturn Используется ли опция **Быстрый возврат денег за дешевый брак**. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ReturnDTO(
  id: Option[Long],
  orderId: Option[Long],
  creationDate: Option[OffsetDateTime],
  updateDate: Option[OffsetDateTime],
  refundStatus: Option[RefundStatusType],
  logisticPickupPoint: Option[LogisticPickupPointDTO],
  shipmentRecipientType: Option[RecipientType],
  shipmentStatus: Option[ReturnShipmentStatusType],
  refundAmount: Option[Long],
  items: List[ReturnItemDTO],
  returnType: Option[ReturnType],
  fastReturn: Option[Boolean]
)

object ReturnDTO {
  implicit lazy val returnDTOJsonFormat: Format[ReturnDTO] = Json.format[ReturnDTO]
}

