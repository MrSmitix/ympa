package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum ReturnRequestDecisionType {
  REFUND_MONEY,
  REFUND_MONEY_INCLUDING_SHIPMENT,
  REPAIR,
  REPLACE,
  SEND_TO_EXAMINATION,
  DECLINE_REFUND,
  OTHER_DECISION;
}
