# GetQuarantineOffersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | Option<**Vec<String>**> | Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  | [optional]
**card_statuses** | Option<[**Vec<models::OfferCardStatusType>**](OfferCardStatusType.md)> | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional]
**category_ids** | Option<**Vec<i32>**> | Фильтр по категориям на Маркете. | [optional]
**vendor_names** | Option<**Vec<String>**> | Фильтр по брендам. | [optional]
**tags** | Option<**Vec<String>**> | Фильтр по тегам. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


