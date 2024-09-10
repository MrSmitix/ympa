# GetCampaignOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Quantum** | Pointer to [**QuantumDTO**](QuantumDTO.md) |  | [optional] 
**Available** | Pointer to **bool** | Есть ли товар в продаже.  | [optional] 
**BasicPrice** | Pointer to [**GetPriceWithDiscountDTO**](GetPriceWithDiscountDTO.md) |  | [optional] 
**CampaignPrice** | Pointer to [**GetPriceWithVatDTO**](GetPriceWithVatDTO.md) |  | [optional] 
**Status** | Pointer to [**OfferCampaignStatusType**](OfferCampaignStatusType.md) |  | [optional] 
**Errors** | Pointer to [**[]OfferErrorDTO**](OfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  | [optional] 
**Warnings** | Pointer to [**[]OfferErrorDTO**](OfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  | [optional] 

## Methods

### NewGetCampaignOfferDTO

`func NewGetCampaignOfferDTO(offerId string, ) *GetCampaignOfferDTO`

NewGetCampaignOfferDTO instantiates a new GetCampaignOfferDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetCampaignOfferDTOWithDefaults

`func NewGetCampaignOfferDTOWithDefaults() *GetCampaignOfferDTO`

NewGetCampaignOfferDTOWithDefaults instantiates a new GetCampaignOfferDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *GetCampaignOfferDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *GetCampaignOfferDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *GetCampaignOfferDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.


### GetQuantum

`func (o *GetCampaignOfferDTO) GetQuantum() QuantumDTO`

GetQuantum returns the Quantum field if non-nil, zero value otherwise.

### GetQuantumOk

`func (o *GetCampaignOfferDTO) GetQuantumOk() (*QuantumDTO, bool)`

GetQuantumOk returns a tuple with the Quantum field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuantum

`func (o *GetCampaignOfferDTO) SetQuantum(v QuantumDTO)`

SetQuantum sets Quantum field to given value.

### HasQuantum

`func (o *GetCampaignOfferDTO) HasQuantum() bool`

HasQuantum returns a boolean if a field has been set.

### GetAvailable

`func (o *GetCampaignOfferDTO) GetAvailable() bool`

GetAvailable returns the Available field if non-nil, zero value otherwise.

### GetAvailableOk

`func (o *GetCampaignOfferDTO) GetAvailableOk() (*bool, bool)`

GetAvailableOk returns a tuple with the Available field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailable

`func (o *GetCampaignOfferDTO) SetAvailable(v bool)`

SetAvailable sets Available field to given value.

### HasAvailable

`func (o *GetCampaignOfferDTO) HasAvailable() bool`

HasAvailable returns a boolean if a field has been set.

### GetBasicPrice

`func (o *GetCampaignOfferDTO) GetBasicPrice() GetPriceWithDiscountDTO`

GetBasicPrice returns the BasicPrice field if non-nil, zero value otherwise.

### GetBasicPriceOk

`func (o *GetCampaignOfferDTO) GetBasicPriceOk() (*GetPriceWithDiscountDTO, bool)`

GetBasicPriceOk returns a tuple with the BasicPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBasicPrice

`func (o *GetCampaignOfferDTO) SetBasicPrice(v GetPriceWithDiscountDTO)`

SetBasicPrice sets BasicPrice field to given value.

### HasBasicPrice

`func (o *GetCampaignOfferDTO) HasBasicPrice() bool`

HasBasicPrice returns a boolean if a field has been set.

### GetCampaignPrice

`func (o *GetCampaignOfferDTO) GetCampaignPrice() GetPriceWithVatDTO`

GetCampaignPrice returns the CampaignPrice field if non-nil, zero value otherwise.

### GetCampaignPriceOk

`func (o *GetCampaignOfferDTO) GetCampaignPriceOk() (*GetPriceWithVatDTO, bool)`

GetCampaignPriceOk returns a tuple with the CampaignPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignPrice

`func (o *GetCampaignOfferDTO) SetCampaignPrice(v GetPriceWithVatDTO)`

SetCampaignPrice sets CampaignPrice field to given value.

### HasCampaignPrice

`func (o *GetCampaignOfferDTO) HasCampaignPrice() bool`

HasCampaignPrice returns a boolean if a field has been set.

### GetStatus

`func (o *GetCampaignOfferDTO) GetStatus() OfferCampaignStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetCampaignOfferDTO) GetStatusOk() (*OfferCampaignStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetCampaignOfferDTO) SetStatus(v OfferCampaignStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetCampaignOfferDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetErrors

`func (o *GetCampaignOfferDTO) GetErrors() []OfferErrorDTO`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *GetCampaignOfferDTO) GetErrorsOk() (*[]OfferErrorDTO, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *GetCampaignOfferDTO) SetErrors(v []OfferErrorDTO)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *GetCampaignOfferDTO) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### SetErrorsNil

`func (o *GetCampaignOfferDTO) SetErrorsNil(b bool)`

 SetErrorsNil sets the value for Errors to be an explicit nil

### UnsetErrors
`func (o *GetCampaignOfferDTO) UnsetErrors()`

UnsetErrors ensures that no value is present for Errors, not even an explicit nil
### GetWarnings

`func (o *GetCampaignOfferDTO) GetWarnings() []OfferErrorDTO`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *GetCampaignOfferDTO) GetWarningsOk() (*[]OfferErrorDTO, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *GetCampaignOfferDTO) SetWarnings(v []OfferErrorDTO)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *GetCampaignOfferDTO) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.

### SetWarningsNil

`func (o *GetCampaignOfferDTO) SetWarningsNil(b bool)`

 SetWarningsNil sets the value for Warnings to be an explicit nil

### UnsetWarnings
`func (o *GetCampaignOfferDTO) UnsetWarnings()`

UnsetWarnings ensures that no value is present for Warnings, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


