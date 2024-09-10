/*
 * price_suggest_type.h
 *
 * Тип цены:  * &#x60;BUYBOX&#x60; — самая низкая цена на товар, по которой он продается сейчас. Эта цена обновляется в режиме реального времени. Если вы установите цену ниже, начнет показываться ваше предложение. Если для этого значения в параметре &#x60;price&#x60; указана цена, которая совпадает с вашей, значит, ваш товар уже показывается на витрине. Если кроме вас этот товар продают другие продавцы по такой же цене, их предложения также будут отображаться вместе с вашими по очереди. * &#x60;DEFAULT_OFFER&#x60; — рекомендованная Маркетом цена, которая привлекает покупателей. Рассчитывается только для популярных на сервисе товаров и обновляется раз в четыре часа. * &#x60;MIN_PRICE_MARKET&#x60; — минимальная цена на Маркете. Самая низкая цена среди всех предложений товара на Маркете во всех регионах, включая те, которые не видны на витрине. Эта цена обновляется в режиме реального времени и обеспечивает большее количество показов на Маркете, чем самая низкая или рекомендованная цена. 
 */

#ifndef _price_suggest_type_H_
#define _price_suggest_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct price_suggest_type_t price_suggest_type_t;


// Enum  for price_suggest_type

typedef enum { _api__price_suggest_type__NULL = 0, _api__price_suggest_type__BUYBOX, _api__price_suggest_type__DEFAULT_OFFER, _api__price_suggest_type__MIN_PRICE_MARKET } _api__price_suggest_type__e;

char* price_suggest_type_price_suggest_type_ToString(_api__price_suggest_type__e price_suggest_type);

_api__price_suggest_type__e price_suggest_type_price_suggest_type_FromString(char* price_suggest_type);

//cJSON *price_suggest_type_price_suggest_type_convertToJSON(_api__price_suggest_type__e price_suggest_type);

//_api__price_suggest_type__e price_suggest_type_price_suggest_type_parseFromJSON(cJSON *price_suggest_typeJSON);

#endif /* _price_suggest_type_H_ */

