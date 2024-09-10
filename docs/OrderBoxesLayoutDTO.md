# OrderBoxesLayoutDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Boxes** | [**[]EnrichedOrderBoxLayoutDTO**](EnrichedOrderBoxLayoutDTO.md) | Список коробок. | 

## Methods

### NewOrderBoxesLayoutDTO

`func NewOrderBoxesLayoutDTO(boxes []EnrichedOrderBoxLayoutDTO, ) *OrderBoxesLayoutDTO`

NewOrderBoxesLayoutDTO instantiates a new OrderBoxesLayoutDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderBoxesLayoutDTOWithDefaults

`func NewOrderBoxesLayoutDTOWithDefaults() *OrderBoxesLayoutDTO`

NewOrderBoxesLayoutDTOWithDefaults instantiates a new OrderBoxesLayoutDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBoxes

`func (o *OrderBoxesLayoutDTO) GetBoxes() []EnrichedOrderBoxLayoutDTO`

GetBoxes returns the Boxes field if non-nil, zero value otherwise.

### GetBoxesOk

`func (o *OrderBoxesLayoutDTO) GetBoxesOk() (*[]EnrichedOrderBoxLayoutDTO, bool)`

GetBoxesOk returns a tuple with the Boxes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoxes

`func (o *OrderBoxesLayoutDTO) SetBoxes(v []EnrichedOrderBoxLayoutDTO)`

SetBoxes sets Boxes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


