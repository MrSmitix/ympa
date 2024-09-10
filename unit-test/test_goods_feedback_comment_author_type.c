#ifndef goods_feedback_comment_author_type_TEST
#define goods_feedback_comment_author_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define goods_feedback_comment_author_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/goods_feedback_comment_author_type.h"
goods_feedback_comment_author_type_t* instantiate_goods_feedback_comment_author_type(int include_optional);



goods_feedback_comment_author_type_t* instantiate_goods_feedback_comment_author_type(int include_optional) {
  goods_feedback_comment_author_type_t* goods_feedback_comment_author_type = NULL;
  if (include_optional) {
    goods_feedback_comment_author_type = goods_feedback_comment_author_type_create(
    );
  } else {
    goods_feedback_comment_author_type = goods_feedback_comment_author_type_create(
    );
  }

  return goods_feedback_comment_author_type;
}


#ifdef goods_feedback_comment_author_type_MAIN

void test_goods_feedback_comment_author_type(int include_optional) {
    goods_feedback_comment_author_type_t* goods_feedback_comment_author_type_1 = instantiate_goods_feedback_comment_author_type(include_optional);

	cJSON* jsongoods_feedback_comment_author_type_1 = goods_feedback_comment_author_type_convertToJSON(goods_feedback_comment_author_type_1);
	printf("goods_feedback_comment_author_type :\n%s\n", cJSON_Print(jsongoods_feedback_comment_author_type_1));
	goods_feedback_comment_author_type_t* goods_feedback_comment_author_type_2 = goods_feedback_comment_author_type_parseFromJSON(jsongoods_feedback_comment_author_type_1);
	cJSON* jsongoods_feedback_comment_author_type_2 = goods_feedback_comment_author_type_convertToJSON(goods_feedback_comment_author_type_2);
	printf("repeating goods_feedback_comment_author_type:\n%s\n", cJSON_Print(jsongoods_feedback_comment_author_type_2));
}

int main() {
  test_goods_feedback_comment_author_type(1);
  test_goods_feedback_comment_author_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // goods_feedback_comment_author_type_MAIN
#endif // goods_feedback_comment_author_type_TEST
