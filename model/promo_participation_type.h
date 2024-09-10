/*
 * promo_participation_type.h
 *
 * Какие акции вернутся:  * &#x60;PARTICIPATING_NOW&#x60; — текущие и будущие акции продавца.  * &#x60;PARTICIPATED&#x60; — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
 */

#ifndef _promo_participation_type_H_
#define _promo_participation_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promo_participation_type_t promo_participation_type_t;


// Enum  for promo_participation_type

typedef enum { _api__promo_participation_type__NULL = 0, _api__promo_participation_type__PARTICIPATING_NOW, _api__promo_participation_type__PARTICIPATED } _api__promo_participation_type__e;

char* promo_participation_type_promo_participation_type_ToString(_api__promo_participation_type__e promo_participation_type);

_api__promo_participation_type__e promo_participation_type_promo_participation_type_FromString(char* promo_participation_type);

//cJSON *promo_participation_type_promo_participation_type_convertToJSON(_api__promo_participation_type__e promo_participation_type);

//_api__promo_participation_type__e promo_participation_type_promo_participation_type_parseFromJSON(cJSON *promo_participation_typeJSON);

#endif /* _promo_participation_type_H_ */

