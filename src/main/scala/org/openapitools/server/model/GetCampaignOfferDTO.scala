package org.openapitools.server.model


/**
 * Параметры размещения товара в магазине.
 *
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param quantum  for example: ''null''
 * @param available Есть ли товар в продаже.  for example: ''null''
 * @param basicPrice  for example: ''null''
 * @param campaignPrice  for example: ''null''
 * @param status  for example: ''null''
 * @param errors Ошибки, препятствующие размещению товара на витрине.  for example: ''null''
 * @param warnings Предупреждения, не препятствующие размещению товара на витрине.  for example: ''null''
*/
final case class GetCampaignOfferDTO (
  offerId: String,
  quantum: Option[QuantumDTO] = None,
  available: Option[Boolean] = None,
  basicPrice: Option[GetPriceWithDiscountDTO] = None,
  campaignPrice: Option[GetPriceWithVatDTO] = None,
  status: Option[OfferCampaignStatusType] = None,
  errors: Option[Seq[OfferErrorDTO]] = None,
  warnings: Option[Seq[OfferErrorDTO]] = None
)

