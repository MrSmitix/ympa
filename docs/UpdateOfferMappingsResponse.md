# UpdateOfferMappingsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Results** | Pointer to [**[]UpdateOfferMappingResultDTO**](UpdateOfferMappingResultDTO.md) | Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  | [optional] 

## Methods

### NewUpdateOfferMappingsResponse

`func NewUpdateOfferMappingsResponse() *UpdateOfferMappingsResponse`

NewUpdateOfferMappingsResponse instantiates a new UpdateOfferMappingsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateOfferMappingsResponseWithDefaults

`func NewUpdateOfferMappingsResponseWithDefaults() *UpdateOfferMappingsResponse`

NewUpdateOfferMappingsResponseWithDefaults instantiates a new UpdateOfferMappingsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *UpdateOfferMappingsResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *UpdateOfferMappingsResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *UpdateOfferMappingsResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *UpdateOfferMappingsResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResults

`func (o *UpdateOfferMappingsResponse) GetResults() []UpdateOfferMappingResultDTO`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *UpdateOfferMappingsResponse) GetResultsOk() (*[]UpdateOfferMappingResultDTO, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *UpdateOfferMappingsResponse) SetResults(v []UpdateOfferMappingResultDTO)`

SetResults sets Results field to given value.

### HasResults

`func (o *UpdateOfferMappingsResponse) HasResults() bool`

HasResults returns a boolean if a field has been set.

### SetResultsNil

`func (o *UpdateOfferMappingsResponse) SetResultsNil(b bool)`

 SetResultsNil sets the value for Results to be an explicit nil

### UnsetResults
`func (o *UpdateOfferMappingsResponse) UnsetResults()`

UnsetResults ensures that no value is present for Results, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


