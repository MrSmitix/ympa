# QualityRatingComponentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **float64** | Значение составляющей в процентах. | 
**ComponentType** | [**QualityRatingComponentType**](QualityRatingComponentType.md) |  | 

## Methods

### NewQualityRatingComponentDTO

`func NewQualityRatingComponentDTO(value float64, componentType QualityRatingComponentType, ) *QualityRatingComponentDTO`

NewQualityRatingComponentDTO instantiates a new QualityRatingComponentDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQualityRatingComponentDTOWithDefaults

`func NewQualityRatingComponentDTOWithDefaults() *QualityRatingComponentDTO`

NewQualityRatingComponentDTOWithDefaults instantiates a new QualityRatingComponentDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetValue

`func (o *QualityRatingComponentDTO) GetValue() float64`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *QualityRatingComponentDTO) GetValueOk() (*float64, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *QualityRatingComponentDTO) SetValue(v float64)`

SetValue sets Value field to given value.


### GetComponentType

`func (o *QualityRatingComponentDTO) GetComponentType() QualityRatingComponentType`

GetComponentType returns the ComponentType field if non-nil, zero value otherwise.

### GetComponentTypeOk

`func (o *QualityRatingComponentDTO) GetComponentTypeOk() (*QualityRatingComponentType, bool)`

GetComponentTypeOk returns a tuple with the ComponentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponentType

`func (o *QualityRatingComponentDTO) SetComponentType(v QualityRatingComponentType)`

SetComponentType sets ComponentType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


