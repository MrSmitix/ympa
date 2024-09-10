# PromoOfferUpdateWarningDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | [**PromoOfferUpdateWarningCodeType**](PromoOfferUpdateWarningCodeType.md) |  | 
**CampaignIds** | Pointer to **[]int64** | Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.  | [optional] 

## Methods

### NewPromoOfferUpdateWarningDTO

`func NewPromoOfferUpdateWarningDTO(code PromoOfferUpdateWarningCodeType, ) *PromoOfferUpdateWarningDTO`

NewPromoOfferUpdateWarningDTO instantiates a new PromoOfferUpdateWarningDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPromoOfferUpdateWarningDTOWithDefaults

`func NewPromoOfferUpdateWarningDTOWithDefaults() *PromoOfferUpdateWarningDTO`

NewPromoOfferUpdateWarningDTOWithDefaults instantiates a new PromoOfferUpdateWarningDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *PromoOfferUpdateWarningDTO) GetCode() PromoOfferUpdateWarningCodeType`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *PromoOfferUpdateWarningDTO) GetCodeOk() (*PromoOfferUpdateWarningCodeType, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *PromoOfferUpdateWarningDTO) SetCode(v PromoOfferUpdateWarningCodeType)`

SetCode sets Code field to given value.


### GetCampaignIds

`func (o *PromoOfferUpdateWarningDTO) GetCampaignIds() []int64`

GetCampaignIds returns the CampaignIds field if non-nil, zero value otherwise.

### GetCampaignIdsOk

`func (o *PromoOfferUpdateWarningDTO) GetCampaignIdsOk() (*[]int64, bool)`

GetCampaignIdsOk returns a tuple with the CampaignIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignIds

`func (o *PromoOfferUpdateWarningDTO) SetCampaignIds(v []int64)`

SetCampaignIds sets CampaignIds field to given value.

### HasCampaignIds

`func (o *PromoOfferUpdateWarningDTO) HasCampaignIds() bool`

HasCampaignIds returns a boolean if a field has been set.

### SetCampaignIdsNil

`func (o *PromoOfferUpdateWarningDTO) SetCampaignIdsNil(b bool)`

 SetCampaignIdsNil sets the value for CampaignIds to be an explicit nil

### UnsetCampaignIds
`func (o *PromoOfferUpdateWarningDTO) UnsetCampaignIds()`

UnsetCampaignIds ensures that no value is present for CampaignIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


