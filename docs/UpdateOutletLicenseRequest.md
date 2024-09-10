
# Table `UpdateOutletLicenseRequest`
(mapped from: UpdateOutletLicenseRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**licenses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OutletLicenseDTO&gt;**](OutletLicenseDTO.md) | Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.  | 


# **Table `UpdateOutletLicenseRequestOutletLicenseDTO`**
(mapped from: UpdateOutletLicenseRequestOutletLicenseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateOutletLicenseRequest | updateOutletLicenseRequest | long | | kotlin.Long | Primary Key | *one*
outletLicenseDTO | outletLicenseDTO | long | | kotlin.Long | Foreign Key | *many*



