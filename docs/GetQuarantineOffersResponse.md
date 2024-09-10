# GetQuarantineOffersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**GetQuarantineOffersResultDTO**](GetQuarantineOffersResultDTO.md) |  | [optional] 

## Methods

### NewGetQuarantineOffersResponse

`func NewGetQuarantineOffersResponse() *GetQuarantineOffersResponse`

NewGetQuarantineOffersResponse instantiates a new GetQuarantineOffersResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetQuarantineOffersResponseWithDefaults

`func NewGetQuarantineOffersResponseWithDefaults() *GetQuarantineOffersResponse`

NewGetQuarantineOffersResponseWithDefaults instantiates a new GetQuarantineOffersResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetQuarantineOffersResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetQuarantineOffersResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetQuarantineOffersResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetQuarantineOffersResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetQuarantineOffersResponse) GetResult() GetQuarantineOffersResultDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetQuarantineOffersResponse) GetResultOk() (*GetQuarantineOffersResultDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetQuarantineOffersResponse) SetResult(v GetQuarantineOffersResultDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetQuarantineOffersResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


