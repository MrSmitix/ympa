#ifndef enriched_models_dto_TEST
#define enriched_models_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define enriched_models_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/enriched_models_dto.h"
enriched_models_dto_t* instantiate_enriched_models_dto(int include_optional);



enriched_models_dto_t* instantiate_enriched_models_dto(int include_optional) {
  enriched_models_dto_t* enriched_models_dto = NULL;
  if (include_optional) {
    enriched_models_dto = enriched_models_dto_create(
      list_createList()
    );
  } else {
    enriched_models_dto = enriched_models_dto_create(
      list_createList()
    );
  }

  return enriched_models_dto;
}


#ifdef enriched_models_dto_MAIN

void test_enriched_models_dto(int include_optional) {
    enriched_models_dto_t* enriched_models_dto_1 = instantiate_enriched_models_dto(include_optional);

	cJSON* jsonenriched_models_dto_1 = enriched_models_dto_convertToJSON(enriched_models_dto_1);
	printf("enriched_models_dto :\n%s\n", cJSON_Print(jsonenriched_models_dto_1));
	enriched_models_dto_t* enriched_models_dto_2 = enriched_models_dto_parseFromJSON(jsonenriched_models_dto_1);
	cJSON* jsonenriched_models_dto_2 = enriched_models_dto_convertToJSON(enriched_models_dto_2);
	printf("repeating enriched_models_dto:\n%s\n", cJSON_Print(jsonenriched_models_dto_2));
}

int main() {
  test_enriched_models_dto(1);
  test_enriched_models_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // enriched_models_dto_MAIN
#endif // enriched_models_dto_TEST
