# GetOfferMappingsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | Option<**Vec<String>**> | Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}     | [optional]
**card_statuses** | Option<[**Vec<models::OfferCardStatusType>**](OfferCardStatusType.md)> | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional]
**category_ids** | Option<**Vec<i32>**> | Фильтр по категориям на Маркете. | [optional]
**vendor_names** | Option<**Vec<String>**> | Фильтр по брендам. | [optional]
**tags** | Option<**Vec<String>**> | Фильтр по тегам. | [optional]
**archived** | Option<**bool**> | Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


