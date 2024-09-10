# OfferPriceListResponseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offers** | [**[]OfferPriceResponseDTO**](OfferPriceResponseDTO.md) | Страница списка. | 
**Paging** | Pointer to [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**Total** | Pointer to **int32** | Количество всех цен магазина, измененных через API. | [optional] 

## Methods

### NewOfferPriceListResponseDTO

`func NewOfferPriceListResponseDTO(offers []OfferPriceResponseDTO, ) *OfferPriceListResponseDTO`

NewOfferPriceListResponseDTO instantiates a new OfferPriceListResponseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferPriceListResponseDTOWithDefaults

`func NewOfferPriceListResponseDTOWithDefaults() *OfferPriceListResponseDTO`

NewOfferPriceListResponseDTOWithDefaults instantiates a new OfferPriceListResponseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOffers

`func (o *OfferPriceListResponseDTO) GetOffers() []OfferPriceResponseDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *OfferPriceListResponseDTO) GetOffersOk() (*[]OfferPriceResponseDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *OfferPriceListResponseDTO) SetOffers(v []OfferPriceResponseDTO)`

SetOffers sets Offers field to given value.


### GetPaging

`func (o *OfferPriceListResponseDTO) GetPaging() ScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *OfferPriceListResponseDTO) GetPagingOk() (*ScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *OfferPriceListResponseDTO) SetPaging(v ScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *OfferPriceListResponseDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetTotal

`func (o *OfferPriceListResponseDTO) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *OfferPriceListResponseDTO) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *OfferPriceListResponseDTO) SetTotal(v int32)`

SetTotal sets Total field to given value.

### HasTotal

`func (o *OfferPriceListResponseDTO) HasTotal() bool`

HasTotal returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


