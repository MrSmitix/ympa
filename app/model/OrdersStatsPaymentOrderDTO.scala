package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Информация о платежном получении.
  * @param id Номер платежного поручения.
  * @param date Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsPaymentOrderDTO(
  id: Option[String],
  date: Option[LocalDate]
)

object OrdersStatsPaymentOrderDTO {
  implicit lazy val ordersStatsPaymentOrderDTOJsonFormat: Format[OrdersStatsPaymentOrderDTO] = Json.format[OrdersStatsPaymentOrderDTO]
}

