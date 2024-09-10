#ifndef get_feeds_response_TEST
#define get_feeds_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_feeds_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_feeds_response.h"
get_feeds_response_t* instantiate_get_feeds_response(int include_optional);



get_feeds_response_t* instantiate_get_feeds_response(int include_optional) {
  get_feeds_response_t* get_feeds_response = NULL;
  if (include_optional) {
    get_feeds_response = get_feeds_response_create(
      list_createList()
    );
  } else {
    get_feeds_response = get_feeds_response_create(
      list_createList()
    );
  }

  return get_feeds_response;
}


#ifdef get_feeds_response_MAIN

void test_get_feeds_response(int include_optional) {
    get_feeds_response_t* get_feeds_response_1 = instantiate_get_feeds_response(include_optional);

	cJSON* jsonget_feeds_response_1 = get_feeds_response_convertToJSON(get_feeds_response_1);
	printf("get_feeds_response :\n%s\n", cJSON_Print(jsonget_feeds_response_1));
	get_feeds_response_t* get_feeds_response_2 = get_feeds_response_parseFromJSON(jsonget_feeds_response_1);
	cJSON* jsonget_feeds_response_2 = get_feeds_response_convertToJSON(get_feeds_response_2);
	printf("repeating get_feeds_response:\n%s\n", cJSON_Print(jsonget_feeds_response_2));
}

int main() {
  test_get_feeds_response(1);
  test_get_feeds_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_feeds_response_MAIN
#endif // get_feeds_response_TEST
