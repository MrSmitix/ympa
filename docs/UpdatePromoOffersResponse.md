# UpdatePromoOffersResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | Pointer to [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Result** | Pointer to [**UpdatePromoOffersResultDTO**](UpdatePromoOffersResultDTO.md) |  | [optional] 

## Methods

### NewUpdatePromoOffersResponse

`func NewUpdatePromoOffersResponse() *UpdatePromoOffersResponse`

NewUpdatePromoOffersResponse instantiates a new UpdatePromoOffersResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdatePromoOffersResponseWithDefaults

`func NewUpdatePromoOffersResponseWithDefaults() *UpdatePromoOffersResponse`

NewUpdatePromoOffersResponseWithDefaults instantiates a new UpdatePromoOffersResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *UpdatePromoOffersResponse) GetStatus() ApiResponseStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *UpdatePromoOffersResponse) GetStatusOk() (*ApiResponseStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *UpdatePromoOffersResponse) SetStatus(v ApiResponseStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *UpdatePromoOffersResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetResult

`func (o *UpdatePromoOffersResponse) GetResult() UpdatePromoOffersResultDTO`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *UpdatePromoOffersResponse) GetResultOk() (*UpdatePromoOffersResultDTO, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *UpdatePromoOffersResponse) SetResult(v UpdatePromoOffersResultDTO)`

SetResult sets Result field to given value.

### HasResult

`func (o *UpdatePromoOffersResponse) HasResult() bool`

HasResult returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


