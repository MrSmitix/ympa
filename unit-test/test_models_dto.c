#ifndef models_dto_TEST
#define models_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define models_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/models_dto.h"
models_dto_t* instantiate_models_dto(int include_optional);



models_dto_t* instantiate_models_dto(int include_optional) {
  models_dto_t* models_dto = NULL;
  if (include_optional) {
    models_dto = models_dto_create(
      list_createList()
    );
  } else {
    models_dto = models_dto_create(
      list_createList()
    );
  }

  return models_dto;
}


#ifdef models_dto_MAIN

void test_models_dto(int include_optional) {
    models_dto_t* models_dto_1 = instantiate_models_dto(include_optional);

	cJSON* jsonmodels_dto_1 = models_dto_convertToJSON(models_dto_1);
	printf("models_dto :\n%s\n", cJSON_Print(jsonmodels_dto_1));
	models_dto_t* models_dto_2 = models_dto_parseFromJSON(jsonmodels_dto_1);
	cJSON* jsonmodels_dto_2 = models_dto_convertToJSON(models_dto_2);
	printf("repeating models_dto:\n%s\n", cJSON_Print(jsonmodels_dto_2));
}

int main() {
  test_models_dto(1);
  test_models_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // models_dto_MAIN
#endif // models_dto_TEST
