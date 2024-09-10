# FeedParameterDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted** | **bool** | Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`.  | [optional] [default to None]
**name** | **String** | Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.  | 
**values** | **Vec<i32>** | Значения параметра.  Используется вместе с параметром `name`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


