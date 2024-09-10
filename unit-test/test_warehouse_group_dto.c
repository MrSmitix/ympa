#ifndef warehouse_group_dto_TEST
#define warehouse_group_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define warehouse_group_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/warehouse_group_dto.h"
warehouse_group_dto_t* instantiate_warehouse_group_dto(int include_optional);

#include "test_warehouse_dto.c"


warehouse_group_dto_t* instantiate_warehouse_group_dto(int include_optional) {
  warehouse_group_dto_t* warehouse_group_dto = NULL;
  if (include_optional) {
    warehouse_group_dto = warehouse_group_dto_create(
      "0",
       // false, not to have infinite recursion
      instantiate_warehouse_dto(0),
      list_createList()
    );
  } else {
    warehouse_group_dto = warehouse_group_dto_create(
      "0",
      NULL,
      list_createList()
    );
  }

  return warehouse_group_dto;
}


#ifdef warehouse_group_dto_MAIN

void test_warehouse_group_dto(int include_optional) {
    warehouse_group_dto_t* warehouse_group_dto_1 = instantiate_warehouse_group_dto(include_optional);

	cJSON* jsonwarehouse_group_dto_1 = warehouse_group_dto_convertToJSON(warehouse_group_dto_1);
	printf("warehouse_group_dto :\n%s\n", cJSON_Print(jsonwarehouse_group_dto_1));
	warehouse_group_dto_t* warehouse_group_dto_2 = warehouse_group_dto_parseFromJSON(jsonwarehouse_group_dto_1);
	cJSON* jsonwarehouse_group_dto_2 = warehouse_group_dto_convertToJSON(warehouse_group_dto_2);
	printf("repeating warehouse_group_dto:\n%s\n", cJSON_Print(jsonwarehouse_group_dto_2));
}

int main() {
  test_warehouse_group_dto(1);
  test_warehouse_group_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // warehouse_group_dto_MAIN
#endif // warehouse_group_dto_TEST
