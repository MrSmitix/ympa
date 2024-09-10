package model

import play.api.libs.json._

/**
  * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
  * @param discount Размер пользовательской скидки в валюте покупателя. 
  * @param subsidy Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
  * @param shopPromoId Идентификатор акции поставщика. 
  * @param marketPromoId Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderItemPromoDTO(
  `type`: OrderPromoType,
  discount: Option[BigDecimal],
  subsidy: Option[BigDecimal],
  shopPromoId: Option[String],
  marketPromoId: Option[String]
)

object OrderItemPromoDTO {
  implicit lazy val orderItemPromoDTOJsonFormat: Format[OrderItemPromoDTO] = Json.format[OrderItemPromoDTO]
}

