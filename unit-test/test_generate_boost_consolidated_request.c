#ifndef generate_boost_consolidated_request_TEST
#define generate_boost_consolidated_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generate_boost_consolidated_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generate_boost_consolidated_request.h"
generate_boost_consolidated_request_t* instantiate_generate_boost_consolidated_request(int include_optional);



generate_boost_consolidated_request_t* instantiate_generate_boost_consolidated_request(int include_optional) {
  generate_boost_consolidated_request_t* generate_boost_consolidated_request = NULL;
  if (include_optional) {
    generate_boost_consolidated_request = generate_boost_consolidated_request_create(
      56,
      "2013-10-20",
      "2013-10-20"
    );
  } else {
    generate_boost_consolidated_request = generate_boost_consolidated_request_create(
      56,
      "2013-10-20",
      "2013-10-20"
    );
  }

  return generate_boost_consolidated_request;
}


#ifdef generate_boost_consolidated_request_MAIN

void test_generate_boost_consolidated_request(int include_optional) {
    generate_boost_consolidated_request_t* generate_boost_consolidated_request_1 = instantiate_generate_boost_consolidated_request(include_optional);

	cJSON* jsongenerate_boost_consolidated_request_1 = generate_boost_consolidated_request_convertToJSON(generate_boost_consolidated_request_1);
	printf("generate_boost_consolidated_request :\n%s\n", cJSON_Print(jsongenerate_boost_consolidated_request_1));
	generate_boost_consolidated_request_t* generate_boost_consolidated_request_2 = generate_boost_consolidated_request_parseFromJSON(jsongenerate_boost_consolidated_request_1);
	cJSON* jsongenerate_boost_consolidated_request_2 = generate_boost_consolidated_request_convertToJSON(generate_boost_consolidated_request_2);
	printf("repeating generate_boost_consolidated_request:\n%s\n", cJSON_Print(jsongenerate_boost_consolidated_request_2));
}

int main() {
  test_generate_boost_consolidated_request(1);
  test_generate_boost_consolidated_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // generate_boost_consolidated_request_MAIN
#endif // generate_boost_consolidated_request_TEST
