#ifndef get_offer_cards_content_status_response_TEST
#define get_offer_cards_content_status_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_offer_cards_content_status_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_offer_cards_content_status_response.h"
get_offer_cards_content_status_response_t* instantiate_get_offer_cards_content_status_response(int include_optional);

#include "test_offer_cards_content_status_dto.c"


get_offer_cards_content_status_response_t* instantiate_get_offer_cards_content_status_response(int include_optional) {
  get_offer_cards_content_status_response_t* get_offer_cards_content_status_response = NULL;
  if (include_optional) {
    get_offer_cards_content_status_response = get_offer_cards_content_status_response_create(
      _api__get_offer_cards_content_status_response__OK,
       // false, not to have infinite recursion
      instantiate_offer_cards_content_status_dto(0)
    );
  } else {
    get_offer_cards_content_status_response = get_offer_cards_content_status_response_create(
      _api__get_offer_cards_content_status_response__OK,
      NULL
    );
  }

  return get_offer_cards_content_status_response;
}


#ifdef get_offer_cards_content_status_response_MAIN

void test_get_offer_cards_content_status_response(int include_optional) {
    get_offer_cards_content_status_response_t* get_offer_cards_content_status_response_1 = instantiate_get_offer_cards_content_status_response(include_optional);

	cJSON* jsonget_offer_cards_content_status_response_1 = get_offer_cards_content_status_response_convertToJSON(get_offer_cards_content_status_response_1);
	printf("get_offer_cards_content_status_response :\n%s\n", cJSON_Print(jsonget_offer_cards_content_status_response_1));
	get_offer_cards_content_status_response_t* get_offer_cards_content_status_response_2 = get_offer_cards_content_status_response_parseFromJSON(jsonget_offer_cards_content_status_response_1);
	cJSON* jsonget_offer_cards_content_status_response_2 = get_offer_cards_content_status_response_convertToJSON(get_offer_cards_content_status_response_2);
	printf("repeating get_offer_cards_content_status_response:\n%s\n", cJSON_Print(jsonget_offer_cards_content_status_response_2));
}

int main() {
  test_get_offer_cards_content_status_response(1);
  test_get_offer_cards_content_status_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_offer_cards_content_status_response_MAIN
#endif // get_offer_cards_content_status_response_TEST
