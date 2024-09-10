#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "outlet_licenses_response_dto.h"



outlet_licenses_response_dto_t *outlet_licenses_response_dto_create(
    list_t *licenses
    ) {
    outlet_licenses_response_dto_t *outlet_licenses_response_dto_local_var = malloc(sizeof(outlet_licenses_response_dto_t));
    if (!outlet_licenses_response_dto_local_var) {
        return NULL;
    }
    outlet_licenses_response_dto_local_var->licenses = licenses;

    return outlet_licenses_response_dto_local_var;
}


void outlet_licenses_response_dto_free(outlet_licenses_response_dto_t *outlet_licenses_response_dto) {
    if(NULL == outlet_licenses_response_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (outlet_licenses_response_dto->licenses) {
        list_ForEach(listEntry, outlet_licenses_response_dto->licenses) {
            full_outlet_license_dto_free(listEntry->data);
        }
        list_freeList(outlet_licenses_response_dto->licenses);
        outlet_licenses_response_dto->licenses = NULL;
    }
    free(outlet_licenses_response_dto);
}

cJSON *outlet_licenses_response_dto_convertToJSON(outlet_licenses_response_dto_t *outlet_licenses_response_dto) {
    cJSON *item = cJSON_CreateObject();

    // outlet_licenses_response_dto->licenses
    if (!outlet_licenses_response_dto->licenses) {
        goto fail;
    }
    cJSON *licenses = cJSON_AddArrayToObject(item, "licenses");
    if(licenses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *licensesListEntry;
    if (outlet_licenses_response_dto->licenses) {
    list_ForEach(licensesListEntry, outlet_licenses_response_dto->licenses) {
    cJSON *itemLocal = full_outlet_license_dto_convertToJSON(licensesListEntry->data);
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

outlet_licenses_response_dto_t *outlet_licenses_response_dto_parseFromJSON(cJSON *outlet_licenses_response_dtoJSON){

    outlet_licenses_response_dto_t *outlet_licenses_response_dto_local_var = NULL;

    // define the local list for outlet_licenses_response_dto->licenses
    list_t *licensesList = NULL;

    // outlet_licenses_response_dto->licenses
    cJSON *licenses = cJSON_GetObjectItemCaseSensitive(outlet_licenses_response_dtoJSON, "licenses");
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
        full_outlet_license_dto_t *licensesItem = full_outlet_license_dto_parseFromJSON(licenses_local_nonprimitive);

        list_addElement(licensesList, licensesItem);
    }


    outlet_licenses_response_dto_local_var = outlet_licenses_response_dto_create (
        licensesList
        );

    return outlet_licenses_response_dto_local_var;
end:
    if (licensesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, licensesList) {
            full_outlet_license_dto_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(licensesList);
        licensesList = NULL;
    }
    return NULL;

}
