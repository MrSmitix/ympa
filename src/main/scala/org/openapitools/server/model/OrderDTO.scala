package org.openapitools.server.model


/**
 * Заказ.
 *
 * @param id Идентификатор заказа. for example: ''null''
 * @param status  for example: ''null''
 * @param substatus  for example: ''null''
 * @param creationDate  for example: ''23-09-2022 09:12:41''
 * @param updatedAt  for example: ''23-09-2022 09:12:41''
 * @param currency  for example: ''null''
 * @param itemsTotal Платеж покупателя.  for example: ''null''
 * @param deliveryTotal Стоимость доставки.  for example: ''null''
 * @param buyerItemsTotal {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  for example: ''null''
 * @param buyerTotal {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  for example: ''null''
 * @param buyerItemsTotalBeforeDiscount Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  for example: ''null''
 * @param buyerTotalBeforeDiscount {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).  for example: ''null''
 * @param paymentType  for example: ''null''
 * @param paymentMethod  for example: ''null''
 * @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  for example: ''null''
 * @param items Список товаров в заказе. for example: ''null''
 * @param subsidies Список субсидий по типам. for example: ''null''
 * @param delivery  for example: ''null''
 * @param buyer  for example: ''null''
 * @param notes Комментарий к заказу. for example: ''null''
 * @param taxSystem  for example: ''null''
 * @param cancelRequested **Только для модели DBS**  Запрошена ли отмена.  for example: ''null''
 * @param expiryDate  for example: ''23-09-2022 09:12:41''
*/
final case class OrderDTO (
  id: Option[Long] = None,
  status: Option[OrderStatusType] = None,
  substatus: Option[OrderSubstatusType] = None,
  creationDate: Option[String] = None,
  updatedAt: Option[String] = None,
  currency: Option[CurrencyType] = None,
  itemsTotal: Option[Double] = None,
  deliveryTotal: Option[Double] = None,
  buyerItemsTotal: Option[Double] = None,
  buyerTotal: Option[Double] = None,
  buyerItemsTotalBeforeDiscount: Option[Double] = None,
  buyerTotalBeforeDiscount: Option[Double] = None,
  paymentType: Option[OrderPaymentType] = None,
  paymentMethod: Option[OrderPaymentMethodType] = None,
  fake: Option[Boolean] = None,
  items: Seq[OrderItemDTO],
  subsidies: Option[Seq[OrderSubsidyDTO]] = None,
  delivery: Option[OrderDeliveryDTO] = None,
  buyer: Option[OrderBuyerDTO] = None,
  notes: Option[String] = None,
  taxSystem: Option[OrderTaxSystemType] = None,
  cancelRequested: Option[Boolean] = None,
  expiryDate: Option[String] = None
)

