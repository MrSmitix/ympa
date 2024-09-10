# DeliveryServiceDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор службы доставки. | [optional] 
**Name** | Pointer to **string** | Наименование службы доставки. | [optional] 

## Methods

### NewDeliveryServiceDTO

`func NewDeliveryServiceDTO() *DeliveryServiceDTO`

NewDeliveryServiceDTO instantiates a new DeliveryServiceDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeliveryServiceDTOWithDefaults

`func NewDeliveryServiceDTOWithDefaults() *DeliveryServiceDTO`

NewDeliveryServiceDTOWithDefaults instantiates a new DeliveryServiceDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *DeliveryServiceDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *DeliveryServiceDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *DeliveryServiceDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *DeliveryServiceDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *DeliveryServiceDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *DeliveryServiceDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *DeliveryServiceDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *DeliveryServiceDTO) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


