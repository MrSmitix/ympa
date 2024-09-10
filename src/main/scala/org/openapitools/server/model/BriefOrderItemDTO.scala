package org.openapitools.server.model


/**
 * Информация о маркированном товаре.
 *
 * @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  for example: ''null''
 * @param vat  for example: ''null''
 * @param count Количество единиц товара. for example: ''null''
 * @param price Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  for example: ''null''
 * @param offerName Название товара. for example: ''null''
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param instances Переданные вами коды маркировки. for example: ''null''
*/
final case class BriefOrderItemDTO (
  id: Option[Long] = None,
  vat: Option[OrderVatType] = None,
  count: Option[Int] = None,
  price: Option[Double] = None,
  offerName: Option[String] = None,
  offerId: Option[String] = None,
  instances: Option[Seq[OrderItemInstanceDTO]] = None
)

