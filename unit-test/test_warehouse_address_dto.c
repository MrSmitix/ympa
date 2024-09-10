#ifndef warehouse_address_dto_TEST
#define warehouse_address_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define warehouse_address_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/warehouse_address_dto.h"
warehouse_address_dto_t* instantiate_warehouse_address_dto(int include_optional);

#include "test_gps_dto.c"


warehouse_address_dto_t* instantiate_warehouse_address_dto(int include_optional) {
  warehouse_address_dto_t* warehouse_address_dto = NULL;
  if (include_optional) {
    warehouse_address_dto = warehouse_address_dto_create(
      "0",
      "0",
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_gps_dto(0)
    );
  } else {
    warehouse_address_dto = warehouse_address_dto_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      NULL
    );
  }

  return warehouse_address_dto;
}


#ifdef warehouse_address_dto_MAIN

void test_warehouse_address_dto(int include_optional) {
    warehouse_address_dto_t* warehouse_address_dto_1 = instantiate_warehouse_address_dto(include_optional);

	cJSON* jsonwarehouse_address_dto_1 = warehouse_address_dto_convertToJSON(warehouse_address_dto_1);
	printf("warehouse_address_dto :\n%s\n", cJSON_Print(jsonwarehouse_address_dto_1));
	warehouse_address_dto_t* warehouse_address_dto_2 = warehouse_address_dto_parseFromJSON(jsonwarehouse_address_dto_1);
	cJSON* jsonwarehouse_address_dto_2 = warehouse_address_dto_convertToJSON(warehouse_address_dto_2);
	printf("repeating warehouse_address_dto:\n%s\n", cJSON_Print(jsonwarehouse_address_dto_2));
}

int main() {
  test_warehouse_address_dto(1);
  test_warehouse_address_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // warehouse_address_dto_MAIN
#endif // warehouse_address_dto_TEST
