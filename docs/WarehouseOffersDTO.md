
# Table `WarehouseOffersDTO`
(mapped from: WarehouseOffersDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**warehouseId** | warehouseId | long NOT NULL |  | **kotlin.Long** | Идентификатор склада. | 
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;WarehouseOfferDTO&gt;**](WarehouseOfferDTO.md) | Информация об остатках. | 



# **Table `WarehouseOffersDTOWarehouseOfferDTO`**
(mapped from: WarehouseOffersDTOWarehouseOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
warehouseOffersDTO | warehouseOffersDTO | long | | kotlin.Long | Primary Key | *one*
warehouseOfferDTO | warehouseOfferDTO | long | | kotlin.Long | Foreign Key | *many*



