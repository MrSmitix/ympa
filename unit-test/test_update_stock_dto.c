#ifndef update_stock_dto_TEST
#define update_stock_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_stock_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_stock_dto.h"
update_stock_dto_t* instantiate_update_stock_dto(int include_optional);



update_stock_dto_t* instantiate_update_stock_dto(int include_optional) {
  update_stock_dto_t* update_stock_dto = NULL;
  if (include_optional) {
    update_stock_dto = update_stock_dto_create(
      "a",
      list_createList()
    );
  } else {
    update_stock_dto = update_stock_dto_create(
      "a",
      list_createList()
    );
  }

  return update_stock_dto;
}


#ifdef update_stock_dto_MAIN

void test_update_stock_dto(int include_optional) {
    update_stock_dto_t* update_stock_dto_1 = instantiate_update_stock_dto(include_optional);

	cJSON* jsonupdate_stock_dto_1 = update_stock_dto_convertToJSON(update_stock_dto_1);
	printf("update_stock_dto :\n%s\n", cJSON_Print(jsonupdate_stock_dto_1));
	update_stock_dto_t* update_stock_dto_2 = update_stock_dto_parseFromJSON(jsonupdate_stock_dto_1);
	cJSON* jsonupdate_stock_dto_2 = update_stock_dto_convertToJSON(update_stock_dto_2);
	printf("repeating update_stock_dto:\n%s\n", cJSON_Print(jsonupdate_stock_dto_2));
}

int main() {
  test_update_stock_dto(1);
  test_update_stock_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_stock_dto_MAIN
#endif // update_stock_dto_TEST
