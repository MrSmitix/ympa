
# Table `AddOffersToArchiveDTO`
(mapped from: AddOffersToArchiveDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**notArchivedOffers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AddOffersToArchiveErrorDTO&gt;**](AddOffersToArchiveErrorDTO.md) | Список товаров, которые не удалось поместить в архив. |  [optional]


# **Table `AddOffersToArchiveDTOAddOffersToArchiveErrorDTO`**
(mapped from: AddOffersToArchiveDTOAddOffersToArchiveErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
addOffersToArchiveDTO | addOffersToArchiveDTO | long | | kotlin.Long | Primary Key | *one*
addOffersToArchiveErrorDTO | addOffersToArchiveErrorDTO | long | | kotlin.Long | Foreign Key | *many*



