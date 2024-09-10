#ifndef get_suggested_offer_mapping_entries_request_TEST
#define get_suggested_offer_mapping_entries_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_suggested_offer_mapping_entries_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_suggested_offer_mapping_entries_request.h"
get_suggested_offer_mapping_entries_request_t* instantiate_get_suggested_offer_mapping_entries_request(int include_optional);



get_suggested_offer_mapping_entries_request_t* instantiate_get_suggested_offer_mapping_entries_request(int include_optional) {
  get_suggested_offer_mapping_entries_request_t* get_suggested_offer_mapping_entries_request = NULL;
  if (include_optional) {
    get_suggested_offer_mapping_entries_request = get_suggested_offer_mapping_entries_request_create(
      list_createList()
    );
  } else {
    get_suggested_offer_mapping_entries_request = get_suggested_offer_mapping_entries_request_create(
      list_createList()
    );
  }

  return get_suggested_offer_mapping_entries_request;
}


#ifdef get_suggested_offer_mapping_entries_request_MAIN

void test_get_suggested_offer_mapping_entries_request(int include_optional) {
    get_suggested_offer_mapping_entries_request_t* get_suggested_offer_mapping_entries_request_1 = instantiate_get_suggested_offer_mapping_entries_request(include_optional);

	cJSON* jsonget_suggested_offer_mapping_entries_request_1 = get_suggested_offer_mapping_entries_request_convertToJSON(get_suggested_offer_mapping_entries_request_1);
	printf("get_suggested_offer_mapping_entries_request :\n%s\n", cJSON_Print(jsonget_suggested_offer_mapping_entries_request_1));
	get_suggested_offer_mapping_entries_request_t* get_suggested_offer_mapping_entries_request_2 = get_suggested_offer_mapping_entries_request_parseFromJSON(jsonget_suggested_offer_mapping_entries_request_1);
	cJSON* jsonget_suggested_offer_mapping_entries_request_2 = get_suggested_offer_mapping_entries_request_convertToJSON(get_suggested_offer_mapping_entries_request_2);
	printf("repeating get_suggested_offer_mapping_entries_request:\n%s\n", cJSON_Print(jsonget_suggested_offer_mapping_entries_request_2));
}

int main() {
  test_get_suggested_offer_mapping_entries_request(1);
  test_get_suggested_offer_mapping_entries_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_suggested_offer_mapping_entries_request_MAIN
#endif // get_suggested_offer_mapping_entries_request_TEST
