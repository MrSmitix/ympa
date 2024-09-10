package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Информация о новой дате доставки заказа.
  * @param toDate Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderDeliveryDateDTO(
  toDate: LocalDate
)

object OrderDeliveryDateDTO {
  implicit lazy val orderDeliveryDateDTOJsonFormat: Format[OrderDeliveryDateDTO] = Json.format[OrderDeliveryDateDTO]
}

