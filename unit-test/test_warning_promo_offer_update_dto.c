#ifndef warning_promo_offer_update_dto_TEST
#define warning_promo_offer_update_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define warning_promo_offer_update_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/warning_promo_offer_update_dto.h"
warning_promo_offer_update_dto_t* instantiate_warning_promo_offer_update_dto(int include_optional);



warning_promo_offer_update_dto_t* instantiate_warning_promo_offer_update_dto(int include_optional) {
  warning_promo_offer_update_dto_t* warning_promo_offer_update_dto = NULL;
  if (include_optional) {
    warning_promo_offer_update_dto = warning_promo_offer_update_dto_create(
      "a",
      list_createList()
    );
  } else {
    warning_promo_offer_update_dto = warning_promo_offer_update_dto_create(
      "a",
      list_createList()
    );
  }

  return warning_promo_offer_update_dto;
}


#ifdef warning_promo_offer_update_dto_MAIN

void test_warning_promo_offer_update_dto(int include_optional) {
    warning_promo_offer_update_dto_t* warning_promo_offer_update_dto_1 = instantiate_warning_promo_offer_update_dto(include_optional);

	cJSON* jsonwarning_promo_offer_update_dto_1 = warning_promo_offer_update_dto_convertToJSON(warning_promo_offer_update_dto_1);
	printf("warning_promo_offer_update_dto :\n%s\n", cJSON_Print(jsonwarning_promo_offer_update_dto_1));
	warning_promo_offer_update_dto_t* warning_promo_offer_update_dto_2 = warning_promo_offer_update_dto_parseFromJSON(jsonwarning_promo_offer_update_dto_1);
	cJSON* jsonwarning_promo_offer_update_dto_2 = warning_promo_offer_update_dto_convertToJSON(warning_promo_offer_update_dto_2);
	printf("repeating warning_promo_offer_update_dto:\n%s\n", cJSON_Print(jsonwarning_promo_offer_update_dto_2));
}

int main() {
  test_warning_promo_offer_update_dto(1);
  test_warning_promo_offer_update_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // warning_promo_offer_update_dto_MAIN
#endif // warning_promo_offer_update_dto_TEST
