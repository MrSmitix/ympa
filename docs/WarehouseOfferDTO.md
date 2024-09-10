
# Table `WarehouseOfferDTO`
(mapped from: WarehouseOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerId** | offerId | text NOT NULL |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**stocks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;WarehouseStockDTO&gt;**](WarehouseStockDTO.md) | Информация об остатках. | 
**turnoverSummary** | turnoverSummary | long |  | [**TurnoverDTO**](TurnoverDTO.md) |  |  [optional] [foreignkey]
**updatedAt** | updatedAt | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;.  |  [optional]



# **Table `WarehouseOfferDTOWarehouseStockDTO`**
(mapped from: WarehouseOfferDTOWarehouseStockDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
warehouseOfferDTO | warehouseOfferDTO | long | | kotlin.Long | Primary Key | *one*
warehouseStockDTO | warehouseStockDTO | long | | kotlin.Long | Foreign Key | *many*





