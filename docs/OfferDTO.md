

# OfferDTO

Предложение.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**price** | **BigDecimal** | Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  |  [optional] |
|**feedId** | **Long** | Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  |  [optional] |
|**id** | **String** | Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  |  [optional] |
|**shopCategoryId** | **String** | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  |  [optional] |
|**marketCategoryId** | **Integer** | Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  |  [optional] |
|**preDiscountPrice** | **BigDecimal** | Цена предложения без скидки. |  [optional] |
|**discount** | **Integer** | Скидка на предложение в процентах. |  [optional] |
|**cutPrice** | **Boolean** | Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  |  [optional] |
|**url** | **String** | URL-адрес предложения на сайте магазина. |  [optional] |
|**modelId** | **Long** | Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %}  |  |
|**name** | **String** | Наименование предложения. |  [optional] |
|**currency** | **CurrencyType** |  |  [optional] |
|**bid** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  |  [optional] |
|**cbid** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  |  [optional] |
|**fee** | **BigDecimal** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  |  [optional] |
|**blocked** | **Boolean** | Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  |  [optional] |


