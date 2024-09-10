# OfferForRecommendationDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | Pointer to **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Price** | Pointer to [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**CofinancePrice** | Pointer to [**GetPriceDTO**](GetPriceDTO.md) |  | [optional] 
**Competitiveness** | Pointer to [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] 
**Shows** | Pointer to **int64** | Количество показов карточки товара за последние 7 дней. | [optional] 

## Methods

### NewOfferForRecommendationDTO

`func NewOfferForRecommendationDTO() *OfferForRecommendationDTO`

NewOfferForRecommendationDTO instantiates a new OfferForRecommendationDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferForRecommendationDTOWithDefaults

`func NewOfferForRecommendationDTOWithDefaults() *OfferForRecommendationDTO`

NewOfferForRecommendationDTOWithDefaults instantiates a new OfferForRecommendationDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferId

`func (o *OfferForRecommendationDTO) GetOfferId() string`

GetOfferId returns the OfferId field if non-nil, zero value otherwise.

### GetOfferIdOk

`func (o *OfferForRecommendationDTO) GetOfferIdOk() (*string, bool)`

GetOfferIdOk returns a tuple with the OfferId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferId

`func (o *OfferForRecommendationDTO) SetOfferId(v string)`

SetOfferId sets OfferId field to given value.

### HasOfferId

`func (o *OfferForRecommendationDTO) HasOfferId() bool`

HasOfferId returns a boolean if a field has been set.

### GetPrice

`func (o *OfferForRecommendationDTO) GetPrice() BasePriceDTO`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *OfferForRecommendationDTO) GetPriceOk() (*BasePriceDTO, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *OfferForRecommendationDTO) SetPrice(v BasePriceDTO)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *OfferForRecommendationDTO) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetCofinancePrice

`func (o *OfferForRecommendationDTO) GetCofinancePrice() GetPriceDTO`

GetCofinancePrice returns the CofinancePrice field if non-nil, zero value otherwise.

### GetCofinancePriceOk

`func (o *OfferForRecommendationDTO) GetCofinancePriceOk() (*GetPriceDTO, bool)`

GetCofinancePriceOk returns a tuple with the CofinancePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCofinancePrice

`func (o *OfferForRecommendationDTO) SetCofinancePrice(v GetPriceDTO)`

SetCofinancePrice sets CofinancePrice field to given value.

### HasCofinancePrice

`func (o *OfferForRecommendationDTO) HasCofinancePrice() bool`

HasCofinancePrice returns a boolean if a field has been set.

### GetCompetitiveness

`func (o *OfferForRecommendationDTO) GetCompetitiveness() PriceCompetitivenessType`

GetCompetitiveness returns the Competitiveness field if non-nil, zero value otherwise.

### GetCompetitivenessOk

`func (o *OfferForRecommendationDTO) GetCompetitivenessOk() (*PriceCompetitivenessType, bool)`

GetCompetitivenessOk returns a tuple with the Competitiveness field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompetitiveness

`func (o *OfferForRecommendationDTO) SetCompetitiveness(v PriceCompetitivenessType)`

SetCompetitiveness sets Competitiveness field to given value.

### HasCompetitiveness

`func (o *OfferForRecommendationDTO) HasCompetitiveness() bool`

HasCompetitiveness returns a boolean if a field has been set.

### GetShows

`func (o *OfferForRecommendationDTO) GetShows() int64`

GetShows returns the Shows field if non-nil, zero value otherwise.

### GetShowsOk

`func (o *OfferForRecommendationDTO) GetShowsOk() (*int64, bool)`

GetShowsOk returns a tuple with the Shows field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShows

`func (o *OfferForRecommendationDTO) SetShows(v int64)`

SetShows sets Shows field to given value.

### HasShows

`func (o *OfferForRecommendationDTO) HasShows() bool`

HasShows returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


