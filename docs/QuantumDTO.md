# QuantumDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinQuantity** | **Int32** | Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать.  | [optional] 
**StepQuantity** | **Int32** | На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту.  | [optional] 

## Examples

- Prepare the resource
```powershell
$QuantumDTO = Initialize-ympa_powershell_clientQuantumDTO  -MinQuantity null `
 -StepQuantity null
```

- Convert the resource to JSON
```powershell
$QuantumDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

