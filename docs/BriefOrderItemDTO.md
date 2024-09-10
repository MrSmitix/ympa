# BriefOrderItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] 
**Vat** | Pointer to [**OrderVatType**](OrderVatType.md) |  | [optional] 
**Count** | Pointer to **int32** | Количество единиц товара. | [optional] 
**Price** | Pointer to **float32** | Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка.  | [optional] 
**OfferName** | Pointer to **string** | Название товара. | [optional] 
**OfferId** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Instances** | Pointer to [**[]OrderItemInstanceDTO**](OrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] 

## Methods

### NewBriefOrderItemDTO

`func NewBriefOrderItemDTO() *BriefOrderItemDTO`

NewBriefOrderItemDTO instantiates a new BriefOrderItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBriefOrderItemDTOWithDefaults

`func NewBriefOrderItemDTOWithDefaults() *BriefOrderItemDTO`

NewBriefOrderItemDTOWithDefaults instantiates a new BriefOrderItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *BriefOrderItemDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BriefOrderItemDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BriefOrderItemDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *BriefOrderItemDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetVat

`func (o *BriefOrderItemDTO) GetVat() OrderVatType`

GetVat returns the Vat field if non-nil, zero value otherwise.

### GetVatOk

`func (o *BriefOrderItemDTO) GetVatOk() (*OrderVatType, bool)`

GetVatOk returns a tuple with the Vat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVat

`func (o *BriefOrderItemDTO) SetVat(v OrderVatType)`

SetVat sets Vat field to given value.

### HasVat

`func (o *BriefOrderItemDTO) HasVat() bool`

HasVat returns a boolean if a field has been set.

### GetCount

`func (o *BriefOrderItemDTO) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *BriefOrderItemDTO) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *BriefOrderItemDTO) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *BriefOrderItemDTO) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetPrice

`func (o *BriefOrderItemDTO) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *BriefOrderItemDTO) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *BriefOrderItemDTO) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *BriefOrderItemDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetOfferName

`func (o *BriefOrderItemDTO) GetOfferName() string`

GetOfferName returns the OfferName field if non-nil, zero value otherwise.

### GetOfferNameOk

`func (o *BriefOrderItemDTO) GetOfferNameOk() (*string, bool)`

GetOfferNameOk returns a tuple with the OfferName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferName

`func (o *BriefOrderItemDTO) SetOfferName(v string)`

SetOfferName sets OfferName field to given value.

### HasOfferName

`func (o *BriefOrderItemDTO) HasOfferName() bool`

HasOfferName returns a boolean if a field has been set.

### GetOfferId

`func (o *BriefOrderItemDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *BriefOrderItemDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *BriefOrderItemDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.

### HasOfferId

`func (o *BriefOrderItemDTO) HasOfferId() bool`

HasOfferId returns a boolean if a field has been set.

### GetInstances

`func (o *BriefOrderItemDTO) GetInstances() []OrderItemInstanceDTO`

GetInstances returns the Instances field if non-nil, zero value otherwise.

### GetInstancesOk

`func (o *BriefOrderItemDTO) GetInstancesOk() (*[]OrderItemInstanceDTO, bool)`

GetInstancesOk returns a tuple with the Instances field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstances

`func (o *BriefOrderItemDTO) SetInstances(v []OrderItemInstanceDTO)`

SetInstances sets Instances field to given value.

### HasInstances

`func (o *BriefOrderItemDTO) HasInstances() bool`

HasInstances returns a boolean if a field has been set.

### SetInstancesNil

`func (o *BriefOrderItemDTO) SetInstancesNil(b bool)`

 SetInstancesNil sets the value for Instances to be an explicit nil

### UnsetInstances
`func (o *BriefOrderItemDTO) UnsetInstances()`

UnsetInstances ensures that no value is present for Instances, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


