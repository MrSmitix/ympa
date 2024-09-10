/*
 * delete_offers_from_archive_request.h
 *
 * Товары, которые нужно восстановить из архива. 
 */

#ifndef _delete_offers_from_archive_request_H_
#define _delete_offers_from_archive_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_offers_from_archive_request_t delete_offers_from_archive_request_t;




typedef struct delete_offers_from_archive_request_t {
    list_t *offer_ids; //primitive container

} delete_offers_from_archive_request_t;

delete_offers_from_archive_request_t *delete_offers_from_archive_request_create(
    list_t *offer_ids
);

void delete_offers_from_archive_request_free(delete_offers_from_archive_request_t *delete_offers_from_archive_request);

delete_offers_from_archive_request_t *delete_offers_from_archive_request_parseFromJSON(cJSON *delete_offers_from_archive_requestJSON);

cJSON *delete_offers_from_archive_request_convertToJSON(delete_offers_from_archive_request_t *delete_offers_from_archive_request);

#endif /* _delete_offers_from_archive_request_H_ */

