# OutletAddressDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RegionId** | **int64** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | 
**Street** | Pointer to **string** | Улица. | [optional] 
**Number** | Pointer to **string** | Номер дома. | [optional] 
**Building** | Pointer to **string** | Номер строения. | [optional] 
**Estate** | Pointer to **string** | Номер владения. | [optional] 
**Block** | Pointer to **string** | Номер корпуса. | [optional] 
**Additional** | Pointer to **string** | Дополнительная информация. | [optional] 
**Km** | Pointer to **int32** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional] 
**City** | Pointer to **string** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  | [optional] 

## Methods

### NewOutletAddressDTO

`func NewOutletAddressDTO(regionId int64, ) *OutletAddressDTO`

NewOutletAddressDTO instantiates a new OutletAddressDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOutletAddressDTOWithDefaults

`func NewOutletAddressDTOWithDefaults() *OutletAddressDTO`

NewOutletAddressDTOWithDefaults instantiates a new OutletAddressDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRegionId

`func (o *OutletAddressDTO) GetRegionId() int64`

GetRegionId returns the RegionId field if non-nil, zero value otherwise.

### GetRegionIdOk

`func (o *OutletAddressDTO) GetRegionIdOk() (*int64, bool)`

GetRegionIdOk returns a tuple with the RegionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegionId

`func (o *OutletAddressDTO) SetRegionId(v int64)`

SetRegionId sets RegionId field to given value.


### GetStreet

`func (o *OutletAddressDTO) GetStreet() string`

GetStreet returns the Street field if non-nil, zero value otherwise.

### GetStreetOk

`func (o *OutletAddressDTO) GetStreetOk() (*string, bool)`

GetStreetOk returns a tuple with the Street field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreet

`func (o *OutletAddressDTO) SetStreet(v string)`

SetStreet sets Street field to given value.

### HasStreet

`func (o *OutletAddressDTO) HasStreet() bool`

HasStreet returns a boolean if a field has been set.

### GetNumber

`func (o *OutletAddressDTO) GetNumber() string`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *OutletAddressDTO) GetNumberOk() (*string, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *OutletAddressDTO) SetNumber(v string)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *OutletAddressDTO) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetBuilding

`func (o *OutletAddressDTO) GetBuilding() string`

GetBuilding returns the Building field if non-nil, zero value otherwise.

### GetBuildingOk

`func (o *OutletAddressDTO) GetBuildingOk() (*string, bool)`

GetBuildingOk returns a tuple with the Building field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBuilding

`func (o *OutletAddressDTO) SetBuilding(v string)`

SetBuilding sets Building field to given value.

### HasBuilding

`func (o *OutletAddressDTO) HasBuilding() bool`

HasBuilding returns a boolean if a field has been set.

### GetEstate

`func (o *OutletAddressDTO) GetEstate() string`

GetEstate returns the Estate field if non-nil, zero value otherwise.

### GetEstateOk

`func (o *OutletAddressDTO) GetEstateOk() (*string, bool)`

GetEstateOk returns a tuple with the Estate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEstate

`func (o *OutletAddressDTO) SetEstate(v string)`

SetEstate sets Estate field to given value.

### HasEstate

`func (o *OutletAddressDTO) HasEstate() bool`

HasEstate returns a boolean if a field has been set.

### GetBlock

`func (o *OutletAddressDTO) GetBlock() string`

GetBlock returns the Block field if non-nil, zero value otherwise.

### GetBlockOk

`func (o *OutletAddressDTO) GetBlockOk() (*string, bool)`

GetBlockOk returns a tuple with the Block field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlock

`func (o *OutletAddressDTO) SetBlock(v string)`

SetBlock sets Block field to given value.

### HasBlock

`func (o *OutletAddressDTO) HasBlock() bool`

HasBlock returns a boolean if a field has been set.

### GetAdditional

`func (o *OutletAddressDTO) GetAdditional() string`

GetAdditional returns the Additional field if non-nil, zero value otherwise.

### GetAdditionalOk

`func (o *OutletAddressDTO) GetAdditionalOk() (*string, bool)`

GetAdditionalOk returns a tuple with the Additional field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditional

`func (o *OutletAddressDTO) SetAdditional(v string)`

SetAdditional sets Additional field to given value.

### HasAdditional

`func (o *OutletAddressDTO) HasAdditional() bool`

HasAdditional returns a boolean if a field has been set.

### GetKm

`func (o *OutletAddressDTO) GetKm() int32`

GetKm returns the Km field if non-nil, zero value otherwise.

### GetKmOk

`func (o *OutletAddressDTO) GetKmOk() (*int32, bool)`

GetKmOk returns a tuple with the Km field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKm

`func (o *OutletAddressDTO) SetKm(v int32)`

SetKm sets Km field to given value.

### HasKm

`func (o *OutletAddressDTO) HasKm() bool`

HasKm returns a boolean if a field has been set.

### GetCity

`func (o *OutletAddressDTO) GetCity() string`

GetCity returns the City field if non-nil, zero value otherwise.

### GetCityOk

`func (o *OutletAddressDTO) GetCityOk() (*string, bool)`

GetCityOk returns a tuple with the City field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCity

`func (o *OutletAddressDTO) SetCity(v string)`

SetCity sets City field to given value.

### HasCity

`func (o *OutletAddressDTO) HasCity() bool`

HasCity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


