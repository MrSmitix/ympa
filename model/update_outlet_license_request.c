#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_outlet_license_request.h"



update_outlet_license_request_t *update_outlet_license_request_create(
    list_t *licenses
    ) {
    update_outlet_license_request_t *update_outlet_license_request_local_var = malloc(sizeof(update_outlet_license_request_t));
    if (!update_outlet_license_request_local_var) {
        return NULL;
    }
    update_outlet_license_request_local_var->licenses = licenses;

    return update_outlet_license_request_local_var;
}


void update_outlet_license_request_free(update_outlet_license_request_t *update_outlet_license_request) {
    if(NULL == update_outlet_license_request){
        return ;
    }
    listEntry_t *listEntry;
    if (update_outlet_license_request->licenses) {
        list_ForEach(listEntry, update_outlet_license_request->licenses) {
            outlet_license_dto_free(listEntry->data);
        }
        list_freeList(update_outlet_license_request->licenses);
        update_outlet_license_request->licenses = NULL;
    }
    free(update_outlet_license_request);
}

cJSON *update_outlet_license_request_convertToJSON(update_outlet_license_request_t *update_outlet_license_request) {
    cJSON *item = cJSON_CreateObject();

    // update_outlet_license_request->licenses
    if (!update_outlet_license_request->licenses) {
        goto fail;
    }
    cJSON *licenses = cJSON_AddArrayToObject(item, "licenses");
    if(licenses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *licensesListEntry;
    if (update_outlet_license_request->licenses) {
    list_ForEach(licensesListEntry, update_outlet_license_request->licenses) {
    cJSON *itemLocal = outlet_license_dto_convertToJSON(licensesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(licenses, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_outlet_license_request_t *update_outlet_license_request_parseFromJSON(cJSON *update_outlet_license_requestJSON){

    update_outlet_license_request_t *update_outlet_license_request_local_var = NULL;

    // define the local list for update_outlet_license_request->licenses
    list_t *licensesList = NULL;

    // update_outlet_license_request->licenses
    cJSON *licenses = cJSON_GetObjectItemCaseSensitive(update_outlet_license_requestJSON, "licenses");
    if (!licenses) {
        goto end;
    }

    
    cJSON *licenses_local_nonprimitive = NULL;
    if(!cJSON_IsArray(licenses)){
        goto end; //nonprimitive container
    }

    licensesList = list_createList();

    cJSON_ArrayForEach(licenses_local_nonprimitive,licenses )
    {
        if(!cJSON_IsObject(licenses_local_nonprimitive)){
            goto end;
        }
        outlet_license_dto_t *licensesItem = outlet_license_dto_parseFromJSON(licenses_local_nonprimitive);

        list_addElement(licensesList, licensesItem);
    }


    update_outlet_license_request_local_var = update_outlet_license_request_create (
        licensesList
        );

    return update_outlet_license_request_local_var;
end:
    if (licensesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, licensesList) {
            outlet_license_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(licensesList);
        licensesList = NULL;
    }
    return NULL;

}
