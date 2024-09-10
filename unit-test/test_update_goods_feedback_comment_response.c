#ifndef update_goods_feedback_comment_response_TEST
#define update_goods_feedback_comment_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_goods_feedback_comment_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_goods_feedback_comment_response.h"
update_goods_feedback_comment_response_t* instantiate_update_goods_feedback_comment_response(int include_optional);

#include "test_goods_feedback_comment_dto.c"


update_goods_feedback_comment_response_t* instantiate_update_goods_feedback_comment_response(int include_optional) {
  update_goods_feedback_comment_response_t* update_goods_feedback_comment_response = NULL;
  if (include_optional) {
    update_goods_feedback_comment_response = update_goods_feedback_comment_response_create(
      _api__update_goods_feedback_comment_response__OK,
       // false, not to have infinite recursion
      instantiate_goods_feedback_comment_dto(0)
    );
  } else {
    update_goods_feedback_comment_response = update_goods_feedback_comment_response_create(
      _api__update_goods_feedback_comment_response__OK,
      NULL
    );
  }

  return update_goods_feedback_comment_response;
}


#ifdef update_goods_feedback_comment_response_MAIN

void test_update_goods_feedback_comment_response(int include_optional) {
    update_goods_feedback_comment_response_t* update_goods_feedback_comment_response_1 = instantiate_update_goods_feedback_comment_response(include_optional);

	cJSON* jsonupdate_goods_feedback_comment_response_1 = update_goods_feedback_comment_response_convertToJSON(update_goods_feedback_comment_response_1);
	printf("update_goods_feedback_comment_response :\n%s\n", cJSON_Print(jsonupdate_goods_feedback_comment_response_1));
	update_goods_feedback_comment_response_t* update_goods_feedback_comment_response_2 = update_goods_feedback_comment_response_parseFromJSON(jsonupdate_goods_feedback_comment_response_1);
	cJSON* jsonupdate_goods_feedback_comment_response_2 = update_goods_feedback_comment_response_convertToJSON(update_goods_feedback_comment_response_2);
	printf("repeating update_goods_feedback_comment_response:\n%s\n", cJSON_Print(jsonupdate_goods_feedback_comment_response_2));
}

int main() {
  test_update_goods_feedback_comment_response(1);
  test_update_goods_feedback_comment_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_goods_feedback_comment_response_MAIN
#endif // update_goods_feedback_comment_response_TEST
