
# Table `OfferDTO`
(mapped from: OfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**modelId** | modelId | long NOT NULL |  | **kotlin.Long** | Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %}  | 
**price** | price | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  |  [optional]
**feedId** | feedId | long |  | **kotlin.Long** | Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  |  [optional]
**shopCategoryId** | shopCategoryId | text |  | **kotlin.String** | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  |  [optional]
**marketCategoryId** | marketCategoryId | int |  | **kotlin.Int** | Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  |  [optional]
**preDiscountPrice** | preDiscountPrice | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена предложения без скидки. |  [optional]
**discount** | discount | int |  | **kotlin.Int** | Скидка на предложение в процентах. |  [optional]
**cutPrice** | cutPrice | boolean |  | **kotlin.Boolean** | Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  |  [optional]
**url** | url | text |  | **kotlin.String** | URL-адрес предложения на сайте магазина. |  [optional]
**name** | name | text |  | **kotlin.String** | Наименование предложения. |  [optional]
**currency** | currency | long |  | [**CurrencyType**](CurrencyType.md) |  |  [optional] [foreignkey]
**bid** | bid | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  |  [optional]
**cbid** | cbid | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  |  [optional]
**fee** | fee | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  |  [optional]
**blocked** | blocked | boolean |  | **kotlin.Boolean** | Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  |  [optional]


















