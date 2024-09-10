#ifndef offer_card_recommendation_type_TEST
#define offer_card_recommendation_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_card_recommendation_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_card_recommendation_type.h"
offer_card_recommendation_type_t* instantiate_offer_card_recommendation_type(int include_optional);



offer_card_recommendation_type_t* instantiate_offer_card_recommendation_type(int include_optional) {
  offer_card_recommendation_type_t* offer_card_recommendation_type = NULL;
  if (include_optional) {
    offer_card_recommendation_type = offer_card_recommendation_type_create(
    );
  } else {
    offer_card_recommendation_type = offer_card_recommendation_type_create(
    );
  }

  return offer_card_recommendation_type;
}


#ifdef offer_card_recommendation_type_MAIN

void test_offer_card_recommendation_type(int include_optional) {
    offer_card_recommendation_type_t* offer_card_recommendation_type_1 = instantiate_offer_card_recommendation_type(include_optional);

	cJSON* jsonoffer_card_recommendation_type_1 = offer_card_recommendation_type_convertToJSON(offer_card_recommendation_type_1);
	printf("offer_card_recommendation_type :\n%s\n", cJSON_Print(jsonoffer_card_recommendation_type_1));
	offer_card_recommendation_type_t* offer_card_recommendation_type_2 = offer_card_recommendation_type_parseFromJSON(jsonoffer_card_recommendation_type_1);
	cJSON* jsonoffer_card_recommendation_type_2 = offer_card_recommendation_type_convertToJSON(offer_card_recommendation_type_2);
	printf("repeating offer_card_recommendation_type:\n%s\n", cJSON_Print(jsonoffer_card_recommendation_type_2));
}

int main() {
  test_offer_card_recommendation_type(1);
  test_offer_card_recommendation_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_card_recommendation_type_MAIN
#endif // offer_card_recommendation_type_TEST
