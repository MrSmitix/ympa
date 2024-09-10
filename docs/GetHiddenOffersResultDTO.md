# GetHiddenOffersResultDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | Pointer to [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**HiddenOffers** | [**[]HiddenOfferDTO**](HiddenOfferDTO.md) | Список скрытых товаров. | 

## Methods

### NewGetHiddenOffersResultDTO

`func NewGetHiddenOffersResultDTO(hiddenOffers []HiddenOfferDTO, ) *GetHiddenOffersResultDTO`

NewGetHiddenOffersResultDTO instantiates a new GetHiddenOffersResultDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetHiddenOffersResultDTOWithDefaults

`func NewGetHiddenOffersResultDTOWithDefaults() *GetHiddenOffersResultDTO`

NewGetHiddenOffersResultDTOWithDefaults instantiates a new GetHiddenOffersResultDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPaging

`func (o *GetHiddenOffersResultDTO) GetPaging() ScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GetHiddenOffersResultDTO) GetPagingOk() (*ScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GetHiddenOffersResultDTO) SetPaging(v ScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GetHiddenOffersResultDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.

### GetHiddenOffers

`func (o *GetHiddenOffersResultDTO) GetHiddenOffers() []HiddenOfferDTO`

GetHiddenOffers returns the HiddenOffers field if non-nil, zero value otherwise.

### GetHiddenOffersOk

`func (o *GetHiddenOffersResultDTO) GetHiddenOffersOk() (*[]HiddenOfferDTO, bool)`

GetHiddenOffersOk returns a tuple with the HiddenOffers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHiddenOffers

`func (o *GetHiddenOffersResultDTO) SetHiddenOffers(v []HiddenOfferDTO)`

SetHiddenOffers sets HiddenOffers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


