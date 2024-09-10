# UpdateStockDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Sku** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Items** | [**[]UpdateStockItemDTO**](UpdateStockItemDTO.md) | Информация об остатках товара.  | 

## Methods

### NewUpdateStockDTO

`func NewUpdateStockDTO(sku string, items []UpdateStockItemDTO, ) *UpdateStockDTO`

NewUpdateStockDTO instantiates a new UpdateStockDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateStockDTOWithDefaults

`func NewUpdateStockDTOWithDefaults() *UpdateStockDTO`

NewUpdateStockDTOWithDefaults instantiates a new UpdateStockDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSku

`func (o *UpdateStockDTO) GetSku() string`

GetSku returns the Sku field if non-nil, zero value otherwise.

### GetSkuOk

`func (o *UpdateStockDTO) GetSkuOk() (*string, bool)`

GetSkuOk returns a tuple with the Sku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSku

`func (o *UpdateStockDTO) SetSku(v string)`

SetSku sets Sku field to given value.


### GetItems

`func (o *UpdateStockDTO) GetItems() []UpdateStockItemDTO`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *UpdateStockDTO) GetItemsOk() (*[]UpdateStockItemDTO, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *UpdateStockDTO) SetItems(v []UpdateStockItemDTO)`

SetItems sets Items field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


