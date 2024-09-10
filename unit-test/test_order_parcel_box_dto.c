#ifndef order_parcel_box_dto_TEST
#define order_parcel_box_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_parcel_box_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_parcel_box_dto.h"
order_parcel_box_dto_t* instantiate_order_parcel_box_dto(int include_optional);



order_parcel_box_dto_t* instantiate_order_parcel_box_dto(int include_optional) {
  order_parcel_box_dto_t* order_parcel_box_dto = NULL;
  if (include_optional) {
    order_parcel_box_dto = order_parcel_box_dto_create(
      56,
      "0"
    );
  } else {
    order_parcel_box_dto = order_parcel_box_dto_create(
      56,
      "0"
    );
  }

  return order_parcel_box_dto;
}


#ifdef order_parcel_box_dto_MAIN

void test_order_parcel_box_dto(int include_optional) {
    order_parcel_box_dto_t* order_parcel_box_dto_1 = instantiate_order_parcel_box_dto(include_optional);

	cJSON* jsonorder_parcel_box_dto_1 = order_parcel_box_dto_convertToJSON(order_parcel_box_dto_1);
	printf("order_parcel_box_dto :\n%s\n", cJSON_Print(jsonorder_parcel_box_dto_1));
	order_parcel_box_dto_t* order_parcel_box_dto_2 = order_parcel_box_dto_parseFromJSON(jsonorder_parcel_box_dto_1);
	cJSON* jsonorder_parcel_box_dto_2 = order_parcel_box_dto_convertToJSON(order_parcel_box_dto_2);
	printf("repeating order_parcel_box_dto:\n%s\n", cJSON_Print(jsonorder_parcel_box_dto_2));
}

int main() {
  test_order_parcel_box_dto(1);
  test_order_parcel_box_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_parcel_box_dto_MAIN
#endif // order_parcel_box_dto_TEST
