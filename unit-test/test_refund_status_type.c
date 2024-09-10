#ifndef refund_status_type_TEST
#define refund_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define refund_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/refund_status_type.h"
refund_status_type_t* instantiate_refund_status_type(int include_optional);



refund_status_type_t* instantiate_refund_status_type(int include_optional) {
  refund_status_type_t* refund_status_type = NULL;
  if (include_optional) {
    refund_status_type = refund_status_type_create(
    );
  } else {
    refund_status_type = refund_status_type_create(
    );
  }

  return refund_status_type;
}


#ifdef refund_status_type_MAIN

void test_refund_status_type(int include_optional) {
    refund_status_type_t* refund_status_type_1 = instantiate_refund_status_type(include_optional);

	cJSON* jsonrefund_status_type_1 = refund_status_type_convertToJSON(refund_status_type_1);
	printf("refund_status_type :\n%s\n", cJSON_Print(jsonrefund_status_type_1));
	refund_status_type_t* refund_status_type_2 = refund_status_type_parseFromJSON(jsonrefund_status_type_1);
	cJSON* jsonrefund_status_type_2 = refund_status_type_convertToJSON(refund_status_type_2);
	printf("repeating refund_status_type:\n%s\n", cJSON_Print(jsonrefund_status_type_2));
}

int main() {
  test_refund_status_type(1);
  test_refund_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // refund_status_type_MAIN
#endif // refund_status_type_TEST
