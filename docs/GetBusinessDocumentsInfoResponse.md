# GetBusinessDocumentsInfoResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**OrderBusinessDocumentsDTO**](OrderBusinessDocumentsDTO.md) |  | [optional] 

## Methods

### NewGetBusinessDocumentsInfoResponse

`func NewGetBusinessDocumentsInfoResponse() *GetBusinessDocumentsInfoResponse`

NewGetBusinessDocumentsInfoResponse instantiates a new GetBusinessDocumentsInfoResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBusinessDocumentsInfoResponseWithDefaults

`func NewGetBusinessDocumentsInfoResponseWithDefaults() *GetBusinessDocumentsInfoResponse`

NewGetBusinessDocumentsInfoResponseWithDefaults instantiates a new GetBusinessDocumentsInfoResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetBusinessDocumentsInfoResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetBusinessDocumentsInfoResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetBusinessDocumentsInfoResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetBusinessDocumentsInfoResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetBusinessDocumentsInfoResponse) GetResult() OrderBusinessDocumentsDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetBusinessDocumentsInfoResponse) GetResultOk() (*OrderBusinessDocumentsDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetBusinessDocumentsInfoResponse) SetResult(v OrderBusinessDocumentsDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetBusinessDocumentsInfoResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


