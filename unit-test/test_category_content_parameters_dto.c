#ifndef category_content_parameters_dto_TEST
#define category_content_parameters_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define category_content_parameters_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/category_content_parameters_dto.h"
category_content_parameters_dto_t* instantiate_category_content_parameters_dto(int include_optional);



category_content_parameters_dto_t* instantiate_category_content_parameters_dto(int include_optional) {
  category_content_parameters_dto_t* category_content_parameters_dto = NULL;
  if (include_optional) {
    category_content_parameters_dto = category_content_parameters_dto_create(
      56,
      list_createList()
    );
  } else {
    category_content_parameters_dto = category_content_parameters_dto_create(
      56,
      list_createList()
    );
  }

  return category_content_parameters_dto;
}


#ifdef category_content_parameters_dto_MAIN

void test_category_content_parameters_dto(int include_optional) {
    category_content_parameters_dto_t* category_content_parameters_dto_1 = instantiate_category_content_parameters_dto(include_optional);

	cJSON* jsoncategory_content_parameters_dto_1 = category_content_parameters_dto_convertToJSON(category_content_parameters_dto_1);
	printf("category_content_parameters_dto :\n%s\n", cJSON_Print(jsoncategory_content_parameters_dto_1));
	category_content_parameters_dto_t* category_content_parameters_dto_2 = category_content_parameters_dto_parseFromJSON(jsoncategory_content_parameters_dto_1);
	cJSON* jsoncategory_content_parameters_dto_2 = category_content_parameters_dto_convertToJSON(category_content_parameters_dto_2);
	printf("repeating category_content_parameters_dto:\n%s\n", cJSON_Print(jsoncategory_content_parameters_dto_2));
}

int main() {
  test_category_content_parameters_dto(1);
  test_category_content_parameters_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // category_content_parameters_dto_MAIN
#endif // category_content_parameters_dto_TEST
