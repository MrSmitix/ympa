# GetBidsInfoResponseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bids** | [**[]SkuBidItemDTO**](SkuBidItemDTO.md) | Страница списка товаров. | 
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewGetBidsInfoResponseDTO

`func NewGetBidsInfoResponseDTO(bids []SkuBidItemDTO, ) *GetBidsInfoResponseDTO`

NewGetBidsInfoResponseDTO instantiates a new GetBidsInfoResponseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBidsInfoResponseDTOWithDefaults

`func NewGetBidsInfoResponseDTOWithDefaults() *GetBidsInfoResponseDTO`

NewGetBidsInfoResponseDTOWithDefaults instantiates a new GetBidsInfoResponseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBids

`func (o *GetBidsInfoResponseDTO) GetBids() []SkuBidItemDTO`

GetBids returns the Bids field if non-nil, zero value otherwise.

### GetBidsOk

`func (o *GetBidsInfoResponseDTO) GetBidsOk() (*[]SkuBidItemDTO, bool)`

GetBidsOk returns a tuple with the Bids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBids

`func (o *GetBidsInfoResponseDTO) SetBids(v []SkuBidItemDTO)`

SetBids sets Bids field to given value.


### GetPaging

`func (o *GetBidsInfoResponseDTO) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *GetBidsInfoResponseDTO) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *GetBidsInfoResponseDTO) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *GetBidsInfoResponseDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


