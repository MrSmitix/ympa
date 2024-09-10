# ympa_r_client::UpdateOfferContentResponse

Описывает проблемы, которые появились при сохранении товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] [Enum: ] 
**results** | [**array[UpdateOfferContentResultDTO]**](UpdateOfferContentResultDTO.md) | Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  | [optional] 


