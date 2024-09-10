#ifndef order_state_dto_TEST
#define order_state_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_state_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_state_dto.h"
order_state_dto_t* instantiate_order_state_dto(int include_optional);



order_state_dto_t* instantiate_order_state_dto(int include_optional) {
  order_state_dto_t* order_state_dto = NULL;
  if (include_optional) {
    order_state_dto = order_state_dto_create(
      56,
      _api__order_state_dto__PLACING,
      _api__order_state_dto__RESERVATION_EXPIRED
    );
  } else {
    order_state_dto = order_state_dto_create(
      56,
      _api__order_state_dto__PLACING,
      _api__order_state_dto__RESERVATION_EXPIRED
    );
  }

  return order_state_dto;
}


#ifdef order_state_dto_MAIN

void test_order_state_dto(int include_optional) {
    order_state_dto_t* order_state_dto_1 = instantiate_order_state_dto(include_optional);

	cJSON* jsonorder_state_dto_1 = order_state_dto_convertToJSON(order_state_dto_1);
	printf("order_state_dto :\n%s\n", cJSON_Print(jsonorder_state_dto_1));
	order_state_dto_t* order_state_dto_2 = order_state_dto_parseFromJSON(jsonorder_state_dto_1);
	cJSON* jsonorder_state_dto_2 = order_state_dto_convertToJSON(order_state_dto_2);
	printf("repeating order_state_dto:\n%s\n", cJSON_Print(jsonorder_state_dto_2));
}

int main() {
  test_order_state_dto(1);
  test_order_state_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_state_dto_MAIN
#endif // order_state_dto_TEST
