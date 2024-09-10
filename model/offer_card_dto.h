/*
 * offer_card_dto.h
 *
 * Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 */

#ifndef _offer_card_dto_H_
#define _offer_card_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_card_dto_t offer_card_dto_t;

#include "get_mapping_dto.h"
#include "offer_card_recommendation_dto.h"
#include "offer_card_status_type.h"
#include "offer_error_dto.h"
#include "parameter_value_dto.h"

// Enum  for offer_card_dto

typedef enum  { _api__offer_card_dto__NULL = 0, _api__offer_card_dto__HAS_CARD_CAN_NOT_UPDATE, _api__offer_card_dto__HAS_CARD_CAN_UPDATE, _api__offer_card_dto__HAS_CARD_CAN_UPDATE_ERRORS, _api__offer_card_dto__HAS_CARD_CAN_UPDATE_PROCESSING, _api__offer_card_dto__NO_CARD_NEED_CONTENT, _api__offer_card_dto__NO_CARD_MARKET_WILL_CREATE, _api__offer_card_dto__NO_CARD_ERRORS, _api__offer_card_dto__NO_CARD_PROCESSING, _api__offer_card_dto__NO_CARD_ADD_TO_CAMPAIGN } _api__offer_card_dto__e;

char* offer_card_dto_card_status_ToString(_api__offer_card_dto__e card_status);

_api__offer_card_dto__e offer_card_dto_card_status_FromString(char* card_status);



typedef struct offer_card_dto_t {
    char *offer_id; // string
    struct get_mapping_dto_t *mapping; //model
    list_t *parameter_values; //nonprimitive container
    offer_card_status_type_t *card_status; // custom
    int content_rating; //numeric
    list_t *recommendations; //nonprimitive container
    list_t *errors; //nonprimitive container
    list_t *warnings; //nonprimitive container

} offer_card_dto_t;

offer_card_dto_t *offer_card_dto_create(
    char *offer_id,
    get_mapping_dto_t *mapping,
    list_t *parameter_values,
    offer_card_status_type_t *card_status,
    int content_rating,
    list_t *recommendations,
    list_t *errors,
    list_t *warnings
);

void offer_card_dto_free(offer_card_dto_t *offer_card_dto);

offer_card_dto_t *offer_card_dto_parseFromJSON(cJSON *offer_card_dtoJSON);

cJSON *offer_card_dto_convertToJSON(offer_card_dto_t *offer_card_dto);

#endif /* _offer_card_dto_H_ */

