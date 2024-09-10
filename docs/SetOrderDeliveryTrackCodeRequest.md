
# Table `SetOrderDeliveryTrackCodeRequest`
(mapped from: SetOrderDeliveryTrackCodeRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**trackCode** | trackCode | text NOT NULL |  | **kotlin.String** | Трек‑номер посылки. | 
**deliveryServiceId** | deliveryServiceId | long NOT NULL |  | **kotlin.Long** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 




