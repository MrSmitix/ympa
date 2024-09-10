#ifndef get_models_request_TEST
#define get_models_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_models_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_models_request.h"
get_models_request_t* instantiate_get_models_request(int include_optional);



get_models_request_t* instantiate_get_models_request(int include_optional) {
  get_models_request_t* get_models_request = NULL;
  if (include_optional) {
    get_models_request = get_models_request_create(
      list_createList()
    );
  } else {
    get_models_request = get_models_request_create(
      list_createList()
    );
  }

  return get_models_request;
}


#ifdef get_models_request_MAIN

void test_get_models_request(int include_optional) {
    get_models_request_t* get_models_request_1 = instantiate_get_models_request(include_optional);

	cJSON* jsonget_models_request_1 = get_models_request_convertToJSON(get_models_request_1);
	printf("get_models_request :\n%s\n", cJSON_Print(jsonget_models_request_1));
	get_models_request_t* get_models_request_2 = get_models_request_parseFromJSON(jsonget_models_request_1);
	cJSON* jsonget_models_request_2 = get_models_request_convertToJSON(get_models_request_2);
	printf("repeating get_models_request:\n%s\n", cJSON_Print(jsonget_models_request_2));
}

int main() {
  test_get_models_request(1);
  test_get_models_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_models_request_MAIN
#endif // get_models_request_TEST
