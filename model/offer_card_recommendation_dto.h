/*
 * offer_card_recommendation_dto.h
 *
 * Рекомендация по заполнению карточки товара.
 */

#ifndef _offer_card_recommendation_dto_H_
#define _offer_card_recommendation_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_card_recommendation_dto_t offer_card_recommendation_dto_t;

#include "offer_card_recommendation_type.h"

// Enum  for offer_card_recommendation_dto

typedef enum  { _api__offer_card_recommendation_dto__NULL = 0, _api__offer_card_recommendation_dto__HAS_VIDEO, _api__offer_card_recommendation_dto__RECOGNIZED_VENDOR, _api__offer_card_recommendation_dto__MAIN, _api__offer_card_recommendation_dto__ADDITIONAL, _api__offer_card_recommendation_dto__DISTINCTIVE, _api__offer_card_recommendation_dto__FILTERABLE, _api__offer_card_recommendation_dto__PICTURE_COUNT, _api__offer_card_recommendation_dto__HAS_DESCRIPTION, _api__offer_card_recommendation_dto__HAS_BARCODE, _api__offer_card_recommendation_dto__FIRST_PICTURE_SIZE, _api__offer_card_recommendation_dto__TITLE_LENGTH, _api__offer_card_recommendation_dto__DESCRIPTION_LENGTH, _api__offer_card_recommendation_dto__AVERAGE_PICTURE_SIZE, _api__offer_card_recommendation_dto__FIRST_VIDEO_SIZE, _api__offer_card_recommendation_dto__FIRST_VIDEO_LENGTH, _api__offer_card_recommendation_dto__AVERAGE_VIDEO_SIZE, _api__offer_card_recommendation_dto__VIDEO_COUNT } _api__offer_card_recommendation_dto__e;

char* offer_card_recommendation_dto_type_ToString(_api__offer_card_recommendation_dto__e type);

_api__offer_card_recommendation_dto__e offer_card_recommendation_dto_type_FromString(char* type);



typedef struct offer_card_recommendation_dto_t {
    offer_card_recommendation_type_t *type; // custom
    int percent; //numeric

} offer_card_recommendation_dto_t;

offer_card_recommendation_dto_t *offer_card_recommendation_dto_create(
    offer_card_recommendation_type_t *type,
    int percent
);

void offer_card_recommendation_dto_free(offer_card_recommendation_dto_t *offer_card_recommendation_dto);

offer_card_recommendation_dto_t *offer_card_recommendation_dto_parseFromJSON(cJSON *offer_card_recommendation_dtoJSON);

cJSON *offer_card_recommendation_dto_convertToJSON(offer_card_recommendation_dto_t *offer_card_recommendation_dto);

#endif /* _offer_card_recommendation_dto_H_ */

