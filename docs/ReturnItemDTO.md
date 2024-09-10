# ympa_r_client::ReturnItemDTO

Список товаров в возврате.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketSku** | **integer** | SKU на Маркете. | [optional] 
**shopSku** | **character** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [Pattern: ^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$] [Max. length: 255] [Min. length: 1] 
**count** | **integer** | Количество единиц товара. | 
**decisions** | [**array[ReturnDecisionDTO]**](ReturnDecisionDTO.md) | Список решений по возврату. | [optional] 
**instances** | [**array[ReturnInstanceDTO]**](ReturnInstanceDTO.md) | Список логистических позиций возврата. | [optional] 
**tracks** | [**array[TrackDTO]**](TrackDTO.md) | Список трек-кодов для почтовых отправлений. | [optional] 


