#ifndef model_price_dto_TEST
#define model_price_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define model_price_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/model_price_dto.h"
model_price_dto_t* instantiate_model_price_dto(int include_optional);



model_price_dto_t* instantiate_model_price_dto(int include_optional) {
  model_price_dto_t* model_price_dto = NULL;
  if (include_optional) {
    model_price_dto = model_price_dto_create(
      1.337,
      1.337,
      1.337
    );
  } else {
    model_price_dto = model_price_dto_create(
      1.337,
      1.337,
      1.337
    );
  }

  return model_price_dto;
}


#ifdef model_price_dto_MAIN

void test_model_price_dto(int include_optional) {
    model_price_dto_t* model_price_dto_1 = instantiate_model_price_dto(include_optional);

	cJSON* jsonmodel_price_dto_1 = model_price_dto_convertToJSON(model_price_dto_1);
	printf("model_price_dto :\n%s\n", cJSON_Print(jsonmodel_price_dto_1));
	model_price_dto_t* model_price_dto_2 = model_price_dto_parseFromJSON(jsonmodel_price_dto_1);
	cJSON* jsonmodel_price_dto_2 = model_price_dto_convertToJSON(model_price_dto_2);
	printf("repeating model_price_dto:\n%s\n", cJSON_Print(jsonmodel_price_dto_2));
}

int main() {
  test_model_price_dto(1);
  test_model_price_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // model_price_dto_MAIN
#endif // model_price_dto_TEST
