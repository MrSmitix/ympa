#ifndef model_dto_TEST
#define model_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define model_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/model_dto.h"
model_dto_t* instantiate_model_dto(int include_optional);

#include "test_model_price_dto.c"


model_dto_t* instantiate_model_dto(int include_optional) {
  model_dto_t* model_dto = NULL;
  if (include_optional) {
    model_dto = model_dto_create(
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_model_price_dto(0)
    );
  } else {
    model_dto = model_dto_create(
      56,
      "0",
      NULL
    );
  }

  return model_dto;
}


#ifdef model_dto_MAIN

void test_model_dto(int include_optional) {
    model_dto_t* model_dto_1 = instantiate_model_dto(include_optional);

	cJSON* jsonmodel_dto_1 = model_dto_convertToJSON(model_dto_1);
	printf("model_dto :\n%s\n", cJSON_Print(jsonmodel_dto_1));
	model_dto_t* model_dto_2 = model_dto_parseFromJSON(jsonmodel_dto_1);
	cJSON* jsonmodel_dto_2 = model_dto_convertToJSON(model_dto_2);
	printf("repeating model_dto:\n%s\n", cJSON_Print(jsonmodel_dto_2));
}

int main() {
  test_model_dto(1);
  test_model_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // model_dto_MAIN
#endif // model_dto_TEST
