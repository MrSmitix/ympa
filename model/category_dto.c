#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "category_dto.h"



category_dto_t *category_dto_create(
    long id,
    char *name,
    list_t *children
    ) {
    category_dto_t *category_dto_local_var = malloc(sizeof(category_dto_t));
    if (!category_dto_local_var) {
        return NULL;
    }
    category_dto_local_var->id = id;
    category_dto_local_var->name = name;
    category_dto_local_var->children = children;

    return category_dto_local_var;
}


void category_dto_free(category_dto_t *category_dto) {
    if(NULL == category_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (category_dto->name) {
        free(category_dto->name);
        category_dto->name = NULL;
    }
    if (category_dto->children) {
        list_ForEach(listEntry, category_dto->children) {
            category_dto_free(listEntry->data);
        }
        list_freeList(category_dto->children);
        category_dto->children = NULL;
    }
    free(category_dto);
}

cJSON *category_dto_convertToJSON(category_dto_t *category_dto) {
    cJSON *item = cJSON_CreateObject();

    // category_dto->id
    if (!category_dto->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", category_dto->id) == NULL) {
    goto fail; //Numeric
    }


    // category_dto->name
    if (!category_dto->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", category_dto->name) == NULL) {
    goto fail; //String
    }


    // category_dto->children
    if(category_dto->children) {
    cJSON *children = cJSON_AddArrayToObject(item, "children");
    if(children == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *childrenListEntry;
    if (category_dto->children) {
    list_ForEach(childrenListEntry, category_dto->children) {
    cJSON *itemLocal = category_dto_convertToJSON(childrenListEntry->data);
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

category_dto_t *category_dto_parseFromJSON(cJSON *category_dtoJSON){

    category_dto_t *category_dto_local_var = NULL;

    // define the local list for category_dto->children
    list_t *childrenList = NULL;

    // category_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(category_dtoJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // category_dto->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(category_dtoJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // category_dto->children
    cJSON *children = cJSON_GetObjectItemCaseSensitive(category_dtoJSON, "children");
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
        category_dto_t *childrenItem = category_dto_parseFromJSON(children_local_nonprimitive);

        list_addElement(childrenList, childrenItem);
    }
    }


    category_dto_local_var = category_dto_create (
        id->valuedouble,
        strdup(name->valuestring),
        children ? childrenList : NULL
        );

    return category_dto_local_var;
end:
    if (childrenList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, childrenList) {
            category_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(childrenList);
        childrenList = NULL;
    }
    return NULL;

}
