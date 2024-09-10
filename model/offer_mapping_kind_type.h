/*
 * offer_mapping_kind_type.h
 *
 * Вид маппинга.
 */

#ifndef _offer_mapping_kind_type_H_
#define _offer_mapping_kind_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_mapping_kind_type_t offer_mapping_kind_type_t;


// Enum  for offer_mapping_kind_type

typedef enum { _api__offer_mapping_kind_type__NULL = 0, _api__offer_mapping_kind_type__ACTIVE, _api__offer_mapping_kind_type__ALL } _api__offer_mapping_kind_type__e;

char* offer_mapping_kind_type_offer_mapping_kind_type_ToString(_api__offer_mapping_kind_type__e offer_mapping_kind_type);

_api__offer_mapping_kind_type__e offer_mapping_kind_type_offer_mapping_kind_type_FromString(char* offer_mapping_kind_type);

//cJSON *offer_mapping_kind_type_offer_mapping_kind_type_convertToJSON(_api__offer_mapping_kind_type__e offer_mapping_kind_type);

//_api__offer_mapping_kind_type__e offer_mapping_kind_type_offer_mapping_kind_type_parseFromJSON(cJSON *offer_mapping_kind_typeJSON);

#endif /* _offer_mapping_kind_type_H_ */

