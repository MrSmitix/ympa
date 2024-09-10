# OfferErrorDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | Pointer to **string** | Тип ошибки. | [optional] 
**Comment** | Pointer to **string** | Пояснение. | [optional] 

## Methods

### NewOfferErrorDTO

`func NewOfferErrorDTO() *OfferErrorDTO`

NewOfferErrorDTO instantiates a new OfferErrorDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferErrorDTOWithDefaults

`func NewOfferErrorDTOWithDefaults() *OfferErrorDTO`

NewOfferErrorDTOWithDefaults instantiates a new OfferErrorDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *OfferErrorDTO) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *OfferErrorDTO) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *OfferErrorDTO) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *OfferErrorDTO) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetComment

`func (o *OfferErrorDTO) GetComment() string`

GetComment returns the Comment field if non-nil, zero value otherwise.

### GetCommentOk

`func (o *OfferErrorDTO) GetCommentOk() (*string, bool)`

GetCommentOk returns a tuple with the Comment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComment

`func (o *OfferErrorDTO) SetComment(v string)`

SetComment sets Comment field to given value.

### HasComment

`func (o *OfferErrorDTO) HasComment() bool`

HasComment returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


