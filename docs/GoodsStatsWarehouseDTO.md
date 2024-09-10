
# Table `GoodsStatsWarehouseDTO`
(mapped from: GoodsStatsWarehouseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**stocks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;WarehouseStockDTO&gt;**](WarehouseStockDTO.md) | Информация об остатках товаров на складе. | 
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор склада. |  [optional]
**name** | name | text |  | **kotlin.String** | Название склада. |  [optional]


# **Table `GoodsStatsWarehouseDTOWarehouseStockDTO`**
(mapped from: GoodsStatsWarehouseDTOWarehouseStockDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
goodsStatsWarehouseDTO | goodsStatsWarehouseDTO | long | | kotlin.Long | Primary Key | *one*
warehouseStockDTO | warehouseStockDTO | long | | kotlin.Long | Foreign Key | *many*





