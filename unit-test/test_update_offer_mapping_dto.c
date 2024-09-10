#ifndef update_offer_mapping_dto_TEST
#define update_offer_mapping_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_offer_mapping_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_offer_mapping_dto.h"
update_offer_mapping_dto_t* instantiate_update_offer_mapping_dto(int include_optional);

#include "test_update_offer_dto.c"
#include "test_update_mapping_dto.c"


update_offer_mapping_dto_t* instantiate_update_offer_mapping_dto(int include_optional) {
  update_offer_mapping_dto_t* update_offer_mapping_dto = NULL;
  if (include_optional) {
    update_offer_mapping_dto = update_offer_mapping_dto_create(
       // false, not to have infinite recursion
      instantiate_update_offer_dto(0),
       // false, not to have infinite recursion
      instantiate_update_mapping_dto(0)
    );
  } else {
    update_offer_mapping_dto = update_offer_mapping_dto_create(
      NULL,
      NULL
    );
  }

  return update_offer_mapping_dto;
}


#ifdef update_offer_mapping_dto_MAIN

void test_update_offer_mapping_dto(int include_optional) {
    update_offer_mapping_dto_t* update_offer_mapping_dto_1 = instantiate_update_offer_mapping_dto(include_optional);

	cJSON* jsonupdate_offer_mapping_dto_1 = update_offer_mapping_dto_convertToJSON(update_offer_mapping_dto_1);
	printf("update_offer_mapping_dto :\n%s\n", cJSON_Print(jsonupdate_offer_mapping_dto_1));
	update_offer_mapping_dto_t* update_offer_mapping_dto_2 = update_offer_mapping_dto_parseFromJSON(jsonupdate_offer_mapping_dto_1);
	cJSON* jsonupdate_offer_mapping_dto_2 = update_offer_mapping_dto_convertToJSON(update_offer_mapping_dto_2);
	printf("repeating update_offer_mapping_dto:\n%s\n", cJSON_Print(jsonupdate_offer_mapping_dto_2));
}

int main() {
  test_update_offer_mapping_dto(1);
  test_update_offer_mapping_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_offer_mapping_dto_MAIN
#endif // update_offer_mapping_dto_TEST
