#ifndef generate_shelfs_statistics_request_TEST
#define generate_shelfs_statistics_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generate_shelfs_statistics_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generate_shelfs_statistics_request.h"
generate_shelfs_statistics_request_t* instantiate_generate_shelfs_statistics_request(int include_optional);



generate_shelfs_statistics_request_t* instantiate_generate_shelfs_statistics_request(int include_optional) {
  generate_shelfs_statistics_request_t* generate_shelfs_statistics_request = NULL;
  if (include_optional) {
    generate_shelfs_statistics_request = generate_shelfs_statistics_request_create(
      56,
      "2013-10-20",
      "2013-10-20",
      _api__generate_shelfs_statistics_request__CLICKS
    );
  } else {
    generate_shelfs_statistics_request = generate_shelfs_statistics_request_create(
      56,
      "2013-10-20",
      "2013-10-20",
      _api__generate_shelfs_statistics_request__CLICKS
    );
  }

  return generate_shelfs_statistics_request;
}


#ifdef generate_shelfs_statistics_request_MAIN

void test_generate_shelfs_statistics_request(int include_optional) {
    generate_shelfs_statistics_request_t* generate_shelfs_statistics_request_1 = instantiate_generate_shelfs_statistics_request(include_optional);

	cJSON* jsongenerate_shelfs_statistics_request_1 = generate_shelfs_statistics_request_convertToJSON(generate_shelfs_statistics_request_1);
	printf("generate_shelfs_statistics_request :\n%s\n", cJSON_Print(jsongenerate_shelfs_statistics_request_1));
	generate_shelfs_statistics_request_t* generate_shelfs_statistics_request_2 = generate_shelfs_statistics_request_parseFromJSON(jsongenerate_shelfs_statistics_request_1);
	cJSON* jsongenerate_shelfs_statistics_request_2 = generate_shelfs_statistics_request_convertToJSON(generate_shelfs_statistics_request_2);
	printf("repeating generate_shelfs_statistics_request:\n%s\n", cJSON_Print(jsongenerate_shelfs_statistics_request_2));
}

int main() {
  test_generate_shelfs_statistics_request(1);
  test_generate_shelfs_statistics_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // generate_shelfs_statistics_request_MAIN
#endif // generate_shelfs_statistics_request_TEST
