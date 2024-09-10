#ifndef shipment_boxes_dto_TEST
#define shipment_boxes_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shipment_boxes_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shipment_boxes_dto.h"
shipment_boxes_dto_t* instantiate_shipment_boxes_dto(int include_optional);



shipment_boxes_dto_t* instantiate_shipment_boxes_dto(int include_optional) {
  shipment_boxes_dto_t* shipment_boxes_dto = NULL;
  if (include_optional) {
    shipment_boxes_dto = shipment_boxes_dto_create(
      list_createList()
    );
  } else {
    shipment_boxes_dto = shipment_boxes_dto_create(
      list_createList()
    );
  }

  return shipment_boxes_dto;
}


#ifdef shipment_boxes_dto_MAIN

void test_shipment_boxes_dto(int include_optional) {
    shipment_boxes_dto_t* shipment_boxes_dto_1 = instantiate_shipment_boxes_dto(include_optional);

	cJSON* jsonshipment_boxes_dto_1 = shipment_boxes_dto_convertToJSON(shipment_boxes_dto_1);
	printf("shipment_boxes_dto :\n%s\n", cJSON_Print(jsonshipment_boxes_dto_1));
	shipment_boxes_dto_t* shipment_boxes_dto_2 = shipment_boxes_dto_parseFromJSON(jsonshipment_boxes_dto_1);
	cJSON* jsonshipment_boxes_dto_2 = shipment_boxes_dto_convertToJSON(shipment_boxes_dto_2);
	printf("repeating shipment_boxes_dto:\n%s\n", cJSON_Print(jsonshipment_boxes_dto_2));
}

int main() {
  test_shipment_boxes_dto(1);
  test_shipment_boxes_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // shipment_boxes_dto_MAIN
#endif // shipment_boxes_dto_TEST
