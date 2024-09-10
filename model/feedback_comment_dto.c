#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_comment_dto.h"



feedback_comment_dto_t *feedback_comment_dto_create(
    long id,
    long parent_id,
    char *body,
    char *created_at,
    char *updated_at,
    feedback_comment_author_dto_t *author,
    list_t *children
    ) {
    feedback_comment_dto_t *feedback_comment_dto_local_var = malloc(sizeof(feedback_comment_dto_t));
    if (!feedback_comment_dto_local_var) {
        return NULL;
    }
    feedback_comment_dto_local_var->id = id;
    feedback_comment_dto_local_var->parent_id = parent_id;
    feedback_comment_dto_local_var->body = body;
    feedback_comment_dto_local_var->created_at = created_at;
    feedback_comment_dto_local_var->updated_at = updated_at;
    feedback_comment_dto_local_var->author = author;
    feedback_comment_dto_local_var->children = children;

    return feedback_comment_dto_local_var;
}


void feedback_comment_dto_free(feedback_comment_dto_t *feedback_comment_dto) {
    if(NULL == feedback_comment_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feedback_comment_dto->body) {
        free(feedback_comment_dto->body);
        feedback_comment_dto->body = NULL;
    }
    if (feedback_comment_dto->created_at) {
        free(feedback_comment_dto->created_at);
        feedback_comment_dto->created_at = NULL;
    }
    if (feedback_comment_dto->updated_at) {
        free(feedback_comment_dto->updated_at);
        feedback_comment_dto->updated_at = NULL;
    }
    if (feedback_comment_dto->author) {
        feedback_comment_author_dto_free(feedback_comment_dto->author);
        feedback_comment_dto->author = NULL;
    }
    if (feedback_comment_dto->children) {
        list_ForEach(listEntry, feedback_comment_dto->children) {
            feedback_comment_dto_free(listEntry->data);
        }
        list_freeList(feedback_comment_dto->children);
        feedback_comment_dto->children = NULL;
    }
    free(feedback_comment_dto);
}

cJSON *feedback_comment_dto_convertToJSON(feedback_comment_dto_t *feedback_comment_dto) {
    cJSON *item = cJSON_CreateObject();

    // feedback_comment_dto->id
    if(feedback_comment_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", feedback_comment_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // feedback_comment_dto->parent_id
    if(feedback_comment_dto->parent_id) {
    if(cJSON_AddNumberToObject(item, "parentId", feedback_comment_dto->parent_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // feedback_comment_dto->body
    if(feedback_comment_dto->body) {
    if(cJSON_AddStringToObject(item, "body", feedback_comment_dto->body) == NULL) {
    goto fail; //String
    }
    }


    // feedback_comment_dto->created_at
    if(feedback_comment_dto->created_at) {
    if(cJSON_AddStringToObject(item, "createdAt", feedback_comment_dto->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // feedback_comment_dto->updated_at
    if(feedback_comment_dto->updated_at) {
    if(cJSON_AddStringToObject(item, "updatedAt", feedback_comment_dto->updated_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // feedback_comment_dto->author
    if(feedback_comment_dto->author) {
    cJSON *author_local_JSON = feedback_comment_author_dto_convertToJSON(feedback_comment_dto->author);
    if(author_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "author", author_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feedback_comment_dto->children
    if(feedback_comment_dto->children) {
    cJSON *children = cJSON_AddArrayToObject(item, "children");
    if(children == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *childrenListEntry;
    if (feedback_comment_dto->children) {
    list_ForEach(childrenListEntry, feedback_comment_dto->children) {
    cJSON *itemLocal = feedback_comment_dto_convertToJSON(childrenListEntry->data);
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

feedback_comment_dto_t *feedback_comment_dto_parseFromJSON(cJSON *feedback_comment_dtoJSON){

    feedback_comment_dto_t *feedback_comment_dto_local_var = NULL;

    // define the local variable for feedback_comment_dto->author
    feedback_comment_author_dto_t *author_local_nonprim = NULL;

    // define the local list for feedback_comment_dto->children
    list_t *childrenList = NULL;

    // feedback_comment_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(feedback_comment_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // feedback_comment_dto->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(feedback_comment_dtoJSON, "parentId");
    if (parent_id) { 
    if(!cJSON_IsNumber(parent_id))
    {
    goto end; //Numeric
    }
    }

    // feedback_comment_dto->body
    cJSON *body = cJSON_GetObjectItemCaseSensitive(feedback_comment_dtoJSON, "body");
    if (body) { 
    if(!cJSON_IsString(body) && !cJSON_IsNull(body))
    {
    goto end; //String
    }
    }

    // feedback_comment_dto->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(feedback_comment_dtoJSON, "createdAt");
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // feedback_comment_dto->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(feedback_comment_dtoJSON, "updatedAt");
    if (updated_at) { 
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }
    }

    // feedback_comment_dto->author
    cJSON *author = cJSON_GetObjectItemCaseSensitive(feedback_comment_dtoJSON, "author");
    if (author) { 
    author_local_nonprim = feedback_comment_author_dto_parseFromJSON(author); //nonprimitive
    }

    // feedback_comment_dto->children
    cJSON *children = cJSON_GetObjectItemCaseSensitive(feedback_comment_dtoJSON, "children");
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
        feedback_comment_dto_t *childrenItem = feedback_comment_dto_parseFromJSON(children_local_nonprimitive);

        list_addElement(childrenList, childrenItem);
    }
    }


    feedback_comment_dto_local_var = feedback_comment_dto_create (
        id ? id->valuedouble : 0,
        parent_id ? parent_id->valuedouble : 0,
        body && !cJSON_IsNull(body) ? strdup(body->valuestring) : NULL,
        created_at && !cJSON_IsNull(created_at) ? strdup(created_at->valuestring) : NULL,
        updated_at && !cJSON_IsNull(updated_at) ? strdup(updated_at->valuestring) : NULL,
        author ? author_local_nonprim : NULL,
        children ? childrenList : NULL
        );

    return feedback_comment_dto_local_var;
end:
    if (author_local_nonprim) {
        feedback_comment_author_dto_free(author_local_nonprim);
        author_local_nonprim = NULL;
    }
    if (childrenList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, childrenList) {
            feedback_comment_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(childrenList);
        childrenList = NULL;
    }
    return NULL;

}
