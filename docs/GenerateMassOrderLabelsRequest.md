# GenerateMassOrderLabelsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **int64** | Идентификатор кабинета. | 
**OrderIds** | **[]int64** | Список идентификаторов заказов. | 

## Methods

### NewGenerateMassOrderLabelsRequest

`func NewGenerateMassOrderLabelsRequest(businessId int64, orderIds []int64, ) *GenerateMassOrderLabelsRequest`

NewGenerateMassOrderLabelsRequest instantiates a new GenerateMassOrderLabelsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerateMassOrderLabelsRequestWithDefaults

`func NewGenerateMassOrderLabelsRequestWithDefaults() *GenerateMassOrderLabelsRequest`

NewGenerateMassOrderLabelsRequestWithDefaults instantiates a new GenerateMassOrderLabelsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBusinessId

`func (o *GenerateMassOrderLabelsRequest) GetBusinessId() int64`

GetBusinessId returns the BusinessId field if non-nil, zero value otherwise.

### GetBusinessIdOk

`func (o *GenerateMassOrderLabelsRequest) GetBusinessIdOk() (*int64, bool)`

GetBusinessIdOk returns a tuple with the BusinessId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusinessId

`func (o *GenerateMassOrderLabelsRequest) SetBusinessId(v int64)`

SetBusinessId sets BusinessId field to given value.


### GetOrderIds

`func (o *GenerateMassOrderLabelsRequest) GetOrderIds() []int64`

GetOrderIds returns the OrderIds field if non-nil, zero value otherwise.

### GetOrderIdsOk

`func (o *GenerateMassOrderLabelsRequest) GetOrderIdsOk() (*[]int64, bool)`

GetOrderIdsOk returns a tuple with the OrderIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderIds

`func (o *GenerateMassOrderLabelsRequest) SetOrderIds(v []int64)`

SetOrderIds sets OrderIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


