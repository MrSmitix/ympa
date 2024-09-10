#ifndef category_error_dto_TEST
#define category_error_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define category_error_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/category_error_dto.h"
category_error_dto_t* instantiate_category_error_dto(int include_optional);



category_error_dto_t* instantiate_category_error_dto(int include_optional) {
  category_error_dto_t* category_error_dto = NULL;
  if (include_optional) {
    category_error_dto = category_error_dto_create(
      56,
      _api__category_error_dto__UNKNOWN_CATEGORY
    );
  } else {
    category_error_dto = category_error_dto_create(
      56,
      _api__category_error_dto__UNKNOWN_CATEGORY
    );
  }

  return category_error_dto;
}


#ifdef category_error_dto_MAIN

void test_category_error_dto(int include_optional) {
    category_error_dto_t* category_error_dto_1 = instantiate_category_error_dto(include_optional);

	cJSON* jsoncategory_error_dto_1 = category_error_dto_convertToJSON(category_error_dto_1);
	printf("category_error_dto :\n%s\n", cJSON_Print(jsoncategory_error_dto_1));
	category_error_dto_t* category_error_dto_2 = category_error_dto_parseFromJSON(jsoncategory_error_dto_1);
	cJSON* jsoncategory_error_dto_2 = category_error_dto_convertToJSON(category_error_dto_2);
	printf("repeating category_error_dto:\n%s\n", cJSON_Print(jsoncategory_error_dto_2));
}

int main() {
  test_category_error_dto(1);
  test_category_error_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // category_error_dto_MAIN
#endif // category_error_dto_TEST
