#ifndef base_campaign_offer_dto_TEST
#define base_campaign_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define base_campaign_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/base_campaign_offer_dto.h"
base_campaign_offer_dto_t* instantiate_base_campaign_offer_dto(int include_optional);

#include "test_quantum_dto.c"


base_campaign_offer_dto_t* instantiate_base_campaign_offer_dto(int include_optional) {
  base_campaign_offer_dto_t* base_campaign_offer_dto = NULL;
  if (include_optional) {
    base_campaign_offer_dto = base_campaign_offer_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_quantum_dto(0),
      1
    );
  } else {
    base_campaign_offer_dto = base_campaign_offer_dto_create(
      "a",
      NULL,
      1
    );
  }

  return base_campaign_offer_dto;
}


#ifdef base_campaign_offer_dto_MAIN

void test_base_campaign_offer_dto(int include_optional) {
    base_campaign_offer_dto_t* base_campaign_offer_dto_1 = instantiate_base_campaign_offer_dto(include_optional);

	cJSON* jsonbase_campaign_offer_dto_1 = base_campaign_offer_dto_convertToJSON(base_campaign_offer_dto_1);
	printf("base_campaign_offer_dto :\n%s\n", cJSON_Print(jsonbase_campaign_offer_dto_1));
	base_campaign_offer_dto_t* base_campaign_offer_dto_2 = base_campaign_offer_dto_parseFromJSON(jsonbase_campaign_offer_dto_1);
	cJSON* jsonbase_campaign_offer_dto_2 = base_campaign_offer_dto_convertToJSON(base_campaign_offer_dto_2);
	printf("repeating base_campaign_offer_dto:\n%s\n", cJSON_Print(jsonbase_campaign_offer_dto_2));
}

int main() {
  test_base_campaign_offer_dto(1);
  test_base_campaign_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // base_campaign_offer_dto_MAIN
#endif // base_campaign_offer_dto_TEST
