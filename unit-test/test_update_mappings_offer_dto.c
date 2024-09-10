#ifndef update_mappings_offer_dto_TEST
#define update_mappings_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_mappings_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_mappings_offer_dto.h"
update_mappings_offer_dto_t* instantiate_update_mappings_offer_dto(int include_optional);

#include "test_offer_weight_dimensions_dto.c"
#include "test_offer_processing_state_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"
#include "test_time_period_dto.c"


update_mappings_offer_dto_t* instantiate_update_mappings_offer_dto(int include_optional) {
  update_mappings_offer_dto_t* update_mappings_offer_dto = NULL;
  if (include_optional) {
    update_mappings_offer_dto = update_mappings_offer_dto_create(
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
      _api__update_mappings_offer_dto__ACTIVE,
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
       // false, not to have infinite recursion
      instantiate_time_period_dto(0),
      "0"
    );
  } else {
    update_mappings_offer_dto = update_mappings_offer_dto_create(
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
      _api__update_mappings_offer_dto__ACTIVE,
      NULL,
      NULL,
      NULL,
      "0"
    );
  }

  return update_mappings_offer_dto;
}


#ifdef update_mappings_offer_dto_MAIN

void test_update_mappings_offer_dto(int include_optional) {
    update_mappings_offer_dto_t* update_mappings_offer_dto_1 = instantiate_update_mappings_offer_dto(include_optional);

	cJSON* jsonupdate_mappings_offer_dto_1 = update_mappings_offer_dto_convertToJSON(update_mappings_offer_dto_1);
	printf("update_mappings_offer_dto :\n%s\n", cJSON_Print(jsonupdate_mappings_offer_dto_1));
	update_mappings_offer_dto_t* update_mappings_offer_dto_2 = update_mappings_offer_dto_parseFromJSON(jsonupdate_mappings_offer_dto_1);
	cJSON* jsonupdate_mappings_offer_dto_2 = update_mappings_offer_dto_convertToJSON(update_mappings_offer_dto_2);
	printf("repeating update_mappings_offer_dto:\n%s\n", cJSON_Print(jsonupdate_mappings_offer_dto_2));
}

int main() {
  test_update_mappings_offer_dto(1);
  test_update_mappings_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_mappings_offer_dto_MAIN
#endif // update_mappings_offer_dto_TEST
