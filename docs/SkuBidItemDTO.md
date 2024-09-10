# SkuBidItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Sku** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Bid** | **int32** | Значение ставки. | 

## Methods

### NewSkuBidItemDTO

`func NewSkuBidItemDTO(sku string, bid int32, ) *SkuBidItemDTO`

NewSkuBidItemDTO instantiates a new SkuBidItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSkuBidItemDTOWithDefaults

`func NewSkuBidItemDTOWithDefaults() *SkuBidItemDTO`

NewSkuBidItemDTOWithDefaults instantiates a new SkuBidItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSku

`func (o *SkuBidItemDTO) GetSku() string`

GetSku returns the Sku field if non-nil, zero value otherwise.

### GetSkuOk

`func (o *SkuBidItemDTO) GetSkuOk() (*string, bool)`

GetSkuOk returns a tuple with the Sku field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSku

`func (o *SkuBidItemDTO) SetSku(v string)`

SetSku sets Sku field to given value.


### GetBid

`func (o *SkuBidItemDTO) GetBid() int32`

GetBid returns the Bid field if non-nil, zero value otherwise.

### GetBidOk

`func (o *SkuBidItemDTO) GetBidOk() (*int32, bool)`

GetBidOk returns a tuple with the Bid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBid

`func (o *SkuBidItemDTO) SetBid(v int32)`

SetBid sets Bid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


