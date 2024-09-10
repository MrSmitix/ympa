package model

import play.api.libs.json._

/**
  * Заказ.
  * @param id Идентификатор заказа.
  * @param itemsTotal Платеж покупателя. 
  * @param deliveryTotal Стоимость доставки. 
  * @param buyerItemsTotal {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
  * @param buyerTotal {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
  * @param buyerItemsTotalBeforeDiscount Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
  * @param buyerTotalBeforeDiscount {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
  * @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  * @param items Список товаров в заказе.
  * @param subsidies Список субсидий по типам.
  * @param notes Комментарий к заказу.
  * @param cancelRequested **Только для модели DBS**  Запрошена ли отмена. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderDTO(
  id: Option[Long],
  status: Option[OrderStatusType],
  substatus: Option[OrderSubstatusType],
  creationDate: Option[String],
  updatedAt: Option[String],
  currency: Option[CurrencyType],
  itemsTotal: Option[BigDecimal],
  deliveryTotal: Option[BigDecimal],
  buyerItemsTotal: Option[BigDecimal],
  buyerTotal: Option[BigDecimal],
  buyerItemsTotalBeforeDiscount: Option[BigDecimal],
  buyerTotalBeforeDiscount: Option[BigDecimal],
  paymentType: Option[OrderPaymentType],
  paymentMethod: Option[OrderPaymentMethodType],
  fake: Option[Boolean],
  items: List[OrderItemDTO],
  subsidies: Option[List[OrderSubsidyDTO]],
  delivery: Option[OrderDeliveryDTO],
  buyer: Option[OrderBuyerDTO],
  notes: Option[String],
  taxSystem: Option[OrderTaxSystemType],
  cancelRequested: Option[Boolean],
  expiryDate: Option[String]
)

object OrderDTO {
  implicit lazy val orderDTOJsonFormat: Format[OrderDTO] = Json.format[OrderDTO]
}

