package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum ReturnInstanceStatusType {
  CREATED,
  RECEIVED,
  IN_TRANSIT,
  READY_FOR_PICKUP,
  PICKED,
  RECEIVED_ON_FULFILLMENT,
  CANCELLED,
  LOST,
  UTILIZED,
  PREPARED_FOR_UTILIZATION,
  EXPROPRIATED,
  NOT_IN_DEMAND;
}
