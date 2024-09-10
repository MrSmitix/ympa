# WarehouseOffersDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WarehouseId** | **int64** | Идентификатор склада. | 
**Offers** | [**[]WarehouseOfferDTO**](WarehouseOfferDTO.md) | Информация об остатках. | 

## Methods

### NewWarehouseOffersDTO

`func NewWarehouseOffersDTO(warehouseId int64, offers []WarehouseOfferDTO, ) *WarehouseOffersDTO`

NewWarehouseOffersDTO instantiates a new WarehouseOffersDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWarehouseOffersDTOWithDefaults

`func NewWarehouseOffersDTOWithDefaults() *WarehouseOffersDTO`

NewWarehouseOffersDTOWithDefaults instantiates a new WarehouseOffersDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWarehouseId

`func (o *WarehouseOffersDTO) GetWarehouseId() int64`

GetWarehouseId returns the WarehouseId field if non-nil, zero value otherwise.

### GetWarehouseIdOk

`func (o *WarehouseOffersDTO) GetWarehouseIdOk() (*int64, bool)`

GetWarehouseIdOk returns a tuple with the WarehouseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarehouseId

`func (o *WarehouseOffersDTO) SetWarehouseId(v int64)`

SetWarehouseId sets WarehouseId field to given value.


### GetOffers

`func (o *WarehouseOffersDTO) GetOffers() []WarehouseOfferDTO`

GetOffers returns the Offers field if non-nil, zero value otherwise.

### GetOffersOk

`func (o *WarehouseOffersDTO) GetOffersOk() (*[]WarehouseOfferDTO, bool)`

GetOffersOk returns a tuple with the Offers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffers

`func (o *WarehouseOffersDTO) SetOffers(v []WarehouseOfferDTO)`

SetOffers sets Offers field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


