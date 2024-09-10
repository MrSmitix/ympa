package org.openapitools.server.model


/**
 * Информация о товарах в акции.
 *
 * @param activeOffers Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  for example: ''null''
 * @param potentialOffers Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.  for example: ''null''
 * @param processing Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.  for example: ''null''
*/
final case class GetPromoAssortmentInfoDTO (
  activeOffers: Int,
  potentialOffers: Option[Int] = None,
  processing: Option[Boolean] = None
)

