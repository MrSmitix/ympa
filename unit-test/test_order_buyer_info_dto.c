#ifndef order_buyer_info_dto_TEST
#define order_buyer_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_buyer_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_buyer_info_dto.h"
order_buyer_info_dto_t* instantiate_order_buyer_info_dto(int include_optional);



order_buyer_info_dto_t* instantiate_order_buyer_info_dto(int include_optional) {
  order_buyer_info_dto_t* order_buyer_info_dto = NULL;
  if (include_optional) {
    order_buyer_info_dto = order_buyer_info_dto_create(
      "0",
      "0",
      "0",
      "0",
      _api__order_buyer_info_dto__PERSON,
      "0"
    );
  } else {
    order_buyer_info_dto = order_buyer_info_dto_create(
      "0",
      "0",
      "0",
      "0",
      _api__order_buyer_info_dto__PERSON,
      "0"
    );
  }

  return order_buyer_info_dto;
}


#ifdef order_buyer_info_dto_MAIN

void test_order_buyer_info_dto(int include_optional) {
    order_buyer_info_dto_t* order_buyer_info_dto_1 = instantiate_order_buyer_info_dto(include_optional);

	cJSON* jsonorder_buyer_info_dto_1 = order_buyer_info_dto_convertToJSON(order_buyer_info_dto_1);
	printf("order_buyer_info_dto :\n%s\n", cJSON_Print(jsonorder_buyer_info_dto_1));
	order_buyer_info_dto_t* order_buyer_info_dto_2 = order_buyer_info_dto_parseFromJSON(jsonorder_buyer_info_dto_1);
	cJSON* jsonorder_buyer_info_dto_2 = order_buyer_info_dto_convertToJSON(order_buyer_info_dto_2);
	printf("repeating order_buyer_info_dto:\n%s\n", cJSON_Print(jsonorder_buyer_info_dto_2));
}

int main() {
  test_order_buyer_info_dto(1);
  test_order_buyer_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_buyer_info_dto_MAIN
#endif // order_buyer_info_dto_TEST
