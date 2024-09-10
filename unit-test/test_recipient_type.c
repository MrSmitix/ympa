#ifndef recipient_type_TEST
#define recipient_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define recipient_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/recipient_type.h"
recipient_type_t* instantiate_recipient_type(int include_optional);



recipient_type_t* instantiate_recipient_type(int include_optional) {
  recipient_type_t* recipient_type = NULL;
  if (include_optional) {
    recipient_type = recipient_type_create(
    );
  } else {
    recipient_type = recipient_type_create(
    );
  }

  return recipient_type;
}


#ifdef recipient_type_MAIN

void test_recipient_type(int include_optional) {
    recipient_type_t* recipient_type_1 = instantiate_recipient_type(include_optional);

	cJSON* jsonrecipient_type_1 = recipient_type_convertToJSON(recipient_type_1);
	printf("recipient_type :\n%s\n", cJSON_Print(jsonrecipient_type_1));
	recipient_type_t* recipient_type_2 = recipient_type_parseFromJSON(jsonrecipient_type_1);
	cJSON* jsonrecipient_type_2 = recipient_type_convertToJSON(recipient_type_2);
	printf("repeating recipient_type:\n%s\n", cJSON_Print(jsonrecipient_type_2));
}

int main() {
  test_recipient_type(1);
  test_recipient_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // recipient_type_MAIN
#endif // recipient_type_TEST
