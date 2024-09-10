# ParcelDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Boxes** | [**[]ParcelBoxDTO**](ParcelBoxDTO.md) | Список грузовых мест. Маркет определяет количество мест по длине этого списка. | 

## Methods

### NewParcelDTO

`func NewParcelDTO(boxes []ParcelBoxDTO, ) *ParcelDTO`

NewParcelDTO instantiates a new ParcelDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewParcelDTOWithDefaults

`func NewParcelDTOWithDefaults() *ParcelDTO`

NewParcelDTOWithDefaults instantiates a new ParcelDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBoxes

`func (o *ParcelDTO) GetBoxes() []ParcelBoxDTO`

GetBoxes returns the Boxes field if non-nil, zero value otherwise.

### GetBoxesOk

`func (o *ParcelDTO) GetBoxesOk() (*[]ParcelBoxDTO, bool)`

GetBoxesOk returns a tuple with the Boxes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxes

`func (o *ParcelDTO) SetBoxes(v []ParcelBoxDTO)`

SetBoxes sets Boxes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


