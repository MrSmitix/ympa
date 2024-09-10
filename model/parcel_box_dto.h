/*
 * parcel_box_dto.h
 *
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 */

#ifndef _parcel_box_dto_H_
#define _parcel_box_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct parcel_box_dto_t parcel_box_dto_t;




typedef struct parcel_box_dto_t {
    long id; //numeric
    char *fulfilment_id; // string

} parcel_box_dto_t;

parcel_box_dto_t *parcel_box_dto_create(
    long id,
    char *fulfilment_id
);

void parcel_box_dto_free(parcel_box_dto_t *parcel_box_dto);

parcel_box_dto_t *parcel_box_dto_parseFromJSON(cJSON *parcel_box_dtoJSON);

cJSON *parcel_box_dto_convertToJSON(parcel_box_dto_t *parcel_box_dto);

#endif /* _parcel_box_dto_H_ */

