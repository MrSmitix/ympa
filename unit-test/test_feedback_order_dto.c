#ifndef feedback_order_dto_TEST
#define feedback_order_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_order_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_order_dto.h"
feedback_order_dto_t* instantiate_feedback_order_dto(int include_optional);



feedback_order_dto_t* instantiate_feedback_order_dto(int include_optional) {
  feedback_order_dto_t* feedback_order_dto = NULL;
  if (include_optional) {
    feedback_order_dto = feedback_order_dto_create(
      "0",
      _api__feedback_order_dto__DELIVERY
    );
  } else {
    feedback_order_dto = feedback_order_dto_create(
      "0",
      _api__feedback_order_dto__DELIVERY
    );
  }

  return feedback_order_dto;
}


#ifdef feedback_order_dto_MAIN

void test_feedback_order_dto(int include_optional) {
    feedback_order_dto_t* feedback_order_dto_1 = instantiate_feedback_order_dto(include_optional);

	cJSON* jsonfeedback_order_dto_1 = feedback_order_dto_convertToJSON(feedback_order_dto_1);
	printf("feedback_order_dto :\n%s\n", cJSON_Print(jsonfeedback_order_dto_1));
	feedback_order_dto_t* feedback_order_dto_2 = feedback_order_dto_parseFromJSON(jsonfeedback_order_dto_1);
	cJSON* jsonfeedback_order_dto_2 = feedback_order_dto_convertToJSON(feedback_order_dto_2);
	printf("repeating feedback_order_dto:\n%s\n", cJSON_Print(jsonfeedback_order_dto_2));
}

int main() {
  test_feedback_order_dto(1);
  test_feedback_order_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_order_dto_MAIN
#endif // feedback_order_dto_TEST
