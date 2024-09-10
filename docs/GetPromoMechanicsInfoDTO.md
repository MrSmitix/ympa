# GetPromoMechanicsInfoDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**MechanicsType**](MechanicsType.md) |  | 
**PromocodeInfo** | Pointer to [**GetPromoPromocodeInfoDTO**](GetPromoPromocodeInfoDTO.md) |  | [optional] 

## Methods

### NewGetPromoMechanicsInfoDTO

`func NewGetPromoMechanicsInfoDTO(type_ MechanicsType, ) *GetPromoMechanicsInfoDTO`

NewGetPromoMechanicsInfoDTO instantiates a new GetPromoMechanicsInfoDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromoMechanicsInfoDTOWithDefaults

`func NewGetPromoMechanicsInfoDTOWithDefaults() *GetPromoMechanicsInfoDTO`

NewGetPromoMechanicsInfoDTOWithDefaults instantiates a new GetPromoMechanicsInfoDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *GetPromoMechanicsInfoDTO) GetType() MechanicsType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *GetPromoMechanicsInfoDTO) GetTypeOk() (*MechanicsType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *GetPromoMechanicsInfoDTO) SetType(v MechanicsType)`

SetType sets Type field to given value.


### GetPromocodeInfo

`func (o *GetPromoMechanicsInfoDTO) GetPromocodeInfo() GetPromoPromocodeInfoDTO`

GetPromocodeInfo returns the PromocodeInfo field if non-nil, zero value otherwise.

### GetPromocodeInfoOk

`func (o *GetPromoMechanicsInfoDTO) GetPromocodeInfoOk() (*GetPromoPromocodeInfoDTO, bool)`

GetPromocodeInfoOk returns a tuple with the PromocodeInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromocodeInfo

`func (o *GetPromoMechanicsInfoDTO) SetPromocodeInfo(v GetPromoPromocodeInfoDTO)`

SetPromocodeInfo sets PromocodeInfo field to given value.

### HasPromocodeInfo

`func (o *GetPromoMechanicsInfoDTO) HasPromocodeInfo() bool`

HasPromocodeInfo returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


