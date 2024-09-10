# ApiErrorDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Код ошибки. | 
**Message** | Pointer to **string** | Описание ошибки. | [optional] 

## Methods

### NewApiErrorDTO

`func NewApiErrorDTO(code string, ) *ApiErrorDTO`

NewApiErrorDTO instantiates a new ApiErrorDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApiErrorDTOWithDefaults

`func NewApiErrorDTOWithDefaults() *ApiErrorDTO`

NewApiErrorDTOWithDefaults instantiates a new ApiErrorDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *ApiErrorDTO) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ApiErrorDTO) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ApiErrorDTO) SetCode(v string)`

SetCode sets Code field to given value.


### GetMessage

`func (o *ApiErrorDTO) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ApiErrorDTO) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ApiErrorDTO) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ApiErrorDTO) HasMessage() bool`

HasMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


