# OfferPriceByOfferIdsListResponseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**[]OfferPriceByOfferIdsResponseDTO**](OfferPriceByOfferIdsResponseDTO.md) | Страница списка цен. | 
**Paging** | Pointer to [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewOfferPriceByOfferIdsListResponseDTO

`func NewOfferPriceByOfferIdsListResponseDTO(offers []OfferPriceByOfferIdsResponseDTO, ) *OfferPriceByOfferIdsListResponseDTO`

NewOfferPriceByOfferIdsListResponseDTO instantiates a new OfferPriceByOfferIdsListResponseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferPriceByOfferIdsListResponseDTOWithDefaults

`func NewOfferPriceByOfferIdsListResponseDTOWithDefaults() *OfferPriceByOfferIdsListResponseDTO`

NewOfferPriceByOfferIdsListResponseDTOWithDefaults instantiates a new OfferPriceByOfferIdsListResponseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *OfferPriceByOfferIdsListResponseDTO) GetOffers() []OfferPriceByOfferIdsResponseDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *OfferPriceByOfferIdsListResponseDTO) GetOffersOk() (*[]OfferPriceByOfferIdsResponseDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *OfferPriceByOfferIdsListResponseDTO) SetOffers(v []OfferPriceByOfferIdsResponseDTO)`

SetOffers sets Offers field to given value.


### GetPaging

`func (o *OfferPriceByOfferIdsListResponseDTO) GetPaging() ScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *OfferPriceByOfferIdsListResponseDTO) GetPagingOk() (*ScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *OfferPriceByOfferIdsListResponseDTO) SetPaging(v ScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *OfferPriceByOfferIdsListResponseDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


