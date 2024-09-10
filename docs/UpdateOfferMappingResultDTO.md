# UpdateOfferMappingResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Errors** | Pointer to [**[]OfferMappingErrorDTO**](OfferMappingErrorDTO.md) | Ошибки — информация в каталоге не обновится. | [optional] 
**Warnings** | Pointer to [**[]OfferMappingErrorDTO**](OfferMappingErrorDTO.md) | Предупреждения — информация в каталоге обновится. | [optional] 

## Methods

### NewUpdateOfferMappingResultDTO

`func NewUpdateOfferMappingResultDTO(offerId string, ) *UpdateOfferMappingResultDTO`

NewUpdateOfferMappingResultDTO instantiates a new UpdateOfferMappingResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOfferMappingResultDTOWithDefaults

`func NewUpdateOfferMappingResultDTOWithDefaults() *UpdateOfferMappingResultDTO`

NewUpdateOfferMappingResultDTOWithDefaults instantiates a new UpdateOfferMappingResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *UpdateOfferMappingResultDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *UpdateOfferMappingResultDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *UpdateOfferMappingResultDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.


### GetErrors

`func (o *UpdateOfferMappingResultDTO) GetErrors() []OfferMappingErrorDTO`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *UpdateOfferMappingResultDTO) GetErrorsOk() (*[]OfferMappingErrorDTO, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *UpdateOfferMappingResultDTO) SetErrors(v []OfferMappingErrorDTO)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *UpdateOfferMappingResultDTO) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### SetErrorsNil

`func (o *UpdateOfferMappingResultDTO) SetErrorsNil(b bool)`

 SetErrorsNil sets the value for Errors to be an explicit nil

### UnsetErrors
`func (o *UpdateOfferMappingResultDTO) UnsetErrors()`

UnsetErrors ensures that no value is present for Errors, not even an explicit nil
### GetWarnings

`func (o *UpdateOfferMappingResultDTO) GetWarnings() []OfferMappingErrorDTO`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *UpdateOfferMappingResultDTO) GetWarningsOk() (*[]OfferMappingErrorDTO, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *UpdateOfferMappingResultDTO) SetWarnings(v []OfferMappingErrorDTO)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *UpdateOfferMappingResultDTO) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.

### SetWarningsNil

`func (o *UpdateOfferMappingResultDTO) SetWarningsNil(b bool)`

 SetWarningsNil sets the value for Warnings to be an explicit nil

### UnsetWarnings
`func (o *UpdateOfferMappingResultDTO) UnsetWarnings()`

UnsetWarnings ensures that no value is present for Warnings, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


