# ympa_csharp_client.Model.GetPromoAssortmentInfoDTO
Информация о товарах в акции.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActiveOffers** | **int** | Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**PotentialOffers** | **int** | Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.  | [optional] 
**Processing** | **bool** | Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

