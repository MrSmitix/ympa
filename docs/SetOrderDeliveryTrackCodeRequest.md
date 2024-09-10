# SetOrderDeliveryTrackCodeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TrackCode** | **string** | Трек‑номер посылки. | 
**DeliveryServiceId** | **int64** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 

## Methods

### NewSetOrderDeliveryTrackCodeRequest

`func NewSetOrderDeliveryTrackCodeRequest(trackCode string, deliveryServiceId int64, ) *SetOrderDeliveryTrackCodeRequest`

NewSetOrderDeliveryTrackCodeRequest instantiates a new SetOrderDeliveryTrackCodeRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSetOrderDeliveryTrackCodeRequestWithDefaults

`func NewSetOrderDeliveryTrackCodeRequestWithDefaults() *SetOrderDeliveryTrackCodeRequest`

NewSetOrderDeliveryTrackCodeRequestWithDefaults instantiates a new SetOrderDeliveryTrackCodeRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTrackCode

`func (o *SetOrderDeliveryTrackCodeRequest) GetTrackCode() string`

GetTrackCode returns the TrackCode field if non-nil, zero value otherwise.

### GetTrackCodeOk

`func (o *SetOrderDeliveryTrackCodeRequest) GetTrackCodeOk() (*string, bool)`

GetTrackCodeOk returns a tuple with the TrackCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackCode

`func (o *SetOrderDeliveryTrackCodeRequest) SetTrackCode(v string)`

SetTrackCode sets TrackCode field to given value.


### GetDeliveryServiceId

`func (o *SetOrderDeliveryTrackCodeRequest) GetDeliveryServiceId() int64`

GetDeliveryServiceId returns the DeliveryServiceId field if non-nil, zero value otherwise.

### GetDeliveryServiceIdOk

`func (o *SetOrderDeliveryTrackCodeRequest) GetDeliveryServiceIdOk() (*int64, bool)`

GetDeliveryServiceIdOk returns a tuple with the DeliveryServiceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryServiceId

`func (o *SetOrderDeliveryTrackCodeRequest) SetDeliveryServiceId(v int64)`

SetDeliveryServiceId sets DeliveryServiceId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


