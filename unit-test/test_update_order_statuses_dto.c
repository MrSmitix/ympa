#ifndef update_order_statuses_dto_TEST
#define update_order_statuses_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_order_statuses_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_order_statuses_dto.h"
update_order_statuses_dto_t* instantiate_update_order_statuses_dto(int include_optional);



update_order_statuses_dto_t* instantiate_update_order_statuses_dto(int include_optional) {
  update_order_statuses_dto_t* update_order_statuses_dto = NULL;
  if (include_optional) {
    update_order_statuses_dto = update_order_statuses_dto_create(
      list_createList()
    );
  } else {
    update_order_statuses_dto = update_order_statuses_dto_create(
      list_createList()
    );
  }

  return update_order_statuses_dto;
}


#ifdef update_order_statuses_dto_MAIN

void test_update_order_statuses_dto(int include_optional) {
    update_order_statuses_dto_t* update_order_statuses_dto_1 = instantiate_update_order_statuses_dto(include_optional);

	cJSON* jsonupdate_order_statuses_dto_1 = update_order_statuses_dto_convertToJSON(update_order_statuses_dto_1);
	printf("update_order_statuses_dto :\n%s\n", cJSON_Print(jsonupdate_order_statuses_dto_1));
	update_order_statuses_dto_t* update_order_statuses_dto_2 = update_order_statuses_dto_parseFromJSON(jsonupdate_order_statuses_dto_1);
	cJSON* jsonupdate_order_statuses_dto_2 = update_order_statuses_dto_convertToJSON(update_order_statuses_dto_2);
	printf("repeating update_order_statuses_dto:\n%s\n", cJSON_Print(jsonupdate_order_statuses_dto_2));
}

int main() {
  test_update_order_statuses_dto(1);
  test_update_order_statuses_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_order_statuses_dto_MAIN
#endif // update_order_statuses_dto_TEST
