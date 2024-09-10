/*
 * add_offers_to_archive_request.h
 *
 * Товары, которые нужно поместить в архив. 
 */

#ifndef _add_offers_to_archive_request_H_
#define _add_offers_to_archive_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct add_offers_to_archive_request_t add_offers_to_archive_request_t;




typedef struct add_offers_to_archive_request_t {
    list_t *offer_ids; //primitive container

} add_offers_to_archive_request_t;

add_offers_to_archive_request_t *add_offers_to_archive_request_create(
    list_t *offer_ids
);

void add_offers_to_archive_request_free(add_offers_to_archive_request_t *add_offers_to_archive_request);

add_offers_to_archive_request_t *add_offers_to_archive_request_parseFromJSON(cJSON *add_offers_to_archive_requestJSON);

cJSON *add_offers_to_archive_request_convertToJSON(add_offers_to_archive_request_t *add_offers_to_archive_request);

#endif /* _add_offers_to_archive_request_H_ */

