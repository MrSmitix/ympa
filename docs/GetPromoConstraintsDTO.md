
# Table `GetPromoConstraintsDTO`
(mapped from: GetPromoConstraintsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**warehouseIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  |  [optional]


# **Table `GetPromoConstraintsDTOWarehouseIds`**
(mapped from: GetPromoConstraintsDTOWarehouseIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getPromoConstraintsDTO | getPromoConstraintsDTO | long | | kotlin.Long | Primary Key | *one*
warehouseIds | warehouseIds | long | | kotlin.Long | Foreign Key | *many*



