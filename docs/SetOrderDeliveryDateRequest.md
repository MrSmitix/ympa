# SetOrderDeliveryDateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dates** | [**OrderDeliveryDateDTO**](OrderDeliveryDateDTO.md) |  | 
**Reason** | [**OrderDeliveryDateReasonType**](OrderDeliveryDateReasonType.md) |  | 

## Methods

### NewSetOrderDeliveryDateRequest

`func NewSetOrderDeliveryDateRequest(dates OrderDeliveryDateDTO, reason OrderDeliveryDateReasonType, ) *SetOrderDeliveryDateRequest`

NewSetOrderDeliveryDateRequest instantiates a new SetOrderDeliveryDateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSetOrderDeliveryDateRequestWithDefaults

`func NewSetOrderDeliveryDateRequestWithDefaults() *SetOrderDeliveryDateRequest`

NewSetOrderDeliveryDateRequestWithDefaults instantiates a new SetOrderDeliveryDateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDates

`func (o *SetOrderDeliveryDateRequest) GetDates() OrderDeliveryDateDTO`

GetDates returns the Dates field if non-nil, zero value otherwise.

### GetDatesOk

`func (o *SetOrderDeliveryDateRequest) GetDatesOk() (*OrderDeliveryDateDTO, bool)`

GetDatesOk returns a tuple with the Dates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDates

`func (o *SetOrderDeliveryDateRequest) SetDates(v OrderDeliveryDateDTO)`

SetDates sets Dates field to given value.


### GetReason

`func (o *SetOrderDeliveryDateRequest) GetReason() OrderDeliveryDateReasonType`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *SetOrderDeliveryDateRequest) GetReasonOk() (*OrderDeliveryDateReasonType, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *SetOrderDeliveryDateRequest) SetReason(v OrderDeliveryDateReasonType)`

SetReason sets Reason field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


