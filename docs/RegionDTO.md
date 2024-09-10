
# Table `RegionDTO`
(mapped from: RegionDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Название региона. | 
**type** | type | long NOT NULL |  | [**RegionType**](RegionType.md) |  |  [foreignkey]
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор региона. |  [optional]
**parent** | parent | long |  | [**RegionDTO**](RegionDTO.md) |  |  [optional] [foreignkey]
**children** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RegionDTO&gt;**](RegionDTO.md) | Дочерние регионы. |  [optional]






# **Table `RegionDTORegionDTO`**
(mapped from: RegionDTORegionDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
regionDTO | regionDTO | long | | kotlin.Long | Primary Key | *one*
regionDTO | regionDTO | long | | kotlin.Long | Foreign Key | *many*



