#ifndef payment_frequency_type_TEST
#define payment_frequency_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define payment_frequency_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/payment_frequency_type.h"
payment_frequency_type_t* instantiate_payment_frequency_type(int include_optional);



payment_frequency_type_t* instantiate_payment_frequency_type(int include_optional) {
  payment_frequency_type_t* payment_frequency_type = NULL;
  if (include_optional) {
    payment_frequency_type = payment_frequency_type_create(
    );
  } else {
    payment_frequency_type = payment_frequency_type_create(
    );
  }

  return payment_frequency_type;
}


#ifdef payment_frequency_type_MAIN

void test_payment_frequency_type(int include_optional) {
    payment_frequency_type_t* payment_frequency_type_1 = instantiate_payment_frequency_type(include_optional);

	cJSON* jsonpayment_frequency_type_1 = payment_frequency_type_convertToJSON(payment_frequency_type_1);
	printf("payment_frequency_type :\n%s\n", cJSON_Print(jsonpayment_frequency_type_1));
	payment_frequency_type_t* payment_frequency_type_2 = payment_frequency_type_parseFromJSON(jsonpayment_frequency_type_1);
	cJSON* jsonpayment_frequency_type_2 = payment_frequency_type_convertToJSON(payment_frequency_type_2);
	printf("repeating payment_frequency_type:\n%s\n", cJSON_Print(jsonpayment_frequency_type_2));
}

int main() {
  test_payment_frequency_type(1);
  test_payment_frequency_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // payment_frequency_type_MAIN
#endif // payment_frequency_type_TEST
