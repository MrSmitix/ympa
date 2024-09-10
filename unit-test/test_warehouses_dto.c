#ifndef warehouses_dto_TEST
#define warehouses_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define warehouses_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/warehouses_dto.h"
warehouses_dto_t* instantiate_warehouses_dto(int include_optional);



warehouses_dto_t* instantiate_warehouses_dto(int include_optional) {
  warehouses_dto_t* warehouses_dto = NULL;
  if (include_optional) {
    warehouses_dto = warehouses_dto_create(
      list_createList(),
      list_createList()
    );
  } else {
    warehouses_dto = warehouses_dto_create(
      list_createList(),
      list_createList()
    );
  }

  return warehouses_dto;
}


#ifdef warehouses_dto_MAIN

void test_warehouses_dto(int include_optional) {
    warehouses_dto_t* warehouses_dto_1 = instantiate_warehouses_dto(include_optional);

	cJSON* jsonwarehouses_dto_1 = warehouses_dto_convertToJSON(warehouses_dto_1);
	printf("warehouses_dto :\n%s\n", cJSON_Print(jsonwarehouses_dto_1));
	warehouses_dto_t* warehouses_dto_2 = warehouses_dto_parseFromJSON(jsonwarehouses_dto_1);
	cJSON* jsonwarehouses_dto_2 = warehouses_dto_convertToJSON(warehouses_dto_2);
	printf("repeating warehouses_dto:\n%s\n", cJSON_Print(jsonwarehouses_dto_2));
}

int main() {
  test_warehouses_dto(1);
  test_warehouses_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // warehouses_dto_MAIN
#endif // warehouses_dto_TEST
