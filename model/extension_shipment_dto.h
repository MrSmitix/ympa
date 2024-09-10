/*
 * extension_shipment_dto.h
 *
 * Информация об отгрузке.
 */

#ifndef _extension_shipment_dto_H_
#define _extension_shipment_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct extension_shipment_dto_t extension_shipment_dto_t;

#include "shipment_action_type.h"
#include "shipment_status_change_dto.h"

// Enum  for extension_shipment_dto

typedef enum  { _api__extension_shipment_dto__NULL = 0, _api__extension_shipment_dto__CONFIRM, _api__extension_shipment_dto__DOWNLOAD_ACT, _api__extension_shipment_dto__DOWNLOAD_INBOUND_ACT, _api__extension_shipment_dto__DOWNLOAD_DISCREPANCY_ACT, _api__extension_shipment_dto__CHANGE_PALLETS_COUNT } _api__extension_shipment_dto__e;

char* extension_shipment_dto_available_actions_ToString(_api__extension_shipment_dto__e available_actions);

_api__extension_shipment_dto__e extension_shipment_dto_available_actions_FromString(char* available_actions);



typedef struct extension_shipment_dto_t {
    struct shipment_status_change_dto_t *current_status; //model
    list_t *available_actions; //nonprimitive container

} extension_shipment_dto_t;

extension_shipment_dto_t *extension_shipment_dto_create(
    shipment_status_change_dto_t *current_status,
    list_t *available_actions
);

void extension_shipment_dto_free(extension_shipment_dto_t *extension_shipment_dto);

extension_shipment_dto_t *extension_shipment_dto_parseFromJSON(cJSON *extension_shipment_dtoJSON);

cJSON *extension_shipment_dto_convertToJSON(extension_shipment_dto_t *extension_shipment_dto);

#endif /* _extension_shipment_dto_H_ */

