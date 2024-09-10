# GetPromoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Идентификатор акции. | 
**Name** | **string** | Название акции. | 
**Period** | [**PromoPeriodDTO**](PromoPeriodDTO.md) |  | 
**Participating** | **bool** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**AssortmentInfo** | [**GetPromoAssortmentInfoDTO**](GetPromoAssortmentInfoDTO.md) |  | 
**MechanicsInfo** | [**GetPromoMechanicsInfoDTO**](GetPromoMechanicsInfoDTO.md) |  | 
**BestsellerInfo** | [**GetPromoBestsellerInfoDTO**](GetPromoBestsellerInfoDTO.md) |  | 
**Channels** | Pointer to [**[]ChannelType**](ChannelType.md) | Список каналов продвижения товаров. | [optional] 
**Constraints** | Pointer to [**GetPromoConstraintsDTO**](GetPromoConstraintsDTO.md) |  | [optional] 

## Methods

### NewGetPromoDTO

`func NewGetPromoDTO(id string, name string, period PromoPeriodDTO, participating bool, assortmentInfo GetPromoAssortmentInfoDTO, mechanicsInfo GetPromoMechanicsInfoDTO, bestsellerInfo GetPromoBestsellerInfoDTO, ) *GetPromoDTO`

NewGetPromoDTO instantiates a new GetPromoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromoDTOWithDefaults

`func NewGetPromoDTOWithDefaults() *GetPromoDTO`

NewGetPromoDTOWithDefaults instantiates a new GetPromoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *GetPromoDTO) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GetPromoDTO) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GetPromoDTO) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *GetPromoDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GetPromoDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GetPromoDTO) SetName(v string)`

SetName sets Name field to given value.


### GetPeriod

`func (o *GetPromoDTO) GetPeriod() PromoPeriodDTO`

GetPeriod returns the Period field if non-nil, zero value otherwise.

### GetPeriodOk

`func (o *GetPromoDTO) GetPeriodOk() (*PromoPeriodDTO, bool)`

GetPeriodOk returns a tuple with the Period field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeriod

`func (o *GetPromoDTO) SetPeriod(v PromoPeriodDTO)`

SetPeriod sets Period field to given value.


### GetParticipating

`func (o *GetPromoDTO) GetParticipating() bool`

GetParticipating returns the Participating field if non-nil, zero value otherwise.

### GetParticipatingOk

`func (o *GetPromoDTO) GetParticipatingOk() (*bool, bool)`

GetParticipatingOk returns a tuple with the Participating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParticipating

`func (o *GetPromoDTO) SetParticipating(v bool)`

SetParticipating sets Participating field to given value.


### GetAssortmentInfo

`func (o *GetPromoDTO) GetAssortmentInfo() GetPromoAssortmentInfoDTO`

GetAssortmentInfo returns the AssortmentInfo field if non-nil, zero value otherwise.

### GetAssortmentInfoOk

`func (o *GetPromoDTO) GetAssortmentInfoOk() (*GetPromoAssortmentInfoDTO, bool)`

GetAssortmentInfoOk returns a tuple with the AssortmentInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssortmentInfo

`func (o *GetPromoDTO) SetAssortmentInfo(v GetPromoAssortmentInfoDTO)`

SetAssortmentInfo sets AssortmentInfo field to given value.


### GetMechanicsInfo

`func (o *GetPromoDTO) GetMechanicsInfo() GetPromoMechanicsInfoDTO`

GetMechanicsInfo returns the MechanicsInfo field if non-nil, zero value otherwise.

### GetMechanicsInfoOk

`func (o *GetPromoDTO) GetMechanicsInfoOk() (*GetPromoMechanicsInfoDTO, bool)`

GetMechanicsInfoOk returns a tuple with the MechanicsInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMechanicsInfo

`func (o *GetPromoDTO) SetMechanicsInfo(v GetPromoMechanicsInfoDTO)`

SetMechanicsInfo sets MechanicsInfo field to given value.


### GetBestsellerInfo

`func (o *GetPromoDTO) GetBestsellerInfo() GetPromoBestsellerInfoDTO`

GetBestsellerInfo returns the BestsellerInfo field if non-nil, zero value otherwise.

### GetBestsellerInfoOk

`func (o *GetPromoDTO) GetBestsellerInfoOk() (*GetPromoBestsellerInfoDTO, bool)`

GetBestsellerInfoOk returns a tuple with the BestsellerInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBestsellerInfo

`func (o *GetPromoDTO) SetBestsellerInfo(v GetPromoBestsellerInfoDTO)`

SetBestsellerInfo sets BestsellerInfo field to given value.


### GetChannels

`func (o *GetPromoDTO) GetChannels() []ChannelType`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *GetPromoDTO) GetChannelsOk() (*[]ChannelType, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *GetPromoDTO) SetChannels(v []ChannelType)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *GetPromoDTO) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *GetPromoDTO) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *GetPromoDTO) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetConstraints

`func (o *GetPromoDTO) GetConstraints() GetPromoConstraintsDTO`

GetConstraints returns the Constraints field if non-nil, zero value otherwise.

### GetConstraintsOk

`func (o *GetPromoDTO) GetConstraintsOk() (*GetPromoConstraintsDTO, bool)`

GetConstraintsOk returns a tuple with the Constraints field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConstraints

`func (o *GetPromoDTO) SetConstraints(v GetPromoConstraintsDTO)`

SetConstraints sets Constraints field to given value.

### HasConstraints

`func (o *GetPromoDTO) HasConstraints() bool`

HasConstraints returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


