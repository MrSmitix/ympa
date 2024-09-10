#ifndef update_promo_offer_dto_TEST
#define update_promo_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_promo_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_promo_offer_dto.h"
update_promo_offer_dto_t* instantiate_update_promo_offer_dto(int include_optional);

#include "test_update_promo_offer_params_dto.c"


update_promo_offer_dto_t* instantiate_update_promo_offer_dto(int include_optional) {
  update_promo_offer_dto_t* update_promo_offer_dto = NULL;
  if (include_optional) {
    update_promo_offer_dto = update_promo_offer_dto_create(
      "a",
       // false, not to have infinite recursion
      instantiate_update_promo_offer_params_dto(0)
    );
  } else {
    update_promo_offer_dto = update_promo_offer_dto_create(
      "a",
      NULL
    );
  }

  return update_promo_offer_dto;
}


#ifdef update_promo_offer_dto_MAIN

void test_update_promo_offer_dto(int include_optional) {
    update_promo_offer_dto_t* update_promo_offer_dto_1 = instantiate_update_promo_offer_dto(include_optional);

	cJSON* jsonupdate_promo_offer_dto_1 = update_promo_offer_dto_convertToJSON(update_promo_offer_dto_1);
	printf("update_promo_offer_dto :\n%s\n", cJSON_Print(jsonupdate_promo_offer_dto_1));
	update_promo_offer_dto_t* update_promo_offer_dto_2 = update_promo_offer_dto_parseFromJSON(jsonupdate_promo_offer_dto_1);
	cJSON* jsonupdate_promo_offer_dto_2 = update_promo_offer_dto_convertToJSON(update_promo_offer_dto_2);
	printf("repeating update_promo_offer_dto:\n%s\n", cJSON_Print(jsonupdate_promo_offer_dto_2));
}

int main() {
  test_update_promo_offer_dto(1);
  test_update_promo_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_promo_offer_dto_MAIN
#endif // update_promo_offer_dto_TEST
