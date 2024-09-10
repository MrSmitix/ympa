# OAIReturnItemDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketSku** | **NSNumber*** | SKU на Маркете. | [optional] 
**shopSku** | **NSString*** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**count** | **NSNumber*** | Количество единиц товара. | 
**decisions** | [**NSArray&lt;OAIReturnDecisionDTO&gt;***](OAIReturnDecisionDTO.md) | Список решений по возврату. | [optional] 
**instances** | [**NSArray&lt;OAIReturnInstanceDTO&gt;***](OAIReturnInstanceDTO.md) | Список логистических позиций возврата. | [optional] 
**tracks** | [**NSArray&lt;OAITrackDTO&gt;***](OAITrackDTO.md) | Список трек-кодов для почтовых отправлений. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


