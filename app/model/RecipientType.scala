package model

import play.api.libs.json._

/**
  * Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class RecipientType(
)

object RecipientType {
  implicit lazy val recipientTypeJsonFormat: Format[RecipientType] = Json.format[RecipientType]
}

