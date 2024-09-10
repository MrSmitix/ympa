#ifndef model_offer_dto_TEST
#define model_offer_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define model_offer_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/model_offer_dto.h"
model_offer_dto_t* instantiate_model_offer_dto(int include_optional);



model_offer_dto_t* instantiate_model_offer_dto(int include_optional) {
  model_offer_dto_t* model_offer_dto = NULL;
  if (include_optional) {
    model_offer_dto = model_offer_dto_create(
      56,
      "0",
      56,
      1.337,
      1.337,
      56,
      1.337,
      "0",
      56,
      56
    );
  } else {
    model_offer_dto = model_offer_dto_create(
      56,
      "0",
      56,
      1.337,
      1.337,
      56,
      1.337,
      "0",
      56,
      56
    );
  }

  return model_offer_dto;
}


#ifdef model_offer_dto_MAIN

void test_model_offer_dto(int include_optional) {
    model_offer_dto_t* model_offer_dto_1 = instantiate_model_offer_dto(include_optional);

	cJSON* jsonmodel_offer_dto_1 = model_offer_dto_convertToJSON(model_offer_dto_1);
	printf("model_offer_dto :\n%s\n", cJSON_Print(jsonmodel_offer_dto_1));
	model_offer_dto_t* model_offer_dto_2 = model_offer_dto_parseFromJSON(jsonmodel_offer_dto_1);
	cJSON* jsonmodel_offer_dto_2 = model_offer_dto_convertToJSON(model_offer_dto_2);
	printf("repeating model_offer_dto:\n%s\n", cJSON_Print(jsonmodel_offer_dto_2));
}

int main() {
  test_model_offer_dto(1);
  test_model_offer_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // model_offer_dto_MAIN
#endif // model_offer_dto_TEST
