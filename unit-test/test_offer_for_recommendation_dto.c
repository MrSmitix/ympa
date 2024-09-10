#ifndef offer_for_recommendation_dto_TEST
#define offer_for_recommendation_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_for_recommendation_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_for_recommendation_dto.h"
offer_for_recommendation_dto_t* instantiate_offer_for_recommendation_dto(int include_optional);

#include "test_base_price_dto.c"
#include "test_get_price_dto.c"


offer_for_recommendation_dto_t* instantiate_offer_for_recommendation_dto(int include_optional) {
  offer_for_recommendation_dto_t* offer_for_recommendation_dto = NULL;
  if (include_optional) {
    offer_for_recommendation_dto = offer_for_recommendation_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_base_price_dto(0),
       // false, not to have infinite recursion
      instantiate_get_price_dto(0),
      _api__offer_for_recommendation_dto__OPTIMAL,
      56
    );
  } else {
    offer_for_recommendation_dto = offer_for_recommendation_dto_create(
      "a",
      NULL,
      NULL,
      _api__offer_for_recommendation_dto__OPTIMAL,
      56
    );
  }

  return offer_for_recommendation_dto;
}


#ifdef offer_for_recommendation_dto_MAIN

void test_offer_for_recommendation_dto(int include_optional) {
    offer_for_recommendation_dto_t* offer_for_recommendation_dto_1 = instantiate_offer_for_recommendation_dto(include_optional);

	cJSON* jsonoffer_for_recommendation_dto_1 = offer_for_recommendation_dto_convertToJSON(offer_for_recommendation_dto_1);
	printf("offer_for_recommendation_dto :\n%s\n", cJSON_Print(jsonoffer_for_recommendation_dto_1));
	offer_for_recommendation_dto_t* offer_for_recommendation_dto_2 = offer_for_recommendation_dto_parseFromJSON(jsonoffer_for_recommendation_dto_1);
	cJSON* jsonoffer_for_recommendation_dto_2 = offer_for_recommendation_dto_convertToJSON(offer_for_recommendation_dto_2);
	printf("repeating offer_for_recommendation_dto:\n%s\n", cJSON_Print(jsonoffer_for_recommendation_dto_2));
}

int main() {
  test_offer_for_recommendation_dto(1);
  test_offer_for_recommendation_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_for_recommendation_dto_MAIN
#endif // offer_for_recommendation_dto_TEST
