# ympa_csharp_client.Model.GetCampaignOffersRequest
Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | **List&lt;string&gt;** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] 
**Statuses** | [**List&lt;OfferCampaignStatusType&gt;**](OfferCampaignStatusType.md) | Фильтр по статусам товаров.  | [optional] 
**CategoryIds** | **List&lt;int&gt;** | Фильтр по категориям на Маркете. | [optional] 
**VendorNames** | **List&lt;string&gt;** | Фильтр по брендам. | [optional] 
**Tags** | **List&lt;string&gt;** | Фильтр по тегам. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

