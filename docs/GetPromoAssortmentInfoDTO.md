
# Table `GetPromoAssortmentInfoDTO`
(mapped from: GetPromoAssortmentInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**activeOffers** | activeOffers | int NOT NULL |  | **kotlin.Int** | Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**potentialOffers** | potentialOffers | int |  | **kotlin.Int** | Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.  |  [optional]
**processing** | processing | boolean |  | **kotlin.Boolean** | Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.  |  [optional]





