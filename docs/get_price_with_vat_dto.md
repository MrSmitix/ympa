# get_price_with_vat_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **double** | Цена на товар. | [optional] 
**discount_base** | **double** | Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] 
**currency_id** | **currency_type_t \*** |  | [optional] 
**vat** | **int** | Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  | [optional] 
**updated_at** | **char \*** | Время последнего обновления. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


