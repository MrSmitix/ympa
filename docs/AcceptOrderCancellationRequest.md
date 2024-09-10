# AcceptOrderCancellationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accepted** | **bool** | Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.  | 
**Reason** | Pointer to [**OrderCancellationReasonType**](OrderCancellationReasonType.md) |  | [optional] 

## Methods

### NewAcceptOrderCancellationRequest

`func NewAcceptOrderCancellationRequest(accepted bool, ) *AcceptOrderCancellationRequest`

NewAcceptOrderCancellationRequest instantiates a new AcceptOrderCancellationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAcceptOrderCancellationRequestWithDefaults

`func NewAcceptOrderCancellationRequestWithDefaults() *AcceptOrderCancellationRequest`

NewAcceptOrderCancellationRequestWithDefaults instantiates a new AcceptOrderCancellationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAccepted

`func (o *AcceptOrderCancellationRequest) GetAccepted() bool`

GetAccepted returns the Accepted field if non-nil, zero value otherwise.

### GetAcceptedOk

`func (o *AcceptOrderCancellationRequest) GetAcceptedOk() (*bool, bool)`

GetAcceptedOk returns a tuple with the Accepted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccepted

`func (o *AcceptOrderCancellationRequest) SetAccepted(v bool)`

SetAccepted sets Accepted field to given value.


### GetReason

`func (o *AcceptOrderCancellationRequest) GetReason() OrderCancellationReasonType`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *AcceptOrderCancellationRequest) GetReasonOk() (*OrderCancellationReasonType, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *AcceptOrderCancellationRequest) SetReason(v OrderCancellationReasonType)`

SetReason sets Reason field to given value.

### HasReason

`func (o *AcceptOrderCancellationRequest) HasReason() bool`

HasReason returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


