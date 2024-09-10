/*
 * document_dto.h
 *
 * Информация о документе.
 */

#ifndef _document_dto_H_
#define _document_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct document_dto_t document_dto_t;

#include "order_document_status_type.h"

// Enum  for document_dto

typedef enum  { _api__document_dto__NULL = 0, _api__document_dto__READY, _api__document_dto__NOT_READY } _api__document_dto__e;

char* document_dto_status_ToString(_api__document_dto__e status);

_api__document_dto__e document_dto_status_FromString(char* status);



typedef struct document_dto_t {
    order_document_status_type_t *status; // custom
    char *number; // string
    char *date; //date

} document_dto_t;

document_dto_t *document_dto_create(
    order_document_status_type_t *status,
    char *number,
    char *date
);

void document_dto_free(document_dto_t *document_dto);

document_dto_t *document_dto_parseFromJSON(cJSON *document_dtoJSON);

cJSON *document_dto_convertToJSON(document_dto_t *document_dto);

#endif /* _document_dto_H_ */

