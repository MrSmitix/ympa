# GetPromoOffersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PromoId** | **string** | Идентификатор акции. | 
**StatusType** | Pointer to [**PromoOfferParticipationStatusFilterType**](PromoOfferParticipationStatusFilterType.md) |  | [optional] 

## Methods

### NewGetPromoOffersRequest

`func NewGetPromoOffersRequest(promoId string, ) *GetPromoOffersRequest`

NewGetPromoOffersRequest instantiates a new GetPromoOffersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPromoOffersRequestWithDefaults

`func NewGetPromoOffersRequestWithDefaults() *GetPromoOffersRequest`

NewGetPromoOffersRequestWithDefaults instantiates a new GetPromoOffersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPromoId

`func (o *GetPromoOffersRequest) GetPromoId() string`

GetPromoId returns the PromoId field if non-nil, zero value otherwise.

### GetPromoIdOk

`func (o *GetPromoOffersRequest) GetPromoIdOk() (*string, bool)`

GetPromoIdOk returns a tuple with the PromoId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromoId

`func (o *GetPromoOffersRequest) SetPromoId(v string)`

SetPromoId sets PromoId field to given value.


### GetStatusType

`func (o *GetPromoOffersRequest) GetStatusType() PromoOfferParticipationStatusFilterType`

GetStatusType returns the StatusType field if non-nil, zero value otherwise.

### GetStatusTypeOk

`func (o *GetPromoOffersRequest) GetStatusTypeOk() (*PromoOfferParticipationStatusFilterType, bool)`

GetStatusTypeOk returns a tuple with the StatusType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusType

`func (o *GetPromoOffersRequest) SetStatusType(v PromoOfferParticipationStatusFilterType)`

SetStatusType sets StatusType field to given value.

### HasStatusType

`func (o *GetPromoOffersRequest) HasStatusType() bool`

HasStatusType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


