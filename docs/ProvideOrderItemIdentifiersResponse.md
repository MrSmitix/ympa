# ProvideOrderItemIdentifiersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**OrderItemsModificationResultDTO**](OrderItemsModificationResultDTO.md) |  | [optional] 

## Methods

### NewProvideOrderItemIdentifiersResponse

`func NewProvideOrderItemIdentifiersResponse() *ProvideOrderItemIdentifiersResponse`

NewProvideOrderItemIdentifiersResponse instantiates a new ProvideOrderItemIdentifiersResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProvideOrderItemIdentifiersResponseWithDefaults

`func NewProvideOrderItemIdentifiersResponseWithDefaults() *ProvideOrderItemIdentifiersResponse`

NewProvideOrderItemIdentifiersResponseWithDefaults instantiates a new ProvideOrderItemIdentifiersResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *ProvideOrderItemIdentifiersResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ProvideOrderItemIdentifiersResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ProvideOrderItemIdentifiersResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ProvideOrderItemIdentifiersResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *ProvideOrderItemIdentifiersResponse) GetResult() OrderItemsModificationResultDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *ProvideOrderItemIdentifiersResponse) GetResultOk() (*OrderItemsModificationResultDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *ProvideOrderItemIdentifiersResponse) SetResult(v OrderItemsModificationResultDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *ProvideOrderItemIdentifiersResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


