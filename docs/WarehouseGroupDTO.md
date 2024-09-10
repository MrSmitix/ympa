
# Table `WarehouseGroupDTO`
(mapped from: WarehouseGroupDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Название группы складов. | 
**mainWarehouse** | mainWarehouse | long NOT NULL |  | [**WarehouseDTO**](WarehouseDTO.md) |  |  [foreignkey]
**warehouses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;WarehouseDTO&gt;**](WarehouseDTO.md) | Список складов, входящих в группу. | 




# **Table `WarehouseGroupDTOWarehouseDTO`**
(mapped from: WarehouseGroupDTOWarehouseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
warehouseGroupDTO | warehouseGroupDTO | long | | kotlin.Long | Primary Key | *one*
warehouseDTO | warehouseDTO | long | | kotlin.Long | Foreign Key | *many*



