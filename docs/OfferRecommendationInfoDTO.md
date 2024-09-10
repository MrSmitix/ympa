# OfferRecommendationInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**RecommendedCofinancePrice** | Pointer to [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**CompetitivenessThresholds** | Pointer to [**PriceCompetitivenessThresholdsDTO**](PriceCompetitivenessThresholdsDTO.md) |  | [optional] 

## Methods

### NewOfferRecommendationInfoDTO

`func NewOfferRecommendationInfoDTO() *OfferRecommendationInfoDTO`

NewOfferRecommendationInfoDTO instantiates a new OfferRecommendationInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferRecommendationInfoDTOWithDefaults

`func NewOfferRecommendationInfoDTOWithDefaults() *OfferRecommendationInfoDTO`

NewOfferRecommendationInfoDTOWithDefaults instantiates a new OfferRecommendationInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *OfferRecommendationInfoDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *OfferRecommendationInfoDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *OfferRecommendationInfoDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.

### HasOfferId

`func (o *OfferRecommendationInfoDTO) HasOfferId() bool`

HasOfferId returns a boolean if a field has been set.

### GetRecommendedCofinancePrice

`func (o *OfferRecommendationInfoDTO) GetRecommendedCofinancePrice() BasePriceDTO`

GetRecommendedCofinancePrice returns the RecommendedCofinancePrice field if non-nil, zero value otherwise.

### GetRecommendedCofinancePriceOk

`func (o *OfferRecommendationInfoDTO) GetRecommendedCofinancePriceOk() (*BasePriceDTO, bool)`

GetRecommendedCofinancePriceOk returns a tuple with the RecommendedCofinancePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecommendedCofinancePrice

`func (o *OfferRecommendationInfoDTO) SetRecommendedCofinancePrice(v BasePriceDTO)`

SetRecommendedCofinancePrice sets RecommendedCofinancePrice field to given value.

### HasRecommendedCofinancePrice

`func (o *OfferRecommendationInfoDTO) HasRecommendedCofinancePrice() bool`

HasRecommendedCofinancePrice returns a boolean if a field has been set.

### GetCompetitivenessThresholds

`func (o *OfferRecommendationInfoDTO) GetCompetitivenessThresholds() PriceCompetitivenessThresholdsDTO`

GetCompetitivenessThresholds returns the CompetitivenessThresholds field if non-nil, zero value otherwise.

### GetCompetitivenessThresholdsOk

`func (o *OfferRecommendationInfoDTO) GetCompetitivenessThresholdsOk() (*PriceCompetitivenessThresholdsDTO, bool)`

GetCompetitivenessThresholdsOk returns a tuple with the CompetitivenessThresholds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetitivenessThresholds

`func (o *OfferRecommendationInfoDTO) SetCompetitivenessThresholds(v PriceCompetitivenessThresholdsDTO)`

SetCompetitivenessThresholds sets CompetitivenessThresholds field to given value.

### HasCompetitivenessThresholds

`func (o *OfferRecommendationInfoDTO) HasCompetitivenessThresholds() bool`

HasCompetitivenessThresholds returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


