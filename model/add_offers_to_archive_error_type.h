/*
 * add_offers_to_archive_error_type.h
 *
 * Причина, по которой товар не удалось поместить в архив:  * &#x60;OFFER_HAS_STOCKS&#x60; — товар хранится на складе Маркета. 
 */

#ifndef _add_offers_to_archive_error_type_H_
#define _add_offers_to_archive_error_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct add_offers_to_archive_error_type_t add_offers_to_archive_error_type_t;


// Enum  for add_offers_to_archive_error_type

typedef enum { _api__add_offers_to_archive_error_type__NULL = 0, _api__add_offers_to_archive_error_type__OFFER_HAS_STOCKS, _api__add_offers_to_archive_error_type__UNKNOWN } _api__add_offers_to_archive_error_type__e;

char* add_offers_to_archive_error_type_add_offers_to_archive_error_type_ToString(_api__add_offers_to_archive_error_type__e add_offers_to_archive_error_type);

_api__add_offers_to_archive_error_type__e add_offers_to_archive_error_type_add_offers_to_archive_error_type_FromString(char* add_offers_to_archive_error_type);

//cJSON *add_offers_to_archive_error_type_add_offers_to_archive_error_type_convertToJSON(_api__add_offers_to_archive_error_type__e add_offers_to_archive_error_type);

//_api__add_offers_to_archive_error_type__e add_offers_to_archive_error_type_add_offers_to_archive_error_type_parseFromJSON(cJSON *add_offers_to_archive_error_typeJSON);

#endif /* _add_offers_to_archive_error_type_H_ */

