# GetPromoPromocodeInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Promocode** | **string** | Промокод. | 
**Discount** | **int32** | Процент скидки по промокоду. | 

## Methods

### NewGetPromoPromocodeInfoDTO

`func NewGetPromoPromocodeInfoDTO(promocode string, discount int32, ) *GetPromoPromocodeInfoDTO`

NewGetPromoPromocodeInfoDTO instantiates a new GetPromoPromocodeInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromoPromocodeInfoDTOWithDefaults

`func NewGetPromoPromocodeInfoDTOWithDefaults() *GetPromoPromocodeInfoDTO`

NewGetPromoPromocodeInfoDTOWithDefaults instantiates a new GetPromoPromocodeInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPromocode

`func (o *GetPromoPromocodeInfoDTO) GetPromocode() string`

GetPromocode returns the Promocode field if non-nil, zero value otherwise.

### GetPromocodeOk

`func (o *GetPromoPromocodeInfoDTO) GetPromocodeOk() (*string, bool)`

GetPromocodeOk returns a tuple with the Promocode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromocode

`func (o *GetPromoPromocodeInfoDTO) SetPromocode(v string)`

SetPromocode sets Promocode field to given value.


### GetDiscount

`func (o *GetPromoPromocodeInfoDTO) GetDiscount() int32`

GetDiscount returns the Discount field if non-nil, zero value otherwise.

### GetDiscountOk

`func (o *GetPromoPromocodeInfoDTO) GetDiscountOk() (*int32, bool)`

GetDiscountOk returns a tuple with the Discount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscount

`func (o *GetPromoPromocodeInfoDTO) SetDiscount(v int32)`

SetDiscount sets Discount field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


