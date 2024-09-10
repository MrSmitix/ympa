/*
 * order_delivery_address_dto.h
 *
 * Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
 */

#ifndef _order_delivery_address_dto_H_
#define _order_delivery_address_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_delivery_address_dto_t order_delivery_address_dto_t;

#include "gps_dto.h"



typedef struct order_delivery_address_dto_t {
    char *country; // string
    char *postcode; // string
    char *city; // string
    char *district; // string
    char *subway; // string
    char *street; // string
    char *house; // string
    char *block; // string
    char *entrance; // string
    char *entryphone; // string
    char *floor; // string
    char *apartment; // string
    char *phone; // string
    char *recipient; // string
    struct gps_dto_t *gps; //model

} order_delivery_address_dto_t;

order_delivery_address_dto_t *order_delivery_address_dto_create(
    char *country,
    char *postcode,
    char *city,
    char *district,
    char *subway,
    char *street,
    char *house,
    char *block,
    char *entrance,
    char *entryphone,
    char *floor,
    char *apartment,
    char *phone,
    char *recipient,
    gps_dto_t *gps
);

void order_delivery_address_dto_free(order_delivery_address_dto_t *order_delivery_address_dto);

order_delivery_address_dto_t *order_delivery_address_dto_parseFromJSON(cJSON *order_delivery_address_dtoJSON);

cJSON *order_delivery_address_dto_convertToJSON(order_delivery_address_dto_t *order_delivery_address_dto);

#endif /* _order_delivery_address_dto_H_ */

