#ifndef get_models_offers_response_TEST
#define get_models_offers_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_models_offers_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_models_offers_response.h"
get_models_offers_response_t* instantiate_get_models_offers_response(int include_optional);



get_models_offers_response_t* instantiate_get_models_offers_response(int include_optional) {
  get_models_offers_response_t* get_models_offers_response = NULL;
  if (include_optional) {
    get_models_offers_response = get_models_offers_response_create(
      list_createList(),
      _api__get_models_offers_response__RUR,
      56
    );
  } else {
    get_models_offers_response = get_models_offers_response_create(
      list_createList(),
      _api__get_models_offers_response__RUR,
      56
    );
  }

  return get_models_offers_response;
}


#ifdef get_models_offers_response_MAIN

void test_get_models_offers_response(int include_optional) {
    get_models_offers_response_t* get_models_offers_response_1 = instantiate_get_models_offers_response(include_optional);

	cJSON* jsonget_models_offers_response_1 = get_models_offers_response_convertToJSON(get_models_offers_response_1);
	printf("get_models_offers_response :\n%s\n", cJSON_Print(jsonget_models_offers_response_1));
	get_models_offers_response_t* get_models_offers_response_2 = get_models_offers_response_parseFromJSON(jsonget_models_offers_response_1);
	cJSON* jsonget_models_offers_response_2 = get_models_offers_response_convertToJSON(get_models_offers_response_2);
	printf("repeating get_models_offers_response:\n%s\n", cJSON_Print(jsonget_models_offers_response_2));
}

int main() {
  test_get_models_offers_response(1);
  test_get_models_offers_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_models_offers_response_MAIN
#endif // get_models_offers_response_TEST
