# OfferDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **price** | **BigDecimal** | Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  | [optional] [default to null] |
| **feedId** | **Long** | Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to null] |
| **id** | **String** | Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to null] |
| **shopCategoryId** | **String** | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to null] |
| **marketCategoryId** | **Integer** | Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] [default to null] |
| **preDiscountPrice** | **BigDecimal** | Цена предложения без скидки. | [optional] [default to null] |
| **discount** | **Integer** | Скидка на предложение в процентах. | [optional] [default to null] |
| **cutPrice** | **Boolean** | Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  | [optional] [default to null] |
| **url** | **String** | URL-адрес предложения на сайте магазина. | [optional] [default to null] |
| **modelId** | **Long** | Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %}  | [default to null] |
| **name** | **String** | Наименование предложения. | [optional] [default to null] |
| **currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] [default to null] |
| **bid** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  | [optional] [default to null] |
| **cbid** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  | [optional] [default to null] |
| **fee** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  | [optional] [default to null] |
| **blocked** | **Boolean** | Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

