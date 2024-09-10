#ifndef offer_condition_dto_TEST
#define offer_condition_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_condition_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_condition_dto.h"
offer_condition_dto_t* instantiate_offer_condition_dto(int include_optional);



offer_condition_dto_t* instantiate_offer_condition_dto(int include_optional) {
  offer_condition_dto_t* offer_condition_dto = NULL;
  if (include_optional) {
    offer_condition_dto = offer_condition_dto_create(
      _api__offer_condition_dto__PREOWNED,
      _api__offer_condition_dto__PERFECT,
      "0"
    );
  } else {
    offer_condition_dto = offer_condition_dto_create(
      _api__offer_condition_dto__PREOWNED,
      _api__offer_condition_dto__PERFECT,
      "0"
    );
  }

  return offer_condition_dto;
}


#ifdef offer_condition_dto_MAIN

void test_offer_condition_dto(int include_optional) {
    offer_condition_dto_t* offer_condition_dto_1 = instantiate_offer_condition_dto(include_optional);

	cJSON* jsonoffer_condition_dto_1 = offer_condition_dto_convertToJSON(offer_condition_dto_1);
	printf("offer_condition_dto :\n%s\n", cJSON_Print(jsonoffer_condition_dto_1));
	offer_condition_dto_t* offer_condition_dto_2 = offer_condition_dto_parseFromJSON(jsonoffer_condition_dto_1);
	cJSON* jsonoffer_condition_dto_2 = offer_condition_dto_convertToJSON(offer_condition_dto_2);
	printf("repeating offer_condition_dto:\n%s\n", cJSON_Print(jsonoffer_condition_dto_2));
}

int main() {
  test_offer_condition_dto(1);
  test_offer_condition_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_condition_dto_MAIN
#endif // offer_condition_dto_TEST
