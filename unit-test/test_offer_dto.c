#ifndef offer_dto_TEST
#define offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_dto.h"
offer_dto_t* instantiate_offer_dto(int include_optional);



offer_dto_t* instantiate_offer_dto(int include_optional) {
  offer_dto_t* offer_dto = NULL;
  if (include_optional) {
    offer_dto = offer_dto_create(
      1.337,
      56,
      "0",
      "0",
      56,
      1.337,
      56,
      1,
      "0",
      56,
      "0",
      _api__offer_dto__RUR,
      1.337,
      1.337,
      1.337,
      1
    );
  } else {
    offer_dto = offer_dto_create(
      1.337,
      56,
      "0",
      "0",
      56,
      1.337,
      56,
      1,
      "0",
      56,
      "0",
      _api__offer_dto__RUR,
      1.337,
      1.337,
      1.337,
      1
    );
  }

  return offer_dto;
}


#ifdef offer_dto_MAIN

void test_offer_dto(int include_optional) {
    offer_dto_t* offer_dto_1 = instantiate_offer_dto(include_optional);

	cJSON* jsonoffer_dto_1 = offer_dto_convertToJSON(offer_dto_1);
	printf("offer_dto :\n%s\n", cJSON_Print(jsonoffer_dto_1));
	offer_dto_t* offer_dto_2 = offer_dto_parseFromJSON(jsonoffer_dto_1);
	cJSON* jsonoffer_dto_2 = offer_dto_convertToJSON(offer_dto_2);
	printf("repeating offer_dto:\n%s\n", cJSON_Print(jsonoffer_dto_2));
}

int main() {
  test_offer_dto(1);
  test_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_dto_MAIN
#endif // offer_dto_TEST
