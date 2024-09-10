
# Table `GetOutletsResponse`
(mapped from: GetOutletsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**outlets** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FullOutletDTO&gt;**](FullOutletDTO.md) | Информация о точках продаж. | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]
**pager** | pager | long |  | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetOutletsResponseFullOutletDTO`**
(mapped from: GetOutletsResponseFullOutletDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOutletsResponse | getOutletsResponse | long | | kotlin.Long | Primary Key | *one*
fullOutletDTO | fullOutletDTO | long | | kotlin.Long | Foreign Key | *many*





