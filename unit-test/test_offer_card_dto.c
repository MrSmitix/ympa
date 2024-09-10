#ifndef offer_card_dto_TEST
#define offer_card_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_card_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_card_dto.h"
offer_card_dto_t* instantiate_offer_card_dto(int include_optional);

#include "test_get_mapping_dto.c"


offer_card_dto_t* instantiate_offer_card_dto(int include_optional) {
  offer_card_dto_t* offer_card_dto = NULL;
  if (include_optional) {
    offer_card_dto = offer_card_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_get_mapping_dto(0),
      list_createList(),
      _api__offer_card_dto__HAS_CARD_CAN_NOT_UPDATE,
      56,
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    offer_card_dto = offer_card_dto_create(
      "a",
      NULL,
      list_createList(),
      _api__offer_card_dto__HAS_CARD_CAN_NOT_UPDATE,
      56,
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return offer_card_dto;
}


#ifdef offer_card_dto_MAIN

void test_offer_card_dto(int include_optional) {
    offer_card_dto_t* offer_card_dto_1 = instantiate_offer_card_dto(include_optional);

	cJSON* jsonoffer_card_dto_1 = offer_card_dto_convertToJSON(offer_card_dto_1);
	printf("offer_card_dto :\n%s\n", cJSON_Print(jsonoffer_card_dto_1));
	offer_card_dto_t* offer_card_dto_2 = offer_card_dto_parseFromJSON(jsonoffer_card_dto_1);
	cJSON* jsonoffer_card_dto_2 = offer_card_dto_convertToJSON(offer_card_dto_2);
	printf("repeating offer_card_dto:\n%s\n", cJSON_Print(jsonoffer_card_dto_2));
}

int main() {
  test_offer_card_dto(1);
  test_offer_card_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_card_dto_MAIN
#endif // offer_card_dto_TEST
