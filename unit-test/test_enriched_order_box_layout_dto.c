#ifndef enriched_order_box_layout_dto_TEST
#define enriched_order_box_layout_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define enriched_order_box_layout_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/enriched_order_box_layout_dto.h"
enriched_order_box_layout_dto_t* instantiate_enriched_order_box_layout_dto(int include_optional);



enriched_order_box_layout_dto_t* instantiate_enriched_order_box_layout_dto(int include_optional) {
  enriched_order_box_layout_dto_t* enriched_order_box_layout_dto = NULL;
  if (include_optional) {
    enriched_order_box_layout_dto = enriched_order_box_layout_dto_create(
      list_createList(),
      56
    );
  } else {
    enriched_order_box_layout_dto = enriched_order_box_layout_dto_create(
      list_createList(),
      56
    );
  }

  return enriched_order_box_layout_dto;
}


#ifdef enriched_order_box_layout_dto_MAIN

void test_enriched_order_box_layout_dto(int include_optional) {
    enriched_order_box_layout_dto_t* enriched_order_box_layout_dto_1 = instantiate_enriched_order_box_layout_dto(include_optional);

	cJSON* jsonenriched_order_box_layout_dto_1 = enriched_order_box_layout_dto_convertToJSON(enriched_order_box_layout_dto_1);
	printf("enriched_order_box_layout_dto :\n%s\n", cJSON_Print(jsonenriched_order_box_layout_dto_1));
	enriched_order_box_layout_dto_t* enriched_order_box_layout_dto_2 = enriched_order_box_layout_dto_parseFromJSON(jsonenriched_order_box_layout_dto_1);
	cJSON* jsonenriched_order_box_layout_dto_2 = enriched_order_box_layout_dto_convertToJSON(enriched_order_box_layout_dto_2);
	printf("repeating enriched_order_box_layout_dto:\n%s\n", cJSON_Print(jsonenriched_order_box_layout_dto_2));
}

int main() {
  test_enriched_order_box_layout_dto(1);
  test_enriched_order_box_layout_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // enriched_order_box_layout_dto_MAIN
#endif // enriched_order_box_layout_dto_TEST
