#ifndef get_promo_offers_response_TEST
#define get_promo_offers_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_promo_offers_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_promo_offers_response.h"
get_promo_offers_response_t* instantiate_get_promo_offers_response(int include_optional);

#include "test_get_promo_offers_result_dto.c"


get_promo_offers_response_t* instantiate_get_promo_offers_response(int include_optional) {
  get_promo_offers_response_t* get_promo_offers_response = NULL;
  if (include_optional) {
    get_promo_offers_response = get_promo_offers_response_create(
      _api__get_promo_offers_response__OK,
       // false, not to have infinite recursion
      instantiate_get_promo_offers_result_dto(0)
    );
  } else {
    get_promo_offers_response = get_promo_offers_response_create(
      _api__get_promo_offers_response__OK,
      NULL
    );
  }

  return get_promo_offers_response;
}


#ifdef get_promo_offers_response_MAIN

void test_get_promo_offers_response(int include_optional) {
    get_promo_offers_response_t* get_promo_offers_response_1 = instantiate_get_promo_offers_response(include_optional);

	cJSON* jsonget_promo_offers_response_1 = get_promo_offers_response_convertToJSON(get_promo_offers_response_1);
	printf("get_promo_offers_response :\n%s\n", cJSON_Print(jsonget_promo_offers_response_1));
	get_promo_offers_response_t* get_promo_offers_response_2 = get_promo_offers_response_parseFromJSON(jsonget_promo_offers_response_1);
	cJSON* jsonget_promo_offers_response_2 = get_promo_offers_response_convertToJSON(get_promo_offers_response_2);
	printf("repeating get_promo_offers_response:\n%s\n", cJSON_Print(jsonget_promo_offers_response_2));
}

int main() {
  test_get_promo_offers_response(1);
  test_get_promo_offers_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_promo_offers_response_MAIN
#endif // get_promo_offers_response_TEST
