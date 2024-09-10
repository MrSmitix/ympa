# OfferDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Price** | **Decimal** | Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  | [optional] 
**FeedId** | **Int64** | Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] 
**Id** | **String** | Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр &#x60;id&#x60; указывается только для первого из них, для остальных параметры &#x60;id&#x60; и &#x60;feedId&#x60; не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] 
**ShopCategoryId** | **String** | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] 
**MarketCategoryId** | **Int32** | Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] 
**PreDiscountPrice** | **Decimal** | Цена предложения без скидки. | [optional] 
**Discount** | **Int32** | Скидка на предложение в процентах. | [optional] 
**CutPrice** | **Boolean** | Является ли предложение уцененным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  | [optional] 
**Url** | **String** | URL-адрес предложения на сайте магазина. | [optional] 
**ModelId** | **Int64** | Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр &#x60;modelid&#x60; содержит значение &#x60;0&#x60;.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра &#x60;product&#x60;. Например: &#x60;https://market.yandex.ru/product/13584121&#x60;.  {% endnote %}  | 
**Name** | **String** | Наименование предложения. | [optional] 
**Currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**Bid** | **Decimal** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  | [optional] 
**Cbid** | **Decimal** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  | [optional] 
**Fee** | **Decimal** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  | [optional] 
**Blocked** | **Boolean** | Признак блокировки предложения. Возможные значения: * &#x60;false&#x60; — предложение активно, параметр не выводится. * &#x60;true&#x60; — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferDTO = Initialize-ympa_powershell_clientOfferDTO  -Price null `
 -FeedId null `
 -Id null `
 -ShopCategoryId null `
 -MarketCategoryId null `
 -PreDiscountPrice null `
 -Discount null `
 -CutPrice null `
 -Url null `
 -ModelId null `
 -Name null `
 -Currency null `
 -Bid null `
 -Cbid null `
 -Fee null `
 -Blocked null
```

- Convert the resource to JSON
```powershell
$OfferDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

