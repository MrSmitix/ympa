# SetReturnDecisionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReturnItemId** | **int64** | Идентификатор товара в возврате. | 
**DecisionType** | [**ReturnRequestDecisionType**](ReturnRequestDecisionType.md) |  | 
**Comment** | Pointer to **string** | Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете.  | [optional] 

## Methods

### NewSetReturnDecisionRequest

`func NewSetReturnDecisionRequest(returnItemId int64, decisionType ReturnRequestDecisionType, ) *SetReturnDecisionRequest`

NewSetReturnDecisionRequest instantiates a new SetReturnDecisionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSetReturnDecisionRequestWithDefaults

`func NewSetReturnDecisionRequestWithDefaults() *SetReturnDecisionRequest`

NewSetReturnDecisionRequestWithDefaults instantiates a new SetReturnDecisionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReturnItemId

`func (o *SetReturnDecisionRequest) GetReturnItemId() int64`

GetReturnItemId returns the ReturnItemId field if non-nil, zero value otherwise.

### GetReturnItemIdOk

`func (o *SetReturnDecisionRequest) GetReturnItemIdOk() (*int64, bool)`

GetReturnItemIdOk returns a tuple with the ReturnItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturnItemId

`func (o *SetReturnDecisionRequest) SetReturnItemId(v int64)`

SetReturnItemId sets ReturnItemId field to given value.


### GetDecisionType

`func (o *SetReturnDecisionRequest) GetDecisionType() ReturnRequestDecisionType`

GetDecisionType returns the DecisionType field if non-nil, zero value otherwise.

### GetDecisionTypeOk

`func (o *SetReturnDecisionRequest) GetDecisionTypeOk() (*ReturnRequestDecisionType, bool)`

GetDecisionTypeOk returns a tuple with the DecisionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDecisionType

`func (o *SetReturnDecisionRequest) SetDecisionType(v ReturnRequestDecisionType)`

SetDecisionType sets DecisionType field to given value.


### GetComment

`func (o *SetReturnDecisionRequest) GetComment() string`

GetComment returns the Comment field if non-nil, zero value otherwise.

### GetCommentOk

`func (o *SetReturnDecisionRequest) GetCommentOk() (*string, bool)`

GetCommentOk returns a tuple with the Comment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComment

`func (o *SetReturnDecisionRequest) SetComment(v string)`

SetComment sets Comment field to given value.

### HasComment

`func (o *SetReturnDecisionRequest) HasComment() bool`

HasComment returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


