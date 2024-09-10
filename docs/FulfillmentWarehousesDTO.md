
# Table `FulfillmentWarehousesDTO`
(mapped from: FulfillmentWarehousesDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**warehouses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FulfillmentWarehouseDTO&gt;**](FulfillmentWarehouseDTO.md) | Список складов Маркета (FBY). | 


# **Table `FulfillmentWarehousesDTOFulfillmentWarehouseDTO`**
(mapped from: FulfillmentWarehousesDTOFulfillmentWarehouseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
fulfillmentWarehousesDTO | fulfillmentWarehousesDTO | long | | kotlin.Long | Primary Key | *one*
fulfillmentWarehouseDTO | fulfillmentWarehouseDTO | long | | kotlin.Long | Foreign Key | *many*



