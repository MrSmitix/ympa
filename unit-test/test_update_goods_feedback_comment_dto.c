#ifndef update_goods_feedback_comment_dto_TEST
#define update_goods_feedback_comment_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_goods_feedback_comment_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_goods_feedback_comment_dto.h"
update_goods_feedback_comment_dto_t* instantiate_update_goods_feedback_comment_dto(int include_optional);



update_goods_feedback_comment_dto_t* instantiate_update_goods_feedback_comment_dto(int include_optional) {
  update_goods_feedback_comment_dto_t* update_goods_feedback_comment_dto = NULL;
  if (include_optional) {
    update_goods_feedback_comment_dto = update_goods_feedback_comment_dto_create(
      56,
      56,
      "0"
    );
  } else {
    update_goods_feedback_comment_dto = update_goods_feedback_comment_dto_create(
      56,
      56,
      "0"
    );
  }

  return update_goods_feedback_comment_dto;
}


#ifdef update_goods_feedback_comment_dto_MAIN

void test_update_goods_feedback_comment_dto(int include_optional) {
    update_goods_feedback_comment_dto_t* update_goods_feedback_comment_dto_1 = instantiate_update_goods_feedback_comment_dto(include_optional);

	cJSON* jsonupdate_goods_feedback_comment_dto_1 = update_goods_feedback_comment_dto_convertToJSON(update_goods_feedback_comment_dto_1);
	printf("update_goods_feedback_comment_dto :\n%s\n", cJSON_Print(jsonupdate_goods_feedback_comment_dto_1));
	update_goods_feedback_comment_dto_t* update_goods_feedback_comment_dto_2 = update_goods_feedback_comment_dto_parseFromJSON(jsonupdate_goods_feedback_comment_dto_1);
	cJSON* jsonupdate_goods_feedback_comment_dto_2 = update_goods_feedback_comment_dto_convertToJSON(update_goods_feedback_comment_dto_2);
	printf("repeating update_goods_feedback_comment_dto:\n%s\n", cJSON_Print(jsonupdate_goods_feedback_comment_dto_2));
}

int main() {
  test_update_goods_feedback_comment_dto(1);
  test_update_goods_feedback_comment_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_goods_feedback_comment_dto_MAIN
#endif // update_goods_feedback_comment_dto_TEST
