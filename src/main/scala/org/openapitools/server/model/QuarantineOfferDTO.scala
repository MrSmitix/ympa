package org.openapitools.server.model


/**
 * Товар в карантине.
 *
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param currentPrice  for example: ''null''
 * @param lastValidPrice  for example: ''null''
 * @param verdicts Причины попадания товара в карантин. for example: ''null''
*/
final case class QuarantineOfferDTO (
  offerId: Option[String] = None,
  currentPrice: Option[BasePriceDTO] = None,
  lastValidPrice: Option[BasePriceDTO] = None,
  verdicts: Option[Seq[PriceQuarantineVerdictDTO]] = None
)

