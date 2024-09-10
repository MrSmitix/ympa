# FeedbackCommentAuthorDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to [**FeedbackCommentAuthorType**](FeedbackCommentAuthorType.md) |  | [optional] 
**Name** | Pointer to **string** | Имя автора отзыва или название магазина. | [optional] 

## Methods

### NewFeedbackCommentAuthorDTO

`func NewFeedbackCommentAuthorDTO() *FeedbackCommentAuthorDTO`

NewFeedbackCommentAuthorDTO instantiates a new FeedbackCommentAuthorDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedbackCommentAuthorDTOWithDefaults

`func NewFeedbackCommentAuthorDTOWithDefaults() *FeedbackCommentAuthorDTO`

NewFeedbackCommentAuthorDTOWithDefaults instantiates a new FeedbackCommentAuthorDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *FeedbackCommentAuthorDTO) GetType() FeedbackCommentAuthorType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *FeedbackCommentAuthorDTO) GetTypeOk() (*FeedbackCommentAuthorType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *FeedbackCommentAuthorDTO) SetType(v FeedbackCommentAuthorType)`

SetType sets Type field to given value.

### HasType

`func (o *FeedbackCommentAuthorDTO) HasType() bool`

HasType returns a boolean if a field has been set.

### GetName

`func (o *FeedbackCommentAuthorDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *FeedbackCommentAuthorDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *FeedbackCommentAuthorDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *FeedbackCommentAuthorDTO) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


