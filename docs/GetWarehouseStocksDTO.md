
# Table `GetWarehouseStocksDTO`
(mapped from: GetWarehouseStocksDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**warehouses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;WarehouseOffersDTO&gt;**](WarehouseOffersDTO.md) | Страница списка складов. | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetWarehouseStocksDTOWarehouseOffersDTO`**
(mapped from: GetWarehouseStocksDTOWarehouseOffersDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getWarehouseStocksDTO | getWarehouseStocksDTO | long | | kotlin.Long | Primary Key | *one*
warehouseOffersDTO | warehouseOffersDTO | long | | kotlin.Long | Foreign Key | *many*




