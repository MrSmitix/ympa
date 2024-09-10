# get_campaign_offers_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **list_t \*** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] 
**statuses** | [**list_t**](offer_campaign_status_type.md) \* | Фильтр по статусам товаров.  | [optional] 
**category_ids** | **list_t \*** | Фильтр по категориям на Маркете. | [optional] 
**vendor_names** | **list_t \*** | Фильтр по брендам. | [optional] 
**tags** | **list_t \*** | Фильтр по тегам. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


