/*
 * offer_type.h
 *
 * Особый тип товара:  * &#x60;MEDICINE&#x60; — лекарства. * &#x60;BOOK&#x60; — бумажные и электронные книги. * &#x60;AUDIOBOOK&#x60; — аудиокниги. * &#x60;ARTIST_TITLE&#x60; — музыкальная и видеопродукция. * &#x60;ON_DEMAND&#x60; — товары на заказ.  {% note info \&quot;Если ваш товар — книга\&quot; %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
 */

#ifndef _offer_type_H_
#define _offer_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_type_t offer_type_t;


// Enum  for offer_type

typedef enum { _api__offer_type__NULL = 0, _api__offer_type___DEFAULT, _api__offer_type__MEDICINE, _api__offer_type__BOOK, _api__offer_type__AUDIOBOOK, _api__offer_type__ARTIST_TITLE, _api__offer_type__ON_DEMAND } _api__offer_type__e;

char* offer_type_offer_type_ToString(_api__offer_type__e offer_type);

_api__offer_type__e offer_type_offer_type_FromString(char* offer_type);

//cJSON *offer_type_offer_type_convertToJSON(_api__offer_type__e offer_type);

//_api__offer_type__e offer_type_offer_type_parseFromJSON(cJSON *offer_typeJSON);

#endif /* _offer_type_H_ */

