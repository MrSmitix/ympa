#ifndef offer_recommendation_info_dto_TEST
#define offer_recommendation_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_recommendation_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_recommendation_info_dto.h"
offer_recommendation_info_dto_t* instantiate_offer_recommendation_info_dto(int include_optional);

#include "test_base_price_dto.c"
#include "test_price_competitiveness_thresholds_dto.c"


offer_recommendation_info_dto_t* instantiate_offer_recommendation_info_dto(int include_optional) {
  offer_recommendation_info_dto_t* offer_recommendation_info_dto = NULL;
  if (include_optional) {
    offer_recommendation_info_dto = offer_recommendation_info_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_base_price_dto(0),
       // false, not to have infinite recursion
      instantiate_price_competitiveness_thresholds_dto(0)
    );
  } else {
    offer_recommendation_info_dto = offer_recommendation_info_dto_create(
      "a",
      NULL,
      NULL
    );
  }

  return offer_recommendation_info_dto;
}


#ifdef offer_recommendation_info_dto_MAIN

void test_offer_recommendation_info_dto(int include_optional) {
    offer_recommendation_info_dto_t* offer_recommendation_info_dto_1 = instantiate_offer_recommendation_info_dto(include_optional);

	cJSON* jsonoffer_recommendation_info_dto_1 = offer_recommendation_info_dto_convertToJSON(offer_recommendation_info_dto_1);
	printf("offer_recommendation_info_dto :\n%s\n", cJSON_Print(jsonoffer_recommendation_info_dto_1));
	offer_recommendation_info_dto_t* offer_recommendation_info_dto_2 = offer_recommendation_info_dto_parseFromJSON(jsonoffer_recommendation_info_dto_1);
	cJSON* jsonoffer_recommendation_info_dto_2 = offer_recommendation_info_dto_convertToJSON(offer_recommendation_info_dto_2);
	printf("repeating offer_recommendation_info_dto:\n%s\n", cJSON_Print(jsonoffer_recommendation_info_dto_2));
}

int main() {
  test_offer_recommendation_info_dto(1);
  test_offer_recommendation_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_recommendation_info_dto_MAIN
#endif // offer_recommendation_info_dto_TEST
