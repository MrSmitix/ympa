# OfferMappingErrorDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OfferMappingErrorType**](OfferMappingErrorType.md) |  | 
**ParameterId** | Pointer to **int64** | Идентификатор характеристики, с которой связана ошибка. | [optional] 
**Message** | **string** | Текст ошибки. | 

## Methods

### NewOfferMappingErrorDTO

`func NewOfferMappingErrorDTO(type_ OfferMappingErrorType, message string, ) *OfferMappingErrorDTO`

NewOfferMappingErrorDTO instantiates a new OfferMappingErrorDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferMappingErrorDTOWithDefaults

`func NewOfferMappingErrorDTOWithDefaults() *OfferMappingErrorDTO`

NewOfferMappingErrorDTOWithDefaults instantiates a new OfferMappingErrorDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *OfferMappingErrorDTO) GetType() OfferMappingErrorType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OfferMappingErrorDTO) GetTypeOk() (*OfferMappingErrorType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OfferMappingErrorDTO) SetType(v OfferMappingErrorType)`

SetType sets Type field to given value.


### GetParameterId

`func (o *OfferMappingErrorDTO) GetParameterId() int64`

GetParameterId returns the ParameterId field if non-nil, zero value otherwise.

### GetParameterIdOk

`func (o *OfferMappingErrorDTO) GetParameterIdOk() (*int64, bool)`

GetParameterIdOk returns a tuple with the ParameterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameterId

`func (o *OfferMappingErrorDTO) SetParameterId(v int64)`

SetParameterId sets ParameterId field to given value.

### HasParameterId

`func (o *OfferMappingErrorDTO) HasParameterId() bool`

HasParameterId returns a boolean if a field has been set.

### GetMessage

`func (o *OfferMappingErrorDTO) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *OfferMappingErrorDTO) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *OfferMappingErrorDTO) SetMessage(v string)`

SetMessage sets Message field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


