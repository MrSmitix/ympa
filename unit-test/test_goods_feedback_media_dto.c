#ifndef goods_feedback_media_dto_TEST
#define goods_feedback_media_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define goods_feedback_media_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/goods_feedback_media_dto.h"
goods_feedback_media_dto_t* instantiate_goods_feedback_media_dto(int include_optional);



goods_feedback_media_dto_t* instantiate_goods_feedback_media_dto(int include_optional) {
  goods_feedback_media_dto_t* goods_feedback_media_dto = NULL;
  if (include_optional) {
    goods_feedback_media_dto = goods_feedback_media_dto_create(
      list_createList(),
      list_createList()
    );
  } else {
    goods_feedback_media_dto = goods_feedback_media_dto_create(
      list_createList(),
      list_createList()
    );
  }

  return goods_feedback_media_dto;
}


#ifdef goods_feedback_media_dto_MAIN

void test_goods_feedback_media_dto(int include_optional) {
    goods_feedback_media_dto_t* goods_feedback_media_dto_1 = instantiate_goods_feedback_media_dto(include_optional);

	cJSON* jsongoods_feedback_media_dto_1 = goods_feedback_media_dto_convertToJSON(goods_feedback_media_dto_1);
	printf("goods_feedback_media_dto :\n%s\n", cJSON_Print(jsongoods_feedback_media_dto_1));
	goods_feedback_media_dto_t* goods_feedback_media_dto_2 = goods_feedback_media_dto_parseFromJSON(jsongoods_feedback_media_dto_1);
	cJSON* jsongoods_feedback_media_dto_2 = goods_feedback_media_dto_convertToJSON(goods_feedback_media_dto_2);
	printf("repeating goods_feedback_media_dto:\n%s\n", cJSON_Print(jsongoods_feedback_media_dto_2));
}

int main() {
  test_goods_feedback_media_dto(1);
  test_goods_feedback_media_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // goods_feedback_media_dto_MAIN
#endif // goods_feedback_media_dto_TEST
