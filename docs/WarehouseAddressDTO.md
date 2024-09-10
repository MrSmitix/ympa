
# Table `WarehouseAddressDTO`
(mapped from: WarehouseAddressDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**city** | city | text NOT NULL |  | **kotlin.String** | Город. | 
**gps** | gps | long NOT NULL |  | [**GpsDTO**](GpsDTO.md) |  |  [foreignkey]
**street** | street | text |  | **kotlin.String** | Улица. |  [optional]
**number** | number | text |  | **kotlin.String** | Номер дома. |  [optional]
**building** | building | text |  | **kotlin.String** | Номер строения. |  [optional]
**block** | block | text |  | **kotlin.String** | Номер корпуса. |  [optional]








