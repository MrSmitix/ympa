package org.openapitools.server.model


/**
 * Список товаров в заказе.
 *
 * @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  for example: ''null''
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param offerName Название товара. for example: ''null''
 * @param price Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`).  for example: ''null''
 * @param buyerPrice Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  for example: ''null''
 * @param buyerPriceBeforeDiscount Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  for example: ''null''
 * @param priceBeforeDiscount {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  for example: ''null''
 * @param count Количество единиц товара. for example: ''null''
 * @param vat  for example: ''null''
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param subsidy {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  for example: ''null''
 * @param partnerWarehouseId {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  for example: ''null''
 * @param promos Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. for example: ''null''
 * @param instances Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует.  for example: ''null''
 * @param details Информация об удалении товара из заказа.  for example: ''null''
 * @param subsidies Список субсидий по типам. for example: ''null''
 * @param requiredInstanceTypes Список необходимых маркировок товара. for example: ''null''
*/
final case class OrderItemDTO (
  id: Option[Long] = None,
  offerId: Option[String] = None,
  offerName: Option[String] = None,
  price: Option[Double] = None,
  buyerPrice: Option[Double] = None,
  buyerPriceBeforeDiscount: Option[Double] = None,
  priceBeforeDiscount: Option[Double] = None,
  count: Option[Int] = None,
  vat: Option[OrderVatType] = None,
  shopSku: Option[String] = None,
  subsidy: Option[Double] = None,
  partnerWarehouseId: Option[String] = None,
  promos: Option[Seq[OrderItemPromoDTO]] = None,
  instances: Option[Seq[OrderItemInstanceDTO]] = None,
  details: Option[Seq[OrderItemDetailDTO]] = None,
  subsidies: Option[Seq[OrderItemSubsidyDTO]] = None,
  requiredInstanceTypes: Option[Seq[OrderItemInstanceType]] = None
)

