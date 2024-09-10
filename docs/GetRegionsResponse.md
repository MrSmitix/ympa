
# Table `GetRegionsResponse`
(mapped from: GetRegionsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**regions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RegionDTO&gt;**](RegionDTO.md) | Регион доставки. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetRegionsResponseRegionDTO`**
(mapped from: GetRegionsResponseRegionDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getRegionsResponse | getRegionsResponse | long | | kotlin.Long | Primary Key | *one*
regionDTO | regionDTO | long | | kotlin.Long | Foreign Key | *many*




