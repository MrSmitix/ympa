package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum ChatStatusType {
  NEW,
  WAITING_FOR_CUSTOMER,
  WAITING_FOR_PARTNER,
  WAITING_FOR_ARBITER,
  WAITING_FOR_MARKET,
  FINISHED;
}
