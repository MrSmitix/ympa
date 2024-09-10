# ympa_r_client::SearchModelsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**array[ModelDTO]**](ModelDTO.md) | Список моделей товаров. | 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] [Enum: ] 
**regionId** | **integer** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 
**pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 


