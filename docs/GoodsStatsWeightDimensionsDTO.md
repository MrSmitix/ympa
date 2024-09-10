

# GoodsStatsWeightDimensionsDTO

Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**length** | **BigDecimal** | Длина товара в сантиметрах. |  [optional]
**width** | **BigDecimal** | Ширина товара в сантиметрах. |  [optional]
**height** | **BigDecimal** | Высота товара в сантиметрах. |  [optional]
**weight** | **BigDecimal** | Вес товара в килограммах. |  [optional]



