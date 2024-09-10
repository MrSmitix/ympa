#ifndef delete_goods_feedback_comment_request_TEST
#define delete_goods_feedback_comment_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_goods_feedback_comment_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_goods_feedback_comment_request.h"
delete_goods_feedback_comment_request_t* instantiate_delete_goods_feedback_comment_request(int include_optional);



delete_goods_feedback_comment_request_t* instantiate_delete_goods_feedback_comment_request(int include_optional) {
  delete_goods_feedback_comment_request_t* delete_goods_feedback_comment_request = NULL;
  if (include_optional) {
    delete_goods_feedback_comment_request = delete_goods_feedback_comment_request_create(
      56
    );
  } else {
    delete_goods_feedback_comment_request = delete_goods_feedback_comment_request_create(
      56
    );
  }

  return delete_goods_feedback_comment_request;
}


#ifdef delete_goods_feedback_comment_request_MAIN

void test_delete_goods_feedback_comment_request(int include_optional) {
    delete_goods_feedback_comment_request_t* delete_goods_feedback_comment_request_1 = instantiate_delete_goods_feedback_comment_request(include_optional);

	cJSON* jsondelete_goods_feedback_comment_request_1 = delete_goods_feedback_comment_request_convertToJSON(delete_goods_feedback_comment_request_1);
	printf("delete_goods_feedback_comment_request :\n%s\n", cJSON_Print(jsondelete_goods_feedback_comment_request_1));
	delete_goods_feedback_comment_request_t* delete_goods_feedback_comment_request_2 = delete_goods_feedback_comment_request_parseFromJSON(jsondelete_goods_feedback_comment_request_1);
	cJSON* jsondelete_goods_feedback_comment_request_2 = delete_goods_feedback_comment_request_convertToJSON(delete_goods_feedback_comment_request_2);
	printf("repeating delete_goods_feedback_comment_request:\n%s\n", cJSON_Print(jsondelete_goods_feedback_comment_request_2));
}

int main() {
  test_delete_goods_feedback_comment_request(1);
  test_delete_goods_feedback_comment_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_goods_feedback_comment_request_MAIN
#endif // delete_goods_feedback_comment_request_TEST
