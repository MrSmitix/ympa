/*
 * get_promo_bestseller_info_dto.h
 *
 * Информация об акции «Бестселлеры Маркета».
 */

#ifndef _get_promo_bestseller_info_dto_H_
#define _get_promo_bestseller_info_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_promo_bestseller_info_dto_t get_promo_bestseller_info_dto_t;




typedef struct get_promo_bestseller_info_dto_t {
    int bestseller; //boolean
    char *entry_deadline; //date time

} get_promo_bestseller_info_dto_t;

get_promo_bestseller_info_dto_t *get_promo_bestseller_info_dto_create(
    int bestseller,
    char *entry_deadline
);

void get_promo_bestseller_info_dto_free(get_promo_bestseller_info_dto_t *get_promo_bestseller_info_dto);

get_promo_bestseller_info_dto_t *get_promo_bestseller_info_dto_parseFromJSON(cJSON *get_promo_bestseller_info_dtoJSON);

cJSON *get_promo_bestseller_info_dto_convertToJSON(get_promo_bestseller_info_dto_t *get_promo_bestseller_info_dto);

#endif /* _get_promo_bestseller_info_dto_H_ */

