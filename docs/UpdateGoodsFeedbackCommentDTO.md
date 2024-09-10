# UpdateGoodsFeedbackCommentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор комментария к отзыву.  | [optional] 
**ParentId** | Pointer to **int64** | Идентификатор комментария к отзыву.  | [optional] 
**Text** | **string** | Текст комментария. | 

## Methods

### NewUpdateGoodsFeedbackCommentDTO

`func NewUpdateGoodsFeedbackCommentDTO(text string, ) *UpdateGoodsFeedbackCommentDTO`

NewUpdateGoodsFeedbackCommentDTO instantiates a new UpdateGoodsFeedbackCommentDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateGoodsFeedbackCommentDTOWithDefaults

`func NewUpdateGoodsFeedbackCommentDTOWithDefaults() *UpdateGoodsFeedbackCommentDTO`

NewUpdateGoodsFeedbackCommentDTOWithDefaults instantiates a new UpdateGoodsFeedbackCommentDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *UpdateGoodsFeedbackCommentDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *UpdateGoodsFeedbackCommentDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *UpdateGoodsFeedbackCommentDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *UpdateGoodsFeedbackCommentDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetParentId

`func (o *UpdateGoodsFeedbackCommentDTO) GetParentId() int64`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *UpdateGoodsFeedbackCommentDTO) GetParentIdOk() (*int64, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *UpdateGoodsFeedbackCommentDTO) SetParentId(v int64)`

SetParentId sets ParentId field to given value.

### HasParentId

`func (o *UpdateGoodsFeedbackCommentDTO) HasParentId() bool`

HasParentId returns a boolean if a field has been set.

### GetText

`func (o *UpdateGoodsFeedbackCommentDTO) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *UpdateGoodsFeedbackCommentDTO) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *UpdateGoodsFeedbackCommentDTO) SetText(v string)`

SetText sets Text field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


