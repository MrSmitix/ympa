#ifndef offer_mapping_suggestions_list_dto_TEST
#define offer_mapping_suggestions_list_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define offer_mapping_suggestions_list_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/offer_mapping_suggestions_list_dto.h"
offer_mapping_suggestions_list_dto_t* instantiate_offer_mapping_suggestions_list_dto(int include_optional);



offer_mapping_suggestions_list_dto_t* instantiate_offer_mapping_suggestions_list_dto(int include_optional) {
  offer_mapping_suggestions_list_dto_t* offer_mapping_suggestions_list_dto = NULL;
  if (include_optional) {
    offer_mapping_suggestions_list_dto = offer_mapping_suggestions_list_dto_create(
      list_createList()
    );
  } else {
    offer_mapping_suggestions_list_dto = offer_mapping_suggestions_list_dto_create(
      list_createList()
    );
  }

  return offer_mapping_suggestions_list_dto;
}


#ifdef offer_mapping_suggestions_list_dto_MAIN

void test_offer_mapping_suggestions_list_dto(int include_optional) {
    offer_mapping_suggestions_list_dto_t* offer_mapping_suggestions_list_dto_1 = instantiate_offer_mapping_suggestions_list_dto(include_optional);

	cJSON* jsonoffer_mapping_suggestions_list_dto_1 = offer_mapping_suggestions_list_dto_convertToJSON(offer_mapping_suggestions_list_dto_1);
	printf("offer_mapping_suggestions_list_dto :\n%s\n", cJSON_Print(jsonoffer_mapping_suggestions_list_dto_1));
	offer_mapping_suggestions_list_dto_t* offer_mapping_suggestions_list_dto_2 = offer_mapping_suggestions_list_dto_parseFromJSON(jsonoffer_mapping_suggestions_list_dto_1);
	cJSON* jsonoffer_mapping_suggestions_list_dto_2 = offer_mapping_suggestions_list_dto_convertToJSON(offer_mapping_suggestions_list_dto_2);
	printf("repeating offer_mapping_suggestions_list_dto:\n%s\n", cJSON_Print(jsonoffer_mapping_suggestions_list_dto_2));
}

int main() {
  test_offer_mapping_suggestions_list_dto(1);
  test_offer_mapping_suggestions_list_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // offer_mapping_suggestions_list_dto_MAIN
#endif // offer_mapping_suggestions_list_dto_TEST
