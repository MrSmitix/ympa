#ifndef get_suggested_offer_mapping_entries_response_TEST
#define get_suggested_offer_mapping_entries_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_suggested_offer_mapping_entries_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_suggested_offer_mapping_entries_response.h"
get_suggested_offer_mapping_entries_response_t* instantiate_get_suggested_offer_mapping_entries_response(int include_optional);

#include "test_offer_mapping_suggestions_list_dto.c"


get_suggested_offer_mapping_entries_response_t* instantiate_get_suggested_offer_mapping_entries_response(int include_optional) {
  get_suggested_offer_mapping_entries_response_t* get_suggested_offer_mapping_entries_response = NULL;
  if (include_optional) {
    get_suggested_offer_mapping_entries_response = get_suggested_offer_mapping_entries_response_create(
      _api__get_suggested_offer_mapping_entries_response__OK,
       // false, not to have infinite recursion
      instantiate_offer_mapping_suggestions_list_dto(0)
    );
  } else {
    get_suggested_offer_mapping_entries_response = get_suggested_offer_mapping_entries_response_create(
      _api__get_suggested_offer_mapping_entries_response__OK,
      NULL
    );
  }

  return get_suggested_offer_mapping_entries_response;
}


#ifdef get_suggested_offer_mapping_entries_response_MAIN

void test_get_suggested_offer_mapping_entries_response(int include_optional) {
    get_suggested_offer_mapping_entries_response_t* get_suggested_offer_mapping_entries_response_1 = instantiate_get_suggested_offer_mapping_entries_response(include_optional);

	cJSON* jsonget_suggested_offer_mapping_entries_response_1 = get_suggested_offer_mapping_entries_response_convertToJSON(get_suggested_offer_mapping_entries_response_1);
	printf("get_suggested_offer_mapping_entries_response :\n%s\n", cJSON_Print(jsonget_suggested_offer_mapping_entries_response_1));
	get_suggested_offer_mapping_entries_response_t* get_suggested_offer_mapping_entries_response_2 = get_suggested_offer_mapping_entries_response_parseFromJSON(jsonget_suggested_offer_mapping_entries_response_1);
	cJSON* jsonget_suggested_offer_mapping_entries_response_2 = get_suggested_offer_mapping_entries_response_convertToJSON(get_suggested_offer_mapping_entries_response_2);
	printf("repeating get_suggested_offer_mapping_entries_response:\n%s\n", cJSON_Print(jsonget_suggested_offer_mapping_entries_response_2));
}

int main() {
  test_get_suggested_offer_mapping_entries_response(1);
  test_get_suggested_offer_mapping_entries_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_suggested_offer_mapping_entries_response_MAIN
#endif // get_suggested_offer_mapping_entries_response_TEST
