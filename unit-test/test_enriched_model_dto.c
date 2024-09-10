#ifndef enriched_model_dto_TEST
#define enriched_model_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define enriched_model_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/enriched_model_dto.h"
enriched_model_dto_t* instantiate_enriched_model_dto(int include_optional);

#include "test_model_price_dto.c"


enriched_model_dto_t* instantiate_enriched_model_dto(int include_optional) {
  enriched_model_dto_t* enriched_model_dto = NULL;
  if (include_optional) {
    enriched_model_dto = enriched_model_dto_create(
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_model_price_dto(0),
      list_createList(),
      56,
      56
    );
  } else {
    enriched_model_dto = enriched_model_dto_create(
      56,
      "0",
      NULL,
      list_createList(),
      56,
      56
    );
  }

  return enriched_model_dto;
}


#ifdef enriched_model_dto_MAIN

void test_enriched_model_dto(int include_optional) {
    enriched_model_dto_t* enriched_model_dto_1 = instantiate_enriched_model_dto(include_optional);

	cJSON* jsonenriched_model_dto_1 = enriched_model_dto_convertToJSON(enriched_model_dto_1);
	printf("enriched_model_dto :\n%s\n", cJSON_Print(jsonenriched_model_dto_1));
	enriched_model_dto_t* enriched_model_dto_2 = enriched_model_dto_parseFromJSON(jsonenriched_model_dto_1);
	cJSON* jsonenriched_model_dto_2 = enriched_model_dto_convertToJSON(enriched_model_dto_2);
	printf("repeating enriched_model_dto:\n%s\n", cJSON_Print(jsonenriched_model_dto_2));
}

int main() {
  test_enriched_model_dto(1);
  test_enriched_model_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // enriched_model_dto_MAIN
#endif // enriched_model_dto_TEST
