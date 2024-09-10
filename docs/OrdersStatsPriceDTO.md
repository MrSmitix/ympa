
# Table `OrdersStatsPriceDTO`
(mapped from: OrdersStatsPriceDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | long |  | [**OrdersStatsPriceType**](OrdersStatsPriceType.md) |  |  [optional] [foreignkey]
**costPerItem** | costPerItem | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  |  [optional]
**total** | total | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  |  [optional]





