#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_working_schedule_dto.h"



outlet_working_schedule_dto_t *outlet_working_schedule_dto_create(
    int work_in_holiday,
    list_t *schedule_items
    ) {
    outlet_working_schedule_dto_t *outlet_working_schedule_dto_local_var = malloc(sizeof(outlet_working_schedule_dto_t));
    if (!outlet_working_schedule_dto_local_var) {
        return NULL;
    }
    outlet_working_schedule_dto_local_var->work_in_holiday = work_in_holiday;
    outlet_working_schedule_dto_local_var->schedule_items = schedule_items;

    return outlet_working_schedule_dto_local_var;
}


void outlet_working_schedule_dto_free(outlet_working_schedule_dto_t *outlet_working_schedule_dto) {
    if(NULL == outlet_working_schedule_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (outlet_working_schedule_dto->schedule_items) {
        list_ForEach(listEntry, outlet_working_schedule_dto->schedule_items) {
            outlet_working_schedule_item_dto_free(listEntry->data);
        }
        list_freeList(outlet_working_schedule_dto->schedule_items);
        outlet_working_schedule_dto->schedule_items = NULL;
    }
    free(outlet_working_schedule_dto);
}

cJSON *outlet_working_schedule_dto_convertToJSON(outlet_working_schedule_dto_t *outlet_working_schedule_dto) {
    cJSON *item = cJSON_CreateObject();

    // outlet_working_schedule_dto->work_in_holiday
    if(outlet_working_schedule_dto->work_in_holiday) {
    if(cJSON_AddBoolToObject(item, "workInHoliday", outlet_working_schedule_dto->work_in_holiday) == NULL) {
    goto fail; //Bool
    }
    }


    // outlet_working_schedule_dto->schedule_items
    if (!outlet_working_schedule_dto->schedule_items) {
        goto fail;
    }
    cJSON *schedule_items = cJSON_AddArrayToObject(item, "scheduleItems");
    if(schedule_items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *schedule_itemsListEntry;
    if (outlet_working_schedule_dto->schedule_items) {
    list_ForEach(schedule_itemsListEntry, outlet_working_schedule_dto->schedule_items) {
    cJSON *itemLocal = outlet_working_schedule_item_dto_convertToJSON(schedule_itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(schedule_items, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

outlet_working_schedule_dto_t *outlet_working_schedule_dto_parseFromJSON(cJSON *outlet_working_schedule_dtoJSON){

    outlet_working_schedule_dto_t *outlet_working_schedule_dto_local_var = NULL;

    // define the local list for outlet_working_schedule_dto->schedule_items
    list_t *schedule_itemsList = NULL;

    // outlet_working_schedule_dto->work_in_holiday
    cJSON *work_in_holiday = cJSON_GetObjectItemCaseSensitive(outlet_working_schedule_dtoJSON, "workInHoliday");
    if (work_in_holiday) { 
    if(!cJSON_IsBool(work_in_holiday))
    {
    goto end; //Bool
    }
    }

    // outlet_working_schedule_dto->schedule_items
    cJSON *schedule_items = cJSON_GetObjectItemCaseSensitive(outlet_working_schedule_dtoJSON, "scheduleItems");
    if (!schedule_items) {
        goto end;
    }

    
    cJSON *schedule_items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(schedule_items)){
        goto end; //nonprimitive container
    }

    schedule_itemsList = list_createList();

    cJSON_ArrayForEach(schedule_items_local_nonprimitive,schedule_items )
    {
        if(!cJSON_IsObject(schedule_items_local_nonprimitive)){
            goto end;
        }
        outlet_working_schedule_item_dto_t *schedule_itemsItem = outlet_working_schedule_item_dto_parseFromJSON(schedule_items_local_nonprimitive);

        list_addElement(schedule_itemsList, schedule_itemsItem);
    }


    outlet_working_schedule_dto_local_var = outlet_working_schedule_dto_create (
        work_in_holiday ? work_in_holiday->valueint : 0,
        schedule_itemsList
        );

    return outlet_working_schedule_dto_local_var;
end:
    if (schedule_itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, schedule_itemsList) {
            outlet_working_schedule_item_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(schedule_itemsList);
        schedule_itemsList = NULL;
    }
    return NULL;

}
