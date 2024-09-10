#ifndef generate_mass_order_labels_request_TEST
#define generate_mass_order_labels_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define generate_mass_order_labels_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/generate_mass_order_labels_request.h"
generate_mass_order_labels_request_t* instantiate_generate_mass_order_labels_request(int include_optional);



generate_mass_order_labels_request_t* instantiate_generate_mass_order_labels_request(int include_optional) {
  generate_mass_order_labels_request_t* generate_mass_order_labels_request = NULL;
  if (include_optional) {
    generate_mass_order_labels_request = generate_mass_order_labels_request_create(
      56,
      list_createList()
    );
  } else {
    generate_mass_order_labels_request = generate_mass_order_labels_request_create(
      56,
      list_createList()
    );
  }

  return generate_mass_order_labels_request;
}


#ifdef generate_mass_order_labels_request_MAIN

void test_generate_mass_order_labels_request(int include_optional) {
    generate_mass_order_labels_request_t* generate_mass_order_labels_request_1 = instantiate_generate_mass_order_labels_request(include_optional);

	cJSON* jsongenerate_mass_order_labels_request_1 = generate_mass_order_labels_request_convertToJSON(generate_mass_order_labels_request_1);
	printf("generate_mass_order_labels_request :\n%s\n", cJSON_Print(jsongenerate_mass_order_labels_request_1));
	generate_mass_order_labels_request_t* generate_mass_order_labels_request_2 = generate_mass_order_labels_request_parseFromJSON(jsongenerate_mass_order_labels_request_1);
	cJSON* jsongenerate_mass_order_labels_request_2 = generate_mass_order_labels_request_convertToJSON(generate_mass_order_labels_request_2);
	printf("repeating generate_mass_order_labels_request:\n%s\n", cJSON_Print(jsongenerate_mass_order_labels_request_2));
}

int main() {
  test_generate_mass_order_labels_request(1);
  test_generate_mass_order_labels_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // generate_mass_order_labels_request_MAIN
#endif // generate_mass_order_labels_request_TEST
