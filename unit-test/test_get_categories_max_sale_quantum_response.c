#ifndef get_categories_max_sale_quantum_response_TEST
#define get_categories_max_sale_quantum_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_categories_max_sale_quantum_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_categories_max_sale_quantum_response.h"
get_categories_max_sale_quantum_response_t* instantiate_get_categories_max_sale_quantum_response(int include_optional);



get_categories_max_sale_quantum_response_t* instantiate_get_categories_max_sale_quantum_response(int include_optional) {
  get_categories_max_sale_quantum_response_t* get_categories_max_sale_quantum_response = NULL;
  if (include_optional) {
    get_categories_max_sale_quantum_response = get_categories_max_sale_quantum_response_create(
      _api__get_categories_max_sale_quantum_response__OK,
      list_createList(),
      list_createList()
    );
  } else {
    get_categories_max_sale_quantum_response = get_categories_max_sale_quantum_response_create(
      _api__get_categories_max_sale_quantum_response__OK,
      list_createList(),
      list_createList()
    );
  }

  return get_categories_max_sale_quantum_response;
}


#ifdef get_categories_max_sale_quantum_response_MAIN

void test_get_categories_max_sale_quantum_response(int include_optional) {
    get_categories_max_sale_quantum_response_t* get_categories_max_sale_quantum_response_1 = instantiate_get_categories_max_sale_quantum_response(include_optional);

	cJSON* jsonget_categories_max_sale_quantum_response_1 = get_categories_max_sale_quantum_response_convertToJSON(get_categories_max_sale_quantum_response_1);
	printf("get_categories_max_sale_quantum_response :\n%s\n", cJSON_Print(jsonget_categories_max_sale_quantum_response_1));
	get_categories_max_sale_quantum_response_t* get_categories_max_sale_quantum_response_2 = get_categories_max_sale_quantum_response_parseFromJSON(jsonget_categories_max_sale_quantum_response_1);
	cJSON* jsonget_categories_max_sale_quantum_response_2 = get_categories_max_sale_quantum_response_convertToJSON(get_categories_max_sale_quantum_response_2);
	printf("repeating get_categories_max_sale_quantum_response:\n%s\n", cJSON_Print(jsonget_categories_max_sale_quantum_response_2));
}

int main() {
  test_get_categories_max_sale_quantum_response(1);
  test_get_categories_max_sale_quantum_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_categories_max_sale_quantum_response_MAIN
#endif // get_categories_max_sale_quantum_response_TEST
