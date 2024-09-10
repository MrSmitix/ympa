# ReturnDecisionDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReturnItemId** | Pointer to **int64** | Идентификатор товара в возврате. | [optional] 
**Count** | Pointer to **int32** | Количество единиц товара. | [optional] 
**Comment** | Pointer to **string** | Комментарий. | [optional] 
**ReasonType** | Pointer to [**ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] 
**SubreasonType** | Pointer to [**ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] 
**DecisionType** | Pointer to [**ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] 
**RefundAmount** | Pointer to **int64** | Сумма возврата. | [optional] 
**PartnerCompensation** | Pointer to **int64** | Компенсация за обратную доставку. | [optional] 
**Images** | Pointer to **[]string** | Список хеш-кодов фотографий товара от покупателя. | [optional] 

## Methods

### NewReturnDecisionDTO

`func NewReturnDecisionDTO() *ReturnDecisionDTO`

NewReturnDecisionDTO instantiates a new ReturnDecisionDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReturnDecisionDTOWithDefaults

`func NewReturnDecisionDTOWithDefaults() *ReturnDecisionDTO`

NewReturnDecisionDTOWithDefaults instantiates a new ReturnDecisionDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReturnItemId

`func (o *ReturnDecisionDTO) GetReturnItemId() int64`

GetReturnItemId returns the ReturnItemId field if non-nil, zero value otherwise.

### GetReturnItemIdOk

`func (o *ReturnDecisionDTO) GetReturnItemIdOk() (*int64, bool)`

GetReturnItemIdOk returns a tuple with the ReturnItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturnItemId

`func (o *ReturnDecisionDTO) SetReturnItemId(v int64)`

SetReturnItemId sets ReturnItemId field to given value.

### HasReturnItemId

`func (o *ReturnDecisionDTO) HasReturnItemId() bool`

HasReturnItemId returns a boolean if a field has been set.

### GetCount

`func (o *ReturnDecisionDTO) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *ReturnDecisionDTO) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *ReturnDecisionDTO) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *ReturnDecisionDTO) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetComment

`func (o *ReturnDecisionDTO) GetComment() string`

GetComment returns the Comment field if non-nil, zero value otherwise.

### GetCommentOk

`func (o *ReturnDecisionDTO) GetCommentOk() (*string, bool)`

GetCommentOk returns a tuple with the Comment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComment

`func (o *ReturnDecisionDTO) SetComment(v string)`

SetComment sets Comment field to given value.

### HasComment

`func (o *ReturnDecisionDTO) HasComment() bool`

HasComment returns a boolean if a field has been set.

### GetReasonType

`func (o *ReturnDecisionDTO) GetReasonType() ReturnDecisionReasonType`

GetReasonType returns the ReasonType field if non-nil, zero value otherwise.

### GetReasonTypeOk

`func (o *ReturnDecisionDTO) GetReasonTypeOk() (*ReturnDecisionReasonType, bool)`

GetReasonTypeOk returns a tuple with the ReasonType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReasonType

`func (o *ReturnDecisionDTO) SetReasonType(v ReturnDecisionReasonType)`

SetReasonType sets ReasonType field to given value.

### HasReasonType

`func (o *ReturnDecisionDTO) HasReasonType() bool`

HasReasonType returns a boolean if a field has been set.

### GetSubreasonType

`func (o *ReturnDecisionDTO) GetSubreasonType() ReturnDecisionSubreasonType`

GetSubreasonType returns the SubreasonType field if non-nil, zero value otherwise.

### GetSubreasonTypeOk

`func (o *ReturnDecisionDTO) GetSubreasonTypeOk() (*ReturnDecisionSubreasonType, bool)`

GetSubreasonTypeOk returns a tuple with the SubreasonType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubreasonType

`func (o *ReturnDecisionDTO) SetSubreasonType(v ReturnDecisionSubreasonType)`

SetSubreasonType sets SubreasonType field to given value.

### HasSubreasonType

`func (o *ReturnDecisionDTO) HasSubreasonType() bool`

HasSubreasonType returns a boolean if a field has been set.

### GetDecisionType

`func (o *ReturnDecisionDTO) GetDecisionType() ReturnDecisionType`

GetDecisionType returns the DecisionType field if non-nil, zero value otherwise.

### GetDecisionTypeOk

`func (o *ReturnDecisionDTO) GetDecisionTypeOk() (*ReturnDecisionType, bool)`

GetDecisionTypeOk returns a tuple with the DecisionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDecisionType

`func (o *ReturnDecisionDTO) SetDecisionType(v ReturnDecisionType)`

SetDecisionType sets DecisionType field to given value.

### HasDecisionType

`func (o *ReturnDecisionDTO) HasDecisionType() bool`

HasDecisionType returns a boolean if a field has been set.

### GetRefundAmount

`func (o *ReturnDecisionDTO) GetRefundAmount() int64`

GetRefundAmount returns the RefundAmount field if non-nil, zero value otherwise.

### GetRefundAmountOk

`func (o *ReturnDecisionDTO) GetRefundAmountOk() (*int64, bool)`

GetRefundAmountOk returns a tuple with the RefundAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefundAmount

`func (o *ReturnDecisionDTO) SetRefundAmount(v int64)`

SetRefundAmount sets RefundAmount field to given value.

### HasRefundAmount

`func (o *ReturnDecisionDTO) HasRefundAmount() bool`

HasRefundAmount returns a boolean if a field has been set.

### GetPartnerCompensation

`func (o *ReturnDecisionDTO) GetPartnerCompensation() int64`

GetPartnerCompensation returns the PartnerCompensation field if non-nil, zero value otherwise.

### GetPartnerCompensationOk

`func (o *ReturnDecisionDTO) GetPartnerCompensationOk() (*int64, bool)`

GetPartnerCompensationOk returns a tuple with the PartnerCompensation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerCompensation

`func (o *ReturnDecisionDTO) SetPartnerCompensation(v int64)`

SetPartnerCompensation sets PartnerCompensation field to given value.

### HasPartnerCompensation

`func (o *ReturnDecisionDTO) HasPartnerCompensation() bool`

HasPartnerCompensation returns a boolean if a field has been set.

### GetImages

`func (o *ReturnDecisionDTO) GetImages() []string`

GetImages returns the Images field if non-nil, zero value otherwise.

### GetImagesOk

`func (o *ReturnDecisionDTO) GetImagesOk() (*[]string, bool)`

GetImagesOk returns a tuple with the Images field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImages

`func (o *ReturnDecisionDTO) SetImages(v []string)`

SetImages sets Images field to given value.

### HasImages

`func (o *ReturnDecisionDTO) HasImages() bool`

HasImages returns a boolean if a field has been set.

### SetImagesNil

`func (o *ReturnDecisionDTO) SetImagesNil(b bool)`

 SetImagesNil sets the value for Images to be an explicit nil

### UnsetImages
`func (o *ReturnDecisionDTO) UnsetImages()`

UnsetImages ensures that no value is present for Images, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


