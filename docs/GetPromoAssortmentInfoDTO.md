# GetPromoAssortmentInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActiveOffers** | **int32** | Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**PotentialOffers** | Pointer to **int32** | Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.  | [optional] 
**Processing** | Pointer to **bool** | Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.  | [optional] 

## Methods

### NewGetPromoAssortmentInfoDTO

`func NewGetPromoAssortmentInfoDTO(activeOffers int32, ) *GetPromoAssortmentInfoDTO`

NewGetPromoAssortmentInfoDTO instantiates a new GetPromoAssortmentInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromoAssortmentInfoDTOWithDefaults

`func NewGetPromoAssortmentInfoDTOWithDefaults() *GetPromoAssortmentInfoDTO`

NewGetPromoAssortmentInfoDTOWithDefaults instantiates a new GetPromoAssortmentInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActiveOffers

`func (o *GetPromoAssortmentInfoDTO) GetActiveOffers() int32`

GetActiveOffers returns the ActiveOffers field if non-nil, zero value otherwise.

### GetActiveOffersOk

`func (o *GetPromoAssortmentInfoDTO) GetActiveOffersOk() (*int32, bool)`

GetActiveOffersOk returns a tuple with the ActiveOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActiveOffers

`func (o *GetPromoAssortmentInfoDTO) SetActiveOffers(v int32)`

SetActiveOffers sets ActiveOffers field to given value.


### GetPotentialOffers

`func (o *GetPromoAssortmentInfoDTO) GetPotentialOffers() int32`

GetPotentialOffers returns the PotentialOffers field if non-nil, zero value otherwise.

### GetPotentialOffersOk

`func (o *GetPromoAssortmentInfoDTO) GetPotentialOffersOk() (*int32, bool)`

GetPotentialOffersOk returns a tuple with the PotentialOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPotentialOffers

`func (o *GetPromoAssortmentInfoDTO) SetPotentialOffers(v int32)`

SetPotentialOffers sets PotentialOffers field to given value.

### HasPotentialOffers

`func (o *GetPromoAssortmentInfoDTO) HasPotentialOffers() bool`

HasPotentialOffers returns a boolean if a field has been set.

### GetProcessing

`func (o *GetPromoAssortmentInfoDTO) GetProcessing() bool`

GetProcessing returns the Processing field if non-nil, zero value otherwise.

### GetProcessingOk

`func (o *GetPromoAssortmentInfoDTO) GetProcessingOk() (*bool, bool)`

GetProcessingOk returns a tuple with the Processing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProcessing

`func (o *GetPromoAssortmentInfoDTO) SetProcessing(v bool)`

SetProcessing sets Processing field to given value.

### HasProcessing

`func (o *GetPromoAssortmentInfoDTO) HasProcessing() bool`

HasProcessing returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


