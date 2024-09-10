#ifndef feedback_dto_TEST
#define feedback_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feedback_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feedback_dto.h"
feedback_dto_t* instantiate_feedback_dto(int include_optional);

#include "test_feedback_author_dto.c"
#include "test_feedback_shop_dto.c"
#include "test_feedback_grades_dto.c"
#include "test_feedback_order_dto.c"


feedback_dto_t* instantiate_feedback_dto(int include_optional) {
  feedback_dto_t* feedback_dto = NULL;
  if (include_optional) {
    feedback_dto = feedback_dto_create(
      56,
      "2013-10-20T19:20:30+01:00",
      "0",
      _api__feedback_dto__LAST,
       // false, not to have infinite recursion
      instantiate_feedback_author_dto(0),
      "0",
      "0",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_feedback_shop_dto(0),
      1,
      1,
      1,
       // false, not to have infinite recursion
      instantiate_feedback_grades_dto(0),
       // false, not to have infinite recursion
      instantiate_feedback_order_dto(0)
    );
  } else {
    feedback_dto = feedback_dto_create(
      56,
      "2013-10-20T19:20:30+01:00",
      "0",
      _api__feedback_dto__LAST,
      NULL,
      "0",
      "0",
      list_createList(),
      NULL,
      1,
      1,
      1,
      NULL,
      NULL
    );
  }

  return feedback_dto;
}


#ifdef feedback_dto_MAIN

void test_feedback_dto(int include_optional) {
    feedback_dto_t* feedback_dto_1 = instantiate_feedback_dto(include_optional);

	cJSON* jsonfeedback_dto_1 = feedback_dto_convertToJSON(feedback_dto_1);
	printf("feedback_dto :\n%s\n", cJSON_Print(jsonfeedback_dto_1));
	feedback_dto_t* feedback_dto_2 = feedback_dto_parseFromJSON(jsonfeedback_dto_1);
	cJSON* jsonfeedback_dto_2 = feedback_dto_convertToJSON(feedback_dto_2);
	printf("repeating feedback_dto:\n%s\n", cJSON_Print(jsonfeedback_dto_2));
}

int main() {
  test_feedback_dto(1);
  test_feedback_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // feedback_dto_MAIN
#endif // feedback_dto_TEST
