#ifndef goods_stats_goods_dto_TEST
#define goods_stats_goods_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define goods_stats_goods_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/goods_stats_goods_dto.h"
goods_stats_goods_dto_t* instantiate_goods_stats_goods_dto(int include_optional);

#include "test_goods_stats_weight_dimensions_dto.c"


goods_stats_goods_dto_t* instantiate_goods_stats_goods_dto(int include_optional) {
  goods_stats_goods_dto_t* goods_stats_goods_dto = NULL;
  if (include_optional) {
    goods_stats_goods_dto = goods_stats_goods_dto_create(
      "a",
      56,
      "0",
      1.337,
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_goods_stats_weight_dimensions_dto(0),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    goods_stats_goods_dto = goods_stats_goods_dto_create(
      "a",
      56,
      "0",
      1.337,
      56,
      "0",
      NULL,
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return goods_stats_goods_dto;
}


#ifdef goods_stats_goods_dto_MAIN

void test_goods_stats_goods_dto(int include_optional) {
    goods_stats_goods_dto_t* goods_stats_goods_dto_1 = instantiate_goods_stats_goods_dto(include_optional);

	cJSON* jsongoods_stats_goods_dto_1 = goods_stats_goods_dto_convertToJSON(goods_stats_goods_dto_1);
	printf("goods_stats_goods_dto :\n%s\n", cJSON_Print(jsongoods_stats_goods_dto_1));
	goods_stats_goods_dto_t* goods_stats_goods_dto_2 = goods_stats_goods_dto_parseFromJSON(jsongoods_stats_goods_dto_1);
	cJSON* jsongoods_stats_goods_dto_2 = goods_stats_goods_dto_convertToJSON(goods_stats_goods_dto_2);
	printf("repeating goods_stats_goods_dto:\n%s\n", cJSON_Print(jsongoods_stats_goods_dto_2));
}

int main() {
  test_goods_stats_goods_dto(1);
  test_goods_stats_goods_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // goods_stats_goods_dto_MAIN
#endif // goods_stats_goods_dto_TEST
