#ifndef get_warehouse_stocks_dto_TEST
#define get_warehouse_stocks_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_warehouse_stocks_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_warehouse_stocks_dto.h"
get_warehouse_stocks_dto_t* instantiate_get_warehouse_stocks_dto(int include_optional);

#include "test_scrolling_pager_dto.c"


get_warehouse_stocks_dto_t* instantiate_get_warehouse_stocks_dto(int include_optional) {
  get_warehouse_stocks_dto_t* get_warehouse_stocks_dto = NULL;
  if (include_optional) {
    get_warehouse_stocks_dto = get_warehouse_stocks_dto_create(
       // false, not to have infinite recursion
      instantiate_scrolling_pager_dto(0),
      list_createList()
    );
  } else {
    get_warehouse_stocks_dto = get_warehouse_stocks_dto_create(
      NULL,
      list_createList()
    );
  }

  return get_warehouse_stocks_dto;
}


#ifdef get_warehouse_stocks_dto_MAIN

void test_get_warehouse_stocks_dto(int include_optional) {
    get_warehouse_stocks_dto_t* get_warehouse_stocks_dto_1 = instantiate_get_warehouse_stocks_dto(include_optional);

	cJSON* jsonget_warehouse_stocks_dto_1 = get_warehouse_stocks_dto_convertToJSON(get_warehouse_stocks_dto_1);
	printf("get_warehouse_stocks_dto :\n%s\n", cJSON_Print(jsonget_warehouse_stocks_dto_1));
	get_warehouse_stocks_dto_t* get_warehouse_stocks_dto_2 = get_warehouse_stocks_dto_parseFromJSON(jsonget_warehouse_stocks_dto_1);
	cJSON* jsonget_warehouse_stocks_dto_2 = get_warehouse_stocks_dto_convertToJSON(get_warehouse_stocks_dto_2);
	printf("repeating get_warehouse_stocks_dto:\n%s\n", cJSON_Print(jsonget_warehouse_stocks_dto_2));
}

int main() {
  test_get_warehouse_stocks_dto(1);
  test_get_warehouse_stocks_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_warehouse_stocks_dto_MAIN
#endif // get_warehouse_stocks_dto_TEST
