# CampaignSettingsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CountryRegion** | Pointer to **int64** | Идентификатор региона, в котором находится магазин. | [optional] 
**ShopName** | Pointer to **string** | Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;.  | [optional] 
**ShowInContext** | Pointer to **bool** | Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  | [optional] 
**ShowInPremium** | Pointer to **bool** | Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения.  | [optional] 
**UseOpenStat** | Pointer to **bool** | Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется.  | [optional] 
**LocalRegion** | Pointer to [**CampaignSettingsLocalRegionDTO**](CampaignSettingsLocalRegionDTO.md) |  | [optional] 

## Methods

### NewCampaignSettingsDTO

`func NewCampaignSettingsDTO() *CampaignSettingsDTO`

NewCampaignSettingsDTO instantiates a new CampaignSettingsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignSettingsDTOWithDefaults

`func NewCampaignSettingsDTOWithDefaults() *CampaignSettingsDTO`

NewCampaignSettingsDTOWithDefaults instantiates a new CampaignSettingsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountryRegion

`func (o *CampaignSettingsDTO) GetCountryRegion() int64`

GetCountryRegion returns the CountryRegion field if non-nil, zero value otherwise.

### GetCountryRegionOk

`func (o *CampaignSettingsDTO) GetCountryRegionOk() (*int64, bool)`

GetCountryRegionOk returns a tuple with the CountryRegion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountryRegion

`func (o *CampaignSettingsDTO) SetCountryRegion(v int64)`

SetCountryRegion sets CountryRegion field to given value.

### HasCountryRegion

`func (o *CampaignSettingsDTO) HasCountryRegion() bool`

HasCountryRegion returns a boolean if a field has been set.

### GetShopName

`func (o *CampaignSettingsDTO) GetShopName() string`

GetShopName returns the ShopName field if non-nil, zero value otherwise.

### GetShopNameOk

`func (o *CampaignSettingsDTO) GetShopNameOk() (*string, bool)`

GetShopNameOk returns a tuple with the ShopName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShopName

`func (o *CampaignSettingsDTO) SetShopName(v string)`

SetShopName sets ShopName field to given value.

### HasShopName

`func (o *CampaignSettingsDTO) HasShopName() bool`

HasShopName returns a boolean if a field has been set.

### GetShowInContext

`func (o *CampaignSettingsDTO) GetShowInContext() bool`

GetShowInContext returns the ShowInContext field if non-nil, zero value otherwise.

### GetShowInContextOk

`func (o *CampaignSettingsDTO) GetShowInContextOk() (*bool, bool)`

GetShowInContextOk returns a tuple with the ShowInContext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowInContext

`func (o *CampaignSettingsDTO) SetShowInContext(v bool)`

SetShowInContext sets ShowInContext field to given value.

### HasShowInContext

`func (o *CampaignSettingsDTO) HasShowInContext() bool`

HasShowInContext returns a boolean if a field has been set.

### GetShowInPremium

`func (o *CampaignSettingsDTO) GetShowInPremium() bool`

GetShowInPremium returns the ShowInPremium field if non-nil, zero value otherwise.

### GetShowInPremiumOk

`func (o *CampaignSettingsDTO) GetShowInPremiumOk() (*bool, bool)`

GetShowInPremiumOk returns a tuple with the ShowInPremium field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowInPremium

`func (o *CampaignSettingsDTO) SetShowInPremium(v bool)`

SetShowInPremium sets ShowInPremium field to given value.

### HasShowInPremium

`func (o *CampaignSettingsDTO) HasShowInPremium() bool`

HasShowInPremium returns a boolean if a field has been set.

### GetUseOpenStat

`func (o *CampaignSettingsDTO) GetUseOpenStat() bool`

GetUseOpenStat returns the UseOpenStat field if non-nil, zero value otherwise.

### GetUseOpenStatOk

`func (o *CampaignSettingsDTO) GetUseOpenStatOk() (*bool, bool)`

GetUseOpenStatOk returns a tuple with the UseOpenStat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseOpenStat

`func (o *CampaignSettingsDTO) SetUseOpenStat(v bool)`

SetUseOpenStat sets UseOpenStat field to given value.

### HasUseOpenStat

`func (o *CampaignSettingsDTO) HasUseOpenStat() bool`

HasUseOpenStat returns a boolean if a field has been set.

### GetLocalRegion

`func (o *CampaignSettingsDTO) GetLocalRegion() CampaignSettingsLocalRegionDTO`

GetLocalRegion returns the LocalRegion field if non-nil, zero value otherwise.

### GetLocalRegionOk

`func (o *CampaignSettingsDTO) GetLocalRegionOk() (*CampaignSettingsLocalRegionDTO, bool)`

GetLocalRegionOk returns a tuple with the LocalRegion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocalRegion

`func (o *CampaignSettingsDTO) SetLocalRegion(v CampaignSettingsLocalRegionDTO)`

SetLocalRegion sets LocalRegion field to given value.

### HasLocalRegion

`func (o *CampaignSettingsDTO) HasLocalRegion() bool`

HasLocalRegion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


