package org.openapitools.server.model


/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 *
 * @param `type`  for example: ''null''
 * @param discount Размер пользовательской скидки в валюте покупателя.  for example: ''null''
 * @param subsidy Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  for example: ''null''
 * @param shopPromoId Идентификатор акции поставщика.  for example: ''null''
 * @param marketPromoId Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`.  for example: ''null''
*/
final case class OrderItemPromoDTO (
  `type`: OrderPromoType,
  discount: Option[Double] = None,
  subsidy: Option[Double] = None,
  shopPromoId: Option[String] = None,
  marketPromoId: Option[String] = None
)

