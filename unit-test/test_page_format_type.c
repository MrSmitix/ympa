#ifndef page_format_type_TEST
#define page_format_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define page_format_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/page_format_type.h"
page_format_type_t* instantiate_page_format_type(int include_optional);



page_format_type_t* instantiate_page_format_type(int include_optional) {
  page_format_type_t* page_format_type = NULL;
  if (include_optional) {
    page_format_type = page_format_type_create(
    );
  } else {
    page_format_type = page_format_type_create(
    );
  }

  return page_format_type;
}


#ifdef page_format_type_MAIN

void test_page_format_type(int include_optional) {
    page_format_type_t* page_format_type_1 = instantiate_page_format_type(include_optional);

	cJSON* jsonpage_format_type_1 = page_format_type_convertToJSON(page_format_type_1);
	printf("page_format_type :\n%s\n", cJSON_Print(jsonpage_format_type_1));
	page_format_type_t* page_format_type_2 = page_format_type_parseFromJSON(jsonpage_format_type_1);
	cJSON* jsonpage_format_type_2 = page_format_type_convertToJSON(page_format_type_2);
	printf("repeating page_format_type:\n%s\n", cJSON_Print(jsonpage_format_type_2));
}

int main() {
  test_page_format_type(1);
  test_page_format_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // page_format_type_MAIN
#endif // page_format_type_TEST
