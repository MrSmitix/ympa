#ifndef quarantine_offer_dto_TEST
#define quarantine_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quarantine_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quarantine_offer_dto.h"
quarantine_offer_dto_t* instantiate_quarantine_offer_dto(int include_optional);

#include "test_base_price_dto.c"
#include "test_base_price_dto.c"


quarantine_offer_dto_t* instantiate_quarantine_offer_dto(int include_optional) {
  quarantine_offer_dto_t* quarantine_offer_dto = NULL;
  if (include_optional) {
    quarantine_offer_dto = quarantine_offer_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_base_price_dto(0),
       // false, not to have infinite recursion
      instantiate_base_price_dto(0),
      list_createList()
    );
  } else {
    quarantine_offer_dto = quarantine_offer_dto_create(
      "a",
      NULL,
      NULL,
      list_createList()
    );
  }

  return quarantine_offer_dto;
}


#ifdef quarantine_offer_dto_MAIN

void test_quarantine_offer_dto(int include_optional) {
    quarantine_offer_dto_t* quarantine_offer_dto_1 = instantiate_quarantine_offer_dto(include_optional);

	cJSON* jsonquarantine_offer_dto_1 = quarantine_offer_dto_convertToJSON(quarantine_offer_dto_1);
	printf("quarantine_offer_dto :\n%s\n", cJSON_Print(jsonquarantine_offer_dto_1));
	quarantine_offer_dto_t* quarantine_offer_dto_2 = quarantine_offer_dto_parseFromJSON(jsonquarantine_offer_dto_1);
	cJSON* jsonquarantine_offer_dto_2 = quarantine_offer_dto_convertToJSON(quarantine_offer_dto_2);
	printf("repeating quarantine_offer_dto:\n%s\n", cJSON_Print(jsonquarantine_offer_dto_2));
}

int main() {
  test_quarantine_offer_dto(1);
  test_quarantine_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // quarantine_offer_dto_MAIN
#endif // quarantine_offer_dto_TEST
