# # ReturnItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market_sku** | **int** | SKU на Маркете. | [optional]
**shop_sku** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) |
**count** | **int** | Количество единиц товара. |
**decisions** | [**\OpenAPI\Client\Model\ReturnDecisionDTO[]**](ReturnDecisionDTO.md) | Список решений по возврату. | [optional]
**instances** | [**\OpenAPI\Client\Model\ReturnInstanceDTO[]**](ReturnInstanceDTO.md) | Список логистических позиций возврата. | [optional]
**tracks** | [**\OpenAPI\Client\Model\TrackDTO[]**](TrackDTO.md) | Список трек-кодов для почтовых отправлений. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
