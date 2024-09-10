/*
 * feed_publication_full_dto.h
 *
 * Информация о последней публикации предложений из прайс-листа на Маркете. 
 */

#ifndef _feed_publication_full_dto_H_
#define _feed_publication_full_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_publication_full_dto_t feed_publication_full_dto_t;




typedef struct feed_publication_full_dto_t {
    char *file_time; //date time
    char *published_time; //date time

} feed_publication_full_dto_t;

feed_publication_full_dto_t *feed_publication_full_dto_create(
    char *file_time,
    char *published_time
);

void feed_publication_full_dto_free(feed_publication_full_dto_t *feed_publication_full_dto);

feed_publication_full_dto_t *feed_publication_full_dto_parseFromJSON(cJSON *feed_publication_full_dtoJSON);

cJSON *feed_publication_full_dto_convertToJSON(feed_publication_full_dto_t *feed_publication_full_dto);

#endif /* _feed_publication_full_dto_H_ */

