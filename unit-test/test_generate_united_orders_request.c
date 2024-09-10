#ifndef generate_united_orders_request_TEST
#define generate_united_orders_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generate_united_orders_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generate_united_orders_request.h"
generate_united_orders_request_t* instantiate_generate_united_orders_request(int include_optional);



generate_united_orders_request_t* instantiate_generate_united_orders_request(int include_optional) {
  generate_united_orders_request_t* generate_united_orders_request = NULL;
  if (include_optional) {
    generate_united_orders_request = generate_united_orders_request_create(
      56,
      "2013-10-20",
      "2013-10-20",
      list_createList(),
      "0"
    );
  } else {
    generate_united_orders_request = generate_united_orders_request_create(
      56,
      "2013-10-20",
      "2013-10-20",
      list_createList(),
      "0"
    );
  }

  return generate_united_orders_request;
}


#ifdef generate_united_orders_request_MAIN

void test_generate_united_orders_request(int include_optional) {
    generate_united_orders_request_t* generate_united_orders_request_1 = instantiate_generate_united_orders_request(include_optional);

	cJSON* jsongenerate_united_orders_request_1 = generate_united_orders_request_convertToJSON(generate_united_orders_request_1);
	printf("generate_united_orders_request :\n%s\n", cJSON_Print(jsongenerate_united_orders_request_1));
	generate_united_orders_request_t* generate_united_orders_request_2 = generate_united_orders_request_parseFromJSON(jsongenerate_united_orders_request_1);
	cJSON* jsongenerate_united_orders_request_2 = generate_united_orders_request_convertToJSON(generate_united_orders_request_2);
	printf("repeating generate_united_orders_request:\n%s\n", cJSON_Print(jsongenerate_united_orders_request_2));
}

int main() {
  test_generate_united_orders_request(1);
  test_generate_united_orders_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // generate_united_orders_request_MAIN
#endif // generate_united_orders_request_TEST
