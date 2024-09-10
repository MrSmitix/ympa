

# FeedContentDTO

Информация о проверке содержимого прайс-листа, загруженного на Маркет.

The class is defined in **[FeedContentDTO.java](../../src/main/java/org/openapitools/model/FeedContentDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejectedOffersCount** | `Long` | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  |  [optional property]
**status** | `FeedStatusType` |  |  [optional property]
**totalOffersCount** | `Long` | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  |  [optional property]
**error** | [`FeedContentErrorDTO`](FeedContentErrorDTO.md) |  |  [optional property]






