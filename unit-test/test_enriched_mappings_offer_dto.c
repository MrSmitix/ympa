#ifndef enriched_mappings_offer_dto_TEST
#define enriched_mappings_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define enriched_mappings_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/enriched_mappings_offer_dto.h"
enriched_mappings_offer_dto_t* instantiate_enriched_mappings_offer_dto(int include_optional);

#include "test_offer_weight_dimensions_dto.c"
#include "test_offer_processing_state_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"


enriched_mappings_offer_dto_t* instantiate_enriched_mappings_offer_dto(int include_optional) {
  enriched_mappings_offer_dto_t* enriched_mappings_offer_dto = NULL;
  if (include_optional) {
    enriched_mappings_offer_dto = enriched_mappings_offer_dto_create(
      "Ударная дрель Makita HP1630, 710 Вт",
      "a",
      "0",
      "LEVENHUK",
      "VNDR-0005A",
      "0",
      "a",
      56,
      list_createList(),
      list_createList(),
      list_createList(),
      "0",
      list_createList(),
      56,
      56,
      56,
      56,
      56,
      list_createList(),
       // false, not to have infinite recursion
      instantiate_offer_weight_dimensions_dto(0),
      list_createList(),
      56,
      56,
      56,
       // false, not to have infinite recursion
      instantiate_offer_processing_state_dto(0),
      _api__enriched_mappings_offer_dto__ACTIVE,
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
      "0",
      1.337,
      56,
      "0",
      56,
      "0",
      56,
      "0"
    );
  } else {
    enriched_mappings_offer_dto = enriched_mappings_offer_dto_create(
      "Ударная дрель Makita HP1630, 710 Вт",
      "a",
      "0",
      "LEVENHUK",
      "VNDR-0005A",
      "0",
      "a",
      56,
      list_createList(),
      list_createList(),
      list_createList(),
      "0",
      list_createList(),
      56,
      56,
      56,
      56,
      56,
      list_createList(),
      NULL,
      list_createList(),
      56,
      56,
      56,
      NULL,
      _api__enriched_mappings_offer_dto__ACTIVE,
      NULL,
      NULL,
      NULL,
      "0",
      1.337,
      56,
      "0",
      56,
      "0",
      56,
      "0"
    );
  }

  return enriched_mappings_offer_dto;
}


#ifdef enriched_mappings_offer_dto_MAIN

void test_enriched_mappings_offer_dto(int include_optional) {
    enriched_mappings_offer_dto_t* enriched_mappings_offer_dto_1 = instantiate_enriched_mappings_offer_dto(include_optional);

	cJSON* jsonenriched_mappings_offer_dto_1 = enriched_mappings_offer_dto_convertToJSON(enriched_mappings_offer_dto_1);
	printf("enriched_mappings_offer_dto :\n%s\n", cJSON_Print(jsonenriched_mappings_offer_dto_1));
	enriched_mappings_offer_dto_t* enriched_mappings_offer_dto_2 = enriched_mappings_offer_dto_parseFromJSON(jsonenriched_mappings_offer_dto_1);
	cJSON* jsonenriched_mappings_offer_dto_2 = enriched_mappings_offer_dto_convertToJSON(enriched_mappings_offer_dto_2);
	printf("repeating enriched_mappings_offer_dto:\n%s\n", cJSON_Print(jsonenriched_mappings_offer_dto_2));
}

int main() {
  test_enriched_mappings_offer_dto(1);
  test_enriched_mappings_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // enriched_mappings_offer_dto_MAIN
#endif // enriched_mappings_offer_dto_TEST
