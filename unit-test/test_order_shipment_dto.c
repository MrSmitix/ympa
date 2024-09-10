#ifndef order_shipment_dto_TEST
#define order_shipment_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_shipment_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_shipment_dto.h"
order_shipment_dto_t* instantiate_order_shipment_dto(int include_optional);



order_shipment_dto_t* instantiate_order_shipment_dto(int include_optional) {
  order_shipment_dto_t* order_shipment_dto = NULL;
  if (include_optional) {
    order_shipment_dto = order_shipment_dto_create(
      56,
      "23-09-2022",
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    order_shipment_dto = order_shipment_dto_create(
      56,
      "23-09-2022",
      "0",
      list_createList(),
      list_createList()
    );
  }

  return order_shipment_dto;
}


#ifdef order_shipment_dto_MAIN

void test_order_shipment_dto(int include_optional) {
    order_shipment_dto_t* order_shipment_dto_1 = instantiate_order_shipment_dto(include_optional);

	cJSON* jsonorder_shipment_dto_1 = order_shipment_dto_convertToJSON(order_shipment_dto_1);
	printf("order_shipment_dto :\n%s\n", cJSON_Print(jsonorder_shipment_dto_1));
	order_shipment_dto_t* order_shipment_dto_2 = order_shipment_dto_parseFromJSON(jsonorder_shipment_dto_1);
	cJSON* jsonorder_shipment_dto_2 = order_shipment_dto_convertToJSON(order_shipment_dto_2);
	printf("repeating order_shipment_dto:\n%s\n", cJSON_Print(jsonorder_shipment_dto_2));
}

int main() {
  test_order_shipment_dto(1);
  test_order_shipment_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_shipment_dto_MAIN
#endif // order_shipment_dto_TEST
