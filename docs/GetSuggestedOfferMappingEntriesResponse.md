# GetSuggestedOfferMappingEntriesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**OfferMappingSuggestionsListDTO**](OfferMappingSuggestionsListDTO.md) |  | [optional] 

## Methods

### NewGetSuggestedOfferMappingEntriesResponse

`func NewGetSuggestedOfferMappingEntriesResponse() *GetSuggestedOfferMappingEntriesResponse`

NewGetSuggestedOfferMappingEntriesResponse instantiates a new GetSuggestedOfferMappingEntriesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetSuggestedOfferMappingEntriesResponseWithDefaults

`func NewGetSuggestedOfferMappingEntriesResponseWithDefaults() *GetSuggestedOfferMappingEntriesResponse`

NewGetSuggestedOfferMappingEntriesResponseWithDefaults instantiates a new GetSuggestedOfferMappingEntriesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetSuggestedOfferMappingEntriesResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetSuggestedOfferMappingEntriesResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetSuggestedOfferMappingEntriesResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetSuggestedOfferMappingEntriesResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetSuggestedOfferMappingEntriesResponse) GetResult() OfferMappingSuggestionsListDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetSuggestedOfferMappingEntriesResponse) GetResultOk() (*OfferMappingSuggestionsListDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetSuggestedOfferMappingEntriesResponse) SetResult(v OfferMappingSuggestionsListDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetSuggestedOfferMappingEntriesResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


