# DeliveryServiceInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор службы доставки. | 
**Name** | **string** | Наименование службы доставки. | 

## Methods

### NewDeliveryServiceInfoDTO

`func NewDeliveryServiceInfoDTO(id int64, name string, ) *DeliveryServiceInfoDTO`

NewDeliveryServiceInfoDTO instantiates a new DeliveryServiceInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeliveryServiceInfoDTOWithDefaults

`func NewDeliveryServiceInfoDTOWithDefaults() *DeliveryServiceInfoDTO`

NewDeliveryServiceInfoDTOWithDefaults instantiates a new DeliveryServiceInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *DeliveryServiceInfoDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *DeliveryServiceInfoDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *DeliveryServiceInfoDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetName

`func (o *DeliveryServiceInfoDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *DeliveryServiceInfoDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *DeliveryServiceInfoDTO) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


