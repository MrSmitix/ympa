#ifndef region_dto_TEST
#define region_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define region_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/region_dto.h"
region_dto_t* instantiate_region_dto(int include_optional);

#include "test_region_dto.c"


region_dto_t* instantiate_region_dto(int include_optional) {
  region_dto_t* region_dto = NULL;
  if (include_optional) {
    region_dto = region_dto_create(
      56,
      "0",
      _api__region_dto__OTHER,
       // false, not to have infinite recursion
      instantiate_region_dto(0),
      list_createList()
    );
  } else {
    region_dto = region_dto_create(
      56,
      "0",
      _api__region_dto__OTHER,
      NULL,
      list_createList()
    );
  }

  return region_dto;
}


#ifdef region_dto_MAIN

void test_region_dto(int include_optional) {
    region_dto_t* region_dto_1 = instantiate_region_dto(include_optional);

	cJSON* jsonregion_dto_1 = region_dto_convertToJSON(region_dto_1);
	printf("region_dto :\n%s\n", cJSON_Print(jsonregion_dto_1));
	region_dto_t* region_dto_2 = region_dto_parseFromJSON(jsonregion_dto_1);
	cJSON* jsonregion_dto_2 = region_dto_convertToJSON(region_dto_2);
	printf("repeating region_dto:\n%s\n", cJSON_Print(jsonregion_dto_2));
}

int main() {
  test_region_dto(1);
  test_region_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // region_dto_MAIN
#endif // region_dto_TEST
