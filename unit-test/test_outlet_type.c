#ifndef outlet_type_TEST
#define outlet_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define outlet_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/outlet_type.h"
outlet_type_t* instantiate_outlet_type(int include_optional);



outlet_type_t* instantiate_outlet_type(int include_optional) {
  outlet_type_t* outlet_type = NULL;
  if (include_optional) {
    outlet_type = outlet_type_create(
    );
  } else {
    outlet_type = outlet_type_create(
    );
  }

  return outlet_type;
}


#ifdef outlet_type_MAIN

void test_outlet_type(int include_optional) {
    outlet_type_t* outlet_type_1 = instantiate_outlet_type(include_optional);

	cJSON* jsonoutlet_type_1 = outlet_type_convertToJSON(outlet_type_1);
	printf("outlet_type :\n%s\n", cJSON_Print(jsonoutlet_type_1));
	outlet_type_t* outlet_type_2 = outlet_type_parseFromJSON(jsonoutlet_type_1);
	cJSON* jsonoutlet_type_2 = outlet_type_convertToJSON(outlet_type_2);
	printf("repeating outlet_type:\n%s\n", cJSON_Print(jsonoutlet_type_2));
}

int main() {
  test_outlet_type(1);
  test_outlet_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // outlet_type_MAIN
#endif // outlet_type_TEST
