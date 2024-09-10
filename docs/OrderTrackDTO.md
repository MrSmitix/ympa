# OrderTrackDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TrackCode** | Pointer to **string** | Трек‑номер посылки. | [optional] 
**DeliveryServiceId** | Pointer to **int64** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | [optional] 

## Methods

### NewOrderTrackDTO

`func NewOrderTrackDTO() *OrderTrackDTO`

NewOrderTrackDTO instantiates a new OrderTrackDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderTrackDTOWithDefaults

`func NewOrderTrackDTOWithDefaults() *OrderTrackDTO`

NewOrderTrackDTOWithDefaults instantiates a new OrderTrackDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTrackCode

`func (o *OrderTrackDTO) GetTrackCode() string`

GetTrackCode returns the TrackCode field if non-nil, zero value otherwise.

### GetTrackCodeOk

`func (o *OrderTrackDTO) GetTrackCodeOk() (*string, bool)`

GetTrackCodeOk returns a tuple with the TrackCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackCode

`func (o *OrderTrackDTO) SetTrackCode(v string)`

SetTrackCode sets TrackCode field to given value.

### HasTrackCode

`func (o *OrderTrackDTO) HasTrackCode() bool`

HasTrackCode returns a boolean if a field has been set.

### GetDeliveryServiceId

`func (o *OrderTrackDTO) GetDeliveryServiceId() int64`

GetDeliveryServiceId returns the DeliveryServiceId field if non-nil, zero value otherwise.

### GetDeliveryServiceIdOk

`func (o *OrderTrackDTO) GetDeliveryServiceIdOk() (*int64, bool)`

GetDeliveryServiceIdOk returns a tuple with the DeliveryServiceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryServiceId

`func (o *OrderTrackDTO) SetDeliveryServiceId(v int64)`

SetDeliveryServiceId sets DeliveryServiceId field to given value.

### HasDeliveryServiceId

`func (o *OrderTrackDTO) HasDeliveryServiceId() bool`

HasDeliveryServiceId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


