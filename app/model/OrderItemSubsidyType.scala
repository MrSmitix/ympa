package model

import play.api.libs.json._

/**
  * Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderItemSubsidyType(
)

object OrderItemSubsidyType {
  implicit lazy val orderItemSubsidyTypeJsonFormat: Format[OrderItemSubsidyType] = Json.format[OrderItemSubsidyType]
}

