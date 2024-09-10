#ifndef full_outlet_dto_TEST
#define full_outlet_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define full_outlet_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/full_outlet_dto.h"
full_outlet_dto_t* instantiate_full_outlet_dto(int include_optional);

#include "test_outlet_address_dto.c"
#include "test_outlet_working_schedule_dto.c"
#include "test_region_dto.c"


full_outlet_dto_t* instantiate_full_outlet_dto(int include_optional) {
  full_outlet_dto_t* full_outlet_dto = NULL;
  if (include_optional) {
    full_outlet_dto = full_outlet_dto_create(
      "0",
      _api__full_outlet_dto__DEPOT,
      "0",
      1,
      "0",
      _api__full_outlet_dto__HIDDEN,
       // false, not to have infinite recursion
      instantiate_outlet_address_dto(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_outlet_working_schedule_dto(0),
      list_createList(),
      56,
      56,
      _api__full_outlet_dto__AT_MODERATION,
       // false, not to have infinite recursion
      instantiate_region_dto(0),
      "0",
      "0",
      "0"
    );
  } else {
    full_outlet_dto = full_outlet_dto_create(
      "0",
      _api__full_outlet_dto__DEPOT,
      "0",
      1,
      "0",
      _api__full_outlet_dto__HIDDEN,
      NULL,
      list_createList(),
      NULL,
      list_createList(),
      56,
      56,
      _api__full_outlet_dto__AT_MODERATION,
      NULL,
      "0",
      "0",
      "0"
    );
  }

  return full_outlet_dto;
}


#ifdef full_outlet_dto_MAIN

void test_full_outlet_dto(int include_optional) {
    full_outlet_dto_t* full_outlet_dto_1 = instantiate_full_outlet_dto(include_optional);

	cJSON* jsonfull_outlet_dto_1 = full_outlet_dto_convertToJSON(full_outlet_dto_1);
	printf("full_outlet_dto :\n%s\n", cJSON_Print(jsonfull_outlet_dto_1));
	full_outlet_dto_t* full_outlet_dto_2 = full_outlet_dto_parseFromJSON(jsonfull_outlet_dto_1);
	cJSON* jsonfull_outlet_dto_2 = full_outlet_dto_convertToJSON(full_outlet_dto_2);
	printf("repeating full_outlet_dto:\n%s\n", cJSON_Print(jsonfull_outlet_dto_2));
}

int main() {
  test_full_outlet_dto(1);
  test_full_outlet_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // full_outlet_dto_MAIN
#endif // full_outlet_dto_TEST
