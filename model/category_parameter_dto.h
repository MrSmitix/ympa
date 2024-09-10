/*
 * category_parameter_dto.h
 *
 * Характеристика товара.
 */

#ifndef _category_parameter_dto_H_
#define _category_parameter_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct category_parameter_dto_t category_parameter_dto_t;

#include "category_parameter_unit_dto.h"
#include "offer_card_recommendation_type.h"
#include "parameter_type.h"
#include "parameter_value_constraints_dto.h"
#include "parameter_value_option_dto.h"
#include "value_restriction_dto.h"

// Enum  for category_parameter_dto

typedef enum  { _api__category_parameter_dto__NULL = 0, _api__category_parameter_dto__TEXT, _api__category_parameter_dto___ENUM, _api__category_parameter_dto__BOOLEAN, _api__category_parameter_dto__NUMERIC } _api__category_parameter_dto__e;

char* category_parameter_dto_type_ToString(_api__category_parameter_dto__e type);

_api__category_parameter_dto__e category_parameter_dto_type_FromString(char* type);

// Enum  for category_parameter_dto

typedef enum  { _api__category_parameter_dto__NULL = 0, _api__category_parameter_dto__HAS_VIDEO, _api__category_parameter_dto__RECOGNIZED_VENDOR, _api__category_parameter_dto__MAIN, _api__category_parameter_dto__ADDITIONAL, _api__category_parameter_dto__DISTINCTIVE, _api__category_parameter_dto__FILTERABLE, _api__category_parameter_dto__PICTURE_COUNT, _api__category_parameter_dto__HAS_DESCRIPTION, _api__category_parameter_dto__HAS_BARCODE, _api__category_parameter_dto__FIRST_PICTURE_SIZE, _api__category_parameter_dto__TITLE_LENGTH, _api__category_parameter_dto__DESCRIPTION_LENGTH, _api__category_parameter_dto__AVERAGE_PICTURE_SIZE, _api__category_parameter_dto__FIRST_VIDEO_SIZE, _api__category_parameter_dto__FIRST_VIDEO_LENGTH, _api__category_parameter_dto__AVERAGE_VIDEO_SIZE, _api__category_parameter_dto__VIDEO_COUNT } _api__category_parameter_dto__e;

char* category_parameter_dto_recommendation_types_ToString(_api__category_parameter_dto__e recommendation_types);

_api__category_parameter_dto__e category_parameter_dto_recommendation_types_FromString(char* recommendation_types);



typedef struct category_parameter_dto_t {
    long id; //numeric
    char *name; // string
    parameter_type_t *type; // custom
    struct category_parameter_unit_dto_t *unit; //model
    char *description; // string
    list_t *recommendation_types; //nonprimitive container
    int required; //boolean
    int filtering; //boolean
    int distinctive; //boolean
    int multivalue; //boolean
    int allow_custom_values; //boolean
    list_t *values; //nonprimitive container
    struct parameter_value_constraints_dto_t *constraints; //model
    list_t *value_restrictions; //nonprimitive container

} category_parameter_dto_t;

category_parameter_dto_t *category_parameter_dto_create(
    long id,
    char *name,
    parameter_type_t *type,
    category_parameter_unit_dto_t *unit,
    char *description,
    list_t *recommendation_types,
    int required,
    int filtering,
    int distinctive,
    int multivalue,
    int allow_custom_values,
    list_t *values,
    parameter_value_constraints_dto_t *constraints,
    list_t *value_restrictions
);

void category_parameter_dto_free(category_parameter_dto_t *category_parameter_dto);

category_parameter_dto_t *category_parameter_dto_parseFromJSON(cJSON *category_parameter_dtoJSON);

cJSON *category_parameter_dto_convertToJSON(category_parameter_dto_t *category_parameter_dto);

#endif /* _category_parameter_dto_H_ */

