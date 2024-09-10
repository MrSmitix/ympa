#ifndef set_feed_params_request_TEST
#define set_feed_params_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define set_feed_params_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/set_feed_params_request.h"
set_feed_params_request_t* instantiate_set_feed_params_request(int include_optional);



set_feed_params_request_t* instantiate_set_feed_params_request(int include_optional) {
  set_feed_params_request_t* set_feed_params_request = NULL;
  if (include_optional) {
    set_feed_params_request = set_feed_params_request_create(
      list_createList()
    );
  } else {
    set_feed_params_request = set_feed_params_request_create(
      list_createList()
    );
  }

  return set_feed_params_request;
}


#ifdef set_feed_params_request_MAIN

void test_set_feed_params_request(int include_optional) {
    set_feed_params_request_t* set_feed_params_request_1 = instantiate_set_feed_params_request(include_optional);

	cJSON* jsonset_feed_params_request_1 = set_feed_params_request_convertToJSON(set_feed_params_request_1);
	printf("set_feed_params_request :\n%s\n", cJSON_Print(jsonset_feed_params_request_1));
	set_feed_params_request_t* set_feed_params_request_2 = set_feed_params_request_parseFromJSON(jsonset_feed_params_request_1);
	cJSON* jsonset_feed_params_request_2 = set_feed_params_request_convertToJSON(set_feed_params_request_2);
	printf("repeating set_feed_params_request:\n%s\n", cJSON_Print(jsonset_feed_params_request_2));
}

int main() {
  test_set_feed_params_request(1);
  test_set_feed_params_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // set_feed_params_request_MAIN
#endif // set_feed_params_request_TEST
