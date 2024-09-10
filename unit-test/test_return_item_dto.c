#ifndef return_item_dto_TEST
#define return_item_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define return_item_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/return_item_dto.h"
return_item_dto_t* instantiate_return_item_dto(int include_optional);



return_item_dto_t* instantiate_return_item_dto(int include_optional) {
  return_item_dto_t* return_item_dto = NULL;
  if (include_optional) {
    return_item_dto = return_item_dto_create(
      56,
      "a",
      56,
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    return_item_dto = return_item_dto_create(
      56,
      "a",
      56,
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return return_item_dto;
}


#ifdef return_item_dto_MAIN

void test_return_item_dto(int include_optional) {
    return_item_dto_t* return_item_dto_1 = instantiate_return_item_dto(include_optional);

	cJSON* jsonreturn_item_dto_1 = return_item_dto_convertToJSON(return_item_dto_1);
	printf("return_item_dto :\n%s\n", cJSON_Print(jsonreturn_item_dto_1));
	return_item_dto_t* return_item_dto_2 = return_item_dto_parseFromJSON(jsonreturn_item_dto_1);
	cJSON* jsonreturn_item_dto_2 = return_item_dto_convertToJSON(return_item_dto_2);
	printf("repeating return_item_dto:\n%s\n", cJSON_Print(jsonreturn_item_dto_2));
}

int main() {
  test_return_item_dto(1);
  test_return_item_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // return_item_dto_MAIN
#endif // return_item_dto_TEST
