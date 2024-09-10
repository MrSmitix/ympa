#ifndef warehouse_stock_type_TEST
#define warehouse_stock_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define warehouse_stock_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/warehouse_stock_type.h"
warehouse_stock_type_t* instantiate_warehouse_stock_type(int include_optional);



warehouse_stock_type_t* instantiate_warehouse_stock_type(int include_optional) {
  warehouse_stock_type_t* warehouse_stock_type = NULL;
  if (include_optional) {
    warehouse_stock_type = warehouse_stock_type_create(
    );
  } else {
    warehouse_stock_type = warehouse_stock_type_create(
    );
  }

  return warehouse_stock_type;
}


#ifdef warehouse_stock_type_MAIN

void test_warehouse_stock_type(int include_optional) {
    warehouse_stock_type_t* warehouse_stock_type_1 = instantiate_warehouse_stock_type(include_optional);

	cJSON* jsonwarehouse_stock_type_1 = warehouse_stock_type_convertToJSON(warehouse_stock_type_1);
	printf("warehouse_stock_type :\n%s\n", cJSON_Print(jsonwarehouse_stock_type_1));
	warehouse_stock_type_t* warehouse_stock_type_2 = warehouse_stock_type_parseFromJSON(jsonwarehouse_stock_type_1);
	cJSON* jsonwarehouse_stock_type_2 = warehouse_stock_type_convertToJSON(warehouse_stock_type_2);
	printf("repeating warehouse_stock_type:\n%s\n", cJSON_Print(jsonwarehouse_stock_type_2));
}

int main() {
  test_warehouse_stock_type(1);
  test_warehouse_stock_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // warehouse_stock_type_MAIN
#endif // warehouse_stock_type_TEST
