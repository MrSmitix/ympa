
# Table `UpdateStockDTO`
(mapped from: UpdateStockDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**sku** | sku | text NOT NULL |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateStockItemDTO&gt;**](UpdateStockItemDTO.md) | Информация об остатках товара.  | 



# **Table `UpdateStockDTOUpdateStockItemDTO`**
(mapped from: UpdateStockDTOUpdateStockItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateStockDTO | updateStockDTO | long | | kotlin.Long | Primary Key | *one*
updateStockItemDTO | updateStockItemDTO | long | | kotlin.Long | Foreign Key | *many*



