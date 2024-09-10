# QualityRatingAffectedOrderDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderId** | **int64** | Идентификатор заказа. | 
**Description** | **string** | Описание проблемы. | 
**ComponentType** | [**AffectedOrderQualityRatingComponentType**](AffectedOrderQualityRatingComponentType.md) |  | 

## Methods

### NewQualityRatingAffectedOrderDTO

`func NewQualityRatingAffectedOrderDTO(orderId int64, description string, componentType AffectedOrderQualityRatingComponentType, ) *QualityRatingAffectedOrderDTO`

NewQualityRatingAffectedOrderDTO instantiates a new QualityRatingAffectedOrderDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQualityRatingAffectedOrderDTOWithDefaults

`func NewQualityRatingAffectedOrderDTOWithDefaults() *QualityRatingAffectedOrderDTO`

NewQualityRatingAffectedOrderDTOWithDefaults instantiates a new QualityRatingAffectedOrderDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrderId

`func (o *QualityRatingAffectedOrderDTO) GetOrderId() int64`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *QualityRatingAffectedOrderDTO) GetOrderIdOk() (*int64, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *QualityRatingAffectedOrderDTO) SetOrderId(v int64)`

SetOrderId sets OrderId field to given value.


### GetDescription

`func (o *QualityRatingAffectedOrderDTO) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *QualityRatingAffectedOrderDTO) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *QualityRatingAffectedOrderDTO) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetComponentType

`func (o *QualityRatingAffectedOrderDTO) GetComponentType() AffectedOrderQualityRatingComponentType`

GetComponentType returns the ComponentType field if non-nil, zero value otherwise.

### GetComponentTypeOk

`func (o *QualityRatingAffectedOrderDTO) GetComponentTypeOk() (*AffectedOrderQualityRatingComponentType, bool)`

GetComponentTypeOk returns a tuple with the ComponentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponentType

`func (o *QualityRatingAffectedOrderDTO) SetComponentType(v AffectedOrderQualityRatingComponentType)`

SetComponentType sets ComponentType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


