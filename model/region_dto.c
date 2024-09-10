#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "region_dto.h"


char* region_dto_type_ToString(_api__region_dto__e type) {
    char* typeArray[] =  { "NULL", "OTHER", "CONTINENT", "REGION", "COUNTRY", "COUNTRY_DISTRICT", "REPUBLIC", "CITY", "VILLAGE", "CITY_DISTRICT", "SUBWAY_STATION", "REPUBLIC_AREA" };
    return typeArray[type];
}

_api__region_dto__e region_dto_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "OTHER", "CONTINENT", "REGION", "COUNTRY", "COUNTRY_DISTRICT", "REPUBLIC", "CITY", "VILLAGE", "CITY_DISTRICT", "SUBWAY_STATION", "REPUBLIC_AREA" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

region_dto_t *region_dto_create(
    long id,
    char *name,
    region_type_t *type,
    region_dto_t *parent,
    list_t *children
    ) {
    region_dto_t *region_dto_local_var = malloc(sizeof(region_dto_t));
    if (!region_dto_local_var) {
        return NULL;
    }
    region_dto_local_var->id = id;
    region_dto_local_var->name = name;
    region_dto_local_var->type = type;
    region_dto_local_var->parent = parent;
    region_dto_local_var->children = children;

    return region_dto_local_var;
}


void region_dto_free(region_dto_t *region_dto) {
    if(NULL == region_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (region_dto->name) {
        free(region_dto->name);
        region_dto->name = NULL;
    }
    if (region_dto->type) {
        region_type_free(region_dto->type);
        region_dto->type = NULL;
    }
    if (region_dto->parent) {
        region_dto_free(region_dto->parent);
        region_dto->parent = NULL;
    }
    if (region_dto->children) {
        list_ForEach(listEntry, region_dto->children) {
            region_dto_free(listEntry->data);
        }
        list_freeList(region_dto->children);
        region_dto->children = NULL;
    }
    free(region_dto);
}

cJSON *region_dto_convertToJSON(region_dto_t *region_dto) {
    cJSON *item = cJSON_CreateObject();

    // region_dto->id
    if(region_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", region_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // region_dto->name
    if (!region_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", region_dto->name) == NULL) {
    goto fail; //String
    }


    // region_dto->type
    if (_api__region_dto__NULL == region_dto->type) {
        goto fail;
    }
    cJSON *type_local_JSON = region_type_convertToJSON(region_dto->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // region_dto->parent
    if(region_dto->parent) {
    cJSON *parent_local_JSON = region_dto_convertToJSON(region_dto->parent);
    if(parent_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "parent", parent_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // region_dto->children
    if(region_dto->children) {
    cJSON *children = cJSON_AddArrayToObject(item, "children");
    if(children == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *childrenListEntry;
    if (region_dto->children) {
    list_ForEach(childrenListEntry, region_dto->children) {
    cJSON *itemLocal = region_dto_convertToJSON(childrenListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(children, itemLocal);
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

region_dto_t *region_dto_parseFromJSON(cJSON *region_dtoJSON){

    region_dto_t *region_dto_local_var = NULL;

    // define the local variable for region_dto->type
    region_type_t *type_local_nonprim = NULL;

    // define the local variable for region_dto->parent
    region_dto_t *parent_local_nonprim = NULL;

    // define the local list for region_dto->children
    list_t *childrenList = NULL;

    // region_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(region_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // region_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(region_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // region_dto->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(region_dtoJSON, "type");
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = region_type_parseFromJSON(type); //custom

    // region_dto->parent
    cJSON *parent = cJSON_GetObjectItemCaseSensitive(region_dtoJSON, "parent");
    if (parent) { 
    parent_local_nonprim = region_dto_parseFromJSON(parent); //nonprimitive
    }

    // region_dto->children
    cJSON *children = cJSON_GetObjectItemCaseSensitive(region_dtoJSON, "children");
    if (children) { 
    cJSON *children_local_nonprimitive = NULL;
    if(!cJSON_IsArray(children)){
        goto end; //nonprimitive container
    }

    childrenList = list_createList();

    cJSON_ArrayForEach(children_local_nonprimitive,children )
    {
        if(!cJSON_IsObject(children_local_nonprimitive)){
            goto end;
        }
        region_dto_t *childrenItem = region_dto_parseFromJSON(children_local_nonprimitive);

        list_addElement(childrenList, childrenItem);
    }
    }


    region_dto_local_var = region_dto_create (
        id ? id->valuedouble : 0,
        strdup(name->valuestring),
        type_local_nonprim,
        parent ? parent_local_nonprim : NULL,
        children ? childrenList : NULL
        );

    return region_dto_local_var;
end:
    if (type_local_nonprim) {
        region_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (parent_local_nonprim) {
        region_dto_free(parent_local_nonprim);
        parent_local_nonprim = NULL;
    }
    if (childrenList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, childrenList) {
            region_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(childrenList);
        childrenList = NULL;
    }
    return NULL;

}
