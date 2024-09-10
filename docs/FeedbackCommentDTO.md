# FeedbackCommentDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор ответа. | [optional] 
**ParentId** | Pointer to **int64** | Идентификатор родительского ответа. | [optional] 
**Body** | Pointer to **string** | Текст ответа. | [optional] 
**CreatedAt** | Pointer to **time.Time** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**UpdatedAt** | Pointer to **time.Time** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**Author** | Pointer to [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] 
**Children** | Pointer to [**[]FeedbackCommentDTO**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] 

## Methods

### NewFeedbackCommentDTO

`func NewFeedbackCommentDTO() *FeedbackCommentDTO`

NewFeedbackCommentDTO instantiates a new FeedbackCommentDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedbackCommentDTOWithDefaults

`func NewFeedbackCommentDTOWithDefaults() *FeedbackCommentDTO`

NewFeedbackCommentDTOWithDefaults instantiates a new FeedbackCommentDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *FeedbackCommentDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *FeedbackCommentDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *FeedbackCommentDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *FeedbackCommentDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetParentId

`func (o *FeedbackCommentDTO) GetParentId() int64`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *FeedbackCommentDTO) GetParentIdOk() (*int64, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *FeedbackCommentDTO) SetParentId(v int64)`

SetParentId sets ParentId field to given value.

### HasParentId

`func (o *FeedbackCommentDTO) HasParentId() bool`

HasParentId returns a boolean if a field has been set.

### GetBody

`func (o *FeedbackCommentDTO) GetBody() string`

GetBody returns the Body field if non-nil, zero value otherwise.

### GetBodyOk

`func (o *FeedbackCommentDTO) GetBodyOk() (*string, bool)`

GetBodyOk returns a tuple with the Body field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBody

`func (o *FeedbackCommentDTO) SetBody(v string)`

SetBody sets Body field to given value.

### HasBody

`func (o *FeedbackCommentDTO) HasBody() bool`

HasBody returns a boolean if a field has been set.

### GetCreatedAt

`func (o *FeedbackCommentDTO) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *FeedbackCommentDTO) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *FeedbackCommentDTO) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *FeedbackCommentDTO) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *FeedbackCommentDTO) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *FeedbackCommentDTO) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *FeedbackCommentDTO) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *FeedbackCommentDTO) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.

### GetAuthor

`func (o *FeedbackCommentDTO) GetAuthor() FeedbackCommentAuthorDTO`

GetAuthor returns the Author field if non-nil, zero value otherwise.

### GetAuthorOk

`func (o *FeedbackCommentDTO) GetAuthorOk() (*FeedbackCommentAuthorDTO, bool)`

GetAuthorOk returns a tuple with the Author field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthor

`func (o *FeedbackCommentDTO) SetAuthor(v FeedbackCommentAuthorDTO)`

SetAuthor sets Author field to given value.

### HasAuthor

`func (o *FeedbackCommentDTO) HasAuthor() bool`

HasAuthor returns a boolean if a field has been set.

### GetChildren

`func (o *FeedbackCommentDTO) GetChildren() []FeedbackCommentDTO`

GetChildren returns the Children field if non-nil, zero value otherwise.

### GetChildrenOk

`func (o *FeedbackCommentDTO) GetChildrenOk() (*[]FeedbackCommentDTO, bool)`

GetChildrenOk returns a tuple with the Children field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChildren

`func (o *FeedbackCommentDTO) SetChildren(v []FeedbackCommentDTO)`

SetChildren sets Children field to given value.

### HasChildren

`func (o *FeedbackCommentDTO) HasChildren() bool`

HasChildren returns a boolean if a field has been set.

### SetChildrenNil

`func (o *FeedbackCommentDTO) SetChildrenNil(b bool)`

 SetChildrenNil sets the value for Children to be an explicit nil

### UnsetChildren
`func (o *FeedbackCommentDTO) UnsetChildren()`

UnsetChildren ensures that no value is present for Children, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


