#ifndef sort_order_type_TEST
#define sort_order_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define sort_order_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/sort_order_type.h"
sort_order_type_t* instantiate_sort_order_type(int include_optional);



sort_order_type_t* instantiate_sort_order_type(int include_optional) {
  sort_order_type_t* sort_order_type = NULL;
  if (include_optional) {
    sort_order_type = sort_order_type_create(
    );
  } else {
    sort_order_type = sort_order_type_create(
    );
  }

  return sort_order_type;
}


#ifdef sort_order_type_MAIN

void test_sort_order_type(int include_optional) {
    sort_order_type_t* sort_order_type_1 = instantiate_sort_order_type(include_optional);

	cJSON* jsonsort_order_type_1 = sort_order_type_convertToJSON(sort_order_type_1);
	printf("sort_order_type :\n%s\n", cJSON_Print(jsonsort_order_type_1));
	sort_order_type_t* sort_order_type_2 = sort_order_type_parseFromJSON(jsonsort_order_type_1);
	cJSON* jsonsort_order_type_2 = sort_order_type_convertToJSON(sort_order_type_2);
	printf("repeating sort_order_type:\n%s\n", cJSON_Print(jsonsort_order_type_2));
}

int main() {
  test_sort_order_type(1);
  test_sort_order_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // sort_order_type_MAIN
#endif // sort_order_type_TEST
