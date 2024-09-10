#ifndef warehouse_stock_dto_TEST
#define warehouse_stock_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define warehouse_stock_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/warehouse_stock_dto.h"
warehouse_stock_dto_t* instantiate_warehouse_stock_dto(int include_optional);



warehouse_stock_dto_t* instantiate_warehouse_stock_dto(int include_optional) {
  warehouse_stock_dto_t* warehouse_stock_dto = NULL;
  if (include_optional) {
    warehouse_stock_dto = warehouse_stock_dto_create(
      _api__warehouse_stock_dto__FIT,
      56
    );
  } else {
    warehouse_stock_dto = warehouse_stock_dto_create(
      _api__warehouse_stock_dto__FIT,
      56
    );
  }

  return warehouse_stock_dto;
}


#ifdef warehouse_stock_dto_MAIN

void test_warehouse_stock_dto(int include_optional) {
    warehouse_stock_dto_t* warehouse_stock_dto_1 = instantiate_warehouse_stock_dto(include_optional);

	cJSON* jsonwarehouse_stock_dto_1 = warehouse_stock_dto_convertToJSON(warehouse_stock_dto_1);
	printf("warehouse_stock_dto :\n%s\n", cJSON_Print(jsonwarehouse_stock_dto_1));
	warehouse_stock_dto_t* warehouse_stock_dto_2 = warehouse_stock_dto_parseFromJSON(jsonwarehouse_stock_dto_1);
	cJSON* jsonwarehouse_stock_dto_2 = warehouse_stock_dto_convertToJSON(warehouse_stock_dto_2);
	printf("repeating warehouse_stock_dto:\n%s\n", cJSON_Print(jsonwarehouse_stock_dto_2));
}

int main() {
  test_warehouse_stock_dto(1);
  test_warehouse_stock_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // warehouse_stock_dto_MAIN
#endif // warehouse_stock_dto_TEST
