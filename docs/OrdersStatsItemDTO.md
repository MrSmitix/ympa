
# Table `OrdersStatsItemDTO`
(mapped from: OrdersStatsItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerName** | offerName | text |  | **kotlin.String** | Название товара. |  [optional]
**marketSku** | marketSku | long |  | **kotlin.Long** | SKU на Маркете. |  [optional]
**shopSku** | shopSku | text |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional]
**count** | count | int |  | **kotlin.Int** | Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список &#x60;initialItems&#x60;.  |  [optional]
**prices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrdersStatsPriceDTO&gt;**](OrdersStatsPriceDTO.md) | Цена или скидки на товар. |  [optional]
**warehouse** | warehouse | long |  | [**OrdersStatsWarehouseDTO**](OrdersStatsWarehouseDTO.md) |  |  [optional] [foreignkey]
**details** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrdersStatsDetailsDTO&gt;**](OrdersStatsDetailsDTO.md) | Информация об удалении товара из заказа. |  [optional]
**cisList** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). |  [optional]
**initialCount** | initialCount | int |  | **kotlin.Int** | Первоначальное количество единиц товара. |  [optional]
**bidFee** | bidFee | int UNSIGNED |  | **kotlin.Int** | Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500.  |  [optional]
**cofinanceThreshold** | cofinanceThreshold | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой.  |  [optional]
**cofinanceValue** | cofinanceValue | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой.  |  [optional]






# **Table `OrdersStatsItemDTOOrdersStatsPriceDTO`**
(mapped from: OrdersStatsItemDTOOrdersStatsPriceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ordersStatsItemDTO | ordersStatsItemDTO | long | | kotlin.Long | Primary Key | *one*
ordersStatsPriceDTO | ordersStatsPriceDTO | long | | kotlin.Long | Foreign Key | *many*




# **Table `OrdersStatsItemDTOOrdersStatsDetailsDTO`**
(mapped from: OrdersStatsItemDTOOrdersStatsDetailsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ordersStatsItemDTO | ordersStatsItemDTO | long | | kotlin.Long | Primary Key | *one*
ordersStatsDetailsDTO | ordersStatsDetailsDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `OrdersStatsItemDTOCisList`**
(mapped from: OrdersStatsItemDTOCisList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ordersStatsItemDTO | ordersStatsItemDTO | long | | kotlin.Long | Primary Key | *one*
cisList | cisList | text | | kotlin.String | Foreign Key | *many*







