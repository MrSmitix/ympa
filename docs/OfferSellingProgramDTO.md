# OfferSellingProgramDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SellingProgram** | [**SellingProgramType**](SellingProgramType.md) |  | 
**Status** | [**OfferSellingProgramStatusType**](OfferSellingProgramStatusType.md) |  | 

## Methods

### NewOfferSellingProgramDTO

`func NewOfferSellingProgramDTO(sellingProgram SellingProgramType, status OfferSellingProgramStatusType, ) *OfferSellingProgramDTO`

NewOfferSellingProgramDTO instantiates a new OfferSellingProgramDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOfferSellingProgramDTOWithDefaults

`func NewOfferSellingProgramDTOWithDefaults() *OfferSellingProgramDTO`

NewOfferSellingProgramDTOWithDefaults instantiates a new OfferSellingProgramDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSellingProgram

`func (o *OfferSellingProgramDTO) GetSellingProgram() SellingProgramType`

GetSellingProgram returns the SellingProgram field if non-nil, zero value otherwise.

### GetSellingProgramOk

`func (o *OfferSellingProgramDTO) GetSellingProgramOk() (*SellingProgramType, bool)`

GetSellingProgramOk returns a tuple with the SellingProgram field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSellingProgram

`func (o *OfferSellingProgramDTO) SetSellingProgram(v SellingProgramType)`

SetSellingProgram sets SellingProgram field to given value.


### GetStatus

`func (o *OfferSellingProgramDTO) GetStatus() OfferSellingProgramStatusType`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *OfferSellingProgramDTO) GetStatusOk() (*OfferSellingProgramStatusType, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *OfferSellingProgramDTO) SetStatus(v OfferSellingProgramStatusType)`

SetStatus sets Status field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


