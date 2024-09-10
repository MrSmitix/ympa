#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "category_parameter_dto.h"


char* category_parameter_dto_type_ToString(_api__category_parameter_dto__e type) {
    char* typeArray[] =  { "NULL", "TEXT", "ENUM", "BOOLEAN", "NUMERIC" };
    return typeArray[type];
}

_api__category_parameter_dto__e category_parameter_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "TEXT", "ENUM", "BOOLEAN", "NUMERIC" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* category_parameter_dto_recommendation_types_ToString(_api__category_parameter_dto__e recommendation_types) {
    char *recommendation_typesArray[] =  { "NULL", "HAS_VIDEO", "RECOGNIZED_VENDOR", "MAIN", "ADDITIONAL", "DISTINCTIVE", "FILTERABLE", "PICTURE_COUNT", "HAS_DESCRIPTION", "HAS_BARCODE", "FIRST_PICTURE_SIZE", "TITLE_LENGTH", "DESCRIPTION_LENGTH", "AVERAGE_PICTURE_SIZE", "FIRST_VIDEO_SIZE", "FIRST_VIDEO_LENGTH", "AVERAGE_VIDEO_SIZE", "VIDEO_COUNT" };
    return recommendation_typesArray[recommendation_types - 1];
}

_api__category_parameter_dto__e category_parameter_dto_recommendation_types_FromString(char* recommendation_types) {
    int stringToReturn = 0;
    char *recommendation_typesArray[] =  { "NULL", "HAS_VIDEO", "RECOGNIZED_VENDOR", "MAIN", "ADDITIONAL", "DISTINCTIVE", "FILTERABLE", "PICTURE_COUNT", "HAS_DESCRIPTION", "HAS_BARCODE", "FIRST_PICTURE_SIZE", "TITLE_LENGTH", "DESCRIPTION_LENGTH", "AVERAGE_PICTURE_SIZE", "FIRST_VIDEO_SIZE", "FIRST_VIDEO_LENGTH", "AVERAGE_VIDEO_SIZE", "VIDEO_COUNT" };
    size_t sizeofArray = sizeof(recommendation_typesArray) / sizeof(recommendation_typesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(recommendation_types, recommendation_typesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

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
    ) {
    category_parameter_dto_t *category_parameter_dto_local_var = malloc(sizeof(category_parameter_dto_t));
    if (!category_parameter_dto_local_var) {
        return NULL;
    }
    category_parameter_dto_local_var->id = id;
    category_parameter_dto_local_var->name = name;
    category_parameter_dto_local_var->type = type;
    category_parameter_dto_local_var->unit = unit;
    category_parameter_dto_local_var->description = description;
    category_parameter_dto_local_var->recommendation_types = recommendation_types;
    category_parameter_dto_local_var->required = required;
    category_parameter_dto_local_var->filtering = filtering;
    category_parameter_dto_local_var->distinctive = distinctive;
    category_parameter_dto_local_var->multivalue = multivalue;
    category_parameter_dto_local_var->allow_custom_values = allow_custom_values;
    category_parameter_dto_local_var->values = values;
    category_parameter_dto_local_var->constraints = constraints;
    category_parameter_dto_local_var->value_restrictions = value_restrictions;

    return category_parameter_dto_local_var;
}


void category_parameter_dto_free(category_parameter_dto_t *category_parameter_dto) {
    if(NULL == category_parameter_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (category_parameter_dto->name) {
        free(category_parameter_dto->name);
        category_parameter_dto->name = NULL;
    }
    if (category_parameter_dto->type) {
        parameter_type_free(category_parameter_dto->type);
        category_parameter_dto->type = NULL;
    }
    if (category_parameter_dto->unit) {
        category_parameter_unit_dto_free(category_parameter_dto->unit);
        category_parameter_dto->unit = NULL;
    }
    if (category_parameter_dto->description) {
        free(category_parameter_dto->description);
        category_parameter_dto->description = NULL;
    }
    if (category_parameter_dto->recommendation_types) {
        list_ForEach(listEntry, category_parameter_dto->recommendation_types) {
            offer_card_recommendation_type_free(listEntry->data);
        }
        list_freeList(category_parameter_dto->recommendation_types);
        category_parameter_dto->recommendation_types = NULL;
    }
    if (category_parameter_dto->values) {
        list_ForEach(listEntry, category_parameter_dto->values) {
            parameter_value_option_dto_free(listEntry->data);
        }
        list_freeList(category_parameter_dto->values);
        category_parameter_dto->values = NULL;
    }
    if (category_parameter_dto->constraints) {
        parameter_value_constraints_dto_free(category_parameter_dto->constraints);
        category_parameter_dto->constraints = NULL;
    }
    if (category_parameter_dto->value_restrictions) {
        list_ForEach(listEntry, category_parameter_dto->value_restrictions) {
            value_restriction_dto_free(listEntry->data);
        }
        list_freeList(category_parameter_dto->value_restrictions);
        category_parameter_dto->value_restrictions = NULL;
    }
    free(category_parameter_dto);
}

cJSON *category_parameter_dto_convertToJSON(category_parameter_dto_t *category_parameter_dto) {
    cJSON *item = cJSON_CreateObject();

    // category_parameter_dto->id
    if (!category_parameter_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", category_parameter_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // category_parameter_dto->name
    if(category_parameter_dto->name) {
    if(cJSON_AddStringToObject(item, "name", category_parameter_dto->name) == NULL) {
    goto fail; //String
    }
    }


    // category_parameter_dto->type
    if (_api__category_parameter_dto__NULL == category_parameter_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = parameter_type_convertToJSON(category_parameter_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // category_parameter_dto->unit
    if(category_parameter_dto->unit) {
    cJSON *unit_local_JSON = category_parameter_unit_dto_convertToJSON(category_parameter_dto->unit);
    if(unit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "unit", unit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // category_parameter_dto->description
    if(category_parameter_dto->description) {
    if(cJSON_AddStringToObject(item, "description", category_parameter_dto->description) == NULL) {
    goto fail; //String
    }
    }


    // category_parameter_dto->recommendation_types
    if(category_parameter_dto->recommendation_types != _api__category_parameter_dto_RECOMMENDATIONTYPES_NULL) {
    cJSON *recommendation_types = cJSON_AddArrayToObject(item, "recommendationTypes");
    if(recommendation_types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *recommendation_typesListEntry;
    if (category_parameter_dto->recommendation_types) {
    list_ForEach(recommendation_typesListEntry, category_parameter_dto->recommendation_types) {
    cJSON *itemLocal = offer_card_recommendation_type_convertToJSON((_api__category_parameter_dto__e)recommendation_typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(recommendation_types, itemLocal);
    }
    }
    }


    // category_parameter_dto->required
    if (!category_parameter_dto->required) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "required", category_parameter_dto->required) == NULL) {
    goto fail; //Bool
    }


    // category_parameter_dto->filtering
    if (!category_parameter_dto->filtering) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "filtering", category_parameter_dto->filtering) == NULL) {
    goto fail; //Bool
    }


    // category_parameter_dto->distinctive
    if (!category_parameter_dto->distinctive) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "distinctive", category_parameter_dto->distinctive) == NULL) {
    goto fail; //Bool
    }


    // category_parameter_dto->multivalue
    if (!category_parameter_dto->multivalue) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "multivalue", category_parameter_dto->multivalue) == NULL) {
    goto fail; //Bool
    }


    // category_parameter_dto->allow_custom_values
    if (!category_parameter_dto->allow_custom_values) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "allowCustomValues", category_parameter_dto->allow_custom_values) == NULL) {
    goto fail; //Bool
    }


    // category_parameter_dto->values
    if(category_parameter_dto->values) {
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (category_parameter_dto->values) {
    list_ForEach(valuesListEntry, category_parameter_dto->values) {
    cJSON *itemLocal = parameter_value_option_dto_convertToJSON(valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(values, itemLocal);
    }
    }
    }


    // category_parameter_dto->constraints
    if(category_parameter_dto->constraints) {
    cJSON *constraints_local_JSON = parameter_value_constraints_dto_convertToJSON(category_parameter_dto->constraints);
    if(constraints_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "constraints", constraints_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // category_parameter_dto->value_restrictions
    if(category_parameter_dto->value_restrictions) {
    cJSON *value_restrictions = cJSON_AddArrayToObject(item, "valueRestrictions");
    if(value_restrictions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *value_restrictionsListEntry;
    if (category_parameter_dto->value_restrictions) {
    list_ForEach(value_restrictionsListEntry, category_parameter_dto->value_restrictions) {
    cJSON *itemLocal = value_restriction_dto_convertToJSON(value_restrictionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(value_restrictions, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

category_parameter_dto_t *category_parameter_dto_parseFromJSON(cJSON *category_parameter_dtoJSON){

    category_parameter_dto_t *category_parameter_dto_local_var = NULL;

    // define the local variable for category_parameter_dto->type
    parameter_type_t *type_local_nonprim = NULL;

    // define the local variable for category_parameter_dto->unit
    category_parameter_unit_dto_t *unit_local_nonprim = NULL;

    // define the local list for category_parameter_dto->recommendation_types
    list_t *recommendation_typesList = NULL;

    // define the local list for category_parameter_dto->values
    list_t *valuesList = NULL;

    // define the local variable for category_parameter_dto->constraints
    parameter_value_constraints_dto_t *constraints_local_nonprim = NULL;

    // define the local list for category_parameter_dto->value_restrictions
    list_t *value_restrictionsList = NULL;

    // category_parameter_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // category_parameter_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // category_parameter_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = parameter_type_parseFromJSON(type); //custom

    // category_parameter_dto->unit
    cJSON *unit = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "unit");
    if (unit) { 
    unit_local_nonprim = category_parameter_unit_dto_parseFromJSON(unit); //nonprimitive
    }

    // category_parameter_dto->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // category_parameter_dto->recommendation_types
    cJSON *recommendation_types = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "recommendationTypes");
    if (recommendation_types) { 
    cJSON *recommendation_types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(recommendation_types)){
        goto end; //nonprimitive container
    }

    recommendation_typesList = list_createList();

    cJSON_ArrayForEach(recommendation_types_local_nonprimitive,recommendation_types )
    {
        if(!cJSON_IsObject(recommendation_types_local_nonprimitive)){
            goto end;
        }
        category_parameter_dto_offer_card_recommendation_type_e recommendation_typesItem = offer_card_recommendation_type_parseFromJSON(recommendation_types_local_nonprimitive);

        list_addElement(recommendation_typesList, (void *)recommendation_typesItem);
    }
    }

    // category_parameter_dto->required
    cJSON *required = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "required");
    if (!required) {
        goto end;
    }

    
    if(!cJSON_IsBool(required))
    {
    goto end; //Bool
    }

    // category_parameter_dto->filtering
    cJSON *filtering = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "filtering");
    if (!filtering) {
        goto end;
    }

    
    if(!cJSON_IsBool(filtering))
    {
    goto end; //Bool
    }

    // category_parameter_dto->distinctive
    cJSON *distinctive = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "distinctive");
    if (!distinctive) {
        goto end;
    }

    
    if(!cJSON_IsBool(distinctive))
    {
    goto end; //Bool
    }

    // category_parameter_dto->multivalue
    cJSON *multivalue = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "multivalue");
    if (!multivalue) {
        goto end;
    }

    
    if(!cJSON_IsBool(multivalue))
    {
    goto end; //Bool
    }

    // category_parameter_dto->allow_custom_values
    cJSON *allow_custom_values = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "allowCustomValues");
    if (!allow_custom_values) {
        goto end;
    }

    
    if(!cJSON_IsBool(allow_custom_values))
    {
    goto end; //Bool
    }

    // category_parameter_dto->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "values");
    if (values) { 
    cJSON *values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(values)){
        goto end; //nonprimitive container
    }

    valuesList = list_createList();

    cJSON_ArrayForEach(values_local_nonprimitive,values )
    {
        if(!cJSON_IsObject(values_local_nonprimitive)){
            goto end;
        }
        parameter_value_option_dto_t *valuesItem = parameter_value_option_dto_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, valuesItem);
    }
    }

    // category_parameter_dto->constraints
    cJSON *constraints = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "constraints");
    if (constraints) { 
    constraints_local_nonprim = parameter_value_constraints_dto_parseFromJSON(constraints); //nonprimitive
    }

    // category_parameter_dto->value_restrictions
    cJSON *value_restrictions = cJSON_GetObjectItemCaseSensitive(category_parameter_dtoJSON, "valueRestrictions");
    if (value_restrictions) { 
    cJSON *value_restrictions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(value_restrictions)){
        goto end; //nonprimitive container
    }

    value_restrictionsList = list_createList();

    cJSON_ArrayForEach(value_restrictions_local_nonprimitive,value_restrictions )
    {
        if(!cJSON_IsObject(value_restrictions_local_nonprimitive)){
            goto end;
        }
        value_restriction_dto_t *value_restrictionsItem = value_restriction_dto_parseFromJSON(value_restrictions_local_nonprimitive);

        list_addElement(value_restrictionsList, value_restrictionsItem);
    }
    }


    category_parameter_dto_local_var = category_parameter_dto_create (
        id->valuedouble,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        type_local_nonprim,
        unit ? unit_local_nonprim : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        recommendation_types ? recommendation_typesList : NULL,
        required->valueint,
        filtering->valueint,
        distinctive->valueint,
        multivalue->valueint,
        allow_custom_values->valueint,
        values ? valuesList : NULL,
        constraints ? constraints_local_nonprim : NULL,
        value_restrictions ? value_restrictionsList : NULL
        );

    return category_parameter_dto_local_var;
end:
    if (type_local_nonprim) {
        parameter_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (unit_local_nonprim) {
        category_parameter_unit_dto_free(unit_local_nonprim);
        unit_local_nonprim = NULL;
    }
    if (recommendation_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, recommendation_typesList) {
            offer_card_recommendation_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(recommendation_typesList);
        recommendation_typesList = NULL;
    }
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            parameter_value_option_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    if (constraints_local_nonprim) {
        parameter_value_constraints_dto_free(constraints_local_nonprim);
        constraints_local_nonprim = NULL;
    }
    if (value_restrictionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, value_restrictionsList) {
            value_restriction_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(value_restrictionsList);
        value_restrictionsList = NULL;
    }
    return NULL;

}
