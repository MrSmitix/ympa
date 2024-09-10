# GetOrdersStatsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**OrdersStatsDTO**](OrdersStatsDTO.md) |  | [optional] 

## Methods

### NewGetOrdersStatsResponse

`func NewGetOrdersStatsResponse() *GetOrdersStatsResponse`

NewGetOrdersStatsResponse instantiates a new GetOrdersStatsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetOrdersStatsResponseWithDefaults

`func NewGetOrdersStatsResponseWithDefaults() *GetOrdersStatsResponse`

NewGetOrdersStatsResponseWithDefaults instantiates a new GetOrdersStatsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *GetOrdersStatsResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GetOrdersStatsResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GetOrdersStatsResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *GetOrdersStatsResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *GetOrdersStatsResponse) GetResult() OrdersStatsDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *GetOrdersStatsResponse) GetResultOk() (*OrdersStatsDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *GetOrdersStatsResponse) SetResult(v OrdersStatsDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *GetOrdersStatsResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


