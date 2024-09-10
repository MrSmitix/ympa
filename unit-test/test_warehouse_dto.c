#ifndef warehouse_dto_TEST
#define warehouse_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define warehouse_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/warehouse_dto.h"
warehouse_dto_t* instantiate_warehouse_dto(int include_optional);

#include "test_warehouse_address_dto.c"


warehouse_dto_t* instantiate_warehouse_dto(int include_optional) {
  warehouse_dto_t* warehouse_dto = NULL;
  if (include_optional) {
    warehouse_dto = warehouse_dto_create(
      56,
      "0",
      56,
      1,
       // false, not to have infinite recursion
      instantiate_warehouse_address_dto(0)
    );
  } else {
    warehouse_dto = warehouse_dto_create(
      56,
      "0",
      56,
      1,
      NULL
    );
  }

  return warehouse_dto;
}


#ifdef warehouse_dto_MAIN

void test_warehouse_dto(int include_optional) {
    warehouse_dto_t* warehouse_dto_1 = instantiate_warehouse_dto(include_optional);

	cJSON* jsonwarehouse_dto_1 = warehouse_dto_convertToJSON(warehouse_dto_1);
	printf("warehouse_dto :\n%s\n", cJSON_Print(jsonwarehouse_dto_1));
	warehouse_dto_t* warehouse_dto_2 = warehouse_dto_parseFromJSON(jsonwarehouse_dto_1);
	cJSON* jsonwarehouse_dto_2 = warehouse_dto_convertToJSON(warehouse_dto_2);
	printf("repeating warehouse_dto:\n%s\n", cJSON_Print(jsonwarehouse_dto_2));
}

int main() {
  test_warehouse_dto(1);
  test_warehouse_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // warehouse_dto_MAIN
#endif // warehouse_dto_TEST
