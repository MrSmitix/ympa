#ifndef warehouse_offer_dto_TEST
#define warehouse_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define warehouse_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/warehouse_offer_dto.h"
warehouse_offer_dto_t* instantiate_warehouse_offer_dto(int include_optional);

#include "test_turnover_dto.c"


warehouse_offer_dto_t* instantiate_warehouse_offer_dto(int include_optional) {
  warehouse_offer_dto_t* warehouse_offer_dto = NULL;
  if (include_optional) {
    warehouse_offer_dto = warehouse_offer_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_turnover_dto(0),
      list_createList(),
      "2013-10-20T19:20:30+01:00"
    );
  } else {
    warehouse_offer_dto = warehouse_offer_dto_create(
      "a",
      NULL,
      list_createList(),
      "2013-10-20T19:20:30+01:00"
    );
  }

  return warehouse_offer_dto;
}


#ifdef warehouse_offer_dto_MAIN

void test_warehouse_offer_dto(int include_optional) {
    warehouse_offer_dto_t* warehouse_offer_dto_1 = instantiate_warehouse_offer_dto(include_optional);

	cJSON* jsonwarehouse_offer_dto_1 = warehouse_offer_dto_convertToJSON(warehouse_offer_dto_1);
	printf("warehouse_offer_dto :\n%s\n", cJSON_Print(jsonwarehouse_offer_dto_1));
	warehouse_offer_dto_t* warehouse_offer_dto_2 = warehouse_offer_dto_parseFromJSON(jsonwarehouse_offer_dto_1);
	cJSON* jsonwarehouse_offer_dto_2 = warehouse_offer_dto_convertToJSON(warehouse_offer_dto_2);
	printf("repeating warehouse_offer_dto:\n%s\n", cJSON_Print(jsonwarehouse_offer_dto_2));
}

int main() {
  test_warehouse_offer_dto(1);
  test_warehouse_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // warehouse_offer_dto_MAIN
#endif // warehouse_offer_dto_TEST
