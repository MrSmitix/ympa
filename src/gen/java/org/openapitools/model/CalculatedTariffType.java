package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum CalculatedTariffType {
  AGENCY_COMMISSION,
  PAYMENT_TRANSFER,
  FEE,
  DELIVERY_TO_CUSTOMER,
  CROSSREGIONAL_DELIVERY,
  EXPRESS_DELIVERY,
  SORTING,
  MIDDLE_MILE;
}
