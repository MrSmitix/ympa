#ifndef feedback_delivery_type_TEST
#define feedback_delivery_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_delivery_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_delivery_type.h"
feedback_delivery_type_t* instantiate_feedback_delivery_type(int include_optional);



feedback_delivery_type_t* instantiate_feedback_delivery_type(int include_optional) {
  feedback_delivery_type_t* feedback_delivery_type = NULL;
  if (include_optional) {
    feedback_delivery_type = feedback_delivery_type_create(
    );
  } else {
    feedback_delivery_type = feedback_delivery_type_create(
    );
  }

  return feedback_delivery_type;
}


#ifdef feedback_delivery_type_MAIN

void test_feedback_delivery_type(int include_optional) {
    feedback_delivery_type_t* feedback_delivery_type_1 = instantiate_feedback_delivery_type(include_optional);

	cJSON* jsonfeedback_delivery_type_1 = feedback_delivery_type_convertToJSON(feedback_delivery_type_1);
	printf("feedback_delivery_type :\n%s\n", cJSON_Print(jsonfeedback_delivery_type_1));
	feedback_delivery_type_t* feedback_delivery_type_2 = feedback_delivery_type_parseFromJSON(jsonfeedback_delivery_type_1);
	cJSON* jsonfeedback_delivery_type_2 = feedback_delivery_type_convertToJSON(feedback_delivery_type_2);
	printf("repeating feedback_delivery_type:\n%s\n", cJSON_Print(jsonfeedback_delivery_type_2));
}

int main() {
  test_feedback_delivery_type(1);
  test_feedback_delivery_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_delivery_type_MAIN
#endif // feedback_delivery_type_TEST
