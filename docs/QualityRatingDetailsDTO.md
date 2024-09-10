# QualityRatingDetailsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AffectedOrders** | [**[]QualityRatingAffectedOrderDTO**](QualityRatingAffectedOrderDTO.md) | Список заказов, которые повлияли на индекс качества. | 

## Methods

### NewQualityRatingDetailsDTO

`func NewQualityRatingDetailsDTO(affectedOrders []QualityRatingAffectedOrderDTO, ) *QualityRatingDetailsDTO`

NewQualityRatingDetailsDTO instantiates a new QualityRatingDetailsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQualityRatingDetailsDTOWithDefaults

`func NewQualityRatingDetailsDTOWithDefaults() *QualityRatingDetailsDTO`

NewQualityRatingDetailsDTOWithDefaults instantiates a new QualityRatingDetailsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAffectedOrders

`func (o *QualityRatingDetailsDTO) GetAffectedOrders() []QualityRatingAffectedOrderDTO`

GetAffectedOrders returns the AffectedOrders field if non-nil, zero value otherwise.

### GetAffectedOrdersOk

`func (o *QualityRatingDetailsDTO) GetAffectedOrdersOk() (*[]QualityRatingAffectedOrderDTO, bool)`

GetAffectedOrdersOk returns a tuple with the AffectedOrders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAffectedOrders

`func (o *QualityRatingDetailsDTO) SetAffectedOrders(v []QualityRatingAffectedOrderDTO)`

SetAffectedOrders sets AffectedOrders field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


