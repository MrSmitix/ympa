# Api.GetCampaignOffersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **[String]** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] 
**statuses** | [**[OfferCampaignStatusType]**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] 
**categoryIds** | **[Number]** | Фильтр по категориям на Маркете. | [optional] 
**vendorNames** | **[String]** | Фильтр по брендам. | [optional] 
**tags** | **[String]** | Фильтр по тегам. | [optional] 


