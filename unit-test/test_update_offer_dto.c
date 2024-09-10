#ifndef update_offer_dto_TEST
#define update_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_offer_dto.h"
update_offer_dto_t* instantiate_update_offer_dto(int include_optional);

#include "test_offer_weight_dimensions_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"
#include "test_offer_condition_dto.c"
#include "test_age_dto.c"
#include "test_update_price_with_discount_dto.c"
#include "test_base_price_dto.c"
#include "test_base_price_dto.c"
#include "test_base_price_dto.c"


update_offer_dto_t* instantiate_update_offer_dto(int include_optional) {
  update_offer_dto_t* update_offer_dto = NULL;
  if (include_optional) {
    update_offer_dto = update_offer_dto_create(
      "a",
      "Ударная дрель Makita HP1630, 710 Вт",
      56,
      "0",
      list_createList(),
      list_createList(),
      list_createList(),
      "LEVENHUK",
      list_createList(),
      "0",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_offer_weight_dimensions_dto(0),
      "VNDR-0005A",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
      "8517610008",
      list_createList(),
      56,
       // false, not to have infinite recursion
      instantiate_offer_condition_dto(0),
      _api__update_offer_dto__DEFAULT,
      1,
      1,
       // false, not to have infinite recursion
      instantiate_age_dto(0),
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_update_price_with_discount_dto(0),
       // false, not to have infinite recursion
      instantiate_base_price_dto(0),
       // false, not to have infinite recursion
      instantiate_base_price_dto(0),
       // false, not to have infinite recursion
      instantiate_base_price_dto(0)
    );
  } else {
    update_offer_dto = update_offer_dto_create(
      "a",
      "Ударная дрель Makita HP1630, 710 Вт",
      56,
      "0",
      list_createList(),
      list_createList(),
      list_createList(),
      "LEVENHUK",
      list_createList(),
      "0",
      list_createList(),
      NULL,
      "VNDR-0005A",
      list_createList(),
      NULL,
      NULL,
      NULL,
      "8517610008",
      list_createList(),
      56,
      NULL,
      _api__update_offer_dto__DEFAULT,
      1,
      1,
      NULL,
      list_createList(),
      list_createList(),
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return update_offer_dto;
}


#ifdef update_offer_dto_MAIN

void test_update_offer_dto(int include_optional) {
    update_offer_dto_t* update_offer_dto_1 = instantiate_update_offer_dto(include_optional);

	cJSON* jsonupdate_offer_dto_1 = update_offer_dto_convertToJSON(update_offer_dto_1);
	printf("update_offer_dto :\n%s\n", cJSON_Print(jsonupdate_offer_dto_1));
	update_offer_dto_t* update_offer_dto_2 = update_offer_dto_parseFromJSON(jsonupdate_offer_dto_1);
	cJSON* jsonupdate_offer_dto_2 = update_offer_dto_convertToJSON(update_offer_dto_2);
	printf("repeating update_offer_dto:\n%s\n", cJSON_Print(jsonupdate_offer_dto_2));
}

int main() {
  test_update_offer_dto(1);
  test_update_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_offer_dto_MAIN
#endif // update_offer_dto_TEST
