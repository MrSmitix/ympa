#ifndef get_campaign_offer_dto_TEST
#define get_campaign_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_campaign_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_campaign_offer_dto.h"
get_campaign_offer_dto_t* instantiate_get_campaign_offer_dto(int include_optional);

#include "test_quantum_dto.c"
#include "test_get_price_with_discount_dto.c"
#include "test_get_price_with_vat_dto.c"


get_campaign_offer_dto_t* instantiate_get_campaign_offer_dto(int include_optional) {
  get_campaign_offer_dto_t* get_campaign_offer_dto = NULL;
  if (include_optional) {
    get_campaign_offer_dto = get_campaign_offer_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_quantum_dto(0),
      1,
       // false, not to have infinite recursion
      instantiate_get_price_with_discount_dto(0),
       // false, not to have infinite recursion
      instantiate_get_price_with_vat_dto(0),
      _api__get_campaign_offer_dto__PUBLISHED,
      list_createList(),
      list_createList()
    );
  } else {
    get_campaign_offer_dto = get_campaign_offer_dto_create(
      "a",
      NULL,
      1,
      NULL,
      NULL,
      _api__get_campaign_offer_dto__PUBLISHED,
      list_createList(),
      list_createList()
    );
  }

  return get_campaign_offer_dto;
}


#ifdef get_campaign_offer_dto_MAIN

void test_get_campaign_offer_dto(int include_optional) {
    get_campaign_offer_dto_t* get_campaign_offer_dto_1 = instantiate_get_campaign_offer_dto(include_optional);

	cJSON* jsonget_campaign_offer_dto_1 = get_campaign_offer_dto_convertToJSON(get_campaign_offer_dto_1);
	printf("get_campaign_offer_dto :\n%s\n", cJSON_Print(jsonget_campaign_offer_dto_1));
	get_campaign_offer_dto_t* get_campaign_offer_dto_2 = get_campaign_offer_dto_parseFromJSON(jsonget_campaign_offer_dto_1);
	cJSON* jsonget_campaign_offer_dto_2 = get_campaign_offer_dto_convertToJSON(get_campaign_offer_dto_2);
	printf("repeating get_campaign_offer_dto:\n%s\n", cJSON_Print(jsonget_campaign_offer_dto_2));
}

int main() {
  test_get_campaign_offer_dto(1);
  test_get_campaign_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_campaign_offer_dto_MAIN
#endif // get_campaign_offer_dto_TEST
