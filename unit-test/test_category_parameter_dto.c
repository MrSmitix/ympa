#ifndef category_parameter_dto_TEST
#define category_parameter_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define category_parameter_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/category_parameter_dto.h"
category_parameter_dto_t* instantiate_category_parameter_dto(int include_optional);

#include "test_category_parameter_unit_dto.c"
#include "test_parameter_value_constraints_dto.c"


category_parameter_dto_t* instantiate_category_parameter_dto(int include_optional) {
  category_parameter_dto_t* category_parameter_dto = NULL;
  if (include_optional) {
    category_parameter_dto = category_parameter_dto_create(
      56,
      "0",
      _api__category_parameter_dto__TEXT,
       // false, not to have infinite recursion
      instantiate_category_parameter_unit_dto(0),
      "0",
      list_createList(),
      1,
      1,
      1,
      1,
      1,
      list_createList(),
       // false, not to have infinite recursion
      instantiate_parameter_value_constraints_dto(0),
      list_createList()
    );
  } else {
    category_parameter_dto = category_parameter_dto_create(
      56,
      "0",
      _api__category_parameter_dto__TEXT,
      NULL,
      "0",
      list_createList(),
      1,
      1,
      1,
      1,
      1,
      list_createList(),
      NULL,
      list_createList()
    );
  }

  return category_parameter_dto;
}


#ifdef category_parameter_dto_MAIN

void test_category_parameter_dto(int include_optional) {
    category_parameter_dto_t* category_parameter_dto_1 = instantiate_category_parameter_dto(include_optional);

	cJSON* jsoncategory_parameter_dto_1 = category_parameter_dto_convertToJSON(category_parameter_dto_1);
	printf("category_parameter_dto :\n%s\n", cJSON_Print(jsoncategory_parameter_dto_1));
	category_parameter_dto_t* category_parameter_dto_2 = category_parameter_dto_parseFromJSON(jsoncategory_parameter_dto_1);
	cJSON* jsoncategory_parameter_dto_2 = category_parameter_dto_convertToJSON(category_parameter_dto_2);
	printf("repeating category_parameter_dto:\n%s\n", cJSON_Print(jsoncategory_parameter_dto_2));
}

int main() {
  test_category_parameter_dto(1);
  test_category_parameter_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // category_parameter_dto_MAIN
#endif // category_parameter_dto_TEST
