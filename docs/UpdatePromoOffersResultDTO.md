
# Table `UpdatePromoOffersResultDTO`
(mapped from: UpdatePromoOffersResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**rejectedOffers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RejectedPromoOfferUpdateDTO&gt;**](RejectedPromoOfferUpdateDTO.md) | Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  |  [optional]
**warningOffers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;WarningPromoOfferUpdateDTO&gt;**](WarningPromoOfferUpdateDTO.md) | Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  |  [optional]


# **Table `UpdatePromoOffersResultDTORejectedPromoOfferUpdateDTO`**
(mapped from: UpdatePromoOffersResultDTORejectedPromoOfferUpdateDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updatePromoOffersResultDTO | updatePromoOffersResultDTO | long | | kotlin.Long | Primary Key | *one*
rejectedPromoOfferUpdateDTO | rejectedPromoOfferUpdateDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `UpdatePromoOffersResultDTOWarningPromoOfferUpdateDTO`**
(mapped from: UpdatePromoOffersResultDTOWarningPromoOfferUpdateDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updatePromoOffersResultDTO | updatePromoOffersResultDTO | long | | kotlin.Long | Primary Key | *one*
warningPromoOfferUpdateDTO | warningPromoOfferUpdateDTO | long | | kotlin.Long | Foreign Key | *many*



