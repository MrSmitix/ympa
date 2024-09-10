# ympa_r_client::UpdateOfferMappingsResponse

Описывает проблемы, возникшие при сохранении товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] [Enum: ] 
**results** | [**array[UpdateOfferMappingResultDTO]**](UpdateOfferMappingResultDTO.md) | Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  | [optional] 


