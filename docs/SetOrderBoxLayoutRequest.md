
# Table `SetOrderBoxLayoutRequest`
(mapped from: SetOrderBoxLayoutRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**boxes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderBoxLayoutDTO&gt;**](OrderBoxLayoutDTO.md) | Список коробок. | 
**allowRemove** | allowRemove | boolean |  | **kotlin.Boolean** | Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа. |  [optional]


# **Table `SetOrderBoxLayoutRequestOrderBoxLayoutDTO`**
(mapped from: SetOrderBoxLayoutRequestOrderBoxLayoutDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
setOrderBoxLayoutRequest | setOrderBoxLayoutRequest | long | | kotlin.Long | Primary Key | *one*
orderBoxLayoutDTO | orderBoxLayoutDTO | long | | kotlin.Long | Foreign Key | *many*




