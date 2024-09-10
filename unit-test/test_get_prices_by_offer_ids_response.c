#ifndef get_prices_by_offer_ids_response_TEST
#define get_prices_by_offer_ids_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_prices_by_offer_ids_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_prices_by_offer_ids_response.h"
get_prices_by_offer_ids_response_t* instantiate_get_prices_by_offer_ids_response(int include_optional);

#include "test_offer_price_by_offer_ids_list_response_dto.c"


get_prices_by_offer_ids_response_t* instantiate_get_prices_by_offer_ids_response(int include_optional) {
  get_prices_by_offer_ids_response_t* get_prices_by_offer_ids_response = NULL;
  if (include_optional) {
    get_prices_by_offer_ids_response = get_prices_by_offer_ids_response_create(
      _api__get_prices_by_offer_ids_response__OK,
       // false, not to have infinite recursion
      instantiate_offer_price_by_offer_ids_list_response_dto(0)
    );
  } else {
    get_prices_by_offer_ids_response = get_prices_by_offer_ids_response_create(
      _api__get_prices_by_offer_ids_response__OK,
      NULL
    );
  }

  return get_prices_by_offer_ids_response;
}


#ifdef get_prices_by_offer_ids_response_MAIN

void test_get_prices_by_offer_ids_response(int include_optional) {
    get_prices_by_offer_ids_response_t* get_prices_by_offer_ids_response_1 = instantiate_get_prices_by_offer_ids_response(include_optional);

	cJSON* jsonget_prices_by_offer_ids_response_1 = get_prices_by_offer_ids_response_convertToJSON(get_prices_by_offer_ids_response_1);
	printf("get_prices_by_offer_ids_response :\n%s\n", cJSON_Print(jsonget_prices_by_offer_ids_response_1));
	get_prices_by_offer_ids_response_t* get_prices_by_offer_ids_response_2 = get_prices_by_offer_ids_response_parseFromJSON(jsonget_prices_by_offer_ids_response_1);
	cJSON* jsonget_prices_by_offer_ids_response_2 = get_prices_by_offer_ids_response_convertToJSON(get_prices_by_offer_ids_response_2);
	printf("repeating get_prices_by_offer_ids_response:\n%s\n", cJSON_Print(jsonget_prices_by_offer_ids_response_2));
}

int main() {
  test_get_prices_by_offer_ids_response(1);
  test_get_prices_by_offer_ids_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_prices_by_offer_ids_response_MAIN
#endif // get_prices_by_offer_ids_response_TEST
