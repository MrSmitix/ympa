package org.openapitools.server.model


/**
 * Цена с указанием скидки, валюты и времени последнего обновления.
 *
 * @param value Цена на товар. for example: ''null''
 * @param discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  for example: ''null''
 * @param currencyId  for example: ''null''
 * @param vat Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  for example: ''null''
*/
final case class PriceDTO (
  value: Option[Double] = None,
  discountBase: Option[Double] = None,
  currencyId: Option[CurrencyType] = None,
  vat: Option[Int] = None
)

