# GetPricesByOfferIdsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferIds** | Pointer to **[]string** | Список SKU.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] 

## Methods

### NewGetPricesByOfferIdsRequest

`func NewGetPricesByOfferIdsRequest() *GetPricesByOfferIdsRequest`

NewGetPricesByOfferIdsRequest instantiates a new GetPricesByOfferIdsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPricesByOfferIdsRequestWithDefaults

`func NewGetPricesByOfferIdsRequestWithDefaults() *GetPricesByOfferIdsRequest`

NewGetPricesByOfferIdsRequestWithDefaults instantiates a new GetPricesByOfferIdsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferIds

`func (o *GetPricesByOfferIdsRequest) GetOfferIds() []string`

GetOfferIds returns the OfferIds field if non-nil, zero value otherwise.

### GetOfferIdsOk

`func (o *GetPricesByOfferIdsRequest) GetOfferIdsOk() (*[]string, bool)`

GetOfferIdsOk returns a tuple with the OfferIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferIds

`func (o *GetPricesByOfferIdsRequest) SetOfferIds(v []string)`

SetOfferIds sets OfferIds field to given value.

### HasOfferIds

`func (o *GetPricesByOfferIdsRequest) HasOfferIds() bool`

HasOfferIds returns a boolean if a field has been set.

### SetOfferIdsNil

`func (o *GetPricesByOfferIdsRequest) SetOfferIdsNil(b bool)`

 SetOfferIdsNil sets the value for OfferIds to be an explicit nil

### UnsetOfferIds
`func (o *GetPricesByOfferIdsRequest) UnsetOfferIds()`

UnsetOfferIds ensures that no value is present for OfferIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


