

# FeedContentDTO

Информация о проверке содержимого прайс-листа, загруженного на Маркет.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejectedOffersCount** | **Long** | Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  |  [optional]
**status** | **FeedStatusType** |  |  [optional]
**totalOffersCount** | **Long** | Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.  |  [optional]
**error** | [**FeedContentErrorDTO**](FeedContentErrorDTO.md) |  |  [optional]



