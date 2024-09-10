# SearchShipmentsResponseDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Shipments** | [**[]ShipmentInfoDTO**](ShipmentInfoDTO.md) | Список с информацией об отгрузках. | 
**Paging** | Pointer to [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Methods

### NewSearchShipmentsResponseDTO

`func NewSearchShipmentsResponseDTO(shipments []ShipmentInfoDTO, ) *SearchShipmentsResponseDTO`

NewSearchShipmentsResponseDTO instantiates a new SearchShipmentsResponseDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSearchShipmentsResponseDTOWithDefaults

`func NewSearchShipmentsResponseDTOWithDefaults() *SearchShipmentsResponseDTO`

NewSearchShipmentsResponseDTOWithDefaults instantiates a new SearchShipmentsResponseDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetShipments

`func (o *SearchShipmentsResponseDTO) GetShipments() []ShipmentInfoDTO`

GetShipments returns the Shipments field if non-nil, zero value otherwise.

### GetShipmentsOk

`func (o *SearchShipmentsResponseDTO) GetShipmentsOk() (*[]ShipmentInfoDTO, bool)`

GetShipmentsOk returns a tuple with the Shipments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShipments

`func (o *SearchShipmentsResponseDTO) SetShipments(v []ShipmentInfoDTO)`

SetShipments sets Shipments field to given value.


### GetPaging

`func (o *SearchShipmentsResponseDTO) GetPaging() ForwardScrollingPagerDTO`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *SearchShipmentsResponseDTO) GetPagingOk() (*ForwardScrollingPagerDTO, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *SearchShipmentsResponseDTO) SetPaging(v ForwardScrollingPagerDTO)`

SetPaging sets Paging field to given value.

### HasPaging

`func (o *SearchShipmentsResponseDTO) HasPaging() bool`

HasPaging returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


