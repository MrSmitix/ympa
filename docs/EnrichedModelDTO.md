# EnrichedModelDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int64** | Идентификатор модели товара. | [optional] 
**Name** | Pointer to **string** | Название модели товара. | [optional] 
**Prices** | Pointer to [**ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] 
**Offers** | Pointer to [**[]ModelOfferDTO**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] 
**OfflineOffers** | Pointer to **int32** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 
**OnlineOffers** | Pointer to **int32** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 

## Methods

### NewEnrichedModelDTO

`func NewEnrichedModelDTO() *EnrichedModelDTO`

NewEnrichedModelDTO instantiates a new EnrichedModelDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnrichedModelDTOWithDefaults

`func NewEnrichedModelDTOWithDefaults() *EnrichedModelDTO`

NewEnrichedModelDTOWithDefaults instantiates a new EnrichedModelDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EnrichedModelDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EnrichedModelDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EnrichedModelDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *EnrichedModelDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *EnrichedModelDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EnrichedModelDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EnrichedModelDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *EnrichedModelDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPrices

`func (o *EnrichedModelDTO) GetPrices() ModelPriceDTO`

GetPrices returns the Prices field if non-nil, zero value otherwise.

### GetPricesOk

`func (o *EnrichedModelDTO) GetPricesOk() (*ModelPriceDTO, bool)`

GetPricesOk returns a tuple with the Prices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrices

`func (o *EnrichedModelDTO) SetPrices(v ModelPriceDTO)`

SetPrices sets Prices field to given value.

### HasPrices

`func (o *EnrichedModelDTO) HasPrices() bool`

HasPrices returns a boolean if a field has been set.

### GetOffers

`func (o *EnrichedModelDTO) GetOffers() []ModelOfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *EnrichedModelDTO) GetOffersOk() (*[]ModelOfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *EnrichedModelDTO) SetOffers(v []ModelOfferDTO)`

SetOffers sets Offers field to given value.

### HasOffers

`func (o *EnrichedModelDTO) HasOffers() bool`

HasOffers returns a boolean if a field has been set.

### SetOffersNil

`func (o *EnrichedModelDTO) SetOffersNil(b bool)`

 SetOffersNil sets the value for Offers to be an explicit nil

### UnsetOffers
`func (o *EnrichedModelDTO) UnsetOffers()`

UnsetOffers ensures that no value is present for Offers, not even an explicit nil
### GetOfflineOffers

`func (o *EnrichedModelDTO) GetOfflineOffers() int32`

GetOfflineOffers returns the OfflineOffers field if non-nil, zero value otherwise.

### GetOfflineOffersOk

`func (o *EnrichedModelDTO) GetOfflineOffersOk() (*int32, bool)`

GetOfflineOffersOk returns a tuple with the OfflineOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfflineOffers

`func (o *EnrichedModelDTO) SetOfflineOffers(v int32)`

SetOfflineOffers sets OfflineOffers field to given value.

### HasOfflineOffers

`func (o *EnrichedModelDTO) HasOfflineOffers() bool`

HasOfflineOffers returns a boolean if a field has been set.

### GetOnlineOffers

`func (o *EnrichedModelDTO) GetOnlineOffers() int32`

GetOnlineOffers returns the OnlineOffers field if non-nil, zero value otherwise.

### GetOnlineOffersOk

`func (o *EnrichedModelDTO) GetOnlineOffersOk() (*int32, bool)`

GetOnlineOffersOk returns a tuple with the OnlineOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlineOffers

`func (o *EnrichedModelDTO) SetOnlineOffers(v int32)`

SetOnlineOffers sets OnlineOffers field to given value.

### HasOnlineOffers

`func (o *EnrichedModelDTO) HasOnlineOffers() bool`

HasOnlineOffers returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


