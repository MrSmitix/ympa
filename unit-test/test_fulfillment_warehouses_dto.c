#ifndef fulfillment_warehouses_dto_TEST
#define fulfillment_warehouses_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fulfillment_warehouses_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fulfillment_warehouses_dto.h"
fulfillment_warehouses_dto_t* instantiate_fulfillment_warehouses_dto(int include_optional);



fulfillment_warehouses_dto_t* instantiate_fulfillment_warehouses_dto(int include_optional) {
  fulfillment_warehouses_dto_t* fulfillment_warehouses_dto = NULL;
  if (include_optional) {
    fulfillment_warehouses_dto = fulfillment_warehouses_dto_create(
      list_createList()
    );
  } else {
    fulfillment_warehouses_dto = fulfillment_warehouses_dto_create(
      list_createList()
    );
  }

  return fulfillment_warehouses_dto;
}


#ifdef fulfillment_warehouses_dto_MAIN

void test_fulfillment_warehouses_dto(int include_optional) {
    fulfillment_warehouses_dto_t* fulfillment_warehouses_dto_1 = instantiate_fulfillment_warehouses_dto(include_optional);

	cJSON* jsonfulfillment_warehouses_dto_1 = fulfillment_warehouses_dto_convertToJSON(fulfillment_warehouses_dto_1);
	printf("fulfillment_warehouses_dto :\n%s\n", cJSON_Print(jsonfulfillment_warehouses_dto_1));
	fulfillment_warehouses_dto_t* fulfillment_warehouses_dto_2 = fulfillment_warehouses_dto_parseFromJSON(jsonfulfillment_warehouses_dto_1);
	cJSON* jsonfulfillment_warehouses_dto_2 = fulfillment_warehouses_dto_convertToJSON(fulfillment_warehouses_dto_2);
	printf("repeating fulfillment_warehouses_dto:\n%s\n", cJSON_Print(jsonfulfillment_warehouses_dto_2));
}

int main() {
  test_fulfillment_warehouses_dto(1);
  test_fulfillment_warehouses_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // fulfillment_warehouses_dto_MAIN
#endif // fulfillment_warehouses_dto_TEST
