/*
 * delete_promo_offers_result_dto.h
 *
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
 */

#ifndef _delete_promo_offers_result_dto_H_
#define _delete_promo_offers_result_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_promo_offers_result_dto_t delete_promo_offers_result_dto_t;

#include "rejected_promo_offer_delete_dto.h"



typedef struct delete_promo_offers_result_dto_t {
    list_t *rejected_offers; //nonprimitive container

} delete_promo_offers_result_dto_t;

delete_promo_offers_result_dto_t *delete_promo_offers_result_dto_create(
    list_t *rejected_offers
);

void delete_promo_offers_result_dto_free(delete_promo_offers_result_dto_t *delete_promo_offers_result_dto);

delete_promo_offers_result_dto_t *delete_promo_offers_result_dto_parseFromJSON(cJSON *delete_promo_offers_result_dtoJSON);

cJSON *delete_promo_offers_result_dto_convertToJSON(delete_promo_offers_result_dto_t *delete_promo_offers_result_dto);

#endif /* _delete_promo_offers_result_dto_H_ */

