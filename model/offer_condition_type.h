/*
 * offer_condition_type.h
 *
 * Тип уценки:  * &#x60;PREOWNED&#x60; —  бывший в употреблении товар, раньше принадлежал другому человеку. * &#x60;SHOWCASESAMPLE&#x60; — витринный образец. * &#x60;REFURBISHED&#x60; — повторная продажа товара. * &#x60;REDUCTION&#x60; — товар с дефектами. * &#x60;RENOVATED&#x60; — восстановленный товар. * &#x60;NOT_SPECIFIED&#x60; — не выбран.  &#x60;REFURBISHED&#x60; — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
 */

#ifndef _offer_condition_type_H_
#define _offer_condition_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_condition_type_t offer_condition_type_t;


// Enum  for offer_condition_type

typedef enum { _api__offer_condition_type__NULL = 0, _api__offer_condition_type__PREOWNED, _api__offer_condition_type__SHOWCASESAMPLE, _api__offer_condition_type__REFURBISHED, _api__offer_condition_type__REDUCTION, _api__offer_condition_type__RENOVATED, _api__offer_condition_type__NOT_SPECIFIED } _api__offer_condition_type__e;

char* offer_condition_type_offer_condition_type_ToString(_api__offer_condition_type__e offer_condition_type);

_api__offer_condition_type__e offer_condition_type_offer_condition_type_FromString(char* offer_condition_type);

//cJSON *offer_condition_type_offer_condition_type_convertToJSON(_api__offer_condition_type__e offer_condition_type);

//_api__offer_condition_type__e offer_condition_type_offer_condition_type_parseFromJSON(cJSON *offer_condition_typeJSON);

#endif /* _offer_condition_type_H_ */

