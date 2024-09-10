#ifndef get_goods_feedback_request_TEST
#define get_goods_feedback_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_goods_feedback_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_goods_feedback_request.h"
get_goods_feedback_request_t* instantiate_get_goods_feedback_request(int include_optional);



get_goods_feedback_request_t* instantiate_get_goods_feedback_request(int include_optional) {
  get_goods_feedback_request_t* get_goods_feedback_request = NULL;
  if (include_optional) {
    get_goods_feedback_request = get_goods_feedback_request_create(
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      _api__get_goods_feedback_request__ALL,
      list_createList(),
      list_createList(),
      1
    );
  } else {
    get_goods_feedback_request = get_goods_feedback_request_create(
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      _api__get_goods_feedback_request__ALL,
      list_createList(),
      list_createList(),
      1
    );
  }

  return get_goods_feedback_request;
}


#ifdef get_goods_feedback_request_MAIN

void test_get_goods_feedback_request(int include_optional) {
    get_goods_feedback_request_t* get_goods_feedback_request_1 = instantiate_get_goods_feedback_request(include_optional);

	cJSON* jsonget_goods_feedback_request_1 = get_goods_feedback_request_convertToJSON(get_goods_feedback_request_1);
	printf("get_goods_feedback_request :\n%s\n", cJSON_Print(jsonget_goods_feedback_request_1));
	get_goods_feedback_request_t* get_goods_feedback_request_2 = get_goods_feedback_request_parseFromJSON(jsonget_goods_feedback_request_1);
	cJSON* jsonget_goods_feedback_request_2 = get_goods_feedback_request_convertToJSON(get_goods_feedback_request_2);
	printf("repeating get_goods_feedback_request:\n%s\n", cJSON_Print(jsonget_goods_feedback_request_2));
}

int main() {
  test_get_goods_feedback_request(1);
  test_get_goods_feedback_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_goods_feedback_request_MAIN
#endif // get_goods_feedback_request_TEST
