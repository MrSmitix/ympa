package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum ShipmentActionType {
  CONFIRM,
  DOWNLOAD_ACT,
  DOWNLOAD_INBOUND_ACT,
  DOWNLOAD_DISCREPANCY_ACT,
  CHANGE_PALLETS_COUNT;
}
