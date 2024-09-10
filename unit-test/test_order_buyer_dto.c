#ifndef order_buyer_dto_TEST
#define order_buyer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_buyer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_buyer_dto.h"
order_buyer_dto_t* instantiate_order_buyer_dto(int include_optional);



order_buyer_dto_t* instantiate_order_buyer_dto(int include_optional) {
  order_buyer_dto_t* order_buyer_dto = NULL;
  if (include_optional) {
    order_buyer_dto = order_buyer_dto_create(
      "0",
      "0",
      "0",
      "0",
      _api__order_buyer_dto__PERSON
    );
  } else {
    order_buyer_dto = order_buyer_dto_create(
      "0",
      "0",
      "0",
      "0",
      _api__order_buyer_dto__PERSON
    );
  }

  return order_buyer_dto;
}


#ifdef order_buyer_dto_MAIN

void test_order_buyer_dto(int include_optional) {
    order_buyer_dto_t* order_buyer_dto_1 = instantiate_order_buyer_dto(include_optional);

	cJSON* jsonorder_buyer_dto_1 = order_buyer_dto_convertToJSON(order_buyer_dto_1);
	printf("order_buyer_dto :\n%s\n", cJSON_Print(jsonorder_buyer_dto_1));
	order_buyer_dto_t* order_buyer_dto_2 = order_buyer_dto_parseFromJSON(jsonorder_buyer_dto_1);
	cJSON* jsonorder_buyer_dto_2 = order_buyer_dto_convertToJSON(order_buyer_dto_2);
	printf("repeating order_buyer_dto:\n%s\n", cJSON_Print(jsonorder_buyer_dto_2));
}

int main() {
  test_order_buyer_dto(1);
  test_order_buyer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_buyer_dto_MAIN
#endif // order_buyer_dto_TEST
