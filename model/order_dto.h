/*
 * order_dto.h
 *
 * Заказ.
 */

#ifndef _order_dto_H_
#define _order_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_dto_t order_dto_t;

#include "currency_type.h"
#include "order_buyer_dto.h"
#include "order_delivery_dto.h"
#include "order_item_dto.h"
#include "order_payment_method_type.h"
#include "order_payment_type.h"
#include "order_status_type.h"
#include "order_subsidy_dto.h"
#include "order_substatus_type.h"
#include "order_tax_system_type.h"

// Enum  for order_dto

typedef enum  { _api__order_dto__NULL = 0, _api__order_dto__PLACING, _api__order_dto__RESERVED, _api__order_dto__UNPAID, _api__order_dto__PROCESSING, _api__order_dto__DELIVERY, _api__order_dto__PICKUP, _api__order_dto__DELIVERED, _api__order_dto__CANCELLED, _api__order_dto__PENDING, _api__order_dto__PARTIALLY_RETURNED, _api__order_dto__RETURNED, _api__order_dto__UNKNOWN } _api__order_dto__e;

char* order_dto_status_ToString(_api__order_dto__e status);

_api__order_dto__e order_dto_status_FromString(char* status);

// Enum  for order_dto

typedef enum  { _api__order_dto__NULL = 0, _api__order_dto__RESERVATION_EXPIRED, _api__order_dto__USER_NOT_PAID, _api__order_dto__USER_UNREACHABLE, _api__order_dto__USER_CHANGED_MIND, _api__order_dto__USER_REFUSED_DELIVERY, _api__order_dto__USER_REFUSED_PRODUCT, _api__order_dto__SHOP_FAILED, _api__order_dto__USER_REFUSED_QUALITY, _api__order_dto__REPLACING_ORDER, _api__order_dto__PROCESSING_EXPIRED, _api__order_dto__PENDING_EXPIRED, _api__order_dto__SHOP_PENDING_CANCELLED, _api__order_dto__PENDING_CANCELLED, _api__order_dto__USER_FRAUD, _api__order_dto__RESERVATION_FAILED, _api__order_dto__USER_PLACED_OTHER_ORDER, _api__order_dto__USER_BOUGHT_CHEAPER, _api__order_dto__MISSING_ITEM, _api__order_dto__BROKEN_ITEM, _api__order_dto__WRONG_ITEM, _api__order_dto__PICKUP_EXPIRED, _api__order_dto__DELIVERY_PROBLEMS, _api__order_dto__LATE_CONTACT, _api__order_dto__CUSTOM, _api__order_dto__DELIVERY_SERVICE_FAILED, _api__order_dto__WAREHOUSE_FAILED_TO_SHIP, _api__order_dto__DELIVERY_SERIVCE_UNDELIVERED, _api__order_dto__DELIVERY_SERVICE_UNDELIVERED, _api__order_dto__PREORDER, _api__order_dto__AWAIT_CONFIRMATION, _api__order_dto__STARTED, _api__order_dto__PACKAGING, _api__order_dto__READY_TO_SHIP, _api__order_dto__SHIPPED, _api__order_dto__ASYNC_PROCESSING, _api__order_dto__USER_REFUSED_TO_PROVIDE_PERSONAL_DATA, _api__order_dto__WAITING_USER_INPUT, _api__order_dto__WAITING_BANK_DECISION, _api__order_dto__BANK_REJECT_CREDIT_OFFER, _api__order_dto__CUSTOMER_REJECT_CREDIT_OFFER, _api__order_dto__CREDIT_OFFER_FAILED, _api__order_dto__AWAIT_DELIVERY_DATES_CONFIRMATION, _api__order_dto__SERVICE_FAULT, _api__order_dto__DELIVERY_SERVICE_RECEIVED, _api__order_dto__USER_RECEIVED, _api__order_dto__WAITING_FOR_STOCKS, _api__order_dto__AS_PART_OF_MULTI_ORDER, _api__order_dto__READY_FOR_LAST_MILE, _api__order_dto__LAST_MILE_STARTED, _api__order_dto__ANTIFRAUD, _api__order_dto__DELIVERY_USER_NOT_RECEIVED, _api__order_dto__DELIVERY_SERVICE_DELIVERED, _api__order_dto__DELIVERED_USER_NOT_RECEIVED, _api__order_dto__USER_WANTED_ANOTHER_PAYMENT_METHOD, _api__order_dto__USER_RECEIVED_TECHNICAL_ERROR, _api__order_dto__USER_FORGOT_TO_USE_BONUS, _api__order_dto__RECEIVED_ON_DISTRIBUTION_CENTER, _api__order_dto__DELIVERY_SERVICE_NOT_RECEIVED, _api__order_dto__DELIVERY_SERVICE_LOST, _api__order_dto__SHIPPED_TO_WRONG_DELIVERY_SERVICE, _api__order_dto__DELIVERED_USER_RECEIVED, _api__order_dto__WAITING_TINKOFF_DECISION, _api__order_dto__COURIER_SEARCH, _api__order_dto__COURIER_FOUND, _api__order_dto__COURIER_IN_TRANSIT_TO_SENDER, _api__order_dto__COURIER_ARRIVED_TO_SENDER, _api__order_dto__COURIER_RECEIVED, _api__order_dto__COURIER_NOT_FOUND, _api__order_dto__COURIER_NOT_DELIVER_ORDER, _api__order_dto__COURIER_RETURNS_ORDER, _api__order_dto__COURIER_RETURNED_ORDER, _api__order_dto__WAITING_USER_DELIVERY_INPUT, _api__order_dto__PICKUP_SERVICE_RECEIVED, _api__order_dto__PICKUP_USER_RECEIVED, _api__order_dto__CANCELLED_COURIER_NOT_FOUND, _api__order_dto__COURIER_NOT_COME_FOR_ORDER, _api__order_dto__DELIVERY_NOT_MANAGED_REGION, _api__order_dto__INCOMPLETE_CONTACT_INFORMATION, _api__order_dto__INCOMPLETE_MULTI_ORDER, _api__order_dto__INAPPROPRIATE_WEIGHT_SIZE, _api__order_dto__TECHNICAL_ERROR, _api__order_dto__SORTING_CENTER_LOST, _api__order_dto__COURIER_SEARCH_NOT_STARTED, _api__order_dto__LOST, _api__order_dto__AWAIT_PAYMENT, _api__order_dto__AWAIT_LAVKA_RESERVATION, _api__order_dto__USER_WANTS_TO_CHANGE_ADDRESS, _api__order_dto__FULL_NOT_RANSOM, _api__order_dto__PRESCRIPTION_MISMATCH, _api__order_dto__DROPOFF_LOST, _api__order_dto__DROPOFF_CLOSED, _api__order_dto__DELIVERY_TO_STORE_STARTED, _api__order_dto__USER_WANTS_TO_CHANGE_DELIVERY_DATE, _api__order_dto__WRONG_ITEM_DELIVERED, _api__order_dto__DAMAGED_BOX, _api__order_dto__AWAIT_DELIVERY_DATES, _api__order_dto__LAST_MILE_COURIER_SEARCH, _api__order_dto__PICKUP_POINT_CLOSED, _api__order_dto__LEGAL_INFO_CHANGED, _api__order_dto__USER_HAS_NO_TIME_TO_PICKUP_ORDER, _api__order_dto__DELIVERY_CUSTOMS_ARRIVED, _api__order_dto__DELIVERY_CUSTOMS_CLEARED, _api__order_dto__FIRST_MILE_DELIVERY_SERVICE_RECEIVED, _api__order_dto__AWAIT_AUTO_DELIVERY_DATES, _api__order_dto__AWAIT_USER_PERSONAL_DATA, _api__order_dto__NO_PERSONAL_DATA_EXPIRED, _api__order_dto__CUSTOMS_PROBLEMS, _api__order_dto__AWAIT_CASHIER, _api__order_dto__WAITING_POSTPAID_BUDGET_RESERVATION, _api__order_dto__AWAIT_SERVICEABLE_CONFIRMATION, _api__order_dto__POSTPAID_BUDGET_RESERVATION_FAILED, _api__order_dto__AWAIT_CUSTOM_PRICE_CONFIRMATION, _api__order_dto__READY_FOR_PICKUP, _api__order_dto__UNKNOWN } _api__order_dto__e;

char* order_dto_substatus_ToString(_api__order_dto__e substatus);

_api__order_dto__e order_dto_substatus_FromString(char* substatus);

// Enum  for order_dto

typedef enum  { _api__order_dto__NULL = 0, _api__order_dto__RUR, _api__order_dto__USD, _api__order_dto__EUR, _api__order_dto__UAH, _api__order_dto__AUD, _api__order_dto__GBP, _api__order_dto__BYR, _api__order_dto__BYN, _api__order_dto__DKK, _api__order_dto__ISK, _api__order_dto__KZT, _api__order_dto__CAD, _api__order_dto__CNY, _api__order_dto__NOK, _api__order_dto__XDR, _api__order_dto__SGD, _api__order_dto___TRY, _api__order_dto__SEK, _api__order_dto__CHF, _api__order_dto__JPY, _api__order_dto__AZN, _api__order_dto__ALL, _api__order_dto__DZD, _api__order_dto__AOA, _api__order_dto__ARS, _api__order_dto__AMD, _api__order_dto__AFN, _api__order_dto__BHD, _api__order_dto__BGN, _api__order_dto__BOB, _api__order_dto__BWP, _api__order_dto__BND, _api__order_dto__BRL, _api__order_dto__BIF, _api__order_dto__HUF, _api__order_dto__VEF, _api__order_dto__KPW, _api__order_dto__VND, _api__order_dto__GMD, _api__order_dto__GHS, _api__order_dto__GNF, _api__order_dto__HKD, _api__order_dto__GEL, _api__order_dto__AED, _api__order_dto__EGP, _api__order_dto__ZMK, _api__order_dto__ILS, _api__order_dto__INR, _api__order_dto__IDR, _api__order_dto__JOD, _api__order_dto__IQD, _api__order_dto__IRR, _api__order_dto__YER, _api__order_dto__QAR, _api__order_dto__KES, _api__order_dto__KGS, _api__order_dto__COP, _api__order_dto__CDF, _api__order_dto__CRC, _api__order_dto__KWD, _api__order_dto__CUP, _api__order_dto__LAK, _api__order_dto__LVL, _api__order_dto__SLL, _api__order_dto__LBP, _api__order_dto__LYD, _api__order_dto__SZL, _api__order_dto__LTL, _api__order_dto__MUR, _api__order_dto__MRO, _api__order_dto__MKD, _api__order_dto__MWK, _api__order_dto__MGA, _api__order_dto__MYR, _api__order_dto__MAD, _api__order_dto__MXN, _api__order_dto__MZN, _api__order_dto__MDL, _api__order_dto__MNT, _api__order_dto__NPR, _api__order_dto__NGN, _api__order_dto__NIO, _api__order_dto__NZD, _api__order_dto__OMR, _api__order_dto__PKR, _api__order_dto__PYG, _api__order_dto__PEN, _api__order_dto__PLN, _api__order_dto__KHR, _api__order_dto__SAR, _api__order_dto__RON, _api__order_dto__SCR, _api__order_dto__SYP, _api__order_dto__SKK, _api__order_dto__SOS, _api__order_dto__SDG, _api__order_dto__SRD, _api__order_dto__TJS, _api__order_dto__THB, _api__order_dto__TWD, _api__order_dto__BDT, _api__order_dto__TZS, _api__order_dto__TND, _api__order_dto__TMM, _api__order_dto__UGX, _api__order_dto__UZS, _api__order_dto__UYU, _api__order_dto__PHP, _api__order_dto__DJF, _api__order_dto__XAF, _api__order_dto__XOF, _api__order_dto__HRK, _api__order_dto__CZK, _api__order_dto__CLP, _api__order_dto__LKR, _api__order_dto__EEK, _api__order_dto__ETB, _api__order_dto__RSD, _api__order_dto__ZAR, _api__order_dto__KRW, _api__order_dto__NAD, _api__order_dto__TL, _api__order_dto__UE } _api__order_dto__e;

char* order_dto_currency_ToString(_api__order_dto__e currency);

_api__order_dto__e order_dto_currency_FromString(char* currency);

// Enum  for order_dto

typedef enum  { _api__order_dto__NULL = 0, _api__order_dto__PREPAID, _api__order_dto__POSTPAID, _api__order_dto__UNKNOWN } _api__order_dto__e;

char* order_dto_payment_type_ToString(_api__order_dto__e payment_type);

_api__order_dto__e order_dto_payment_type_FromString(char* payment_type);

// Enum  for order_dto

typedef enum  { _api__order_dto__NULL = 0, _api__order_dto__CASH_ON_DELIVERY, _api__order_dto__CARD_ON_DELIVERY, _api__order_dto__BOUND_CARD_ON_DELIVERY, _api__order_dto__YANDEX, _api__order_dto__APPLE_PAY, _api__order_dto__EXTERNAL_CERTIFICATE, _api__order_dto__CREDIT, _api__order_dto__GOOGLE_PAY, _api__order_dto__TINKOFF_CREDIT, _api__order_dto__SBP, _api__order_dto__TINKOFF_INSTALLMENTS, _api__order_dto__B2B_ACCOUNT_PREPAYMENT, _api__order_dto__B2B_ACCOUNT_POSTPAYMENT, _api__order_dto__UNKNOWN } _api__order_dto__e;

char* order_dto_payment_method_ToString(_api__order_dto__e payment_method);

_api__order_dto__e order_dto_payment_method_FromString(char* payment_method);

// Enum  for order_dto

typedef enum  { _api__order_dto__NULL = 0, _api__order_dto__OSN, _api__order_dto__USN, _api__order_dto__USN_MINUS_COST, _api__order_dto__ENVD, _api__order_dto__ECHN, _api__order_dto__PSN, _api__order_dto__NPD, _api__order_dto__UNKNOWN_VALUE } _api__order_dto__e;

char* order_dto_tax_system_ToString(_api__order_dto__e tax_system);

_api__order_dto__e order_dto_tax_system_FromString(char* tax_system);



typedef struct order_dto_t {
    long id; //numeric
    order_status_type_t *status; // custom
    order_substatus_type_t *substatus; // custom
    char *creation_date; // string
    char *updated_at; // string
    currency_type_t *currency; // custom
    double items_total; //numeric
    double delivery_total; //numeric
    double buyer_items_total; //numeric
    double buyer_total; //numeric
    double buyer_items_total_before_discount; //numeric
    double buyer_total_before_discount; //numeric
    order_payment_type_t *payment_type; // custom
    order_payment_method_type_t *payment_method; // custom
    int fake; //boolean
    list_t *items; //nonprimitive container
    list_t *subsidies; //nonprimitive container
    struct order_delivery_dto_t *delivery; //model
    struct order_buyer_dto_t *buyer; //model
    char *notes; // string
    order_tax_system_type_t *tax_system; // custom
    int cancel_requested; //boolean
    char *expiry_date; // string

} order_dto_t;

order_dto_t *order_dto_create(
    long id,
    order_status_type_t *status,
    order_substatus_type_t *substatus,
    char *creation_date,
    char *updated_at,
    currency_type_t *currency,
    double items_total,
    double delivery_total,
    double buyer_items_total,
    double buyer_total,
    double buyer_items_total_before_discount,
    double buyer_total_before_discount,
    order_payment_type_t *payment_type,
    order_payment_method_type_t *payment_method,
    int fake,
    list_t *items,
    list_t *subsidies,
    order_delivery_dto_t *delivery,
    order_buyer_dto_t *buyer,
    char *notes,
    order_tax_system_type_t *tax_system,
    int cancel_requested,
    char *expiry_date
);

void order_dto_free(order_dto_t *order_dto);

order_dto_t *order_dto_parseFromJSON(cJSON *order_dtoJSON);

cJSON *order_dto_convertToJSON(order_dto_t *order_dto);

#endif /* _order_dto_H_ */

