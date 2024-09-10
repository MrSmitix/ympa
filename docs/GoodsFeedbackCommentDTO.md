# GoodsFeedbackCommentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор комментария к отзыву.  | 
**Text** | **string** | Текст комментария. | 
**CanModify** | Pointer to **bool** | Может ли продавец изменять комментарий или удалять его. | [optional] 
**ParentId** | Pointer to **int64** | Идентификатор комментария к отзыву.  | [optional] 
**Author** | [**GoodsFeedbackCommentAuthorDTO**](GoodsFeedbackCommentAuthorDTO.md) |  | 
**Status** | [**GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  | 

## Methods

### NewGoodsFeedbackCommentDTO

`func NewGoodsFeedbackCommentDTO(id int64, text string, author GoodsFeedbackCommentAuthorDTO, status GoodsFeedbackCommentStatusType, ) *GoodsFeedbackCommentDTO`

NewGoodsFeedbackCommentDTO instantiates a new GoodsFeedbackCommentDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGoodsFeedbackCommentDTOWithDefaults

`func NewGoodsFeedbackCommentDTOWithDefaults() *GoodsFeedbackCommentDTO`

NewGoodsFeedbackCommentDTOWithDefaults instantiates a new GoodsFeedbackCommentDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *GoodsFeedbackCommentDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GoodsFeedbackCommentDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GoodsFeedbackCommentDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetText

`func (o *GoodsFeedbackCommentDTO) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *GoodsFeedbackCommentDTO) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *GoodsFeedbackCommentDTO) SetText(v string)`

SetText sets Text field to given value.


### GetCanModify

`func (o *GoodsFeedbackCommentDTO) GetCanModify() bool`

GetCanModify returns the CanModify field if non-nil, zero value otherwise.

### GetCanModifyOk

`func (o *GoodsFeedbackCommentDTO) GetCanModifyOk() (*bool, bool)`

GetCanModifyOk returns a tuple with the CanModify field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanModify

`func (o *GoodsFeedbackCommentDTO) SetCanModify(v bool)`

SetCanModify sets CanModify field to given value.

### HasCanModify

`func (o *GoodsFeedbackCommentDTO) HasCanModify() bool`

HasCanModify returns a boolean if a field has been set.

### GetParentId

`func (o *GoodsFeedbackCommentDTO) GetParentId() int64`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *GoodsFeedbackCommentDTO) GetParentIdOk() (*int64, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *GoodsFeedbackCommentDTO) SetParentId(v int64)`

SetParentId sets ParentId field to given value.

### HasParentId

`func (o *GoodsFeedbackCommentDTO) HasParentId() bool`

HasParentId returns a boolean if a field has been set.

### GetAuthor

`func (o *GoodsFeedbackCommentDTO) GetAuthor() GoodsFeedbackCommentAuthorDTO`

GetAuthor returns the Author field if non-nil, zero value otherwise.

### GetAuthorOk

`func (o *GoodsFeedbackCommentDTO) GetAuthorOk() (*GoodsFeedbackCommentAuthorDTO, bool)`

GetAuthorOk returns a tuple with the Author field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthor

`func (o *GoodsFeedbackCommentDTO) SetAuthor(v GoodsFeedbackCommentAuthorDTO)`

SetAuthor sets Author field to given value.


### GetStatus

`func (o *GoodsFeedbackCommentDTO) GetStatus() GoodsFeedbackCommentStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *GoodsFeedbackCommentDTO) GetStatusOk() (*GoodsFeedbackCommentStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *GoodsFeedbackCommentDTO) SetStatus(v GoodsFeedbackCommentStatusType)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


