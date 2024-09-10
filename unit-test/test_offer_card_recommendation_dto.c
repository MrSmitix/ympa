#ifndef offer_card_recommendation_dto_TEST
#define offer_card_recommendation_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_card_recommendation_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_card_recommendation_dto.h"
offer_card_recommendation_dto_t* instantiate_offer_card_recommendation_dto(int include_optional);



offer_card_recommendation_dto_t* instantiate_offer_card_recommendation_dto(int include_optional) {
  offer_card_recommendation_dto_t* offer_card_recommendation_dto = NULL;
  if (include_optional) {
    offer_card_recommendation_dto = offer_card_recommendation_dto_create(
      _api__offer_card_recommendation_dto__HAS_VIDEO,
      0
    );
  } else {
    offer_card_recommendation_dto = offer_card_recommendation_dto_create(
      _api__offer_card_recommendation_dto__HAS_VIDEO,
      0
    );
  }

  return offer_card_recommendation_dto;
}


#ifdef offer_card_recommendation_dto_MAIN

void test_offer_card_recommendation_dto(int include_optional) {
    offer_card_recommendation_dto_t* offer_card_recommendation_dto_1 = instantiate_offer_card_recommendation_dto(include_optional);

	cJSON* jsonoffer_card_recommendation_dto_1 = offer_card_recommendation_dto_convertToJSON(offer_card_recommendation_dto_1);
	printf("offer_card_recommendation_dto :\n%s\n", cJSON_Print(jsonoffer_card_recommendation_dto_1));
	offer_card_recommendation_dto_t* offer_card_recommendation_dto_2 = offer_card_recommendation_dto_parseFromJSON(jsonoffer_card_recommendation_dto_1);
	cJSON* jsonoffer_card_recommendation_dto_2 = offer_card_recommendation_dto_convertToJSON(offer_card_recommendation_dto_2);
	printf("repeating offer_card_recommendation_dto:\n%s\n", cJSON_Print(jsonoffer_card_recommendation_dto_2));
}

int main() {
  test_offer_card_recommendation_dto(1);
  test_offer_card_recommendation_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_card_recommendation_dto_MAIN
#endif // offer_card_recommendation_dto_TEST
