package model

import play.api.libs.json._

/**
  * Информация о маркированном товаре.
  * @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
  * @param count Количество единиц товара.
  * @param price Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
  * @param offerName Название товара.
  * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @param instances Переданные вами коды маркировки.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class BriefOrderItemDTO(
  id: Option[Long],
  vat: Option[OrderVatType],
  count: Option[Int],
  price: Option[BigDecimal],
  offerName: Option[String],
  offerId: Option[String],
  instances: Option[List[OrderItemInstanceDTO]]
)

object BriefOrderItemDTO {
  implicit lazy val briefOrderItemDTOJsonFormat: Format[BriefOrderItemDTO] = Json.format[BriefOrderItemDTO]
}

