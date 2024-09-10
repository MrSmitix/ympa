
# Table `GetMappingDTO`
(mapped from: GetMappingDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**marketSku** | marketSku | long |  | **kotlin.Long** | SKU на Маркете. |  [optional]
**marketSkuName** | marketSkuName | text |  | **kotlin.String** | Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  |  [optional]
**marketModelId** | marketModelId | long |  | **kotlin.Long** | Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  |  [optional]
**marketModelName** | marketModelName | text |  | **kotlin.String** | Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  |  [optional]
**marketCategoryId** | marketCategoryId | long |  | **kotlin.Long** | Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  |  [optional]
**marketCategoryName** | marketCategoryName | text |  | **kotlin.String** | Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  |  [optional]








