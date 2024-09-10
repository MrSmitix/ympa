# GetCampaignOffersRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **Vector{String}** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] [default to nothing]
**statuses** | [**Vector{OfferCampaignStatusType}**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] [default to nothing]
**categoryIds** | **Vector{Int64}** | Фильтр по категориям на Маркете. | [optional] [default to nothing]
**vendorNames** | **Vector{String}** | Фильтр по брендам. | [optional] [default to nothing]
**tags** | **Vector{String}** | Фильтр по тегам. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


