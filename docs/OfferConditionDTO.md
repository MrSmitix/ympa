# OfferConditionDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to [**OfferConditionType**](OfferConditionType.md) |  | [optional] 
**Quality** | Pointer to [**OfferConditionQualityType**](OfferConditionQualityType.md) |  | [optional] 
**Reason** | Pointer to **string** | Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.  | [optional] 

## Methods

### NewOfferConditionDTO

`func NewOfferConditionDTO() *OfferConditionDTO`

NewOfferConditionDTO instantiates a new OfferConditionDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferConditionDTOWithDefaults

`func NewOfferConditionDTOWithDefaults() *OfferConditionDTO`

NewOfferConditionDTOWithDefaults instantiates a new OfferConditionDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *OfferConditionDTO) GetType() OfferConditionType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OfferConditionDTO) GetTypeOk() (*OfferConditionType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OfferConditionDTO) SetType(v OfferConditionType)`

SetType sets Type field to given value.

### HasType

`func (o *OfferConditionDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetQuality

`func (o *OfferConditionDTO) GetQuality() OfferConditionQualityType`

GetQuality returns the Quality field if non-nil, zero value otherwise.

### GetQualityOk

`func (o *OfferConditionDTO) GetQualityOk() (*OfferConditionQualityType, bool)`

GetQualityOk returns a tuple with the Quality field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuality

`func (o *OfferConditionDTO) SetQuality(v OfferConditionQualityType)`

SetQuality sets Quality field to given value.

### HasQuality

`func (o *OfferConditionDTO) HasQuality() bool`

HasQuality returns a boolean if a field has been set.

### GetReason

`func (o *OfferConditionDTO) GetReason() string`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *OfferConditionDTO) GetReasonOk() (*string, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *OfferConditionDTO) SetReason(v string)`

SetReason sets Reason field to given value.

### HasReason

`func (o *OfferConditionDTO) HasReason() bool`

HasReason returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


