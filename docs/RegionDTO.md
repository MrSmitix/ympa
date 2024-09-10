# ympa_r_client::RegionDTO

Регион доставки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор региона. | [optional] 
**name** | **character** | Название региона. | 
**type** | [**RegionType**](RegionType.md) |  | [Enum: ] 
**parent** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**children** | [**array[RegionDTO]**](RegionDTO.md) | Дочерние регионы. | [optional] 


