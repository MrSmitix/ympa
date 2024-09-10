# DeliveryServicesDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeliveryService** | [**[]DeliveryServiceInfoDTO**](DeliveryServiceInfoDTO.md) | Информация о службе доставки. | 

## Methods

### NewDeliveryServicesDTO

`func NewDeliveryServicesDTO(deliveryService []DeliveryServiceInfoDTO, ) *DeliveryServicesDTO`

NewDeliveryServicesDTO instantiates a new DeliveryServicesDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeliveryServicesDTOWithDefaults

`func NewDeliveryServicesDTOWithDefaults() *DeliveryServicesDTO`

NewDeliveryServicesDTOWithDefaults instantiates a new DeliveryServicesDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeliveryService

`func (o *DeliveryServicesDTO) GetDeliveryService() []DeliveryServiceInfoDTO`

GetDeliveryService returns the DeliveryService field if non-nil, zero value otherwise.

### GetDeliveryServiceOk

`func (o *DeliveryServicesDTO) GetDeliveryServiceOk() (*[]DeliveryServiceInfoDTO, bool)`

GetDeliveryServiceOk returns a tuple with the DeliveryService field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryService

`func (o *DeliveryServicesDTO) SetDeliveryService(v []DeliveryServiceInfoDTO)`

SetDeliveryService sets DeliveryService field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


