#ifndef unit_dto_TEST
#define unit_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define unit_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/unit_dto.h"
unit_dto_t* instantiate_unit_dto(int include_optional);



unit_dto_t* instantiate_unit_dto(int include_optional) {
  unit_dto_t* unit_dto = NULL;
  if (include_optional) {
    unit_dto = unit_dto_create(
      56,
      "кг",
      "килограмм"
    );
  } else {
    unit_dto = unit_dto_create(
      56,
      "кг",
      "килограмм"
    );
  }

  return unit_dto;
}


#ifdef unit_dto_MAIN

void test_unit_dto(int include_optional) {
    unit_dto_t* unit_dto_1 = instantiate_unit_dto(include_optional);

	cJSON* jsonunit_dto_1 = unit_dto_convertToJSON(unit_dto_1);
	printf("unit_dto :\n%s\n", cJSON_Print(jsonunit_dto_1));
	unit_dto_t* unit_dto_2 = unit_dto_parseFromJSON(jsonunit_dto_1);
	cJSON* jsonunit_dto_2 = unit_dto_convertToJSON(unit_dto_2);
	printf("repeating unit_dto:\n%s\n", cJSON_Print(jsonunit_dto_2));
}

int main() {
  test_unit_dto(1);
  test_unit_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // unit_dto_MAIN
#endif // unit_dto_TEST
