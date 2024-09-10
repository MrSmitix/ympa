
# Table `WarehousesDTO`
(mapped from: WarehousesDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**warehouses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;WarehouseDTO&gt;**](WarehouseDTO.md) | Список складов, не входящих в группы. | 
**warehouseGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;WarehouseGroupDTO&gt;**](WarehouseGroupDTO.md) | Список групп складов. | 


# **Table `WarehousesDTOWarehouseDTO`**
(mapped from: WarehousesDTOWarehouseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
warehousesDTO | warehousesDTO | long | | kotlin.Long | Primary Key | *one*
warehouseDTO | warehouseDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `WarehousesDTOWarehouseGroupDTO`**
(mapped from: WarehousesDTOWarehouseGroupDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
warehousesDTO | warehousesDTO | long | | kotlin.Long | Primary Key | *one*
warehouseGroupDTO | warehouseGroupDTO | long | | kotlin.Long | Foreign Key | *many*



