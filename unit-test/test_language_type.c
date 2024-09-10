#ifndef language_type_TEST
#define language_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define language_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/language_type.h"
language_type_t* instantiate_language_type(int include_optional);



language_type_t* instantiate_language_type(int include_optional) {
  language_type_t* language_type = NULL;
  if (include_optional) {
    language_type = language_type_create(
    );
  } else {
    language_type = language_type_create(
    );
  }

  return language_type;
}


#ifdef language_type_MAIN

void test_language_type(int include_optional) {
    language_type_t* language_type_1 = instantiate_language_type(include_optional);

	cJSON* jsonlanguage_type_1 = language_type_convertToJSON(language_type_1);
	printf("language_type :\n%s\n", cJSON_Print(jsonlanguage_type_1));
	language_type_t* language_type_2 = language_type_parseFromJSON(jsonlanguage_type_1);
	cJSON* jsonlanguage_type_2 = language_type_convertToJSON(language_type_2);
	printf("repeating language_type:\n%s\n", cJSON_Print(jsonlanguage_type_2));
}

int main() {
  test_language_type(1);
  test_language_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // language_type_MAIN
#endif // language_type_TEST
