# UpdateGoodsFeedbackCommentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FeedbackId** | **int64** | Идентификатор отзыва.  | 
**Comment** | [**UpdateGoodsFeedbackCommentDTO**](UpdateGoodsFeedbackCommentDTO.md) |  | 

## Methods

### NewUpdateGoodsFeedbackCommentRequest

`func NewUpdateGoodsFeedbackCommentRequest(feedbackId int64, comment UpdateGoodsFeedbackCommentDTO, ) *UpdateGoodsFeedbackCommentRequest`

NewUpdateGoodsFeedbackCommentRequest instantiates a new UpdateGoodsFeedbackCommentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateGoodsFeedbackCommentRequestWithDefaults

`func NewUpdateGoodsFeedbackCommentRequestWithDefaults() *UpdateGoodsFeedbackCommentRequest`

NewUpdateGoodsFeedbackCommentRequestWithDefaults instantiates a new UpdateGoodsFeedbackCommentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFeedbackId

`func (o *UpdateGoodsFeedbackCommentRequest) GetFeedbackId() int64`

GetFeedbackId returns the FeedbackId field if non-nil, zero value otherwise.

### GetFeedbackIdOk

`func (o *UpdateGoodsFeedbackCommentRequest) GetFeedbackIdOk() (*int64, bool)`

GetFeedbackIdOk returns a tuple with the FeedbackId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedbackId

`func (o *UpdateGoodsFeedbackCommentRequest) SetFeedbackId(v int64)`

SetFeedbackId sets FeedbackId field to given value.


### GetComment

`func (o *UpdateGoodsFeedbackCommentRequest) GetComment() UpdateGoodsFeedbackCommentDTO`

GetComment returns the Comment field if non-nil, zero value otherwise.

### GetCommentOk

`func (o *UpdateGoodsFeedbackCommentRequest) GetCommentOk() (*UpdateGoodsFeedbackCommentDTO, bool)`

GetCommentOk returns a tuple with the Comment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComment

`func (o *UpdateGoodsFeedbackCommentRequest) SetComment(v UpdateGoodsFeedbackCommentDTO)`

SetComment sets Comment field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


