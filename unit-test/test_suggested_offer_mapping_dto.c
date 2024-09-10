#ifndef suggested_offer_mapping_dto_TEST
#define suggested_offer_mapping_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define suggested_offer_mapping_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/suggested_offer_mapping_dto.h"
suggested_offer_mapping_dto_t* instantiate_suggested_offer_mapping_dto(int include_optional);

#include "test_suggested_offer_dto.c"
#include "test_get_mapping_dto.c"


suggested_offer_mapping_dto_t* instantiate_suggested_offer_mapping_dto(int include_optional) {
  suggested_offer_mapping_dto_t* suggested_offer_mapping_dto = NULL;
  if (include_optional) {
    suggested_offer_mapping_dto = suggested_offer_mapping_dto_create(
       // false, not to have infinite recursion
      instantiate_suggested_offer_dto(0),
       // false, not to have infinite recursion
      instantiate_get_mapping_dto(0)
    );
  } else {
    suggested_offer_mapping_dto = suggested_offer_mapping_dto_create(
      NULL,
      NULL
    );
  }

  return suggested_offer_mapping_dto;
}


#ifdef suggested_offer_mapping_dto_MAIN

void test_suggested_offer_mapping_dto(int include_optional) {
    suggested_offer_mapping_dto_t* suggested_offer_mapping_dto_1 = instantiate_suggested_offer_mapping_dto(include_optional);

	cJSON* jsonsuggested_offer_mapping_dto_1 = suggested_offer_mapping_dto_convertToJSON(suggested_offer_mapping_dto_1);
	printf("suggested_offer_mapping_dto :\n%s\n", cJSON_Print(jsonsuggested_offer_mapping_dto_1));
	suggested_offer_mapping_dto_t* suggested_offer_mapping_dto_2 = suggested_offer_mapping_dto_parseFromJSON(jsonsuggested_offer_mapping_dto_1);
	cJSON* jsonsuggested_offer_mapping_dto_2 = suggested_offer_mapping_dto_convertToJSON(suggested_offer_mapping_dto_2);
	printf("repeating suggested_offer_mapping_dto:\n%s\n", cJSON_Print(jsonsuggested_offer_mapping_dto_2));
}

int main() {
  test_suggested_offer_mapping_dto(1);
  test_suggested_offer_mapping_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // suggested_offer_mapping_dto_MAIN
#endif // suggested_offer_mapping_dto_TEST
