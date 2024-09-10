
# Table `FeedParameterDTO`
(mapped from: FeedParameterDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Название параметра.  Возможное значение: - &#x60;reparseIntervalMinutes&#x60; — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре &#x60;value&#x60;. Например, при &#x60;value&#x3D;1440&#x60;, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.  | 
**deleted** | deleted | boolean |  | **kotlin.Boolean** | Удалить ли значение параметра.  Возможное значение: * &#x60;true&#x60; — удалить значение параметра.  Используется вместе с параметром &#x60;name&#x60;.  |  [optional]
**propertyValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Значения параметра.  Используется вместе с параметром &#x60;name&#x60;.  |  [optional]




# **Table `FeedParameterDTOPropertyValues`**
(mapped from: FeedParameterDTOPropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
feedParameterDTO | feedParameterDTO | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | int | | kotlin.Int | Foreign Key | *many*



