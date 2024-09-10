

# GetCampaignOffersRequest

Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 

The class is defined in **[GetCampaignOffersRequest.java](../../src/main/java/org/openapitools/model/GetCampaignOffersRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | `List&lt;String&gt;` | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     |  [optional property]
**statuses** | `List&lt;OfferCampaignStatusType&gt;` | Фильтр по статусам товаров.  |  [optional property]
**categoryIds** | `List&lt;Integer&gt;` | Фильтр по категориям на Маркете. |  [optional property]
**vendorNames** | `List&lt;String&gt;` | Фильтр по брендам. |  [optional property]
**tags** | `List&lt;String&gt;` | Фильтр по тегам. |  [optional property]







