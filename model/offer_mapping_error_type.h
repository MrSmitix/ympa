/*
 * offer_mapping_error_type.h
 *
 * Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_MISMATCH&#x60; — указана категория, которая не совпадает с категорией товара. * &#x60;EMPTY_MARKET_CATEGORY&#x60; — не указана категория Маркета при передаче характеристик категории. * &#x60;UNKNOWN_PARAMETER&#x60; — передана характеристика, которой нет среди характеристик категории. * &#x60;UNEXPECTED_BOOLEAN_VALUE&#x60; — вместо boolean-значения передано что-то другое. * &#x60;NUMBER_FORMAT&#x60; — передана строка, не обозначающая число, вместо числа. * &#x60;VALUE_BLANK&#x60; — передано пустое значение. * &#x60;INVALID_UNIT_ID&#x60; — передана единица измерения, недопустимая для характеристики. * &#x60;INVALID_GROUP_ID_LENGTH&#x60; — в названии превышено допустимое значение символов — 255. * &#x60;INVALID_GROUP_ID_CHARACTERS&#x60; — переданы [недопустимые символы](*ascii-code). * &#x60;INVALID_PICKER_URL&#x60; — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара. 
 */

#ifndef _offer_mapping_error_type_H_
#define _offer_mapping_error_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct offer_mapping_error_type_t offer_mapping_error_type_t;


// Enum  for offer_mapping_error_type

typedef enum { _api__offer_mapping_error_type__NULL = 0, _api__offer_mapping_error_type__UNKNOWN_CATEGORY, _api__offer_mapping_error_type__CATEGORY_MISMATCH, _api__offer_mapping_error_type__EMPTY_MARKET_CATEGORY, _api__offer_mapping_error_type__UNKNOWN_PARAMETER, _api__offer_mapping_error_type__UNEXPECTED_BOOLEAN_VALUE, _api__offer_mapping_error_type__NUMBER_FORMAT, _api__offer_mapping_error_type__VALUE_BLANK, _api__offer_mapping_error_type__INVALID_UNIT_ID, _api__offer_mapping_error_type__INVALID_GROUP_ID_LENGTH, _api__offer_mapping_error_type__INVALID_GROUP_ID_CHARACTERS, _api__offer_mapping_error_type__INVALID_PICKER_URL } _api__offer_mapping_error_type__e;

char* offer_mapping_error_type_offer_mapping_error_type_ToString(_api__offer_mapping_error_type__e offer_mapping_error_type);

_api__offer_mapping_error_type__e offer_mapping_error_type_offer_mapping_error_type_FromString(char* offer_mapping_error_type);

//cJSON *offer_mapping_error_type_offer_mapping_error_type_convertToJSON(_api__offer_mapping_error_type__e offer_mapping_error_type);

//_api__offer_mapping_error_type__e offer_mapping_error_type_offer_mapping_error_type_parseFromJSON(cJSON *offer_mapping_error_typeJSON);

#endif /* _offer_mapping_error_type_H_ */

