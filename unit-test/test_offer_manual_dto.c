#ifndef offer_manual_dto_TEST
#define offer_manual_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_manual_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_manual_dto.h"
offer_manual_dto_t* instantiate_offer_manual_dto(int include_optional);



offer_manual_dto_t* instantiate_offer_manual_dto(int include_optional) {
  offer_manual_dto_t* offer_manual_dto = NULL;
  if (include_optional) {
    offer_manual_dto = offer_manual_dto_create(
      "0",
      "0"
    );
  } else {
    offer_manual_dto = offer_manual_dto_create(
      "0",
      "0"
    );
  }

  return offer_manual_dto;
}


#ifdef offer_manual_dto_MAIN

void test_offer_manual_dto(int include_optional) {
    offer_manual_dto_t* offer_manual_dto_1 = instantiate_offer_manual_dto(include_optional);

	cJSON* jsonoffer_manual_dto_1 = offer_manual_dto_convertToJSON(offer_manual_dto_1);
	printf("offer_manual_dto :\n%s\n", cJSON_Print(jsonoffer_manual_dto_1));
	offer_manual_dto_t* offer_manual_dto_2 = offer_manual_dto_parseFromJSON(jsonoffer_manual_dto_1);
	cJSON* jsonoffer_manual_dto_2 = offer_manual_dto_convertToJSON(offer_manual_dto_2);
	printf("repeating offer_manual_dto:\n%s\n", cJSON_Print(jsonoffer_manual_dto_2));
}

int main() {
  test_offer_manual_dto(1);
  test_offer_manual_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_manual_dto_MAIN
#endif // offer_manual_dto_TEST
