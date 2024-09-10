# CampaignDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Domain** | Pointer to **string** | URL магазина. | [optional] 
**Id** | Pointer to **int64** | Идентификатор кампании. | [optional] 
**ClientId** | Pointer to **int64** | Идентификатор плательщика в Яндекс Балансе. | [optional] 
**Business** | Pointer to [**BusinessDTO**](BusinessDTO.md) |  | [optional] 
**PlacementType** | Pointer to [**PlacementType**](PlacementType.md) |  | [optional] 

## Methods

### NewCampaignDTO

`func NewCampaignDTO() *CampaignDTO`

NewCampaignDTO instantiates a new CampaignDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignDTOWithDefaults

`func NewCampaignDTOWithDefaults() *CampaignDTO`

NewCampaignDTOWithDefaults instantiates a new CampaignDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDomain

`func (o *CampaignDTO) GetDomain() string`

GetDomain returns the Domain field if non-nil, zero value otherwise.

### GetDomainOk

`func (o *CampaignDTO) GetDomainOk() (*string, bool)`

GetDomainOk returns a tuple with the Domain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomain

`func (o *CampaignDTO) SetDomain(v string)`

SetDomain sets Domain field to given value.

### HasDomain

`func (o *CampaignDTO) HasDomain() bool`

HasDomain returns a boolean if a field has been set.

### GetId

`func (o *CampaignDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CampaignDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CampaignDTO) SetId(v int64)`

SetId sets Id field to given value.

### HasId

`func (o *CampaignDTO) HasId() bool`

HasId returns a boolean if a field has been set.

### GetClientId

`func (o *CampaignDTO) GetClientId() int64`

GetClientId returns the ClientId field if non-nil, zero value otherwise.

### GetClientIdOk

`func (o *CampaignDTO) GetClientIdOk() (*int64, bool)`

GetClientIdOk returns a tuple with the ClientId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientId

`func (o *CampaignDTO) SetClientId(v int64)`

SetClientId sets ClientId field to given value.

### HasClientId

`func (o *CampaignDTO) HasClientId() bool`

HasClientId returns a boolean if a field has been set.

### GetBusiness

`func (o *CampaignDTO) GetBusiness() BusinessDTO`

GetBusiness returns the Business field if non-nil, zero value otherwise.

### GetBusinessOk

`func (o *CampaignDTO) GetBusinessOk() (*BusinessDTO, bool)`

GetBusinessOk returns a tuple with the Business field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBusiness

`func (o *CampaignDTO) SetBusiness(v BusinessDTO)`

SetBusiness sets Business field to given value.

### HasBusiness

`func (o *CampaignDTO) HasBusiness() bool`

HasBusiness returns a boolean if a field has been set.

### GetPlacementType

`func (o *CampaignDTO) GetPlacementType() PlacementType`

GetPlacementType returns the PlacementType field if non-nil, zero value otherwise.

### GetPlacementTypeOk

`func (o *CampaignDTO) GetPlacementTypeOk() (*PlacementType, bool)`

GetPlacementTypeOk returns a tuple with the PlacementType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlacementType

`func (o *CampaignDTO) SetPlacementType(v PlacementType)`

SetPlacementType sets PlacementType field to given value.

### HasPlacementType

`func (o *CampaignDTO) HasPlacementType() bool`

HasPlacementType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


