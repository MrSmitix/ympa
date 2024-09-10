#ifndef warehouse_offers_dto_TEST
#define warehouse_offers_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define warehouse_offers_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/warehouse_offers_dto.h"
warehouse_offers_dto_t* instantiate_warehouse_offers_dto(int include_optional);



warehouse_offers_dto_t* instantiate_warehouse_offers_dto(int include_optional) {
  warehouse_offers_dto_t* warehouse_offers_dto = NULL;
  if (include_optional) {
    warehouse_offers_dto = warehouse_offers_dto_create(
      56,
      list_createList()
    );
  } else {
    warehouse_offers_dto = warehouse_offers_dto_create(
      56,
      list_createList()
    );
  }

  return warehouse_offers_dto;
}


#ifdef warehouse_offers_dto_MAIN

void test_warehouse_offers_dto(int include_optional) {
    warehouse_offers_dto_t* warehouse_offers_dto_1 = instantiate_warehouse_offers_dto(include_optional);

	cJSON* jsonwarehouse_offers_dto_1 = warehouse_offers_dto_convertToJSON(warehouse_offers_dto_1);
	printf("warehouse_offers_dto :\n%s\n", cJSON_Print(jsonwarehouse_offers_dto_1));
	warehouse_offers_dto_t* warehouse_offers_dto_2 = warehouse_offers_dto_parseFromJSON(jsonwarehouse_offers_dto_1);
	cJSON* jsonwarehouse_offers_dto_2 = warehouse_offers_dto_convertToJSON(warehouse_offers_dto_2);
	printf("repeating warehouse_offers_dto:\n%s\n", cJSON_Print(jsonwarehouse_offers_dto_2));
}

int main() {
  test_warehouse_offers_dto(1);
  test_warehouse_offers_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // warehouse_offers_dto_MAIN
#endif // warehouse_offers_dto_TEST
