#ifndef category_parameter_unit_dto_TEST
#define category_parameter_unit_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define category_parameter_unit_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/category_parameter_unit_dto.h"
category_parameter_unit_dto_t* instantiate_category_parameter_unit_dto(int include_optional);



category_parameter_unit_dto_t* instantiate_category_parameter_unit_dto(int include_optional) {
  category_parameter_unit_dto_t* category_parameter_unit_dto = NULL;
  if (include_optional) {
    category_parameter_unit_dto = category_parameter_unit_dto_create(
      56,
      list_createList()
    );
  } else {
    category_parameter_unit_dto = category_parameter_unit_dto_create(
      56,
      list_createList()
    );
  }

  return category_parameter_unit_dto;
}


#ifdef category_parameter_unit_dto_MAIN

void test_category_parameter_unit_dto(int include_optional) {
    category_parameter_unit_dto_t* category_parameter_unit_dto_1 = instantiate_category_parameter_unit_dto(include_optional);

	cJSON* jsoncategory_parameter_unit_dto_1 = category_parameter_unit_dto_convertToJSON(category_parameter_unit_dto_1);
	printf("category_parameter_unit_dto :\n%s\n", cJSON_Print(jsoncategory_parameter_unit_dto_1));
	category_parameter_unit_dto_t* category_parameter_unit_dto_2 = category_parameter_unit_dto_parseFromJSON(jsoncategory_parameter_unit_dto_1);
	cJSON* jsoncategory_parameter_unit_dto_2 = category_parameter_unit_dto_convertToJSON(category_parameter_unit_dto_2);
	printf("repeating category_parameter_unit_dto:\n%s\n", cJSON_Print(jsoncategory_parameter_unit_dto_2));
}

int main() {
  test_category_parameter_unit_dto(1);
  test_category_parameter_unit_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // category_parameter_unit_dto_MAIN
#endif // category_parameter_unit_dto_TEST
