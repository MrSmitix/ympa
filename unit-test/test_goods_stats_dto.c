#ifndef goods_stats_dto_TEST
#define goods_stats_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define goods_stats_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/goods_stats_dto.h"
goods_stats_dto_t* instantiate_goods_stats_dto(int include_optional);



goods_stats_dto_t* instantiate_goods_stats_dto(int include_optional) {
  goods_stats_dto_t* goods_stats_dto = NULL;
  if (include_optional) {
    goods_stats_dto = goods_stats_dto_create(
      list_createList()
    );
  } else {
    goods_stats_dto = goods_stats_dto_create(
      list_createList()
    );
  }

  return goods_stats_dto;
}


#ifdef goods_stats_dto_MAIN

void test_goods_stats_dto(int include_optional) {
    goods_stats_dto_t* goods_stats_dto_1 = instantiate_goods_stats_dto(include_optional);

	cJSON* jsongoods_stats_dto_1 = goods_stats_dto_convertToJSON(goods_stats_dto_1);
	printf("goods_stats_dto :\n%s\n", cJSON_Print(jsongoods_stats_dto_1));
	goods_stats_dto_t* goods_stats_dto_2 = goods_stats_dto_parseFromJSON(jsongoods_stats_dto_1);
	cJSON* jsongoods_stats_dto_2 = goods_stats_dto_convertToJSON(goods_stats_dto_2);
	printf("repeating goods_stats_dto:\n%s\n", cJSON_Print(jsongoods_stats_dto_2));
}

int main() {
  test_goods_stats_dto(1);
  test_goods_stats_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // goods_stats_dto_MAIN
#endif // goods_stats_dto_TEST
