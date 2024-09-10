#ifndef order_track_dto_TEST
#define order_track_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_track_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_track_dto.h"
order_track_dto_t* instantiate_order_track_dto(int include_optional);



order_track_dto_t* instantiate_order_track_dto(int include_optional) {
  order_track_dto_t* order_track_dto = NULL;
  if (include_optional) {
    order_track_dto = order_track_dto_create(
      "0",
      56
    );
  } else {
    order_track_dto = order_track_dto_create(
      "0",
      56
    );
  }

  return order_track_dto;
}


#ifdef order_track_dto_MAIN

void test_order_track_dto(int include_optional) {
    order_track_dto_t* order_track_dto_1 = instantiate_order_track_dto(include_optional);

	cJSON* jsonorder_track_dto_1 = order_track_dto_convertToJSON(order_track_dto_1);
	printf("order_track_dto :\n%s\n", cJSON_Print(jsonorder_track_dto_1));
	order_track_dto_t* order_track_dto_2 = order_track_dto_parseFromJSON(jsonorder_track_dto_1);
	cJSON* jsonorder_track_dto_2 = order_track_dto_convertToJSON(order_track_dto_2);
	printf("repeating order_track_dto:\n%s\n", cJSON_Print(jsonorder_track_dto_2));
}

int main() {
  test_order_track_dto(1);
  test_order_track_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_track_dto_MAIN
#endif // order_track_dto_TEST
