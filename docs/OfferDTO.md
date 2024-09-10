# OfferDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **Float64** | Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  | [optional] [default to nothing]
**feedId** | **Int64** | Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to nothing]
**id** | **String** | Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to nothing]
**shopCategoryId** | **String** | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to nothing]
**marketCategoryId** | **Int64** | Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to nothing]
**preDiscountPrice** | **Float64** | Цена предложения без скидки. | [optional] [default to nothing]
**discount** | **Int64** | Скидка на предложение в процентах. | [optional] [default to nothing]
**cutPrice** | **Bool** | Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  | [optional] [default to nothing]
**url** | **String** | URL-адрес предложения на сайте магазина. | [optional] [default to nothing]
**modelId** | **Int64** | Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %}  | [default to nothing]
**name** | **String** | Наименование предложения. | [optional] [default to nothing]
**currency** | [***CurrencyType**](CurrencyType.md) |  | [optional] [default to nothing]
**bid** | **Float64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  | [optional] [default to nothing]
**cbid** | **Float64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  | [optional] [default to nothing]
**fee** | **Float64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  | [optional] [default to nothing]
**blocked** | **Bool** | Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


