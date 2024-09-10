package org.openapitools.server.model


/**
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 
 *
 * @param offerName Название товара. for example: ''null''
 * @param marketSku SKU на Маркете. for example: ''null''
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param count Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`.  for example: ''null''
 * @param prices Цена или скидки на товар. for example: ''null''
 * @param warehouse  for example: ''null''
 * @param details Информация об удалении товара из заказа. for example: ''null''
 * @param cisList Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). for example: ''null''
 * @param initialCount Первоначальное количество единиц товара. for example: ''null''
 * @param bidFee Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  for example: ''570''
 * @param cofinanceThreshold Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  for example: ''null''
 * @param cofinanceValue Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  for example: ''null''
*/
final case class OrdersStatsItemDTO (
  offerName: Option[String] = None,
  marketSku: Option[Long] = None,
  shopSku: Option[String] = None,
  count: Option[Int] = None,
  prices: Option[Seq[OrdersStatsPriceDTO]] = None,
  warehouse: Option[OrdersStatsWarehouseDTO] = None,
  details: Option[Seq[OrdersStatsDetailsDTO]] = None,
  cisList: Option[Seq[String]] = None,
  initialCount: Option[Int] = None,
  bidFee: Option[Int] = None,
  cofinanceThreshold: Option[Double] = None,
  cofinanceValue: Option[Double] = None
)

