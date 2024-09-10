# GET_PROMO_ASSORTMENT_INFO_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_offers** | **INTEGER_32** | Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | [default to null]
**potential_offers** | **INTEGER_32** | Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.  | [optional] [default to null]
**processing** | **BOOLEAN** | Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


