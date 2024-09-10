#ifndef category_dto_TEST
#define category_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define category_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/category_dto.h"
category_dto_t* instantiate_category_dto(int include_optional);



category_dto_t* instantiate_category_dto(int include_optional) {
  category_dto_t* category_dto = NULL;
  if (include_optional) {
    category_dto = category_dto_create(
      56,
      "0",
      list_createList()
    );
  } else {
    category_dto = category_dto_create(
      56,
      "0",
      list_createList()
    );
  }

  return category_dto;
}


#ifdef category_dto_MAIN

void test_category_dto(int include_optional) {
    category_dto_t* category_dto_1 = instantiate_category_dto(include_optional);

	cJSON* jsoncategory_dto_1 = category_dto_convertToJSON(category_dto_1);
	printf("category_dto :\n%s\n", cJSON_Print(jsoncategory_dto_1));
	category_dto_t* category_dto_2 = category_dto_parseFromJSON(jsoncategory_dto_1);
	cJSON* jsoncategory_dto_2 = category_dto_convertToJSON(category_dto_2);
	printf("repeating category_dto:\n%s\n", cJSON_Print(jsoncategory_dto_2));
}

int main() {
  test_category_dto(1);
  test_category_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // category_dto_MAIN
#endif // category_dto_TEST
