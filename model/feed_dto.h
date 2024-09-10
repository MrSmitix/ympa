/*
 * feed_dto.h
 *
 * Информация о прайс-листе.
 */

#ifndef _feed_dto_H_
#define _feed_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_dto_t feed_dto_t;

#include "feed_content_dto.h"
#include "feed_download_dto.h"
#include "feed_placement_dto.h"
#include "feed_publication_dto.h"



typedef struct feed_dto_t {
    long id; //numeric
    char *login; // string
    char *name; // string
    char *password; // string
    char *upload_date; //date time
    char *url; // string
    struct feed_content_dto_t *content; //model
    struct feed_download_dto_t *download; //model
    struct feed_placement_dto_t *placement; //model
    struct feed_publication_dto_t *publication; //model

} feed_dto_t;

feed_dto_t *feed_dto_create(
    long id,
    char *login,
    char *name,
    char *password,
    char *upload_date,
    char *url,
    feed_content_dto_t *content,
    feed_download_dto_t *download,
    feed_placement_dto_t *placement,
    feed_publication_dto_t *publication
);

void feed_dto_free(feed_dto_t *feed_dto);

feed_dto_t *feed_dto_parseFromJSON(cJSON *feed_dtoJSON);

cJSON *feed_dto_convertToJSON(feed_dto_t *feed_dto);

#endif /* _feed_dto_H_ */

