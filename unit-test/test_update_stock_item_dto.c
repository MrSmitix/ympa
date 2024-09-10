#ifndef update_stock_item_dto_TEST
#define update_stock_item_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_stock_item_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_stock_item_dto.h"
update_stock_item_dto_t* instantiate_update_stock_item_dto(int include_optional);



update_stock_item_dto_t* instantiate_update_stock_item_dto(int include_optional) {
  update_stock_item_dto_t* update_stock_item_dto = NULL;
  if (include_optional) {
    update_stock_item_dto = update_stock_item_dto_create(
      0,
      "2013-10-20T19:20:30+01:00"
    );
  } else {
    update_stock_item_dto = update_stock_item_dto_create(
      0,
      "2013-10-20T19:20:30+01:00"
    );
  }

  return update_stock_item_dto;
}


#ifdef update_stock_item_dto_MAIN

void test_update_stock_item_dto(int include_optional) {
    update_stock_item_dto_t* update_stock_item_dto_1 = instantiate_update_stock_item_dto(include_optional);

	cJSON* jsonupdate_stock_item_dto_1 = update_stock_item_dto_convertToJSON(update_stock_item_dto_1);
	printf("update_stock_item_dto :\n%s\n", cJSON_Print(jsonupdate_stock_item_dto_1));
	update_stock_item_dto_t* update_stock_item_dto_2 = update_stock_item_dto_parseFromJSON(jsonupdate_stock_item_dto_1);
	cJSON* jsonupdate_stock_item_dto_2 = update_stock_item_dto_convertToJSON(update_stock_item_dto_2);
	printf("repeating update_stock_item_dto:\n%s\n", cJSON_Print(jsonupdate_stock_item_dto_2));
}

int main() {
  test_update_stock_item_dto(1);
  test_update_stock_item_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_stock_item_dto_MAIN
#endif // update_stock_item_dto_TEST
