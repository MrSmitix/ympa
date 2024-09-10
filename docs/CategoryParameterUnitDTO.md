
# Table `CategoryParameterUnitDTO`
(mapped from: CategoryParameterUnitDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**defaultUnitId** | defaultUnitId | long NOT NULL |  | **kotlin.Long** | Единица измерения по умолчанию. | 
**units** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UnitDTO&gt;**](UnitDTO.md) | Допустимые единицы измерения. | 



# **Table `CategoryParameterUnitDTOUnitDTO`**
(mapped from: CategoryParameterUnitDTOUnitDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
categoryParameterUnitDTO | categoryParameterUnitDTO | long | | kotlin.Long | Primary Key | *one*
unitDTO | unitDTO | long | | kotlin.Long | Foreign Key | *many*



