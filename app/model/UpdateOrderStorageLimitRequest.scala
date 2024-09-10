package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Запрос на обновление срока хранения заказа в ПВЗ.
  * @param newDate Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOrderStorageLimitRequest(
  newDate: LocalDate
)

object UpdateOrderStorageLimitRequest {
  implicit lazy val updateOrderStorageLimitRequestJsonFormat: Format[UpdateOrderStorageLimitRequest] = Json.format[UpdateOrderStorageLimitRequest]
}

