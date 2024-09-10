
# Table `ProvideOrderDigitalCodesRequest`
(mapped from: ProvideOrderDigitalCodesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderDigitalItemDTO&gt;**](OrderDigitalItemDTO.md) | Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. &#x60;id&#x60; у этих элементов должен быть один и тот же.  | 


# **Table `ProvideOrderDigitalCodesRequestOrderDigitalItemDTO`**
(mapped from: ProvideOrderDigitalCodesRequestOrderDigitalItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
provideOrderDigitalCodesRequest | provideOrderDigitalCodesRequest | long | | kotlin.Long | Primary Key | *one*
orderDigitalItemDTO | orderDigitalItemDTO | long | | kotlin.Long | Foreign Key | *many*



