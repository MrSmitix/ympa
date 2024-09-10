# SetOrderShipmentBoxesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Boxes** | [**[]ParcelBoxDTO**](ParcelBoxDTO.md) | Список грузовых мест. Маркет определяет количество мест по длине этого списка. | 

## Methods

### NewSetOrderShipmentBoxesRequest

`func NewSetOrderShipmentBoxesRequest(boxes []ParcelBoxDTO, ) *SetOrderShipmentBoxesRequest`

NewSetOrderShipmentBoxesRequest instantiates a new SetOrderShipmentBoxesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSetOrderShipmentBoxesRequestWithDefaults

`func NewSetOrderShipmentBoxesRequestWithDefaults() *SetOrderShipmentBoxesRequest`

NewSetOrderShipmentBoxesRequestWithDefaults instantiates a new SetOrderShipmentBoxesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBoxes

`func (o *SetOrderShipmentBoxesRequest) GetBoxes() []ParcelBoxDTO`

GetBoxes returns the Boxes field if non-nil, zero value otherwise.

### GetBoxesOk

`func (o *SetOrderShipmentBoxesRequest) GetBoxesOk() (*[]ParcelBoxDTO, bool)`

GetBoxesOk returns a tuple with the Boxes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxes

`func (o *SetOrderShipmentBoxesRequest) SetBoxes(v []ParcelBoxDTO)`

SetBoxes sets Boxes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


