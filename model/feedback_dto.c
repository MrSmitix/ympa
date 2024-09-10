#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "feedback_dto.h"


char* feedback_dto_state_ToString(_api__feedback_dto__e state) {
    char* stateArray[] =  { "NULL", "LAST", "PREVIOUS", "DELETED" };
    return stateArray[state];
}

_api__feedback_dto__e feedback_dto_state_FromString(char* state){
    int stringToReturn = 0;
    char *stateArray[] =  { "NULL", "LAST", "PREVIOUS", "DELETED" };
    size_t sizeofArray = sizeof(stateArray) / sizeof(stateArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(state, stateArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

feedback_dto_t *feedback_dto_create(
    long id,
    char *created_at,
    char *text,
    feedback_state_type_t *state,
    feedback_author_dto_t *author,
    char *pro,
    char *contra,
    list_t *comments,
    feedback_shop_dto_t *shop,
    int resolved,
    int verified,
    int recommend,
    feedback_grades_dto_t *grades,
    feedback_order_dto_t *order
    ) {
    feedback_dto_t *feedback_dto_local_var = malloc(sizeof(feedback_dto_t));
    if (!feedback_dto_local_var) {
        return NULL;
    }
    feedback_dto_local_var->id = id;
    feedback_dto_local_var->created_at = created_at;
    feedback_dto_local_var->text = text;
    feedback_dto_local_var->state = state;
    feedback_dto_local_var->author = author;
    feedback_dto_local_var->pro = pro;
    feedback_dto_local_var->contra = contra;
    feedback_dto_local_var->comments = comments;
    feedback_dto_local_var->shop = shop;
    feedback_dto_local_var->resolved = resolved;
    feedback_dto_local_var->verified = verified;
    feedback_dto_local_var->recommend = recommend;
    feedback_dto_local_var->grades = grades;
    feedback_dto_local_var->order = order;

    return feedback_dto_local_var;
}


void feedback_dto_free(feedback_dto_t *feedback_dto) {
    if(NULL == feedback_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (feedback_dto->created_at) {
        free(feedback_dto->created_at);
        feedback_dto->created_at = NULL;
    }
    if (feedback_dto->text) {
        free(feedback_dto->text);
        feedback_dto->text = NULL;
    }
    if (feedback_dto->state) {
        feedback_state_type_free(feedback_dto->state);
        feedback_dto->state = NULL;
    }
    if (feedback_dto->author) {
        feedback_author_dto_free(feedback_dto->author);
        feedback_dto->author = NULL;
    }
    if (feedback_dto->pro) {
        free(feedback_dto->pro);
        feedback_dto->pro = NULL;
    }
    if (feedback_dto->contra) {
        free(feedback_dto->contra);
        feedback_dto->contra = NULL;
    }
    if (feedback_dto->comments) {
        list_ForEach(listEntry, feedback_dto->comments) {
            feedback_comment_dto_free(listEntry->data);
        }
        list_freeList(feedback_dto->comments);
        feedback_dto->comments = NULL;
    }
    if (feedback_dto->shop) {
        feedback_shop_dto_free(feedback_dto->shop);
        feedback_dto->shop = NULL;
    }
    if (feedback_dto->grades) {
        feedback_grades_dto_free(feedback_dto->grades);
        feedback_dto->grades = NULL;
    }
    if (feedback_dto->order) {
        feedback_order_dto_free(feedback_dto->order);
        feedback_dto->order = NULL;
    }
    free(feedback_dto);
}

cJSON *feedback_dto_convertToJSON(feedback_dto_t *feedback_dto) {
    cJSON *item = cJSON_CreateObject();

    // feedback_dto->id
    if(feedback_dto->id) {
    if(cJSON_AddNumberToObject(item, "id", feedback_dto->id) == NULL) {
    goto fail; //Numeric
    }
    }


    // feedback_dto->created_at
    if(feedback_dto->created_at) {
    if(cJSON_AddStringToObject(item, "createdAt", feedback_dto->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // feedback_dto->text
    if(feedback_dto->text) {
    if(cJSON_AddStringToObject(item, "text", feedback_dto->text) == NULL) {
    goto fail; //String
    }
    }


    // feedback_dto->state
    if(feedback_dto->state != _api__feedback_dto__NULL) {
    cJSON *state_local_JSON = feedback_state_type_convertToJSON(feedback_dto->state);
    if(state_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "state", state_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // feedback_dto->author
    if(feedback_dto->author) {
    cJSON *author_local_JSON = feedback_author_dto_convertToJSON(feedback_dto->author);
    if(author_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "author", author_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feedback_dto->pro
    if(feedback_dto->pro) {
    if(cJSON_AddStringToObject(item, "pro", feedback_dto->pro) == NULL) {
    goto fail; //String
    }
    }


    // feedback_dto->contra
    if(feedback_dto->contra) {
    if(cJSON_AddStringToObject(item, "contra", feedback_dto->contra) == NULL) {
    goto fail; //String
    }
    }


    // feedback_dto->comments
    if (!feedback_dto->comments) {
        goto fail;
    }
    cJSON *comments = cJSON_AddArrayToObject(item, "comments");
    if(comments == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *commentsListEntry;
    if (feedback_dto->comments) {
    list_ForEach(commentsListEntry, feedback_dto->comments) {
    cJSON *itemLocal = feedback_comment_dto_convertToJSON(commentsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(comments, itemLocal);
    }
    }


    // feedback_dto->shop
    if(feedback_dto->shop) {
    cJSON *shop_local_JSON = feedback_shop_dto_convertToJSON(feedback_dto->shop);
    if(shop_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "shop", shop_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feedback_dto->resolved
    if(feedback_dto->resolved) {
    if(cJSON_AddBoolToObject(item, "resolved", feedback_dto->resolved) == NULL) {
    goto fail; //Bool
    }
    }


    // feedback_dto->verified
    if(feedback_dto->verified) {
    if(cJSON_AddBoolToObject(item, "verified", feedback_dto->verified) == NULL) {
    goto fail; //Bool
    }
    }


    // feedback_dto->recommend
    if(feedback_dto->recommend) {
    if(cJSON_AddBoolToObject(item, "recommend", feedback_dto->recommend) == NULL) {
    goto fail; //Bool
    }
    }


    // feedback_dto->grades
    if(feedback_dto->grades) {
    cJSON *grades_local_JSON = feedback_grades_dto_convertToJSON(feedback_dto->grades);
    if(grades_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "grades", grades_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // feedback_dto->order
    if(feedback_dto->order) {
    cJSON *order_local_JSON = feedback_order_dto_convertToJSON(feedback_dto->order);
    if(order_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "order", order_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

feedback_dto_t *feedback_dto_parseFromJSON(cJSON *feedback_dtoJSON){

    feedback_dto_t *feedback_dto_local_var = NULL;

    // define the local variable for feedback_dto->state
    feedback_state_type_t *state_local_nonprim = NULL;

    // define the local variable for feedback_dto->author
    feedback_author_dto_t *author_local_nonprim = NULL;

    // define the local list for feedback_dto->comments
    list_t *commentsList = NULL;

    // define the local variable for feedback_dto->shop
    feedback_shop_dto_t *shop_local_nonprim = NULL;

    // define the local variable for feedback_dto->grades
    feedback_grades_dto_t *grades_local_nonprim = NULL;

    // define the local variable for feedback_dto->order
    feedback_order_dto_t *order_local_nonprim = NULL;

    // feedback_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    }

    // feedback_dto->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "createdAt");
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // feedback_dto->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "text");
    if (text) { 
    if(!cJSON_IsString(text) && !cJSON_IsNull(text))
    {
    goto end; //String
    }
    }

    // feedback_dto->state
    cJSON *state = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "state");
    if (state) { 
    state_local_nonprim = feedback_state_type_parseFromJSON(state); //custom
    }

    // feedback_dto->author
    cJSON *author = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "author");
    if (author) { 
    author_local_nonprim = feedback_author_dto_parseFromJSON(author); //nonprimitive
    }

    // feedback_dto->pro
    cJSON *pro = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "pro");
    if (pro) { 
    if(!cJSON_IsString(pro) && !cJSON_IsNull(pro))
    {
    goto end; //String
    }
    }

    // feedback_dto->contra
    cJSON *contra = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "contra");
    if (contra) { 
    if(!cJSON_IsString(contra) && !cJSON_IsNull(contra))
    {
    goto end; //String
    }
    }

    // feedback_dto->comments
    cJSON *comments = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "comments");
    if (!comments) {
        goto end;
    }

    
    cJSON *comments_local_nonprimitive = NULL;
    if(!cJSON_IsArray(comments)){
        goto end; //nonprimitive container
    }

    commentsList = list_createList();

    cJSON_ArrayForEach(comments_local_nonprimitive,comments )
    {
        if(!cJSON_IsObject(comments_local_nonprimitive)){
            goto end;
        }
        feedback_comment_dto_t *commentsItem = feedback_comment_dto_parseFromJSON(comments_local_nonprimitive);

        list_addElement(commentsList, commentsItem);
    }

    // feedback_dto->shop
    cJSON *shop = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "shop");
    if (shop) { 
    shop_local_nonprim = feedback_shop_dto_parseFromJSON(shop); //nonprimitive
    }

    // feedback_dto->resolved
    cJSON *resolved = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "resolved");
    if (resolved) { 
    if(!cJSON_IsBool(resolved))
    {
    goto end; //Bool
    }
    }

    // feedback_dto->verified
    cJSON *verified = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "verified");
    if (verified) { 
    if(!cJSON_IsBool(verified))
    {
    goto end; //Bool
    }
    }

    // feedback_dto->recommend
    cJSON *recommend = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "recommend");
    if (recommend) { 
    if(!cJSON_IsBool(recommend))
    {
    goto end; //Bool
    }
    }

    // feedback_dto->grades
    cJSON *grades = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "grades");
    if (grades) { 
    grades_local_nonprim = feedback_grades_dto_parseFromJSON(grades); //nonprimitive
    }

    // feedback_dto->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(feedback_dtoJSON, "order");
    if (order) { 
    order_local_nonprim = feedback_order_dto_parseFromJSON(order); //nonprimitive
    }


    feedback_dto_local_var = feedback_dto_create (
        id ? id->valuedouble : 0,
        created_at && !cJSON_IsNull(created_at) ? strdup(created_at->valuestring) : NULL,
        text && !cJSON_IsNull(text) ? strdup(text->valuestring) : NULL,
        state ? state_local_nonprim : NULL,
        author ? author_local_nonprim : NULL,
        pro && !cJSON_IsNull(pro) ? strdup(pro->valuestring) : NULL,
        contra && !cJSON_IsNull(contra) ? strdup(contra->valuestring) : NULL,
        commentsList,
        shop ? shop_local_nonprim : NULL,
        resolved ? resolved->valueint : 0,
        verified ? verified->valueint : 0,
        recommend ? recommend->valueint : 0,
        grades ? grades_local_nonprim : NULL,
        order ? order_local_nonprim : NULL
        );

    return feedback_dto_local_var;
end:
    if (state_local_nonprim) {
        feedback_state_type_free(state_local_nonprim);
        state_local_nonprim = NULL;
    }
    if (author_local_nonprim) {
        feedback_author_dto_free(author_local_nonprim);
        author_local_nonprim = NULL;
    }
    if (commentsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, commentsList) {
            feedback_comment_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(commentsList);
        commentsList = NULL;
    }
    if (shop_local_nonprim) {
        feedback_shop_dto_free(shop_local_nonprim);
        shop_local_nonprim = NULL;
    }
    if (grades_local_nonprim) {
        feedback_grades_dto_free(grades_local_nonprim);
        grades_local_nonprim = NULL;
    }
    if (order_local_nonprim) {
        feedback_order_dto_free(order_local_nonprim);
        order_local_nonprim = NULL;
    }
    return NULL;

}
