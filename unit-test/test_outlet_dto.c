#ifndef outlet_dto_TEST
#define outlet_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define outlet_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/outlet_dto.h"
outlet_dto_t* instantiate_outlet_dto(int include_optional);

#include "test_outlet_address_dto.c"
#include "test_outlet_working_schedule_dto.c"


outlet_dto_t* instantiate_outlet_dto(int include_optional) {
  outlet_dto_t* outlet_dto = NULL;
  if (include_optional) {
    outlet_dto = outlet_dto_create(
      "0",
      _api__outlet_dto__DEPOT,
      "0",
      1,
      "0",
      _api__outlet_dto__HIDDEN,
       // false, not to have infinite recursion
      instantiate_outlet_address_dto(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_outlet_working_schedule_dto(0),
      list_createList(),
      56
    );
  } else {
    outlet_dto = outlet_dto_create(
      "0",
      _api__outlet_dto__DEPOT,
      "0",
      1,
      "0",
      _api__outlet_dto__HIDDEN,
      NULL,
      list_createList(),
      NULL,
      list_createList(),
      56
    );
  }

  return outlet_dto;
}


#ifdef outlet_dto_MAIN

void test_outlet_dto(int include_optional) {
    outlet_dto_t* outlet_dto_1 = instantiate_outlet_dto(include_optional);

	cJSON* jsonoutlet_dto_1 = outlet_dto_convertToJSON(outlet_dto_1);
	printf("outlet_dto :\n%s\n", cJSON_Print(jsonoutlet_dto_1));
	outlet_dto_t* outlet_dto_2 = outlet_dto_parseFromJSON(jsonoutlet_dto_1);
	cJSON* jsonoutlet_dto_2 = outlet_dto_convertToJSON(outlet_dto_2);
	printf("repeating outlet_dto:\n%s\n", cJSON_Print(jsonoutlet_dto_2));
}

int main() {
  test_outlet_dto(1);
  test_outlet_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // outlet_dto_MAIN
#endif // outlet_dto_TEST
