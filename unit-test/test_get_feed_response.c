#ifndef get_feed_response_TEST
#define get_feed_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_feed_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_feed_response.h"
get_feed_response_t* instantiate_get_feed_response(int include_optional);

#include "test_feed_dto.c"


get_feed_response_t* instantiate_get_feed_response(int include_optional) {
  get_feed_response_t* get_feed_response = NULL;
  if (include_optional) {
    get_feed_response = get_feed_response_create(
       // false, not to have infinite recursion
      instantiate_feed_dto(0)
    );
  } else {
    get_feed_response = get_feed_response_create(
      NULL
    );
  }

  return get_feed_response;
}


#ifdef get_feed_response_MAIN

void test_get_feed_response(int include_optional) {
    get_feed_response_t* get_feed_response_1 = instantiate_get_feed_response(include_optional);

	cJSON* jsonget_feed_response_1 = get_feed_response_convertToJSON(get_feed_response_1);
	printf("get_feed_response :\n%s\n", cJSON_Print(jsonget_feed_response_1));
	get_feed_response_t* get_feed_response_2 = get_feed_response_parseFromJSON(jsonget_feed_response_1);
	cJSON* jsonget_feed_response_2 = get_feed_response_convertToJSON(get_feed_response_2);
	printf("repeating get_feed_response:\n%s\n", cJSON_Print(jsonget_feed_response_2));
}

int main() {
  test_get_feed_response(1);
  test_get_feed_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_feed_response_MAIN
#endif // get_feed_response_TEST
