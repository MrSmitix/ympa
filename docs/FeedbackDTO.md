# FeedbackDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор отзыва. | [optional] 
**CreatedAt** | Pointer to **time.Time** | Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] 
**Text** | Pointer to **string** | Комментарий автора отзыва. | [optional] 
**State** | Pointer to [**FeedbackStateType**](FeedbackStateType.md) |  | [optional] 
**Author** | Pointer to [**FeedbackAuthorDTO**](FeedbackAuthorDTO.md) |  | [optional] 
**Pro** | Pointer to **string** | Достоинства магазина, описанные в отзыве. | [optional] 
**Contra** | Pointer to **string** | Недостатки магазина, описанные в отзыве. | [optional] 
**Comments** | [**[]FeedbackCommentDTO**](FeedbackCommentDTO.md) | Переписка автора отзыва с магазином. | 
**Shop** | Pointer to [**FeedbackShopDTO**](FeedbackShopDTO.md) |  | [optional] 
**Resolved** | Pointer to **bool** | Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись.  | [optional] 
**Verified** | Pointer to **bool** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**Recommend** | Pointer to **bool** | Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  | [optional] 
**Grades** | Pointer to [**FeedbackGradesDTO**](FeedbackGradesDTO.md) |  | [optional] 
**Order** | Pointer to [**FeedbackOrderDTO**](FeedbackOrderDTO.md) |  | [optional] 

## Methods

### NewFeedbackDTO

`func NewFeedbackDTO(comments []FeedbackCommentDTO, ) *FeedbackDTO`

NewFeedbackDTO instantiates a new FeedbackDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewFeedbackDTOWithDefaults

`func NewFeedbackDTOWithDefaults() *FeedbackDTO`

NewFeedbackDTOWithDefaults instantiates a new FeedbackDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *FeedbackDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *FeedbackDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *FeedbackDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *FeedbackDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetCreatedAt

`func (o *FeedbackDTO) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *FeedbackDTO) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *FeedbackDTO) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *FeedbackDTO) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetText

`func (o *FeedbackDTO) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *FeedbackDTO) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *FeedbackDTO) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *FeedbackDTO) HasText() bool`

HasText returns a boolean if a field has been set.

### GetState

`func (o *FeedbackDTO) GetState() FeedbackStateType`

GetState returns the State field if non-nil, zero value otherwise.

### GetStateOk

`func (o *FeedbackDTO) GetStateOk() (*FeedbackStateType, bool)`

GetStateOk returns a tuple with the State field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetState

`func (o *FeedbackDTO) SetState(v FeedbackStateType)`

SetState sets State field to given value.

### HasState

`func (o *FeedbackDTO) HasState() bool`

HasState returns a boolean if a field has been set.

### GetAuthor

`func (o *FeedbackDTO) GetAuthor() FeedbackAuthorDTO`

GetAuthor returns the Author field if non-nil, zero value otherwise.

### GetAuthorOk

`func (o *FeedbackDTO) GetAuthorOk() (*FeedbackAuthorDTO, bool)`

GetAuthorOk returns a tuple with the Author field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthor

`func (o *FeedbackDTO) SetAuthor(v FeedbackAuthorDTO)`

SetAuthor sets Author field to given value.

### HasAuthor

`func (o *FeedbackDTO) HasAuthor() bool`

HasAuthor returns a boolean if a field has been set.

### GetPro

`func (o *FeedbackDTO) GetPro() string`

GetPro returns the Pro field if non-nil, zero value otherwise.

### GetProOk

`func (o *FeedbackDTO) GetProOk() (*string, bool)`

GetProOk returns a tuple with the Pro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPro

`func (o *FeedbackDTO) SetPro(v string)`

SetPro sets Pro field to given value.

### HasPro

`func (o *FeedbackDTO) HasPro() bool`

HasPro returns a boolean if a field has been set.

### GetContra

`func (o *FeedbackDTO) GetContra() string`

GetContra returns the Contra field if non-nil, zero value otherwise.

### GetContraOk

`func (o *FeedbackDTO) GetContraOk() (*string, bool)`

GetContraOk returns a tuple with the Contra field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContra

`func (o *FeedbackDTO) SetContra(v string)`

SetContra sets Contra field to given value.

### HasContra

`func (o *FeedbackDTO) HasContra() bool`

HasContra returns a boolean if a field has been set.

### GetComments

`func (o *FeedbackDTO) GetComments() []FeedbackCommentDTO`

GetComments returns the Comments field if non-nil, zero value otherwise.

### GetCommentsOk

`func (o *FeedbackDTO) GetCommentsOk() (*[]FeedbackCommentDTO, bool)`

GetCommentsOk returns a tuple with the Comments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComments

`func (o *FeedbackDTO) SetComments(v []FeedbackCommentDTO)`

SetComments sets Comments field to given value.


### GetShop

`func (o *FeedbackDTO) GetShop() FeedbackShopDTO`

GetShop returns the Shop field if non-nil, zero value otherwise.

### GetShopOk

`func (o *FeedbackDTO) GetShopOk() (*FeedbackShopDTO, bool)`

GetShopOk returns a tuple with the Shop field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShop

`func (o *FeedbackDTO) SetShop(v FeedbackShopDTO)`

SetShop sets Shop field to given value.

### HasShop

`func (o *FeedbackDTO) HasShop() bool`

HasShop returns a boolean if a field has been set.

### GetResolved

`func (o *FeedbackDTO) GetResolved() bool`

GetResolved returns the Resolved field if non-nil, zero value otherwise.

### GetResolvedOk

`func (o *FeedbackDTO) GetResolvedOk() (*bool, bool)`

GetResolvedOk returns a tuple with the Resolved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResolved

`func (o *FeedbackDTO) SetResolved(v bool)`

SetResolved sets Resolved field to given value.

### HasResolved

`func (o *FeedbackDTO) HasResolved() bool`

HasResolved returns a boolean if a field has been set.

### GetVerified

`func (o *FeedbackDTO) GetVerified() bool`

GetVerified returns the Verified field if non-nil, zero value otherwise.

### GetVerifiedOk

`func (o *FeedbackDTO) GetVerifiedOk() (*bool, bool)`

GetVerifiedOk returns a tuple with the Verified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerified

`func (o *FeedbackDTO) SetVerified(v bool)`

SetVerified sets Verified field to given value.

### HasVerified

`func (o *FeedbackDTO) HasVerified() bool`

HasVerified returns a boolean if a field has been set.

### GetRecommend

`func (o *FeedbackDTO) GetRecommend() bool`

GetRecommend returns the Recommend field if non-nil, zero value otherwise.

### GetRecommendOk

`func (o *FeedbackDTO) GetRecommendOk() (*bool, bool)`

GetRecommendOk returns a tuple with the Recommend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecommend

`func (o *FeedbackDTO) SetRecommend(v bool)`

SetRecommend sets Recommend field to given value.

### HasRecommend

`func (o *FeedbackDTO) HasRecommend() bool`

HasRecommend returns a boolean if a field has been set.

### GetGrades

`func (o *FeedbackDTO) GetGrades() FeedbackGradesDTO`

GetGrades returns the Grades field if non-nil, zero value otherwise.

### GetGradesOk

`func (o *FeedbackDTO) GetGradesOk() (*FeedbackGradesDTO, bool)`

GetGradesOk returns a tuple with the Grades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrades

`func (o *FeedbackDTO) SetGrades(v FeedbackGradesDTO)`

SetGrades sets Grades field to given value.

### HasGrades

`func (o *FeedbackDTO) HasGrades() bool`

HasGrades returns a boolean if a field has been set.

### GetOrder

`func (o *FeedbackDTO) GetOrder() FeedbackOrderDTO`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *FeedbackDTO) GetOrderOk() (*FeedbackOrderDTO, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *FeedbackDTO) SetOrder(v FeedbackOrderDTO)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *FeedbackDTO) HasOrder() bool`

HasOrder returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


