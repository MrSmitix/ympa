package model

import play.api.libs.json._

/**
  * Способ доставки заказа:  * `DELIVERY` — курьерская доставка.  * `PICKUP` — самовывоз.  * `POST` — почта.  * `DIGITAL` — для цифровых товаров.  * `UNKNOWN` — неизвестный тип. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderDeliveryType(
)

object OrderDeliveryType {
  implicit lazy val orderDeliveryTypeJsonFormat: Format[OrderDeliveryType] = Json.format[OrderDeliveryType]
}

