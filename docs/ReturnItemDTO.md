# ReturnItemDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketSku** | **Int64** | SKU на Маркете. | [optional] [default to nothing]
**shopSku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [default to nothing]
**count** | **Int64** | Количество единиц товара. | [default to nothing]
**decisions** | [**Vector{ReturnDecisionDTO}**](ReturnDecisionDTO.md) | Список решений по возврату. | [optional] [default to nothing]
**instances** | [**Vector{ReturnInstanceDTO}**](ReturnInstanceDTO.md) | Список логистических позиций возврата. | [optional] [default to nothing]
**tracks** | [**Vector{TrackDTO}**](TrackDTO.md) | Список трек-кодов для почтовых отправлений. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


