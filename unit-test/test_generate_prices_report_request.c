#ifndef generate_prices_report_request_TEST
#define generate_prices_report_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generate_prices_report_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generate_prices_report_request.h"
generate_prices_report_request_t* instantiate_generate_prices_report_request(int include_optional);



generate_prices_report_request_t* instantiate_generate_prices_report_request(int include_optional) {
  generate_prices_report_request_t* generate_prices_report_request = NULL;
  if (include_optional) {
    generate_prices_report_request = generate_prices_report_request_create(
      56,
      56,
      list_createList(),
      "2013-10-20",
      "2013-10-20"
    );
  } else {
    generate_prices_report_request = generate_prices_report_request_create(
      56,
      56,
      list_createList(),
      "2013-10-20",
      "2013-10-20"
    );
  }

  return generate_prices_report_request;
}


#ifdef generate_prices_report_request_MAIN

void test_generate_prices_report_request(int include_optional) {
    generate_prices_report_request_t* generate_prices_report_request_1 = instantiate_generate_prices_report_request(include_optional);

	cJSON* jsongenerate_prices_report_request_1 = generate_prices_report_request_convertToJSON(generate_prices_report_request_1);
	printf("generate_prices_report_request :\n%s\n", cJSON_Print(jsongenerate_prices_report_request_1));
	generate_prices_report_request_t* generate_prices_report_request_2 = generate_prices_report_request_parseFromJSON(jsongenerate_prices_report_request_1);
	cJSON* jsongenerate_prices_report_request_2 = generate_prices_report_request_convertToJSON(generate_prices_report_request_2);
	printf("repeating generate_prices_report_request:\n%s\n", cJSON_Print(jsongenerate_prices_report_request_2));
}

int main() {
  test_generate_prices_report_request(1);
  test_generate_prices_report_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // generate_prices_report_request_MAIN
#endif // generate_prices_report_request_TEST
