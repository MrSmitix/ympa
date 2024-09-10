package models
// ShipmentStatusType : Статус отгрузки:  * `OUTBOUND_CREATED` — формируется. * `OUTBOUND_READY_FOR_CONFIRMATION` — можно обрабатывать. * `OUTBOUND_CONFIRMED` — подтверждена и готова к отправке. * `OUTBOUND_SIGNED` — по ней подписан электронный акт приема-передачи. * `ACCEPTED` — принята в сортировочном центре или пункте приема. * `ACCEPTED_WITH_DISCREPANCIES` — принята с расхождениями. * `FINISHED` — завершена. * `ERROR` — отменена из-за ошибки. 
type ShipmentStatusType string

// List of ShipmentStatusType
const (
	OUTBOUND_CREATED ShipmentStatusType = "OUTBOUND_CREATED"
	OUTBOUND_READY_FOR_CONFIRMATION ShipmentStatusType = "OUTBOUND_READY_FOR_CONFIRMATION"
	OUTBOUND_CONFIRMED ShipmentStatusType = "OUTBOUND_CONFIRMED"
	OUTBOUND_SIGNED ShipmentStatusType = "OUTBOUND_SIGNED"
	FINISHED ShipmentStatusType = "FINISHED"
	ACCEPTED ShipmentStatusType = "ACCEPTED"
	ACCEPTED_WITH_DISCREPANCIES ShipmentStatusType = "ACCEPTED_WITH_DISCREPANCIES"
	ERROR ShipmentStatusType = "ERROR"
)
