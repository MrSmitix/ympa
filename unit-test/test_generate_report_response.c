#ifndef generate_report_response_TEST
#define generate_report_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generate_report_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generate_report_response.h"
generate_report_response_t* instantiate_generate_report_response(int include_optional);

#include "test_generate_report_dto.c"


generate_report_response_t* instantiate_generate_report_response(int include_optional) {
  generate_report_response_t* generate_report_response = NULL;
  if (include_optional) {
    generate_report_response = generate_report_response_create(
      _api__generate_report_response__OK,
       // false, not to have infinite recursion
      instantiate_generate_report_dto(0)
    );
  } else {
    generate_report_response = generate_report_response_create(
      _api__generate_report_response__OK,
      NULL
    );
  }

  return generate_report_response;
}


#ifdef generate_report_response_MAIN

void test_generate_report_response(int include_optional) {
    generate_report_response_t* generate_report_response_1 = instantiate_generate_report_response(include_optional);

	cJSON* jsongenerate_report_response_1 = generate_report_response_convertToJSON(generate_report_response_1);
	printf("generate_report_response :\n%s\n", cJSON_Print(jsongenerate_report_response_1));
	generate_report_response_t* generate_report_response_2 = generate_report_response_parseFromJSON(jsongenerate_report_response_1);
	cJSON* jsongenerate_report_response_2 = generate_report_response_convertToJSON(generate_report_response_2);
	printf("repeating generate_report_response:\n%s\n", cJSON_Print(jsongenerate_report_response_2));
}

int main() {
  test_generate_report_response(1);
  test_generate_report_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // generate_report_response_MAIN
#endif // generate_report_response_TEST
