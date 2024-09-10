# GetPromoOffersResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**[]GetPromoOfferDTO**](GetPromoOfferDTO.md) | Товары, которые участвуют или могут участвовать в акции. | 
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewGetPromoOffersResultDTO

`func NewGetPromoOffersResultDTO(offers []GetPromoOfferDTO, ) *GetPromoOffersResultDTO`

NewGetPromoOffersResultDTO instantiates a new GetPromoOffersResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromoOffersResultDTOWithDefaults

`func NewGetPromoOffersResultDTOWithDefaults() *GetPromoOffersResultDTO`

NewGetPromoOffersResultDTOWithDefaults instantiates a new GetPromoOffersResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *GetPromoOffersResultDTO) GetOffers() []GetPromoOfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *GetPromoOffersResultDTO) GetOffersOk() (*[]GetPromoOfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *GetPromoOffersResultDTO) SetOffers(v []GetPromoOfferDTO)`

SetOffers sets Offers field to given value.


### GetPaging

`func (o *GetPromoOffersResultDTO) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GetPromoOffersResultDTO) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GetPromoOffersResultDTO) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GetPromoOffersResultDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


