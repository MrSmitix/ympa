#ifndef extension_shipment_dto_TEST
#define extension_shipment_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define extension_shipment_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/extension_shipment_dto.h"
extension_shipment_dto_t* instantiate_extension_shipment_dto(int include_optional);

#include "test_shipment_status_change_dto.c"


extension_shipment_dto_t* instantiate_extension_shipment_dto(int include_optional) {
  extension_shipment_dto_t* extension_shipment_dto = NULL;
  if (include_optional) {
    extension_shipment_dto = extension_shipment_dto_create(
       // false, not to have infinite recursion
      instantiate_shipment_status_change_dto(0),
      list_createList()
    );
  } else {
    extension_shipment_dto = extension_shipment_dto_create(
      NULL,
      list_createList()
    );
  }

  return extension_shipment_dto;
}


#ifdef extension_shipment_dto_MAIN

void test_extension_shipment_dto(int include_optional) {
    extension_shipment_dto_t* extension_shipment_dto_1 = instantiate_extension_shipment_dto(include_optional);

	cJSON* jsonextension_shipment_dto_1 = extension_shipment_dto_convertToJSON(extension_shipment_dto_1);
	printf("extension_shipment_dto :\n%s\n", cJSON_Print(jsonextension_shipment_dto_1));
	extension_shipment_dto_t* extension_shipment_dto_2 = extension_shipment_dto_parseFromJSON(jsonextension_shipment_dto_1);
	cJSON* jsonextension_shipment_dto_2 = extension_shipment_dto_convertToJSON(extension_shipment_dto_2);
	printf("repeating extension_shipment_dto:\n%s\n", cJSON_Print(jsonextension_shipment_dto_2));
}

int main() {
  test_extension_shipment_dto(1);
  test_extension_shipment_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // extension_shipment_dto_MAIN
#endif // extension_shipment_dto_TEST
