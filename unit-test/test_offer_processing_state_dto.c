#ifndef offer_processing_state_dto_TEST
#define offer_processing_state_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_processing_state_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_processing_state_dto.h"
offer_processing_state_dto_t* instantiate_offer_processing_state_dto(int include_optional);



offer_processing_state_dto_t* instantiate_offer_processing_state_dto(int include_optional) {
  offer_processing_state_dto_t* offer_processing_state_dto = NULL;
  if (include_optional) {
    offer_processing_state_dto = offer_processing_state_dto_create(
      _api__offer_processing_state_dto__UNKNOWN,
      list_createList()
    );
  } else {
    offer_processing_state_dto = offer_processing_state_dto_create(
      _api__offer_processing_state_dto__UNKNOWN,
      list_createList()
    );
  }

  return offer_processing_state_dto;
}


#ifdef offer_processing_state_dto_MAIN

void test_offer_processing_state_dto(int include_optional) {
    offer_processing_state_dto_t* offer_processing_state_dto_1 = instantiate_offer_processing_state_dto(include_optional);

	cJSON* jsonoffer_processing_state_dto_1 = offer_processing_state_dto_convertToJSON(offer_processing_state_dto_1);
	printf("offer_processing_state_dto :\n%s\n", cJSON_Print(jsonoffer_processing_state_dto_1));
	offer_processing_state_dto_t* offer_processing_state_dto_2 = offer_processing_state_dto_parseFromJSON(jsonoffer_processing_state_dto_1);
	cJSON* jsonoffer_processing_state_dto_2 = offer_processing_state_dto_convertToJSON(offer_processing_state_dto_2);
	printf("repeating offer_processing_state_dto:\n%s\n", cJSON_Print(jsonoffer_processing_state_dto_2));
}

int main() {
  test_offer_processing_state_dto(1);
  test_offer_processing_state_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_processing_state_dto_MAIN
#endif // offer_processing_state_dto_TEST
