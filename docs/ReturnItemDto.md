# ReturnItemDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market_sku** | **i64** | SKU на Маркете. | [optional] [default to None]
**shop_sku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**count** | **i64** | Количество единиц товара. | 
**decisions** | [**Vec<models::ReturnDecisionDto>**](ReturnDecisionDTO.md) | Список решений по возврату. | [optional] [default to None]
**instances** | [**Vec<models::ReturnInstanceDto>**](ReturnInstanceDTO.md) | Список логистических позиций возврата. | [optional] [default to None]
**tracks** | [**Vec<models::TrackDto>**](TrackDTO.md) | Список трек-кодов для почтовых отправлений. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


