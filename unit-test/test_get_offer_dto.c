#ifndef get_offer_dto_TEST
#define get_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_offer_dto.h"
get_offer_dto_t* instantiate_get_offer_dto(int include_optional);

#include "test_offer_weight_dimensions_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"
#include "test_offer_condition_dto.c"
#include "test_age_dto.c"
#include "test_get_price_with_discount_dto.c"
#include "test_get_price_dto.c"
#include "test_get_price_dto.c"
#include "test_get_price_dto.c"


get_offer_dto_t* instantiate_get_offer_dto(int include_optional) {
  get_offer_dto_t* get_offer_dto = NULL;
  if (include_optional) {
    get_offer_dto = get_offer_dto_create(
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
      _api__get_offer_dto__DEFAULT,
      1,
      1,
       // false, not to have infinite recursion
      instantiate_age_dto(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_get_price_with_discount_dto(0),
       // false, not to have infinite recursion
      instantiate_get_price_dto(0),
       // false, not to have infinite recursion
      instantiate_get_price_dto(0),
       // false, not to have infinite recursion
      instantiate_get_price_dto(0),
      _api__get_offer_dto__HAS_CARD_CAN_NOT_UPDATE,
      list_createList(),
      list_createList(),
      1
    );
  } else {
    get_offer_dto = get_offer_dto_create(
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
      _api__get_offer_dto__DEFAULT,
      1,
      1,
      NULL,
      list_createList(),
      NULL,
      NULL,
      NULL,
      NULL,
      _api__get_offer_dto__HAS_CARD_CAN_NOT_UPDATE,
      list_createList(),
      list_createList(),
      1
    );
  }

  return get_offer_dto;
}


#ifdef get_offer_dto_MAIN

void test_get_offer_dto(int include_optional) {
    get_offer_dto_t* get_offer_dto_1 = instantiate_get_offer_dto(include_optional);

	cJSON* jsonget_offer_dto_1 = get_offer_dto_convertToJSON(get_offer_dto_1);
	printf("get_offer_dto :\n%s\n", cJSON_Print(jsonget_offer_dto_1));
	get_offer_dto_t* get_offer_dto_2 = get_offer_dto_parseFromJSON(jsonget_offer_dto_1);
	cJSON* jsonget_offer_dto_2 = get_offer_dto_convertToJSON(get_offer_dto_2);
	printf("repeating get_offer_dto:\n%s\n", cJSON_Print(jsonget_offer_dto_2));
}

int main() {
  test_get_offer_dto(1);
  test_get_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_offer_dto_MAIN
#endif // get_offer_dto_TEST
