
# Table `ReturnItemDTO`
(mapped from: ReturnItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**shopSku** | shopSku | text NOT NULL |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**count** | count | long NOT NULL |  | **kotlin.Long** | Количество единиц товара. | 
**marketSku** | marketSku | long |  | **kotlin.Long** | SKU на Маркете. |  [optional]
**decisions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ReturnDecisionDTO&gt;**](ReturnDecisionDTO.md) | Список решений по возврату. |  [optional]
**instances** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ReturnInstanceDTO&gt;**](ReturnInstanceDTO.md) | Список логистических позиций возврата. |  [optional]
**tracks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TrackDTO&gt;**](TrackDTO.md) | Список трек-кодов для почтовых отправлений. |  [optional]





# **Table `ReturnItemDTOReturnDecisionDTO`**
(mapped from: ReturnItemDTOReturnDecisionDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
returnItemDTO | returnItemDTO | long | | kotlin.Long | Primary Key | *one*
returnDecisionDTO | returnDecisionDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `ReturnItemDTOReturnInstanceDTO`**
(mapped from: ReturnItemDTOReturnInstanceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
returnItemDTO | returnItemDTO | long | | kotlin.Long | Primary Key | *one*
returnInstanceDTO | returnInstanceDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `ReturnItemDTOTrackDTO`**
(mapped from: ReturnItemDTOTrackDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
returnItemDTO | returnItemDTO | long | | kotlin.Long | Primary Key | *one*
trackDTO | trackDTO | long | | kotlin.Long | Foreign Key | *many*



