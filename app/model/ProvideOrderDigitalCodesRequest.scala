package model

import play.api.libs.json._

/**
  * Запрос на передачу ключей цифровых товаров.
  * @param items Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ProvideOrderDigitalCodesRequest(
  items: List[OrderDigitalItemDTO]
)

object ProvideOrderDigitalCodesRequest {
  implicit lazy val provideOrderDigitalCodesRequestJsonFormat: Format[ProvideOrderDigitalCodesRequest] = Json.format[ProvideOrderDigitalCodesRequest]
}

