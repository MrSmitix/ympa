#ifndef get_offer_mappings_request_TEST
#define get_offer_mappings_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_offer_mappings_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_offer_mappings_request.h"
get_offer_mappings_request_t* instantiate_get_offer_mappings_request(int include_optional);



get_offer_mappings_request_t* instantiate_get_offer_mappings_request(int include_optional) {
  get_offer_mappings_request_t* get_offer_mappings_request = NULL;
  if (include_optional) {
    get_offer_mappings_request = get_offer_mappings_request_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      1
    );
  } else {
    get_offer_mappings_request = get_offer_mappings_request_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      1
    );
  }

  return get_offer_mappings_request;
}


#ifdef get_offer_mappings_request_MAIN

void test_get_offer_mappings_request(int include_optional) {
    get_offer_mappings_request_t* get_offer_mappings_request_1 = instantiate_get_offer_mappings_request(include_optional);

	cJSON* jsonget_offer_mappings_request_1 = get_offer_mappings_request_convertToJSON(get_offer_mappings_request_1);
	printf("get_offer_mappings_request :\n%s\n", cJSON_Print(jsonget_offer_mappings_request_1));
	get_offer_mappings_request_t* get_offer_mappings_request_2 = get_offer_mappings_request_parseFromJSON(jsonget_offer_mappings_request_1);
	cJSON* jsonget_offer_mappings_request_2 = get_offer_mappings_request_convertToJSON(get_offer_mappings_request_2);
	printf("repeating get_offer_mappings_request:\n%s\n", cJSON_Print(jsonget_offer_mappings_request_2));
}

int main() {
  test_get_offer_mappings_request(1);
  test_get_offer_mappings_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_offer_mappings_request_MAIN
#endif // get_offer_mappings_request_TEST
