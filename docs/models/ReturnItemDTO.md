

# ReturnItemDTO

Список товаров в возврате.

The class is defined in **[ReturnItemDTO.java](../../src/main/java/org/openapitools/model/ReturnItemDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketSku** | `Long` | SKU на Маркете. |  [optional property]
**shopSku** | `String` | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**count** | `Long` | Количество единиц товара. | 
**decisions** | [`List&lt;ReturnDecisionDTO&gt;`](ReturnDecisionDTO.md) | Список решений по возврату. |  [optional property]
**instances** | [`List&lt;ReturnInstanceDTO&gt;`](ReturnInstanceDTO.md) | Список логистических позиций возврата. |  [optional property]
**tracks** | [`List&lt;TrackDTO&gt;`](TrackDTO.md) | Список трек-кодов для почтовых отправлений. |  [optional property]








