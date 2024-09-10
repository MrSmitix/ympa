
# Table `FulfillmentWarehouseDTO`
(mapped from: FulfillmentWarehouseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор склада. | 
**name** | name | text NOT NULL |  | **kotlin.String** | Название склада. | 
**address** | address | long |  | [**WarehouseAddressDTO**](WarehouseAddressDTO.md) |  |  [optional] [foreignkey]





