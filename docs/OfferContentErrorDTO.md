# OfferContentErrorDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OfferContentErrorType**](OfferContentErrorType.md) |  | 
**ParameterId** | Pointer to **int64** | Идентификатор характеристики, с которой связана ошибка. | [optional] 
**Message** | **string** | Текст ошибки. | 

## Methods

### NewOfferContentErrorDTO

`func NewOfferContentErrorDTO(type_ OfferContentErrorType, message string, ) *OfferContentErrorDTO`

NewOfferContentErrorDTO instantiates a new OfferContentErrorDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferContentErrorDTOWithDefaults

`func NewOfferContentErrorDTOWithDefaults() *OfferContentErrorDTO`

NewOfferContentErrorDTOWithDefaults instantiates a new OfferContentErrorDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *OfferContentErrorDTO) GetType() OfferContentErrorType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OfferContentErrorDTO) GetTypeOk() (*OfferContentErrorType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OfferContentErrorDTO) SetType(v OfferContentErrorType)`

SetType sets Type field to given value.


### GetParameterId

`func (o *OfferContentErrorDTO) GetParameterId() int64`

GetParameterId returns the ParameterId field if non-nil, zero value otherwise.

### GetParameterIdOk

`func (o *OfferContentErrorDTO) GetParameterIdOk() (*int64, bool)`

GetParameterIdOk returns a tuple with the ParameterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParameterId

`func (o *OfferContentErrorDTO) SetParameterId(v int64)`

SetParameterId sets ParameterId field to given value.

### HasParameterId

`func (o *OfferContentErrorDTO) HasParameterId() bool`

HasParameterId returns a boolean if a field has been set.

### GetMessage

`func (o *OfferContentErrorDTO) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *OfferContentErrorDTO) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *OfferContentErrorDTO) SetMessage(v string)`

SetMessage sets Message field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


