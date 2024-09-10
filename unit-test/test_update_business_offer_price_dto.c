#ifndef update_business_offer_price_dto_TEST
#define update_business_offer_price_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_business_offer_price_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_business_offer_price_dto.h"
update_business_offer_price_dto_t* instantiate_update_business_offer_price_dto(int include_optional);

#include "test_update_price_with_discount_dto.c"


update_business_offer_price_dto_t* instantiate_update_business_offer_price_dto(int include_optional) {
  update_business_offer_price_dto_t* update_business_offer_price_dto = NULL;
  if (include_optional) {
    update_business_offer_price_dto = update_business_offer_price_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_update_price_with_discount_dto(0)
    );
  } else {
    update_business_offer_price_dto = update_business_offer_price_dto_create(
      "a",
      NULL
    );
  }

  return update_business_offer_price_dto;
}


#ifdef update_business_offer_price_dto_MAIN

void test_update_business_offer_price_dto(int include_optional) {
    update_business_offer_price_dto_t* update_business_offer_price_dto_1 = instantiate_update_business_offer_price_dto(include_optional);

	cJSON* jsonupdate_business_offer_price_dto_1 = update_business_offer_price_dto_convertToJSON(update_business_offer_price_dto_1);
	printf("update_business_offer_price_dto :\n%s\n", cJSON_Print(jsonupdate_business_offer_price_dto_1));
	update_business_offer_price_dto_t* update_business_offer_price_dto_2 = update_business_offer_price_dto_parseFromJSON(jsonupdate_business_offer_price_dto_1);
	cJSON* jsonupdate_business_offer_price_dto_2 = update_business_offer_price_dto_convertToJSON(update_business_offer_price_dto_2);
	printf("repeating update_business_offer_price_dto:\n%s\n", cJSON_Print(jsonupdate_business_offer_price_dto_2));
}

int main() {
  test_update_business_offer_price_dto(1);
  test_update_business_offer_price_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_business_offer_price_dto_MAIN
#endif // update_business_offer_price_dto_TEST
