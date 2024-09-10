# ympa_r_client::GetCampaignOffersRequest

Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **array[character]** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] [Max. items: 200] 
**statuses** | [**array[OfferCampaignStatusType]**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] 
**categoryIds** | **array[integer]** | Фильтр по категориям на Маркете. | [optional] 
**vendorNames** | **array[character]** | Фильтр по брендам. | [optional] 
**tags** | **array[character]** | Фильтр по тегам. | [optional] 


