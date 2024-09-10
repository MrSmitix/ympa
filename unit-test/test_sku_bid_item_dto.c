#ifndef sku_bid_item_dto_TEST
#define sku_bid_item_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define sku_bid_item_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/sku_bid_item_dto.h"
sku_bid_item_dto_t* instantiate_sku_bid_item_dto(int include_optional);



sku_bid_item_dto_t* instantiate_sku_bid_item_dto(int include_optional) {
  sku_bid_item_dto_t* sku_bid_item_dto = NULL;
  if (include_optional) {
    sku_bid_item_dto = sku_bid_item_dto_create(
      "a",
      570
    );
  } else {
    sku_bid_item_dto = sku_bid_item_dto_create(
      "a",
      570
    );
  }

  return sku_bid_item_dto;
}


#ifdef sku_bid_item_dto_MAIN

void test_sku_bid_item_dto(int include_optional) {
    sku_bid_item_dto_t* sku_bid_item_dto_1 = instantiate_sku_bid_item_dto(include_optional);

	cJSON* jsonsku_bid_item_dto_1 = sku_bid_item_dto_convertToJSON(sku_bid_item_dto_1);
	printf("sku_bid_item_dto :\n%s\n", cJSON_Print(jsonsku_bid_item_dto_1));
	sku_bid_item_dto_t* sku_bid_item_dto_2 = sku_bid_item_dto_parseFromJSON(jsonsku_bid_item_dto_1);
	cJSON* jsonsku_bid_item_dto_2 = sku_bid_item_dto_convertToJSON(sku_bid_item_dto_2);
	printf("repeating sku_bid_item_dto:\n%s\n", cJSON_Print(jsonsku_bid_item_dto_2));
}

int main() {
  test_sku_bid_item_dto(1);
  test_sku_bid_item_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // sku_bid_item_dto_MAIN
#endif // sku_bid_item_dto_TEST
