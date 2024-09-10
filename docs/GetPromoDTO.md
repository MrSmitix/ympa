# GetPromoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Идентификатор акции. | 
**Name** | **String** | Название акции. | 
**Period** | [**PromoPeriodDTO**](PromoPeriodDTO.md) |  | 
**Participating** | **Boolean** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**AssortmentInfo** | [**GetPromoAssortmentInfoDTO**](GetPromoAssortmentInfoDTO.md) |  | 
**MechanicsInfo** | [**GetPromoMechanicsInfoDTO**](GetPromoMechanicsInfoDTO.md) |  | 
**BestsellerInfo** | [**GetPromoBestsellerInfoDTO**](GetPromoBestsellerInfoDTO.md) |  | 
**Channels** | [**ChannelType[]**](ChannelType.md) | Список каналов продвижения товаров. | [optional] 
**Constraints** | [**GetPromoConstraintsDTO**](GetPromoConstraintsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromoDTO = Initialize-ympa_powershell_clientGetPromoDTO  -Id null `
 -Name null `
 -Period null `
 -Participating null `
 -AssortmentInfo null `
 -MechanicsInfo null `
 -BestsellerInfo null `
 -Channels null `
 -Constraints null
```

- Convert the resource to JSON
```powershell
$GetPromoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

