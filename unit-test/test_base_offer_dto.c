#ifndef base_offer_dto_TEST
#define base_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define base_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/base_offer_dto.h"
base_offer_dto_t* instantiate_base_offer_dto(int include_optional);

#include "test_offer_weight_dimensions_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"
#include "test_offer_condition_dto.c"
#include "test_age_dto.c"


base_offer_dto_t* instantiate_base_offer_dto(int include_optional) {
  base_offer_dto_t* base_offer_dto = NULL;
  if (include_optional) {
    base_offer_dto = base_offer_dto_create(
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
      _api__base_offer_dto__DEFAULT,
      1,
      1,
       // false, not to have infinite recursion
      instantiate_age_dto(0),
      list_createList()
    );
  } else {
    base_offer_dto = base_offer_dto_create(
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
      _api__base_offer_dto__DEFAULT,
      1,
      1,
      NULL,
      list_createList()
    );
  }

  return base_offer_dto;
}


#ifdef base_offer_dto_MAIN

void test_base_offer_dto(int include_optional) {
    base_offer_dto_t* base_offer_dto_1 = instantiate_base_offer_dto(include_optional);

	cJSON* jsonbase_offer_dto_1 = base_offer_dto_convertToJSON(base_offer_dto_1);
	printf("base_offer_dto :\n%s\n", cJSON_Print(jsonbase_offer_dto_1));
	base_offer_dto_t* base_offer_dto_2 = base_offer_dto_parseFromJSON(jsonbase_offer_dto_1);
	cJSON* jsonbase_offer_dto_2 = base_offer_dto_convertToJSON(base_offer_dto_2);
	printf("repeating base_offer_dto:\n%s\n", cJSON_Print(jsonbase_offer_dto_2));
}

int main() {
  test_base_offer_dto(1);
  test_base_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // base_offer_dto_MAIN
#endif // base_offer_dto_TEST
