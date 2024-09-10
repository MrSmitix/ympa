# BaseCampaignOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Quantum** | Pointer to [**QuantumDTO**](QuantumDTO.md) |  | [optional] 
**Available** | Pointer to **bool** | Есть ли товар в продаже.  | [optional] 

## Methods

### NewBaseCampaignOfferDTO

`func NewBaseCampaignOfferDTO(offerId string, ) *BaseCampaignOfferDTO`

NewBaseCampaignOfferDTO instantiates a new BaseCampaignOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBaseCampaignOfferDTOWithDefaults

`func NewBaseCampaignOfferDTOWithDefaults() *BaseCampaignOfferDTO`

NewBaseCampaignOfferDTOWithDefaults instantiates a new BaseCampaignOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *BaseCampaignOfferDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *BaseCampaignOfferDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *BaseCampaignOfferDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.


### GetQuantum

`func (o *BaseCampaignOfferDTO) GetQuantum() QuantumDTO`

GetQuantum returns the Quantum field if non-nil, zero value otherwise.

### GetQuantumOk

`func (o *BaseCampaignOfferDTO) GetQuantumOk() (*QuantumDTO, bool)`

GetQuantumOk returns a tuple with the Quantum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuantum

`func (o *BaseCampaignOfferDTO) SetQuantum(v QuantumDTO)`

SetQuantum sets Quantum field to given value.

### HasQuantum

`func (o *BaseCampaignOfferDTO) HasQuantum() bool`

HasQuantum returns a boolean if a field has been set.

### GetAvailable

`func (o *BaseCampaignOfferDTO) GetAvailable() bool`

GetAvailable returns the Available field if non-nil, zero value otherwise.

### GetAvailableOk

`func (o *BaseCampaignOfferDTO) GetAvailableOk() (*bool, bool)`

GetAvailableOk returns a tuple with the Available field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailable

`func (o *BaseCampaignOfferDTO) SetAvailable(v bool)`

SetAvailable sets Available field to given value.

### HasAvailable

`func (o *BaseCampaignOfferDTO) HasAvailable() bool`

HasAvailable returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


