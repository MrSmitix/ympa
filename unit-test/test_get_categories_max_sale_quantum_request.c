#ifndef get_categories_max_sale_quantum_request_TEST
#define get_categories_max_sale_quantum_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_categories_max_sale_quantum_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_categories_max_sale_quantum_request.h"
get_categories_max_sale_quantum_request_t* instantiate_get_categories_max_sale_quantum_request(int include_optional);



get_categories_max_sale_quantum_request_t* instantiate_get_categories_max_sale_quantum_request(int include_optional) {
  get_categories_max_sale_quantum_request_t* get_categories_max_sale_quantum_request = NULL;
  if (include_optional) {
    get_categories_max_sale_quantum_request = get_categories_max_sale_quantum_request_create(
      list_createList()
    );
  } else {
    get_categories_max_sale_quantum_request = get_categories_max_sale_quantum_request_create(
      list_createList()
    );
  }

  return get_categories_max_sale_quantum_request;
}


#ifdef get_categories_max_sale_quantum_request_MAIN

void test_get_categories_max_sale_quantum_request(int include_optional) {
    get_categories_max_sale_quantum_request_t* get_categories_max_sale_quantum_request_1 = instantiate_get_categories_max_sale_quantum_request(include_optional);

	cJSON* jsonget_categories_max_sale_quantum_request_1 = get_categories_max_sale_quantum_request_convertToJSON(get_categories_max_sale_quantum_request_1);
	printf("get_categories_max_sale_quantum_request :\n%s\n", cJSON_Print(jsonget_categories_max_sale_quantum_request_1));
	get_categories_max_sale_quantum_request_t* get_categories_max_sale_quantum_request_2 = get_categories_max_sale_quantum_request_parseFromJSON(jsonget_categories_max_sale_quantum_request_1);
	cJSON* jsonget_categories_max_sale_quantum_request_2 = get_categories_max_sale_quantum_request_convertToJSON(get_categories_max_sale_quantum_request_2);
	printf("repeating get_categories_max_sale_quantum_request:\n%s\n", cJSON_Print(jsonget_categories_max_sale_quantum_request_2));
}

int main() {
  test_get_categories_max_sale_quantum_request(1);
  test_get_categories_max_sale_quantum_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_categories_max_sale_quantum_request_MAIN
#endif // get_categories_max_sale_quantum_request_TEST
