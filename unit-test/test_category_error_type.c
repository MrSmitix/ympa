#ifndef category_error_type_TEST
#define category_error_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define category_error_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/category_error_type.h"
category_error_type_t* instantiate_category_error_type(int include_optional);



category_error_type_t* instantiate_category_error_type(int include_optional) {
  category_error_type_t* category_error_type = NULL;
  if (include_optional) {
    category_error_type = category_error_type_create(
    );
  } else {
    category_error_type = category_error_type_create(
    );
  }

  return category_error_type;
}


#ifdef category_error_type_MAIN

void test_category_error_type(int include_optional) {
    category_error_type_t* category_error_type_1 = instantiate_category_error_type(include_optional);

	cJSON* jsoncategory_error_type_1 = category_error_type_convertToJSON(category_error_type_1);
	printf("category_error_type :\n%s\n", cJSON_Print(jsoncategory_error_type_1));
	category_error_type_t* category_error_type_2 = category_error_type_parseFromJSON(jsoncategory_error_type_1);
	cJSON* jsoncategory_error_type_2 = category_error_type_convertToJSON(category_error_type_2);
	printf("repeating category_error_type:\n%s\n", cJSON_Print(jsoncategory_error_type_2));
}

int main() {
  test_category_error_type(1);
  test_category_error_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // category_error_type_MAIN
#endif // category_error_type_TEST
