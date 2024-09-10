package model

import play.api.libs.json._

/**
  * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
  * @param amount Сумма субсидии.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderSubsidyDTO(
  `type`: Option[OrderSubsidyType],
  amount: Option[BigDecimal]
)

object OrderSubsidyDTO {
  implicit lazy val orderSubsidyDTOJsonFormat: Format[OrderSubsidyDTO] = Json.format[OrderSubsidyDTO]
}

