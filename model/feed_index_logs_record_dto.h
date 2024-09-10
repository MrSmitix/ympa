/*
 * feed_index_logs_record_dto.h
 *
 * Список отчетов по индексации прайс-листа.
 */

#ifndef _feed_index_logs_record_dto_H_
#define _feed_index_logs_record_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_index_logs_record_dto_t feed_index_logs_record_dto_t;

#include "feed_index_logs_error_dto.h"
#include "feed_index_logs_index_type.h"
#include "feed_index_logs_offers_dto.h"
#include "feed_index_logs_status_type.h"

// Enum  for feed_index_logs_record_dto

typedef enum  { _api__feed_index_logs_record_dto__NULL = 0, _api__feed_index_logs_record_dto__DIFF, _api__feed_index_logs_record_dto__FAST_PRICE, _api__feed_index_logs_record_dto__FULL } _api__feed_index_logs_record_dto__e;

char* feed_index_logs_record_dto_index_type_ToString(_api__feed_index_logs_record_dto__e index_type);

_api__feed_index_logs_record_dto__e feed_index_logs_record_dto_index_type_FromString(char* index_type);

// Enum  for feed_index_logs_record_dto

typedef enum  { _api__feed_index_logs_record_dto__NULL = 0, _api__feed_index_logs_record_dto__ERROR, _api__feed_index_logs_record_dto__OK, _api__feed_index_logs_record_dto__WARNING } _api__feed_index_logs_record_dto__e;

char* feed_index_logs_record_dto_status_ToString(_api__feed_index_logs_record_dto__e status);

_api__feed_index_logs_record_dto__e feed_index_logs_record_dto_status_FromString(char* status);



typedef struct feed_index_logs_record_dto_t {
    char *download_time; //date time
    char *file_time; //date time
    long generation_id; //numeric
    feed_index_logs_index_type_t *index_type; // custom
    char *published_time; //date time
    feed_index_logs_status_type_t *status; // custom
    struct feed_index_logs_error_dto_t *error; //model
    struct feed_index_logs_offers_dto_t *offers; //model

} feed_index_logs_record_dto_t;

feed_index_logs_record_dto_t *feed_index_logs_record_dto_create(
    char *download_time,
    char *file_time,
    long generation_id,
    feed_index_logs_index_type_t *index_type,
    char *published_time,
    feed_index_logs_status_type_t *status,
    feed_index_logs_error_dto_t *error,
    feed_index_logs_offers_dto_t *offers
);

void feed_index_logs_record_dto_free(feed_index_logs_record_dto_t *feed_index_logs_record_dto);

feed_index_logs_record_dto_t *feed_index_logs_record_dto_parseFromJSON(cJSON *feed_index_logs_record_dtoJSON);

cJSON *feed_index_logs_record_dto_convertToJSON(feed_index_logs_record_dto_t *feed_index_logs_record_dto);

#endif /* _feed_index_logs_record_dto_H_ */

