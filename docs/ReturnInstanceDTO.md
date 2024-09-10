# ReturnInstanceDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StockType** | Pointer to [**ReturnInstanceStockType**](ReturnInstanceStockType.md) |  | [optional] 
**Status** | Pointer to [**ReturnInstanceStatusType**](ReturnInstanceStatusType.md) |  | [optional] 
**Cis** | Pointer to **string** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] 
**Imei** | Pointer to **string** | Международный идентификатор мобильного оборудования. | [optional] 

## Methods

### NewReturnInstanceDTO

`func NewReturnInstanceDTO() *ReturnInstanceDTO`

NewReturnInstanceDTO instantiates a new ReturnInstanceDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReturnInstanceDTOWithDefaults

`func NewReturnInstanceDTOWithDefaults() *ReturnInstanceDTO`

NewReturnInstanceDTOWithDefaults instantiates a new ReturnInstanceDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStockType

`func (o *ReturnInstanceDTO) GetStockType() ReturnInstanceStockType`

GetStockType returns the StockType field if non-nil, zero value otherwise.

### GetStockTypeOk

`func (o *ReturnInstanceDTO) GetStockTypeOk() (*ReturnInstanceStockType, bool)`

GetStockTypeOk returns a tuple with the StockType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStockType

`func (o *ReturnInstanceDTO) SetStockType(v ReturnInstanceStockType)`

SetStockType sets StockType field to given value.

### HasStockType

`func (o *ReturnInstanceDTO) HasStockType() bool`

HasStockType returns a boolean if a field has been set.

### GetStatus

`func (o *ReturnInstanceDTO) GetStatus() ReturnInstanceStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ReturnInstanceDTO) GetStatusOk() (*ReturnInstanceStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ReturnInstanceDTO) SetStatus(v ReturnInstanceStatusType)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ReturnInstanceDTO) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetCis

`func (o *ReturnInstanceDTO) GetCis() string`

GetCis returns the Cis field if non-nil, zero value otherwise.

### GetCisOk

`func (o *ReturnInstanceDTO) GetCisOk() (*string, bool)`

GetCisOk returns a tuple with the Cis field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCis

`func (o *ReturnInstanceDTO) SetCis(v string)`

SetCis sets Cis field to given value.

### HasCis

`func (o *ReturnInstanceDTO) HasCis() bool`

HasCis returns a boolean if a field has been set.

### GetImei

`func (o *ReturnInstanceDTO) GetImei() string`

GetImei returns the Imei field if non-nil, zero value otherwise.

### GetImeiOk

`func (o *ReturnInstanceDTO) GetImeiOk() (*string, bool)`

GetImeiOk returns a tuple with the Imei field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImei

`func (o *ReturnInstanceDTO) SetImei(v string)`

SetImei sets Imei field to given value.

### HasImei

`func (o *ReturnInstanceDTO) HasImei() bool`

HasImei returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


