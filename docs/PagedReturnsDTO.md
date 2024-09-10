
# Table `PagedReturnsDTO`
(mapped from: PagedReturnsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**returns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ReturnDTO&gt;**](ReturnDTO.md) | Список возвратов. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `PagedReturnsDTOReturnDTO`**
(mapped from: PagedReturnsDTOReturnDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pagedReturnsDTO | pagedReturnsDTO | long | | kotlin.Long | Primary Key | *one*
returnDTO | returnDTO | long | | kotlin.Long | Foreign Key | *many*




