#ifndef get_categories_request_TEST
#define get_categories_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_categories_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_categories_request.h"
get_categories_request_t* instantiate_get_categories_request(int include_optional);



get_categories_request_t* instantiate_get_categories_request(int include_optional) {
  get_categories_request_t* get_categories_request = NULL;
  if (include_optional) {
    get_categories_request = get_categories_request_create(
      _api__get_categories_request__RU
    );
  } else {
    get_categories_request = get_categories_request_create(
      _api__get_categories_request__RU
    );
  }

  return get_categories_request;
}


#ifdef get_categories_request_MAIN

void test_get_categories_request(int include_optional) {
    get_categories_request_t* get_categories_request_1 = instantiate_get_categories_request(include_optional);

	cJSON* jsonget_categories_request_1 = get_categories_request_convertToJSON(get_categories_request_1);
	printf("get_categories_request :\n%s\n", cJSON_Print(jsonget_categories_request_1));
	get_categories_request_t* get_categories_request_2 = get_categories_request_parseFromJSON(jsonget_categories_request_1);
	cJSON* jsonget_categories_request_2 = get_categories_request_convertToJSON(get_categories_request_2);
	printf("repeating get_categories_request:\n%s\n", cJSON_Print(jsonget_categories_request_2));
}

int main() {
  test_get_categories_request(1);
  test_get_categories_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_categories_request_MAIN
#endif // get_categories_request_TEST
