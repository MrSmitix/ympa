#ifndef feedback_shop_dto_TEST
#define feedback_shop_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_shop_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_shop_dto.h"
feedback_shop_dto_t* instantiate_feedback_shop_dto(int include_optional);



feedback_shop_dto_t* instantiate_feedback_shop_dto(int include_optional) {
  feedback_shop_dto_t* feedback_shop_dto = NULL;
  if (include_optional) {
    feedback_shop_dto = feedback_shop_dto_create(
      "0"
    );
  } else {
    feedback_shop_dto = feedback_shop_dto_create(
      "0"
    );
  }

  return feedback_shop_dto;
}


#ifdef feedback_shop_dto_MAIN

void test_feedback_shop_dto(int include_optional) {
    feedback_shop_dto_t* feedback_shop_dto_1 = instantiate_feedback_shop_dto(include_optional);

	cJSON* jsonfeedback_shop_dto_1 = feedback_shop_dto_convertToJSON(feedback_shop_dto_1);
	printf("feedback_shop_dto :\n%s\n", cJSON_Print(jsonfeedback_shop_dto_1));
	feedback_shop_dto_t* feedback_shop_dto_2 = feedback_shop_dto_parseFromJSON(jsonfeedback_shop_dto_1);
	cJSON* jsonfeedback_shop_dto_2 = feedback_shop_dto_convertToJSON(feedback_shop_dto_2);
	printf("repeating feedback_shop_dto:\n%s\n", cJSON_Print(jsonfeedback_shop_dto_2));
}

int main() {
  test_feedback_shop_dto(1);
  test_feedback_shop_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_shop_dto_MAIN
#endif // feedback_shop_dto_TEST
