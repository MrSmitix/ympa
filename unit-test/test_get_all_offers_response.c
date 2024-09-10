#ifndef get_all_offers_response_TEST
#define get_all_offers_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_all_offers_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_all_offers_response.h"
get_all_offers_response_t* instantiate_get_all_offers_response(int include_optional);



get_all_offers_response_t* instantiate_get_all_offers_response(int include_optional) {
  get_all_offers_response_t* get_all_offers_response = NULL;
  if (include_optional) {
    get_all_offers_response = get_all_offers_response_create(
      list_createList()
    );
  } else {
    get_all_offers_response = get_all_offers_response_create(
      list_createList()
    );
  }

  return get_all_offers_response;
}


#ifdef get_all_offers_response_MAIN

void test_get_all_offers_response(int include_optional) {
    get_all_offers_response_t* get_all_offers_response_1 = instantiate_get_all_offers_response(include_optional);

	cJSON* jsonget_all_offers_response_1 = get_all_offers_response_convertToJSON(get_all_offers_response_1);
	printf("get_all_offers_response :\n%s\n", cJSON_Print(jsonget_all_offers_response_1));
	get_all_offers_response_t* get_all_offers_response_2 = get_all_offers_response_parseFromJSON(jsonget_all_offers_response_1);
	cJSON* jsonget_all_offers_response_2 = get_all_offers_response_convertToJSON(get_all_offers_response_2);
	printf("repeating get_all_offers_response:\n%s\n", cJSON_Print(jsonget_all_offers_response_2));
}

int main() {
  test_get_all_offers_response(1);
  test_get_all_offers_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_all_offers_response_MAIN
#endif // get_all_offers_response_TEST
