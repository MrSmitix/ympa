# OfferCardsContentStatusDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferCards** | [**[]OfferCardDTO**](OfferCardDTO.md) | Страница списка товаров с информацией о состоянии карточек. | 
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewOfferCardsContentStatusDTO

`func NewOfferCardsContentStatusDTO(offerCards []OfferCardDTO, ) *OfferCardsContentStatusDTO`

NewOfferCardsContentStatusDTO instantiates a new OfferCardsContentStatusDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferCardsContentStatusDTOWithDefaults

`func NewOfferCardsContentStatusDTOWithDefaults() *OfferCardsContentStatusDTO`

NewOfferCardsContentStatusDTOWithDefaults instantiates a new OfferCardsContentStatusDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferCards

`func (o *OfferCardsContentStatusDTO) GetOfferCards() []OfferCardDTO`

GetOfferCards returns the OfferCards field if non-nil, zero value otherwise.

### GetOfferCardsOk

`func (o *OfferCardsContentStatusDTO) GetOfferCardsOk() (*[]OfferCardDTO, bool)`

GetOfferCardsOk returns a tuple with the OfferCards field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferCards

`func (o *OfferCardsContentStatusDTO) SetOfferCards(v []OfferCardDTO)`

SetOfferCards sets OfferCards field to given value.


### GetPaging

`func (o *OfferCardsContentStatusDTO) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *OfferCardsContentStatusDTO) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *OfferCardsContentStatusDTO) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *OfferCardsContentStatusDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


