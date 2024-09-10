# get_offer_cards_content_status_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **list_t \*** | Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional] 
**card_statuses** | [**list_t**](offer_card_status_type.md) \* | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**category_ids** | **list_t \*** | Фильтр по категориям на Маркете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


