#ifndef orders_shipment_info_dto_TEST
#define orders_shipment_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define orders_shipment_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/orders_shipment_info_dto.h"
orders_shipment_info_dto_t* instantiate_orders_shipment_info_dto(int include_optional);



orders_shipment_info_dto_t* instantiate_orders_shipment_info_dto(int include_optional) {
  orders_shipment_info_dto_t* orders_shipment_info_dto = NULL;
  if (include_optional) {
    orders_shipment_info_dto = orders_shipment_info_dto_create(
      list_createList(),
      list_createList()
    );
  } else {
    orders_shipment_info_dto = orders_shipment_info_dto_create(
      list_createList(),
      list_createList()
    );
  }

  return orders_shipment_info_dto;
}


#ifdef orders_shipment_info_dto_MAIN

void test_orders_shipment_info_dto(int include_optional) {
    orders_shipment_info_dto_t* orders_shipment_info_dto_1 = instantiate_orders_shipment_info_dto(include_optional);

	cJSON* jsonorders_shipment_info_dto_1 = orders_shipment_info_dto_convertToJSON(orders_shipment_info_dto_1);
	printf("orders_shipment_info_dto :\n%s\n", cJSON_Print(jsonorders_shipment_info_dto_1));
	orders_shipment_info_dto_t* orders_shipment_info_dto_2 = orders_shipment_info_dto_parseFromJSON(jsonorders_shipment_info_dto_1);
	cJSON* jsonorders_shipment_info_dto_2 = orders_shipment_info_dto_convertToJSON(orders_shipment_info_dto_2);
	printf("repeating orders_shipment_info_dto:\n%s\n", cJSON_Print(jsonorders_shipment_info_dto_2));
}

int main() {
  test_orders_shipment_info_dto(1);
  test_orders_shipment_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // orders_shipment_info_dto_MAIN
#endif // orders_shipment_info_dto_TEST
