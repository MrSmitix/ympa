#ifndef brief_order_item_instance_dto_TEST
#define brief_order_item_instance_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define brief_order_item_instance_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/brief_order_item_instance_dto.h"
brief_order_item_instance_dto_t* instantiate_brief_order_item_instance_dto(int include_optional);



brief_order_item_instance_dto_t* instantiate_brief_order_item_instance_dto(int include_optional) {
  brief_order_item_instance_dto_t* brief_order_item_instance_dto = NULL;
  if (include_optional) {
    brief_order_item_instance_dto = brief_order_item_instance_dto_create(
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    brief_order_item_instance_dto = brief_order_item_instance_dto_create(
      "0",
      "0",
      "0",
      "0"
    );
  }

  return brief_order_item_instance_dto;
}


#ifdef brief_order_item_instance_dto_MAIN

void test_brief_order_item_instance_dto(int include_optional) {
    brief_order_item_instance_dto_t* brief_order_item_instance_dto_1 = instantiate_brief_order_item_instance_dto(include_optional);

	cJSON* jsonbrief_order_item_instance_dto_1 = brief_order_item_instance_dto_convertToJSON(brief_order_item_instance_dto_1);
	printf("brief_order_item_instance_dto :\n%s\n", cJSON_Print(jsonbrief_order_item_instance_dto_1));
	brief_order_item_instance_dto_t* brief_order_item_instance_dto_2 = brief_order_item_instance_dto_parseFromJSON(jsonbrief_order_item_instance_dto_1);
	cJSON* jsonbrief_order_item_instance_dto_2 = brief_order_item_instance_dto_convertToJSON(brief_order_item_instance_dto_2);
	printf("repeating brief_order_item_instance_dto:\n%s\n", cJSON_Print(jsonbrief_order_item_instance_dto_2));
}

int main() {
  test_brief_order_item_instance_dto(1);
  test_brief_order_item_instance_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // brief_order_item_instance_dto_MAIN
#endif // brief_order_item_instance_dto_TEST
