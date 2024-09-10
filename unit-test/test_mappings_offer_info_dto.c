#ifndef mappings_offer_info_dto_TEST
#define mappings_offer_info_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define mappings_offer_info_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/mappings_offer_info_dto.h"
mappings_offer_info_dto_t* instantiate_mappings_offer_info_dto(int include_optional);

#include "test_offer_weight_dimensions_dto.c"
#include "test_offer_processing_state_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"


mappings_offer_info_dto_t* instantiate_mappings_offer_info_dto(int include_optional) {
  mappings_offer_info_dto_t* mappings_offer_info_dto = NULL;
  if (include_optional) {
    mappings_offer_info_dto = mappings_offer_info_dto_create(
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
      _api__mappings_offer_info_dto__ACTIVE,
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
      "0"
    );
  } else {
    mappings_offer_info_dto = mappings_offer_info_dto_create(
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
      _api__mappings_offer_info_dto__ACTIVE,
      NULL,
      NULL,
      NULL,
      "0"
    );
  }

  return mappings_offer_info_dto;
}


#ifdef mappings_offer_info_dto_MAIN

void test_mappings_offer_info_dto(int include_optional) {
    mappings_offer_info_dto_t* mappings_offer_info_dto_1 = instantiate_mappings_offer_info_dto(include_optional);

	cJSON* jsonmappings_offer_info_dto_1 = mappings_offer_info_dto_convertToJSON(mappings_offer_info_dto_1);
	printf("mappings_offer_info_dto :\n%s\n", cJSON_Print(jsonmappings_offer_info_dto_1));
	mappings_offer_info_dto_t* mappings_offer_info_dto_2 = mappings_offer_info_dto_parseFromJSON(jsonmappings_offer_info_dto_1);
	cJSON* jsonmappings_offer_info_dto_2 = mappings_offer_info_dto_convertToJSON(mappings_offer_info_dto_2);
	printf("repeating mappings_offer_info_dto:\n%s\n", cJSON_Print(jsonmappings_offer_info_dto_2));
}

int main() {
  test_mappings_offer_info_dto(1);
  test_mappings_offer_info_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // mappings_offer_info_dto_MAIN
#endif // mappings_offer_info_dto_TEST
