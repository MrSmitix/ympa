/*
 * order_business_documents_dto.h
 *
 * Информация о документах. 
 */

#ifndef _order_business_documents_dto_H_
#define _order_business_documents_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_business_documents_dto_t order_business_documents_dto_t;

#include "document_dto.h"



typedef struct order_business_documents_dto_t {
    struct document_dto_t *upd; //model
    struct document_dto_t *ukd; //model
    struct document_dto_t *torg_twelve; //model
    struct document_dto_t *sf; //model
    struct document_dto_t *ksf; //model

} order_business_documents_dto_t;

order_business_documents_dto_t *order_business_documents_dto_create(
    document_dto_t *upd,
    document_dto_t *ukd,
    document_dto_t *torg_twelve,
    document_dto_t *sf,
    document_dto_t *ksf
);

void order_business_documents_dto_free(order_business_documents_dto_t *order_business_documents_dto);

order_business_documents_dto_t *order_business_documents_dto_parseFromJSON(cJSON *order_business_documents_dtoJSON);

cJSON *order_business_documents_dto_convertToJSON(order_business_documents_dto_t *order_business_documents_dto);

#endif /* _order_business_documents_dto_H_ */

