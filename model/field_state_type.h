/*
 * field_state_type.h
 *
 * Фильтр по заполненности или незаполненности поля:  * &#x60;SPECIFIED&#x60; — вывести товары, у которых поле заполнено. * &#x60;EMPTY&#x60; — вывести товары, у которых поле не заполнено. 
 */

#ifndef _field_state_type_H_
#define _field_state_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct field_state_type_t field_state_type_t;


// Enum  for field_state_type

typedef enum { _api__field_state_type__NULL = 0, _api__field_state_type__SPECIFIED, _api__field_state_type__EMPTY } _api__field_state_type__e;

char* field_state_type_field_state_type_ToString(_api__field_state_type__e field_state_type);

_api__field_state_type__e field_state_type_field_state_type_FromString(char* field_state_type);

//cJSON *field_state_type_field_state_type_convertToJSON(_api__field_state_type__e field_state_type);

//_api__field_state_type__e field_state_type_field_state_type_parseFromJSON(cJSON *field_state_typeJSON);

#endif /* _field_state_type_H_ */

