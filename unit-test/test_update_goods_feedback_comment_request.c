#ifndef update_goods_feedback_comment_request_TEST
#define update_goods_feedback_comment_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_goods_feedback_comment_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_goods_feedback_comment_request.h"
update_goods_feedback_comment_request_t* instantiate_update_goods_feedback_comment_request(int include_optional);

#include "test_update_goods_feedback_comment_dto.c"


update_goods_feedback_comment_request_t* instantiate_update_goods_feedback_comment_request(int include_optional) {
  update_goods_feedback_comment_request_t* update_goods_feedback_comment_request = NULL;
  if (include_optional) {
    update_goods_feedback_comment_request = update_goods_feedback_comment_request_create(
      56,
       // false, not to have infinite recursion
      instantiate_update_goods_feedback_comment_dto(0)
    );
  } else {
    update_goods_feedback_comment_request = update_goods_feedback_comment_request_create(
      56,
      NULL
    );
  }

  return update_goods_feedback_comment_request;
}


#ifdef update_goods_feedback_comment_request_MAIN

void test_update_goods_feedback_comment_request(int include_optional) {
    update_goods_feedback_comment_request_t* update_goods_feedback_comment_request_1 = instantiate_update_goods_feedback_comment_request(include_optional);

	cJSON* jsonupdate_goods_feedback_comment_request_1 = update_goods_feedback_comment_request_convertToJSON(update_goods_feedback_comment_request_1);
	printf("update_goods_feedback_comment_request :\n%s\n", cJSON_Print(jsonupdate_goods_feedback_comment_request_1));
	update_goods_feedback_comment_request_t* update_goods_feedback_comment_request_2 = update_goods_feedback_comment_request_parseFromJSON(jsonupdate_goods_feedback_comment_request_1);
	cJSON* jsonupdate_goods_feedback_comment_request_2 = update_goods_feedback_comment_request_convertToJSON(update_goods_feedback_comment_request_2);
	printf("repeating update_goods_feedback_comment_request:\n%s\n", cJSON_Print(jsonupdate_goods_feedback_comment_request_2));
}

int main() {
  test_update_goods_feedback_comment_request(1);
  test_update_goods_feedback_comment_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_goods_feedback_comment_request_MAIN
#endif // update_goods_feedback_comment_request_TEST
