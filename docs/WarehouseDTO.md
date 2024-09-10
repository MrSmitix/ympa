
# Table `WarehouseDTO`
(mapped from: WarehouseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор склада. | 
**name** | name | text NOT NULL |  | **kotlin.String** | Название склада. | 
**campaignId** | campaignId | long NOT NULL |  | **kotlin.Long** | Идентификатор кампании в API и идентификатор магазина. | 
**express** | express | boolean NOT NULL |  | **kotlin.Boolean** | Возможна ли доставка по модели Экспресс. | 
**address** | address | long |  | [**WarehouseAddressDTO**](WarehouseAddressDTO.md) |  |  [optional] [foreignkey]







