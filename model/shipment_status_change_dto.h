/*
 * shipment_status_change_dto.h
 *
 * Статус отгрузки.
 */

#ifndef _shipment_status_change_dto_H_
#define _shipment_status_change_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shipment_status_change_dto_t shipment_status_change_dto_t;

#include "shipment_status_type.h"

// Enum  for shipment_status_change_dto

typedef enum  { _api__shipment_status_change_dto__NULL = 0, _api__shipment_status_change_dto__OUTBOUND_CREATED, _api__shipment_status_change_dto__OUTBOUND_READY_FOR_CONFIRMATION, _api__shipment_status_change_dto__OUTBOUND_CONFIRMED, _api__shipment_status_change_dto__OUTBOUND_SIGNED, _api__shipment_status_change_dto__FINISHED, _api__shipment_status_change_dto__ACCEPTED, _api__shipment_status_change_dto__ACCEPTED_WITH_DISCREPANCIES, _api__shipment_status_change_dto__ERROR } _api__shipment_status_change_dto__e;

char* shipment_status_change_dto_status_ToString(_api__shipment_status_change_dto__e status);

_api__shipment_status_change_dto__e shipment_status_change_dto_status_FromString(char* status);



typedef struct shipment_status_change_dto_t {
    shipment_status_type_t *status; // custom
    char *description; // string
    char *update_time; //date time

} shipment_status_change_dto_t;

shipment_status_change_dto_t *shipment_status_change_dto_create(
    shipment_status_type_t *status,
    char *description,
    char *update_time
);

void shipment_status_change_dto_free(shipment_status_change_dto_t *shipment_status_change_dto);

shipment_status_change_dto_t *shipment_status_change_dto_parseFromJSON(cJSON *shipment_status_change_dtoJSON);

cJSON *shipment_status_change_dto_convertToJSON(shipment_status_change_dto_t *shipment_status_change_dto);

#endif /* _shipment_status_change_dto_H_ */

