# OFFER_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **REAL_32** | Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  | [optional] [default to null]
**feed_id** | **INTEGER_64** | Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to null]
**shop_category_id** | [**STRING_32**](STRING_32.md) | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to null]
**market_category_id** | **INTEGER_32** | Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to null]
**pre_discount_price** | **REAL_32** | Цена предложения без скидки. | [optional] [default to null]
**discount** | **INTEGER_32** | Скидка на предложение в процентах. | [optional] [default to null]
**cut_price** | **BOOLEAN** | Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  | [optional] [default to null]
**url** | [**STRING_32**](STRING_32.md) | URL-адрес предложения на сайте магазина. | [optional] [default to null]
**model_id** | **INTEGER_64** | Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %}  | [default to null]
**name** | [**STRING_32**](STRING_32.md) | Наименование предложения. | [optional] [default to null]
**currency** | [**CURRENCY_TYPE**](CurrencyType.md) |  | [optional] [default to null]
**bid** | **REAL_32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  | [optional] [default to null]
**cbid** | **REAL_32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  | [optional] [default to null]
**fee** | **REAL_32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  | [optional] [default to null]
**blocked** | **BOOLEAN** | Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


