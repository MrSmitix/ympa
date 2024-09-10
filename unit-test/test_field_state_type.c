#ifndef field_state_type_TEST
#define field_state_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define field_state_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/field_state_type.h"
field_state_type_t* instantiate_field_state_type(int include_optional);



field_state_type_t* instantiate_field_state_type(int include_optional) {
  field_state_type_t* field_state_type = NULL;
  if (include_optional) {
    field_state_type = field_state_type_create(
    );
  } else {
    field_state_type = field_state_type_create(
    );
  }

  return field_state_type;
}


#ifdef field_state_type_MAIN

void test_field_state_type(int include_optional) {
    field_state_type_t* field_state_type_1 = instantiate_field_state_type(include_optional);

	cJSON* jsonfield_state_type_1 = field_state_type_convertToJSON(field_state_type_1);
	printf("field_state_type :\n%s\n", cJSON_Print(jsonfield_state_type_1));
	field_state_type_t* field_state_type_2 = field_state_type_parseFromJSON(jsonfield_state_type_1);
	cJSON* jsonfield_state_type_2 = field_state_type_convertToJSON(field_state_type_2);
	printf("repeating field_state_type:\n%s\n", cJSON_Print(jsonfield_state_type_2));
}

int main() {
  test_field_state_type(1);
  test_field_state_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // field_state_type_MAIN
#endif // field_state_type_TEST
