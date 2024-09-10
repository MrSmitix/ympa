
# Table `DeliveryServicesDTO`
(mapped from: DeliveryServicesDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**deliveryService** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeliveryServiceInfoDTO&gt;**](DeliveryServiceInfoDTO.md) | Информация о службе доставки. | 


# **Table `DeliveryServicesDTODeliveryServiceInfoDTO`**
(mapped from: DeliveryServicesDTODeliveryServiceInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deliveryServicesDTO | deliveryServicesDTO | long | | kotlin.Long | Primary Key | *one*
deliveryServiceInfoDTO | deliveryServiceInfoDTO | long | | kotlin.Long | Foreign Key | *many*



