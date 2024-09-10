package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum OrderPaymentMethodType {
  CASH_ON_DELIVERY,
  CARD_ON_DELIVERY,
  BOUND_CARD_ON_DELIVERY,
  YANDEX,
  APPLE_PAY,
  EXTERNAL_CERTIFICATE,
  CREDIT,
  GOOGLE_PAY,
  TINKOFF_CREDIT,
  SBP,
  TINKOFF_INSTALLMENTS,
  B2_B_ACCOUNT_PREPAYMENT,
  B2_B_ACCOUNT_POSTPAYMENT,
  UNKNOWN;
}
