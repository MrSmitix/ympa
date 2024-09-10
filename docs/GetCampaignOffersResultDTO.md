# GetCampaignOffersResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | Pointer to [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**Offers** | [**[]GetCampaignOfferDTO**](GetCampaignOfferDTO.md) | Страница списка товаров. | 

## Methods

### NewGetCampaignOffersResultDTO

`func NewGetCampaignOffersResultDTO(offers []GetCampaignOfferDTO, ) *GetCampaignOffersResultDTO`

NewGetCampaignOffersResultDTO instantiates a new GetCampaignOffersResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetCampaignOffersResultDTOWithDefaults

`func NewGetCampaignOffersResultDTOWithDefaults() *GetCampaignOffersResultDTO`

NewGetCampaignOffersResultDTOWithDefaults instantiates a new GetCampaignOffersResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaging

`func (o *GetCampaignOffersResultDTO) GetPaging() ScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GetCampaignOffersResultDTO) GetPagingOk() (*ScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GetCampaignOffersResultDTO) SetPaging(v ScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GetCampaignOffersResultDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetOffers

`func (o *GetCampaignOffersResultDTO) GetOffers() []GetCampaignOfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *GetCampaignOffersResultDTO) GetOffersOk() (*[]GetCampaignOfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *GetCampaignOffersResultDTO) SetOffers(v []GetCampaignOfferDTO)`

SetOffers sets Offers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


